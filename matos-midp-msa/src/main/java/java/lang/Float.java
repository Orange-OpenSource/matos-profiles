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
public final class Float extends Object {
    public static final float POSITIVE_INFINITY = 3.4028235E38f;
    public static final float NEGATIVE_INFINITY = -3.4028235E38f;
    public static final float NaN = 0.0f / 0.0f;
    public static final float MAX_VALUE = 3.4028235E38f;
;
    public static final float MIN_VALUE = 1.4E-45f;
    public static String toString(float a0){ return "" + "Filoat";}
    public static Float valueOf(String a0) throws NumberFormatException {
	return null;
    }
    public static float parseFloat(String a0) throws NumberFormatException{
	return 0.0f;
    }
    public static boolean isNaN(float a0){ return true;}
    public static boolean isInfinite(float a0){
	return true;
    }
    public Float(float a0){}
    public Float(double a0){}
    public boolean isNaN(){ return true;}
    public boolean isInfinite(){ return true;}
    public String toString(){ return "" + "Float";}
    public byte byteValue(){ return (byte)0;}
    public short shortValue(){ return 0;}
    public int intValue(){ return 0;}
    public long longValue(){ return 0L;}
    public float floatValue(){ return 0.0f;}
    public double doubleValue(){ return 0.0;}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
    public static int floatToIntBits(float a0){ return 0;}
    public static float intBitsToFloat(int a0){ 
	return 0.0f;
    }
}

