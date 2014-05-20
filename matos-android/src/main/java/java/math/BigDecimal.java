package java.math;

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


public class BigDecimal
  extends java.lang.Number  implements java.lang.Comparable<BigDecimal>, java.io.Serializable
{
  // Fields

  public static final int ROUND_UP = 0;

  public static final int ROUND_DOWN = 1;

  public static final int ROUND_CEILING = 2;

  public static final int ROUND_FLOOR = 3;

  public static final int ROUND_HALF_UP = 4;

  public static final int ROUND_HALF_DOWN = 5;

  public static final int ROUND_HALF_EVEN = 6;

  public static final int ROUND_UNNECESSARY = 7;

  public static final BigDecimal ZERO = null;

  public static final BigDecimal ONE = null;

  public static final BigDecimal TEN = null;

  // Constructors

  private BigDecimal(long arg1, int arg2){
    super();
  }
  private BigDecimal(int arg1, int arg2){
    super();
  }
  public BigDecimal(char [] arg1, int arg2, int arg3){
    super();
  }
  public BigDecimal(char [] arg1, int arg2, int arg3, MathContext arg4){
    super();
  }
  public BigDecimal(char [] arg1){
    super();
  }
  public BigDecimal(char [] arg1, MathContext arg2){
    super();
  }
  public BigDecimal(java.lang.String arg1){
    super();
  }
  public BigDecimal(java.lang.String arg1, MathContext arg2){
    super();
  }
  public BigDecimal(double arg1){
    super();
  }
  public BigDecimal(double arg1, MathContext arg2){
    super();
  }
  public BigDecimal(BigInteger arg1){
    super();
  }
  public BigDecimal(BigInteger arg1, MathContext arg2){
    super();
  }
  public BigDecimal(BigInteger arg1, int arg2){
    super();
  }
  public BigDecimal(BigInteger arg1, int arg2, MathContext arg3){
    super();
  }
  public BigDecimal(int arg1){
    super();
  }
  public BigDecimal(int arg1, MathContext arg2){
    super();
  }
  public BigDecimal(long arg1){
    super();
  }
  public BigDecimal(long arg1, MathContext arg2){
    super();
  }
  // Methods

  public BigDecimal add(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal add(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public BigDecimal abs(){
    return (BigDecimal) null;
  }
  public BigDecimal abs(MathContext arg1){
    return (BigDecimal) null;
  }
  public BigDecimal pow(int arg1){
    return (BigDecimal) null;
  }
  public BigDecimal pow(int arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal min(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal max(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public int compareTo(BigDecimal arg1){
    return 0;
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
  public static BigDecimal valueOf(long arg1, int arg2){
    return (BigDecimal) null;
  }
  public static BigDecimal valueOf(long arg1){
    return (BigDecimal) null;
  }
  public static BigDecimal valueOf(double arg1){
    return (BigDecimal) null;
  }
  public int signum(){
    return 0;
  }
  public BigDecimal round(MathContext arg1){
    return (BigDecimal) null;
  }
  public BigDecimal ulp(){
    return (BigDecimal) null;
  }
  public int scale(){
    return 0;
  }
  public BigDecimal setScale(int arg1, RoundingMode arg2){
    return (BigDecimal) null;
  }
  public BigDecimal setScale(int arg1, int arg2){
    return (BigDecimal) null;
  }
  public BigDecimal setScale(int arg1){
    return (BigDecimal) null;
  }
  public BigDecimal subtract(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal subtract(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal negate(){
    return (BigDecimal) null;
  }
  public BigDecimal negate(MathContext arg1){
    return (BigDecimal) null;
  }
  public BigDecimal multiply(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal multiply(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal plus(){
    return (BigDecimal) null;
  }
  public BigDecimal plus(MathContext arg1){
    return (BigDecimal) null;
  }
  public int precision(){
    return 0;
  }
  public BigInteger toBigInteger(){
    return (BigInteger) null;
  }
  public BigDecimal remainder(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal remainder(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal movePointRight(int arg1){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1, int arg2, int arg3){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1, int arg2, RoundingMode arg3){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1, int arg2){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1, RoundingMode arg2){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal divide(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal divideToIntegralValue(BigDecimal arg1){
    return (BigDecimal) null;
  }
  public BigDecimal divideToIntegralValue(BigDecimal arg1, MathContext arg2){
    return (BigDecimal) null;
  }
  public BigDecimal [] divideAndRemainder(BigDecimal arg1){
    return (BigDecimal []) null;
  }
  public BigDecimal [] divideAndRemainder(BigDecimal arg1, MathContext arg2){
    return (BigDecimal []) null;
  }
  public BigInteger unscaledValue(){
    return (BigInteger) null;
  }
  public BigDecimal movePointLeft(int arg1){
    return (BigDecimal) null;
  }
  public BigDecimal scaleByPowerOfTen(int arg1){
    return (BigDecimal) null;
  }
  public BigDecimal stripTrailingZeros(){
    return (BigDecimal) null;
  }
  public java.lang.String toEngineeringString(){
    return (java.lang.String) null;
  }
  public java.lang.String toPlainString(){
    return (java.lang.String) null;
  }
  public BigInteger toBigIntegerExact(){
    return (BigInteger) null;
  }
  public long longValueExact(){
    return 0l;
  }
  public int intValueExact(){
    return 0;
  }
  public short shortValueExact(){
    return (short) 0;
  }
  public byte byteValueExact(){
    return (byte) 0;
  }
}
