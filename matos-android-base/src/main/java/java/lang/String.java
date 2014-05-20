
package java.lang;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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

import java.util.Comparator;

import com.francetelecom.rd.stubs.Generator;


public final class String  implements java.io.Serializable,Comparable,CharSequence {

	static final int STRINGBUFFER_SLOP = 32;

	public String() {
	}

	public String(String other) {
	}

	public String(StringBuffer sb) {
	}

	public String(byte[] bytes) {
	}

	public String(byte[] bytes, String enc) {
	}

	public String(byte ascii[], int hibyte) {
		this(ascii, hibyte, 0, ascii.length);
	}

	public String(byte[] bytes, int offset, int length) {
		this(decodeBytes(bytes, offset, length));
	}

	public String(byte[] bytes, int offset, int length, String enc) {

		this(decodeBytes(bytes, offset, length));
	}

	private static StringBuffer decodeBytes(byte[] bytes, int offset,
			int len) {
		StringBuffer sbuf = new StringBuffer(len);
		return sbuf;
	}

	public String( byte ascii[], int hibyte, int offset, int count) {
	}

	public String( char other[]) {
		this( other, 0, other.length);
	}

	public String( char other[], int offset, int count) {
	}

	String(int sIdx, int eIdx, char[] val) {
	}

	public char charAt ( int index ) { return Generator.charValue(); }


	public int compareTo(Object o) {
		return compareTo((String)o);
	}

	public int compareTo( String s1) { return Generator.intValue(); }

	public int compareToIgnoreCase(String that) { return Generator.intValue(); }

	public String concat(String str) { return "[stub : String.concat]"; }

	public static String copyValueOf( char data[]) { return "[stub: String.copyValueOf]"; }

	public static String copyValueOf(char data[], int offset, int count) {
		return "[stub : String.copyValueOf]";
	}

	public boolean endsWith( String suffix) {
		return Generator.booleanValue();
	}

	public boolean equals (Object anObject) {
		return Generator.booleanValue();
			}

	public boolean equalsIgnoreCase (String that) {
		return Generator.booleanValue();
	}

	public byte[] getBytes() {
		return new byte[0];
	}


	public byte[] getBytes( String enc) throws java.io.UnsupportedEncodingException
	{return new byte[0];}


	public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
	}

	public int hashCode() {
		return Generator.intValue();
	}

	public int indexOf( String str) {
		return Generator.intValue();
	}

	native public int indexOf( String str, int sIdx);

	public int indexOf( int ch) {return Generator.intValue(); }

	public int indexOf( int ch, int sIdx) {return Generator.intValue(); }
	


	public int lastIndexOf( String str) { return Generator.intValue(); }

	public int lastIndexOf( String str, int eIdx) {return Generator.intValue();	}

	public int lastIndexOf(int ch) {return Generator.intValue();}

	public int lastIndexOf(int ch, int eIdx) {return Generator.intValue();}

	public int length() {return Generator.intValue();}

	public boolean regionMatches( int toffset, String other, int ooffset, int len) {
		return Generator.booleanValue();
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return Generator.booleanValue();
	}
	
	public String replace(char oldChar, char newChar) {
		return "[stub : String.replace]";
	}

	public boolean startsWith( String prefix) {
		return Generator.booleanValue();
	}

	public boolean startsWith( String prefix, int toffset) {
		return Generator.booleanValue();
	}

	public String substring( int sIdx) {
		return "[stubs: substring]";
	}

	public String substring( int sIdx, int eIdx) {
		return "[stubs: substring]";
	}

	public char[] toCharArray() {
		return new char[0];
	}

	public String toLowerCase() {
		return this;
	}


	public String toString() {
		return this;
	}

	public String toUpperCase() {
		return "[stubs: toUpperCase]";
	}

	public String trim() {
		return "[stubs: trim]";
	}

	public static String valueOf( Object obj) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( boolean b) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( char c) {
		return "[stubs: valueOf]";
	}

	public static String valueOf(char data[]) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( char data[], int offset, int count) {
		return "[stubs: valueOf]";
	}


	public static String valueOf( int i) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( float i) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( double i) {
		return "[stubs: valueOf]";
	}

	public static String valueOf( long l) {
		return "[stubs: valueOf]";
	}

	public String intern() { return this;	}
	
    public static final java.util.Comparator CASE_INSENSITIVE_ORDER = new Comparator() {
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };                            
    public String(int[] arg1, int arg2 , int arg3){};                                                   
    public String(byte[] arg1, int arg2, int arg3, java.nio.charset.Charset arg4){};                        
    public String(byte[] arg1, java.nio.charset.Charset arg2){};                                  
    public String(StringBuilder arg1){};                                           
    public boolean isEmpty(){return Generator.booleanValue();};                                                                   
    public int codePointAt(int arg1){return Generator.intValue();};                                                                
    public int codePointBefore(int arg1){return Generator.intValue();};                                                            
    public int codePointCount(int arg1, int arg2){return Generator.intValue();};                                                        
    public int offsetByCodePoints(int arg1, int arg2){return Generator.intValue();};                                                    
                                                                     
    public void getBytes(int arg1, int arg2, byte[] arg3, int arg4){};                                                
    public byte[] getBytes(java.nio.charset.Charset arg1){ return new byte [1];};                                           
    public boolean contentEquals(StringBuffer arg1){ return Generator.booleanValue();};                                       
    public boolean contentEquals(CharSequence arg1){ return Generator.booleanValue();};                                       
    public CharSequence subSequence(int arg1, int arg2){ return "[stubs: subSequence]";};                                        
    public boolean matches(String arg1){ return Generator.booleanValue();};                                                   
    public boolean contains(CharSequence arg1){ return Generator.booleanValue();};                                            
    public String replaceFirst(String arg1, String arg2){return "[stubs: replaceFirst]";};                   
    public String replaceAll(String arg1, String arg2){return "[stubs: replaceAll]";};                     
    public String replace(CharSequence arg1, CharSequence arg2){return "[stubs: replace]";};            
    public String[] split(String arg1, int arg2){return new String []{"[stubs: split " + arg1 + "]"};};                                     
    public String[] split(String arg1){return new String[]{"[stubs: split " + arg1 + "]"};};                                          
    public String toLowerCase(java.util.Locale arg1){return "[stubs: toLowerCase]";};                         
    public String toUpperCase(java.util.Locale arg1){return "[stubs: toUpperCase]";};
    public static String format(String arg1, Object [] arg2){return "[stubs: format]";};
    public static String format(java.util.Locale arg1, String arg2, Object[] arg3){return "[stubs: format]";};
    
    static int indexOf(char[] arg1, int arg2, int arg3, char[] arg4, int arg5, int arg6, int arg7){return Generator.intValue();};                                
    static int lastIndexOf(char[] arg1, int arg2, int arg3, char[] arg4, int arg5, int arg6, int arg7){return Generator.intValue();};
    void getChars(char[] arg1, int arg2){};
}
