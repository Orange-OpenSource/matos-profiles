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
@ClassDone
public final class Integer extends Object {
    public static final int MIN_VALUE = -2147483648;
    public static final int MAX_VALUE = 2147483647;
    public static String toString(int a0,int a1){ return "" + "Integer.";}
    public static String toHexString(int a0){ return "" + "Integer.";}
    public static String toOctalString(int a0){ return "" + "Integer.";}
    public static String toBinaryString(int a0){ return "" + "Integer.";}
    public static String toString(int a0){ return "" + "Integer.";}
    public static int parseInt(String a0,int a1) throws NumberFormatException{ return 0;}
    public static int parseInt(String a0) throws NumberFormatException{ return 0;}
    public static Integer valueOf(String a0,int a1) throws NumberFormatException { return new Integer(0); }
    public static Integer valueOf(String a0) throws NumberFormatException { return new Integer(0); }
    public Integer(int a0){}
    public byte byteValue(){ return (byte)0;}
    public short shortValue(){ return 0;}
    public int intValue(){ return 0;}
    public long longValue(){ return 0L;}
    public float floatValue(){ return 0.0f;}
    public double doubleValue(){ return 0.0;}
    public String toString (){ return "" + "Integer.";}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
}

