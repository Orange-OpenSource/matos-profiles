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


public abstract class ECCurve
{
  // Classes

  public static class Fp
    extends ECCurve  {
    // Constructors

    public Fp(java.math.BigInteger arg1, java.math.BigInteger arg2, java.math.BigInteger arg3){
      super();
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    public java.math.BigInteger getQ(){
      return (java.math.BigInteger) null;
    }
    public ECPoint getInfinity(){
      return (ECPoint) null;
    }
    public int getFieldSize(){
      return 0;
    }
    public ECFieldElement fromBigInteger(java.math.BigInteger arg1){
      return (ECFieldElement) null;
    }
    public ECPoint createPoint(java.math.BigInteger arg1, java.math.BigInteger arg2, boolean arg3){
      return (ECPoint) null;
    }
    public ECPoint decodePoint(byte [] arg1){
      return (ECPoint) null;
    }
  }
  public static class F2m
    extends ECCurve  {
    // Constructors

    public F2m(int arg1, int arg2, java.math.BigInteger arg3, java.math.BigInteger arg4){
      super();
    }
    public F2m(int arg1, int arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, java.math.BigInteger arg5, java.math.BigInteger arg6){
      super();
    }
    public F2m(int arg1, int arg2, int arg3, int arg4, java.math.BigInteger arg5, java.math.BigInteger arg6){
      super();
    }
    public F2m(int arg1, int arg2, int arg3, int arg4, java.math.BigInteger arg5, java.math.BigInteger arg6, java.math.BigInteger arg7, java.math.BigInteger arg8){
      super();
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    public ECPoint getInfinity(){
      return (ECPoint) null;
    }
    public int getFieldSize(){
      return 0;
    }
    public java.math.BigInteger getN(){
      return (java.math.BigInteger) null;
    }
    public java.math.BigInteger getH(){
      return (java.math.BigInteger) null;
    }
    public ECFieldElement fromBigInteger(java.math.BigInteger arg1){
      return (ECFieldElement) null;
    }
    public ECPoint createPoint(java.math.BigInteger arg1, java.math.BigInteger arg2, boolean arg3){
      return (ECPoint) null;
    }
    public ECPoint decodePoint(byte [] arg1){
      return (ECPoint) null;
    }
    public int getM(){
      return 0;
    }
    public boolean isTrinomial(){
      return false;
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
    public boolean isKoblitz(){
      return false;
    }
  }
  // Constructors

  public ECCurve(){
  }
  // Methods

  public abstract ECPoint getInfinity();
  public abstract int getFieldSize();
  public ECFieldElement getA(){
    return (ECFieldElement) null;
  }
  public ECFieldElement getB(){
    return (ECFieldElement) null;
  }
  public abstract ECFieldElement fromBigInteger(java.math.BigInteger arg1);
  public abstract ECPoint createPoint(java.math.BigInteger arg1, java.math.BigInteger arg2, boolean arg3);
  public abstract ECPoint decodePoint(byte [] arg1);
}
