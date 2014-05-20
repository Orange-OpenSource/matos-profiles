package com.android.org.bouncycastle.asn1.x9;

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
public class X9ECParameters
  extends com.android.org.bouncycastle.asn1.ASN1Encodable  implements X9ObjectIdentifiers
{
  // Constructors

  public X9ECParameters(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public X9ECParameters(com.android.org.bouncycastle.math.ec.ECCurve arg1, com.android.org.bouncycastle.math.ec.ECPoint arg2, java.math.BigInteger arg3){
    super();
  }
  public X9ECParameters(com.android.org.bouncycastle.math.ec.ECCurve arg1, com.android.org.bouncycastle.math.ec.ECPoint arg2, java.math.BigInteger arg3, java.math.BigInteger arg4){
    super();
  }
  public X9ECParameters(com.android.org.bouncycastle.math.ec.ECCurve arg1, com.android.org.bouncycastle.math.ec.ECPoint arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, byte [] arg5){
    super();
  }
  // Methods

  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.math.ec.ECCurve getCurve(){
    return (com.android.org.bouncycastle.math.ec.ECCurve) null;
  }
  public com.android.org.bouncycastle.math.ec.ECPoint getG(){
    return (com.android.org.bouncycastle.math.ec.ECPoint) null;
  }
  public byte [] getSeed(){
    return (byte []) null;
  }
  public java.math.BigInteger getN(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getH(){
    return (java.math.BigInteger) null;
  }
}
