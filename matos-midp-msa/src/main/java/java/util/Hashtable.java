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
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
import com.francetelecom.rd.stubs.annotation.Fields;
@ClassDone
@Fields({
	@Field(type="Object",value="content", modifier=4),
	@Field(type="Object",value="key", modifier=4)
})
public class Hashtable {
	// Added
	protected static class EnumerationImplem implements Enumeration {
		public EnumerationImplem(@FieldSet("e") Object arg1) {}
		public boolean hasMoreElements() {return false;	}

		@FieldGet("e")
		public Object nextElement() { return null;	}
		
	}
    public Hashtable(int a) { }
    public Hashtable() { }
    public int size() { return 0; }
    public boolean isEmpty() { return true;}
    @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem(key);")
    public synchronized java.util.Enumeration keys() { return null;}
    @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem(content);")
    public synchronized java.util.Enumeration elements() { return null; }
    
    public synchronized boolean contains(java.lang.Object a) {  return true;}
    public synchronized boolean containsKey(java.lang.Object a) { return true; }
    @FieldGet("content")
    public synchronized java.lang.Object get(java.lang.Object a) { return null; }
    protected void rehash() { }
    public synchronized java.lang.Object put(@FieldSet("key")java.lang.Object a,@FieldSet("content") java.lang.Object b) { return null; }
    public synchronized java.lang.Object remove(java.lang.Object a) { return null; }
    public synchronized void clear() { }
    public synchronized java.lang.String toString() { return null; }

}
