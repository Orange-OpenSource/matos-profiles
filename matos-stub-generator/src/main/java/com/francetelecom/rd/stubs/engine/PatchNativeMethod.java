package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The goal of this class is to patch native methods into stubs raising an
 * exception.  
 * @author Pierre Cregut
 *
 */
public class PatchNativeMethod {
	
	/**
	 * If the mode is true, then there is something to patch. 
	 */
	private boolean mode = false;

	private Map<String, Integer> expectedIndexes;
	private int constantpoolsize;
	private int runtime_entry;
	private int init_runtime_entry;
	private int init_object_entry;

	private List<int[]> finalStaticFields = new ArrayList<int[]>();
	private List<Integer> fieldsEntries = new ArrayList<Integer>();
	private int this_entry;
	
	/** Code size regular meth. */
	public final int CODE_LENGTH = 8;
	/** Code size constructor */
	public final int CODE_CONST_LENGTH = 5;

	/** Opcode for nop */
	public final byte NOP = 0;
	/** Opcode for aconst_null */
	public final byte ACNULL = 1;
	/** Opcode for a_load */
	public static final byte A_LOAD= (byte) 0x2a;
	/** Opcode for dup */
	public static final byte DUP = (byte) 0x59;
	/** opcode for return */
	public static final byte RETURN= (byte) 0xb1;
	/** Opcode for put_static */
	public final byte PUT_STATIC = (byte) 0xb3;
	/** Opcode for invoke_special */
	public static final byte INVOKESPECIAL= (byte) 0xb7;
	/** Opcode for new */
	public static final byte NEW = (byte) 0xbb;
	/** Opcode for athrow */
	public static final byte ATHROW = (byte) 0xbf;
	
	private static final String INIT_STRING = "<init>";
	private static final String RUNTIME_STRING = "java/lang/RuntimeException";
	private static final String SIG_STRING = "()V";
	private static final String CODE_STRING = "Code";
	private static final String OBJECT_STRING = "java/lang/Object";
	private static final String CLINIT_STRING = "<clinit>";
	
	private static final String [] expectedStrings = {
		INIT_STRING, RUNTIME_STRING, SIG_STRING, CODE_STRING, OBJECT_STRING
	};
	
	private int [] positions;
	private String [] strings;
	private byte [] buf = new byte [1024];

	private boolean isEnum;
	
	/**
	 * Constructor
	 */
	public PatchNativeMethod() {	
		expectedIndexes = new HashMap<String, Integer>();
		positions = new int[expectedStrings.length];
		for(int i=0; i<expectedStrings.length; i++) {
			expectedIndexes.put(expectedStrings[i],i);
			positions[i] = -1;
		}
	}
	
	/**
	 * Register a new UTF8 string. Check if it is one of the searched ones.
	 * @param pos
	 * @param utfString
	 */
	public void check(int pos, String utfString) {
		strings[pos] = utfString;
		if (expectedIndexes.containsKey(utfString)) {
			positions[expectedIndexes.get(utfString)] = pos;
		}
	}
	
	
	/**
	 * Access to one of the searched strings. It outputs the necessary index as
	 * a short on the stream.
	 * @param out
	 * @param constant
	 * @throws IOException
	 */
	private void referConstant(DataOutputStream out, String constant) throws IOException {
		out.writeShort((short) positions[expectedIndexes.get(constant)]);
	}
	
	/**
	 * This version of skipBytes will feed the buffer until we skip the right number of
	 * bytes.
	 * @param is The stream to read from
	 * @param i The number of bytes to skip
	 * @throws IOException if stream is exhausted.
	 */
	public static void forceSkip(DataInputStream is, int i) throws IOException {
		int done;
		while((done = is.skipBytes(i)) != i) {
			if (done == 0) throw new RuntimeException("Skip bytes");
			i -= done;
		}
	}

	/**
	 * Prepare the patcher. We look for native methods.
	 * @param code
	 * @throws IOException
	 */
	void prepare(DataInputStream code) throws IOException {
		int mod = code.readShort();
		// if (Modifier.isInterface(mod)) return;
		isEnum = (0x4000 & mod) != 0; 
		this_entry = code.readShort();
		forceSkip(code,2);
		int itfs = code.readShort();
		forceSkip(code,itfs*2);
		int fields = code.readShort();
		for(int i=0; i < fields; i++) {
			int modField = code.readShort();
			int name = code.readShort();
			int descr = code.readShort();
			if(Modifier.isStatic(modField) && Modifier.isFinal(modField) && !strings[descr].equals("Ljava/lang/String;") && (strings[descr].charAt(0)=='L' || strings[descr].charAt(0)=='[')) {
				// System.err.println("FIELD " + strings[name] + ": " + strings[descr] + " MUST BE INITIALIZED.");
				finalStaticFields.add(new int []{name,descr});
			}
			// forceSkip(code,6);
			int atts = code.readShort();
			for(int j=0;j<atts;j++) skipAttribute(code);
		}
		int methods = code.readShort();
		for(int i=0; i < methods; i++) {
			int modMethod = code.readShort();
			int name = code.readShort();
			if (strings[name].equals(CLINIT_STRING) && !isEnum) mode = true;
			code.readShort(); // int desc = 
			if (Modifier.isNative(modMethod)) {
				mode = true;
				// System.err.println("*********** NATIVE **********");
				// System.err.println("Method " + strings[name] + " " + strings[desc] + " " + countArgs(desc));
			}
			int atts = code.readShort();
			for(int j=0;j<atts;j++) skipAttribute(code);
		}
	}
	
