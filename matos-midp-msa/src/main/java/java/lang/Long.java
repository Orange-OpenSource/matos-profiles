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
public final class Long extends Object {
    public static final long MIN_VALUE = -9223372036854775808L;
    public static final long MAX_VALUE = 9223372036854775807L;
    public static String toString(long a0,int a1){ return "" + "Long.";}
    public static String toString(long a0){ return "" + "Long.";}
    public static long parseLong(String a0,int a1) throws NumberFormatException{ return 0L;}
    public static long parseLong(String a0) throws NumberFormatException{ return 0L;}
    public Long(long a0){}
    public long longValue(){ return 0L;}
    public float floatValue(){ return 0.0f;}
    public double doubleValue(){ return 0.0;}
    public String toString(){ return "" + "Long.";}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
}

