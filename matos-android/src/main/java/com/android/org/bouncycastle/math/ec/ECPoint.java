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


public abstract class ECPoint
{
  // Classes

  public static class Fp
    extends ECPoint  {
    // Constructors

    public Fp(ECCurve arg1, ECFieldElement arg2, ECFieldElement arg3){
      super((ECCurve) null, (ECFieldElement) null, (ECFieldElement) null);
    }
    public Fp(ECCurve arg1, ECFieldElement arg2, ECFieldElement arg3, boolean arg4){
      super((ECCurve) null, (ECFieldElement) null, (ECFieldElement) null);
    }
    // Methods

    public ECPoint add(ECPoint arg1){
      return (ECPoint) null;
    }
    public byte [] getEncoded(){
      return (byte []) null;
    }
    public ECPoint subtract(ECPoint arg1){
      return (ECPoint) null;
    }
    public ECPoint negate(){
      return (ECPoint) null;
    }
    public ECPoint twice(){
      return (ECPoint) null;
    }
  }
  public static class F2m
    extends ECPoint  {
    // Constructors

    public F2m(ECCurve arg1, ECFieldElement arg2, ECFieldElement arg3){
      super((ECCurve) null, (ECFieldElement) null, (ECFieldElement) null);
    }
    public F2m(ECCurve arg1, ECFieldElement arg2, ECFieldElement arg3, boolean arg4){
      super((ECCurve) null, (ECFieldElement) null, (ECFieldElement) null);
    }
    // Methods

    public ECPoint add(ECPoint arg1){
      return (ECPoint) null;
    }
    public byte [] getEncoded(){
      return (byte []) null;
    }
    public ECPoint subtract(ECPoint arg1){
      return (ECPoint) null;
    }
    public ECPoint negate(){
      return (ECPoint) null;
    }
    public ECPoint twice(){
      return (ECPoint) null;
    }
    public ECPoint.F2m addSimple(ECPoint.F2m arg1){
      return (ECPoint.F2m) null;
    }
    public ECPoint.F2m subtractSimple(ECPoint.F2m arg1){
      return (ECPoint.F2m) null;
    }
  }
  // Fields

  protected boolean withCompression;

  // Constructors

  protected ECPoint(ECCurve arg1, ECFieldElement arg2, ECFieldElement arg3){
  }
  // Methods

  public abstract ECPoint add(ECPoint arg1);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public abstract byte [] getEncoded();
  public ECFieldElement getX(){
    return (ECFieldElement) null;
  }
  public ECFieldElement getY(){
    return (ECFieldElement) null;
  }
  public ECCurve getCurve(){
    return (ECCurve) null;
  }
  public abstract ECPoint subtract(ECPoint arg1);
  public abstract ECPoint negate();
  public abstract ECPoint twice();
  public ECPoint multiply(java.math.BigInteger arg1){
    return (ECPoint) null;
  }
  public boolean isInfinity(){
    return false;
  }
  public boolean isCompressed(){
    return false;
  }
}
