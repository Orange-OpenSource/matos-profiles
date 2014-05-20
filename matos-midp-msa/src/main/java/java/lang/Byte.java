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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public final class Byte extends Object {
    public static final byte MIN_VALUE = -128;
    public static final byte MAX_VALUE = 127;
    public static byte parseByte(String a0) throws NumberFormatException{ return (byte)0;}
    public static byte parseByte(String a0,int a1) throws NumberFormatException{ return (byte)0;}
    public Byte(@FieldSet("b") byte a0){}
    @FieldGet("b") 
    public byte byteValue(){ return (byte) 0;}
    public String toString(){ return "" + "Byte.toString";}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
}

