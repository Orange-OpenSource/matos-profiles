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
public final class Double extends Object {
    public static final double POSITIVE_INFINITY = 1.7976931348623157E308d;
    public static final double NEGATIVE_INFINITY = - 1.7976931348623157E308d;
    public static final double NaN = 0.0 / 0.0;
    public static final double MAX_VALUE = 1.7976931348623157E308d ;
    public static final double MIN_VALUE = 4.9E-324d;

    public static String toString(double a0){ return "" + "Double.";}
    public static Double valueOf(String a0) throws NumberFormatException { 
	return null;
    }
    public static double parseDouble(String a0) throws NumberFormatException{ 
	return 0.0;
    }
    public static boolean isNaN(double a0){ return true;}
    public static boolean isInfinite(double a0){ return true;}
    public Double(double a0){}
    public boolean isNaN(){ return true;}
    public boolean isInfinite(){ return true;}
    public String toString(){ return "" + "Double.";}
    public byte byteValue(){ return (byte)0;}
    public short shortValue(){ return 0;}
    public int intValue(){ return 0;}
    public long longValue(){ return 0L;}
    public float floatValue(){ return 0.0f;}
    public double doubleValue(){ return 0.0;}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
    public static long doubleToLongBits(double a0){ 
	return 0L;
    }
    public static double longBitsToDouble(long a0){
	return 0.0;
    }
}