	/**
	 * Go through an attribute.
	 * @param code
	 * @throws IOException
	 */
	private void skipAttribute(DataInputStream code) throws IOException {
		forceSkip(code,2);
		int size = code.readInt();
		forceSkip(code,size);	
	}

	/**
	 * Modify the constant pool. We need to have access to RuntimeException.<init>()
	 * and RuntimeException as a class.
	 * @param out
	 * @throws IOException
	 */
	public void addConstants(DataOutputStream out) throws IOException {
		for(int i=0; i < expectedStrings.length; i++) {
			if(positions[i] == -1) {
				positions[i] = constantpoolsize++;
				out.writeByte(PatchConstantPool.CONSTANT_Utf8);
				out.writeUTF(expectedStrings[i]);
			}
		}
		// Class
		out.writeByte(PatchConstantPool.CONSTANT_Class);
		referConstant(out,RUNTIME_STRING);
		// NameAndType
		out.writeByte(PatchConstantPool.CONSTANT_NameAndType);
		referConstant(out,INIT_STRING);
		referConstant(out,SIG_STRING);
		// Method
		out.writeByte(PatchConstantPool.CONSTANT_Methodref);
		out.writeShort((short) constantpoolsize);
		out.writeShort((short) constantpoolsize+1);
		// Class Object
		out.writeByte(PatchConstantPool.CONSTANT_Class);
		referConstant(out,OBJECT_STRING);		
		// Object Init Method
		out.writeByte(PatchConstantPool.CONSTANT_Methodref);
		out.writeShort((short) constantpoolsize+3);
		out.writeShort((short) constantpoolsize+1);
		
		runtime_entry = constantpoolsize;
		init_runtime_entry = constantpoolsize + 2;
		init_object_entry = constantpoolsize + 4;
		constantpoolsize += 5;
		
		for(int [] nameType : finalStaticFields) {
			out.writeByte(PatchConstantPool.CONSTANT_NameAndType);
			out.writeShort(nameType[0]);
			out.writeShort(nameType[1]);
			out.writeByte(PatchConstantPool.CONSTANT_Fieldref);
			out.writeShort(this_entry);
			out.writeShort(constantpoolsize);
			fieldsEntries.add(constantpoolsize+1);
			constantpoolsize +=2;
		}
		
	}

	/**
	 * Copy the body of the class and change the methods if needed.
	 * @param code
	 * @param out
	 * @throws IOException
	 */
	public void dumpCode(DataInputStream code, DataOutputStream out) throws IOException {
		transfer(6,code,out);
		int itfs = code.readShort();
		out.writeShort(itfs);
		transfer(itfs*2,code,out);
		int fields = code.readShort();
		out.writeShort(fields);
		for(int i=0; i < fields; i++) {
			transfer(6,code,out);
			int atts = code.readShort();
			out.writeShort(atts);
			for(int j=0;j<atts;j++) dumpAttribute(code,out);
		}
		int methods = code.readShort();
		out.writeShort(methods);
		for(int i=0; i < methods; i++) {
			int modMethod = code.readShort();
			out.writeShort(modMethod & ~ Modifier.NATIVE);
			int name = code.readShort();
			out.writeShort(name);	
			int descr = code.readShort();
			out.writeShort(descr);
			boolean isNative = Modifier.isNative(modMethod);
			boolean isClinit = strings[name].equals(CLINIT_STRING) && !isEnum;
			int argCount = countArgs(descr);
			if (! Modifier.isStatic(modMethod)) argCount++;			
			int atts = code.readShort();
			out.writeShort((isNative) ? atts + 1 : atts);
			for(int j=0;j<atts;j++) dumpAttribute(code,out,isClinit);
			if(isClinit) dumpStaticInit(out);
			else if(isNative) {
				if (strings[name].equals("<init>")) {
					dumpConstructorCode(out,argCount);
				} else {
					dumpMethodCode(out, argCount);
				}
			}
		}
		int atts = code.readShort();
		out.writeShort(atts);
		for(int j=0;j<atts;j++) dumpAttribute(code,out);
	}

