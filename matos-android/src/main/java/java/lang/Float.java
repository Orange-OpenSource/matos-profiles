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


public final class Float
  extends Number  implements Comparable<Float>
{
  // Fields

  public static final float MAX_VALUE = 3.4028235E38f;

  public static final float MIN_VALUE = 1.4E-45f;

  public static final float NaN = 0f/0f;

  public static final float POSITIVE_INFINITY = 1f/0f;

  public static final float NEGATIVE_INFINITY = -1f/0f;

  public static final float MIN_NORMAL = 1.17549435E-38f;

  public static final int MAX_EXPONENT = 127;

  public static final int MIN_EXPONENT = -126;

  public static final Class<Float> TYPE = null;

  public static final int SIZE = 32;

  // Constructors

  public Float(float arg1){
    super();
  }
  public Float(double arg1){
    super();
  }
  public Float(String arg1) throws NumberFormatException{
    super();
  }
  // Methods

  public boolean equals(Object arg1){
    return false;
  }
  public String toString(){
    return (String) null;
  }
  public static String toString(float arg1){
    return (String) null;
  }
  public int hashCode(){
    return 0;
  }
  public static int floatToRawIntBits(float arg1){
    return 0;
  }
  public static int floatToIntBits(float arg1){
    return 0;
  }
  public static float intBitsToFloat(int arg1){
    return 0.0f;
  }
  public int compareTo(Float arg1){
    return 0;
  }
  public byte byteValue(){
    return (byte) 0;
  }
  public short shortValue(){
    return (short) 0;
  }
  public int intValue(){
    return 0;
  }
  public long longValue(){
    return 0l;
  }
  public float floatValue(){
    return 0.0f;
  }
  public double doubleValue(){
    return 0.0d;
  }
  public static Float valueOf(String arg1) throws NumberFormatException{
    return (Float) null;
  }
  public static Float valueOf(float arg1){
    return (Float) null;
  }
  public static String toHexString(float arg1){
    return (String) null;
  }
  public static int compare(float arg1, float arg2){
    return 0;
  }
  public boolean isNaN(){
    return false;
  }
  public static boolean isNaN(float arg1){
    return false;
  }
  public boolean isInfinite(){
    return false;
  }
  public static boolean isInfinite(float arg1){
    return false;
  }
  public static float parseFloat(String arg1) throws NumberFormatException{
    return 0.0f;
  }
}
