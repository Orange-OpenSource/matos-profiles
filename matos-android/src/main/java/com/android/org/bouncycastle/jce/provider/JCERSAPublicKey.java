package com.android.org.bouncycastle.jce.provider;

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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class JCERSAPublicKey
  implements java.security.interfaces.RSAPublicKey
{
  // Constructors

  JCERSAPublicKey(com.android.org.bouncycastle.crypto.params.RSAKeyParameters arg1){
  }
  JCERSAPublicKey(@CallBackRegister("rsaPublicKeySpec") java.security.spec.RSAPublicKeySpec arg1){
  }
  JCERSAPublicKey(@CallBackRegister("publicExponent") java.security.interfaces.RSAPublicKey arg1){
  }
  JCERSAPublicKey(com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public java.math.BigInteger getModulus(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPublicExponent(){
    return (java.math.BigInteger) null;
  }
}
