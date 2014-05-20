package java.util;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@Field(type="Object",value="content", modifier=4)
@ClassDone
public class Vector extends Object{

	// Added
	protected static class EnumerationImplem implements Enumeration {
		public EnumerationImplem(@FieldSet("e") Object arg1) {}
		public boolean hasMoreElements() {return false;	}

		@FieldGet("e")
		public Object nextElement() { return null;	}
		
	}
	
	public Vector(int a0,int a1){
	}
	public Vector(int a0){
	}
	public Vector(){
	}
	@Code("arg1[0]=content;")
	public synchronized void copyInto(Object[] a0){
	}
	
	public synchronized void trimToSize(){ 
	}

	public synchronized void ensureCapacity(int a0){ 
	}

	public synchronized void setSize(int a0){ 
	}

	public int capacity(){ return 0;}
	public int size(){ return 0;}
	public boolean isEmpty(){ return true;}

	@com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem(content);")
	public synchronized Enumeration elements() { return null; } 

	public boolean contains(Object a0){ return true;}

	public int indexOf(Object a0){ return 0; }


	public synchronized int indexOf(Object a0,int a1){  return 0; }

	public int lastIndexOf(Object a0){ return 0; } 
	public synchronized int lastIndexOf(Object a0,int a1){ return 0; }
	@FieldGet("content")
	public synchronized Object elementAt(int a0) { return null;}
	@FieldGet("content")
	public synchronized Object firstElement() { return null;}
	@FieldGet("content")
	public synchronized Object lastElement() { return null; }
	
	public synchronized void setElementAt(@FieldSet("content")Object a0,int a1){	}
	public synchronized void removeElementAt(int a0){ }

	public synchronized void insertElementAt(@FieldSet("content")Object a0,int a1){	}

	public synchronized void addElement(@FieldSet("content")Object a0){	}

	public synchronized boolean removeElement(Object a0){ return true;	}

	public synchronized void removeAllElements(){}

	public synchronized String toString(){ return "";}
}

