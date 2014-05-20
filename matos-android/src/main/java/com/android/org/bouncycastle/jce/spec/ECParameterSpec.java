package com.android.org.bouncycastle.jce.spec;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ECParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
  // Constructors

  public ECParameterSpec(@com.francetelecom.rd.stubs.annotation.FieldSet("curve") com.android.org.bouncycastle.math.ec.ECCurve arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("g") com.android.org.bouncycastle.math.ec.ECPoint arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("n") java.math.BigInteger arg3){
  }
  public ECParameterSpec(@com.francetelecom.rd.stubs.annotation.FieldSet("curve") com.android.org.bouncycastle.math.ec.ECCurve arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("g") com.android.org.bouncycastle.math.ec.ECPoint arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("n") java.math.BigInteger arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("h") java.math.BigInteger arg4){
  }
  public ECParameterSpec(@com.francetelecom.rd.stubs.annotation.FieldSet("curve") com.android.org.bouncycastle.math.ec.ECCurve arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("g") com.android.org.bouncycastle.math.ec.ECPoint arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("n") java.math.BigInteger arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("h") java.math.BigInteger arg4, @com.francetelecom.rd.stubs.annotation.FieldSet("seed") byte [] arg5){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("curve")
  public com.android.org.bouncycastle.math.ec.ECCurve getCurve(){
    return (com.android.org.bouncycastle.math.ec.ECCurve) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("g")
  public com.android.org.bouncycastle.math.ec.ECPoint getG(){
    return (com.android.org.bouncycastle.math.ec.ECPoint) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("seed")
  public byte [] getSeed(){
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("n")
  public java.math.BigInteger getN(){
    return (java.math.BigInteger) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("h")
  public java.math.BigInteger getH(){
    return (java.math.BigInteger) null;
  }
}
