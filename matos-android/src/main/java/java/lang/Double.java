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


public final class Double
  extends Number  implements Comparable<Double>
{
  // Fields

  public static final double MAX_VALUE = 1.7976931348623157E308d;

  public static final double MIN_VALUE = 4.9E-324d;

  public static final double NaN = 0d/0d;

  public static final double POSITIVE_INFINITY = 1d/0d;

  public static final double NEGATIVE_INFINITY = -1d/0d;

  public static final double MIN_NORMAL = 2.2250738585072014E-308d;

  public static final int MAX_EXPONENT = 1023;

  public static final int MIN_EXPONENT = -1022;

  public static final Class<Double> TYPE = null;

  public static final int SIZE = 64;

  // Constructors

  public Double(double arg1){
    super();
  }
  public Double(String arg1) throws NumberFormatException{
    super();
  }
  // Methods

  public boolean equals(Object arg1){
    return false;
  }
  public String toString(){
    return (String) null;
  }
  public static String toString(double arg1){
    return (String) null;
  }
  public int hashCode(){
    return 0;
  }
  public static long doubleToRawLongBits(double arg1){
    return 0l;
  }
  public static long doubleToLongBits(double arg1){
    return 0l;
  }
  public static double longBitsToDouble(long arg1){
    return 0.0d;
  }
  public int compareTo(Double arg1){
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
  public static Double valueOf(String arg1) throws NumberFormatException{
    return (Double) null;
  }
  public static Double valueOf(double arg1){
    return (Double) null;
  }
  public static String toHexString(double arg1){
    return (String) null;
  }
  public static int compare(double arg1, double arg2){
    return 0;
  }
  public boolean isNaN(){
    return false;
  }
  public static boolean isNaN(double arg1){
    return false;
  }
  public boolean isInfinite(){
    return false;
  }
  public static boolean isInfinite(double arg1){
    return false;
  }
  public static double parseDouble(String arg1) throws NumberFormatException{
    return 0.0d;
  }
}
