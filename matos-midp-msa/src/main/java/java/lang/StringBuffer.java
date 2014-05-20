package java.lang;

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

@ClassDone
public final class StringBuffer {

public StringBuffer() { }

public StringBuffer(String str) { }

public StringBuffer(int length) { }

@Code("return this;")
public StringBuffer append(Object obj) { return this; }
@Code("return this;")
public StringBuffer append ( String str ) { return this; }
@Code("return this;")
public StringBuffer append(boolean b) {	return this; }
@Code("return this;")
public synchronized StringBuffer append(char c) { return this; }
@Code("return this;")
public StringBuffer append(char str[]) { return this; }
@Code("return this;")
public synchronized StringBuffer append(char str[], int offset, int len) { return this; }
@Code("return this;")
public StringBuffer append(int i) {	return this; }
@Code("return this;")
public StringBuffer append(long l) { return this; }
@Code("return this;")
public StringBuffer append(float l) { return this; }
@Code("return this;")
public StringBuffer append(double l) { return this; }

public int capacity() {	return 0;}

public synchronized char charAt(int index) { return 0; }

@Code("return this;")
public synchronized StringBuffer deleteCharAt(int index) { return this; }
@Code("return this;")
public synchronized StringBuffer delete(int start, int end) { return this; }
@Code("return this;")
public synchronized StringBuffer replace(int start, int end, String str) { return this; }

public synchronized String substring(int start) { return null; }

public synchronized String substring(int start, int end) { return null; }

public void ensureCapacity(int minCapacity) {}

public synchronized void getChars(int srcBegin, int srcEnd,	char dst[], int dstBegin) { }
@Code("return this;")
public synchronized StringBuffer insert(int offset, Object obj) { return this; }
@Code("return this;")
public synchronized StringBuffer insert(int offset, String str) { return this; }
@Code("return this;")
public StringBuffer insert(int offset, boolean b) {	return this; }
@Code("return this;")
public synchronized StringBuffer insert(int offset, char c) { return this; }
@Code("return this;")
public StringBuffer insert(int offset, char[] str) { return this; }
@Code("return this;")
public synchronized StringBuffer insert(int index, char[] str, int offset, int len) { return this; }
@Code("return this;")
public StringBuffer insert(int offset, int i) {	return this; }
@Code("return this;")
public StringBuffer insert(int offset, long l) { return this; }
@Code("return this;")
public StringBuffer insert(int offset, double l) { return this; }
@Code("return this;")
public StringBuffer insert(int offset, float l) { return this; }

public int length () { return 0; }
@Code("return this;")
public synchronized StringBuffer reverse() { return this; }

public synchronized void setCharAt(int index, char ch) {}

public synchronized void setLength(int newLength) {}

public String toString() {	return new String(); }

}