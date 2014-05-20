package com.android.org.bouncycastle.asn1.pkcs;

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
public class RSAPrivateKeyStructure
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public RSAPrivateKeyStructure(java.math.BigInteger arg1, java.math.BigInteger arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, java.math.BigInteger arg5, java.math.BigInteger arg6, java.math.BigInteger arg7, java.math.BigInteger arg8){
    super();
  }
  public RSAPrivateKeyStructure(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static RSAPrivateKeyStructure getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (RSAPrivateKeyStructure) null;
  }
  public static RSAPrivateKeyStructure getInstance(java.lang.Object arg1){
    return (RSAPrivateKeyStructure) null;
  }
  public int getVersion(){
    return 0;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public java.math.BigInteger getModulus(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPublicExponent(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrivateExponent(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrime1(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrime2(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getExponent1(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getExponent2(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getCoefficient(){
    return (java.math.BigInteger) null;
  }
}
