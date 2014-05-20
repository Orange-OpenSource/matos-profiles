package com.android.org.bouncycastle.math.ec;

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


public abstract class ECFieldElement
  implements ECConstants
{
  // Classes

  public static class Fp
    extends ECFieldElement  {
    // Constructors

    public Fp(java.math.BigInteger arg1, java.math.BigInteger arg2){
      super();
    }
    // Methods

    public ECFieldElement add(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    public ECFieldElement sqrt(){
      return (ECFieldElement) null;
    }
    public java.math.BigInteger getQ(){
      return (java.math.BigInteger) null;
    }
    public int getFieldSize(){
      return 0;
    }
    public ECFieldElement invert(){
      return (ECFieldElement) null;
    }
    public ECFieldElement subtract(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public ECFieldElement negate(){
      return (ECFieldElement) null;
    }
    public ECFieldElement multiply(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public java.math.BigInteger toBigInteger(){
      return (java.math.BigInteger) null;
    }
    public ECFieldElement divide(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public ECFieldElement square(){
      return (ECFieldElement) null;
    }
    public java.lang.String getFieldName(){
      return (java.lang.String) null;
    }
  }
  public static class F2m
    extends ECFieldElement  {
    // Fields

    public static final int GNB = 1;

    public static final int TPB = 2;

    public static final int PPB = 3;

    // Constructors

    public F2m(int arg1, int arg2, int arg3, int arg4, java.math.BigInteger arg5){
      super();
    }
    public F2m(int arg1, int arg2, java.math.BigInteger arg3){
      super();
    }
    // Methods

    public ECFieldElement add(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    public ECFieldElement sqrt(){
      return (ECFieldElement) null;
    }
    public int getFieldSize(){
      return 0;
    }
    public ECFieldElement invert(){
      return (ECFieldElement) null;
    }
    public ECFieldElement subtract(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public ECFieldElement negate(){
      return (ECFieldElement) null;
    }
    public ECFieldElement multiply(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public java.math.BigInteger toBigInteger(){
      return (java.math.BigInteger) null;
    }
    public ECFieldElement divide(ECFieldElement arg1){
      return (ECFieldElement) null;
    }
    public ECFieldElement square(){
      return (ECFieldElement) null;
    }
    public java.lang.String getFieldName(){
      return (java.lang.String) null;
    }
    public int getM(){
      return 0;
    }
    public int getK1(){
      return 0;
    }
    public int getK3(){
      return 0;
    }
    public int getK2(){
      return 0;
    }
    public static void checkFieldElements(ECFieldElement arg1, ECFieldElement arg2){
    }
    public int getRepresentation(){
      return 0;
    }
  }
  // Constructors

  public ECFieldElement(){
  }
  // Methods

  public abstract ECFieldElement add(ECFieldElement arg1);
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract ECFieldElement sqrt();
  public abstract int getFieldSize();
  public abstract ECFieldElement invert();
  public abstract ECFieldElement subtract(ECFieldElement arg1);
  public abstract ECFieldElement negate();
  public abstract ECFieldElement multiply(ECFieldElement arg1);
  public abstract java.math.BigInteger toBigInteger();
  public abstract ECFieldElement divide(ECFieldElement arg1);
  public abstract ECFieldElement square();
  public abstract java.lang.String getFieldName();
}