	/**
	 * Take a method descriptor and counts the number of arguments (for correct locals).
	 * @param descrIdx
	 * @return
	 */
	private int countArgs(int descrIdx) {
		String descr = strings[descrIdx];
		int pos = 1;
		int args = 0;
		char c;
		while((c = descr.charAt(pos)) != ')') {
			if (c == 'L') pos = descr.indexOf(';', pos);
			pos++;
			if ((c == 'J') || (c == 'D')) args++;
			if (c != '[') args++;
		}
		return args;
	}

	/**
	 * Dumps an attribute (generic)
	 * @param code
	 * @param out
	 * @throws IOException
	 */
	private void dumpAttribute(DataInputStream code, DataOutputStream out) throws IOException {
		transfer(2,code,out);
		int size = code.readInt();
		out.writeInt(size);
		transfer(size,code,out);
	}

	/**
	 * Dumps an attribute unless it is a code attribute and the flag is set (then discard).
	 * @param code
	 * @param out
	 * @throws IOException
	 */
	private void dumpAttribute(DataInputStream code, DataOutputStream out, boolean isClinit) throws IOException {
		int attName = code.readShort();
		int size = code.readInt();
		if (isClinit && strings[attName].equals(CODE_STRING)) {
			forceSkip(code,size);
		} else {
			out.writeShort(attName);
			out.writeInt(size);
			transfer(size,code,out);
		}
	}
	
	/**
	 * Transfer n bytes from inputstream to outputstream.
	 * @param i
	 * @param code
	 * @param out
	 * @throws IOException
	 */
	private void transfer(int i, DataInputStream code, DataOutputStream out) throws IOException {
		if (buf.length < i) buf = new byte[i];
		code.readFully(buf, 0, i);
		out.write(buf,0,i);
	}

	/**
	 * Register the pool size in the patcher.
	 * @param size
	 */
	public void setConstantPoolSize(int size) {
		constantpoolsize = size;
		strings = new String[size];
	}
	
	/**
	 * Change the code of a method.
	 * @param out
	 * @param argCount
	 * @throws IOException
	 */
	public void dumpMethodCode(DataOutputStream out, int argCount) throws IOException {
		referConstant(out, CODE_STRING);
		out.writeInt(CODE_LENGTH + 12);
		out.writeShort(2); // MAX STACK = 2
		out.writeShort(argCount); // MAX LOCALS = 1
		out.writeInt(CODE_LENGTH); // CODE LENGTH
		out.writeByte(NEW);
		out.writeShort((short) runtime_entry);
		out.writeByte(DUP);
		out.writeByte(INVOKESPECIAL);
		out.writeShort(init_runtime_entry);
		out.writeByte(ATHROW);
		out.writeShort(0); // Exception table size
		out.writeShort(0); // Code attributes table size
	}

	/**
	 * Dumps the code for a constructor.
	 * @param out
	 * @param argCount
	 * @throws IOException
	 */
	public void dumpConstructorCode(DataOutputStream out, int argCount) throws IOException {
		referConstant(out, CODE_STRING);
		out.writeInt(CODE_CONST_LENGTH + 12);
		out.writeShort(2); // MAX STACK = 2
		out.writeShort(argCount); // MAX LOCALS = 1
		out.writeInt(CODE_CONST_LENGTH); // CODE LENGTH
		out.writeByte(A_LOAD);
		out.writeByte(INVOKESPECIAL);
		out.writeShort(init_object_entry);
		out.writeByte(RETURN);
		out.writeShort(0); // Exception table size
		out.writeShort(0); // Code attributes table size
	}

	/**
	 * @param out
	 */
	private void dumpStaticInit(DataOutputStream out) throws IOException {
		int codeLength = fieldsEntries.size() * 4 + 1;
		referConstant(out, CODE_STRING);
		out.writeInt(codeLength + 12);
		out.writeShort(2); // MAX STACK = 2
		out.writeShort(0); // MAX LOCALS = 1
		out.writeInt(codeLength); // CODE LENGTH
		for(int entry: fieldsEntries) {
			out.writeByte(ACNULL);
			out.writeByte(PUT_STATIC);
			out.writeShort(entry);
		}
		out.writeByte(RETURN);
		out.writeShort(0); // Exception table size
		out.writeShort(0); // Code attributes table size
	}
	
	/**
	 * Modifies the pool size.
	 * @param result
	 */
	public void updatePoolSize(byte[] result) {
		result[8] = (byte) ((constantpoolsize >> 8) & 0xff);
		result[9] = (byte) (constantpoolsize & 0xff);
	}

	/**
	 * Check if we need to patch.
	 * @return
	 */
	public boolean needModification() {
		return mode;
	}
}
