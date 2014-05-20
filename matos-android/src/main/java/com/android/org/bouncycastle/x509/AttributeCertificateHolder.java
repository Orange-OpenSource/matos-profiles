package com.android.org.bouncycastle.x509;

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
public class AttributeCertificateHolder
  implements java.security.cert.CertSelector, com.android.org.bouncycastle.util.Selector
{
  // Constructors

  AttributeCertificateHolder(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
  }
  public AttributeCertificateHolder(com.android.org.bouncycastle.jce.X509Principal arg1, java.math.BigInteger arg2){
  }
  public AttributeCertificateHolder(javax.security.auth.x500.X500Principal arg1, java.math.BigInteger arg2){
  }
  public AttributeCertificateHolder(java.security.cert.X509Certificate arg1) throws java.security.cert.CertificateParsingException{
  }
  public AttributeCertificateHolder(com.android.org.bouncycastle.jce.X509Principal arg1){
  }
  public AttributeCertificateHolder(javax.security.auth.x500.X500Principal arg1){
  }
  public AttributeCertificateHolder(int arg1, java.lang.String arg2, java.lang.String arg3, byte [] arg4){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public boolean match(java.security.cert.Certificate arg1){
    return false;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public java.security.Principal [] getIssuer(){
    return (java.security.Principal []) null;
  }
  public java.lang.String getDigestAlgorithm(){
    return (java.lang.String) null;
  }
  public int getDigestedObjectType(){
    return 0;
  }
  public java.lang.String getOtherObjectTypeID(){
    return (java.lang.String) null;
  }
  public byte [] getObjectDigest(){
    return (byte []) null;
  }
  public java.security.Principal [] getEntityNames(){
    return (java.security.Principal []) null;
  }
}
