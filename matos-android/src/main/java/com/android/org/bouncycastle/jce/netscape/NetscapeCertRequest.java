package com.android.org.bouncycastle.jce.netscape;

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
public class NetscapeCertRequest
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public NetscapeCertRequest(byte [] arg1) throws java.io.IOException{
    super();
  }
  public NetscapeCertRequest(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public NetscapeCertRequest(@com.francetelecom.rd.stubs.annotation.FieldSet("mChalange") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mSigningAlgorithm") com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg3) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException{
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mPublicKey")
  public java.security.PublicKey getPublicKey(){
    return (java.security.PublicKey) null;
  }
  public boolean verify(java.lang.String arg1) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException{
    return false;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public void setChallenge(@com.francetelecom.rd.stubs.annotation.FieldSet("mChallenge") java.lang.String arg1){
  }
  public void sign(java.security.PrivateKey arg1) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException{
  }
  public void sign(java.security.PrivateKey arg1, java.security.SecureRandom arg2) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException{
  }
  public void setPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mChallenge")
  public java.lang.String getChallenge(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSigningAlgorithm")
  public com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigningAlgorithm(){
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
  public void setSigningAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("mSigningAlgorithm") com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mKeyAlgorithm")
  public com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyAlgorithm(){
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
  public void setKeyAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("mKeyAlgorithm") com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg1){
  }
}
