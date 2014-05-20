package com.android.org.bouncycastle.jce;

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
public class PKCS10CertificationRequest
  extends com.android.org.bouncycastle.asn1.pkcs.CertificationRequest{
  // Constructors

  public PKCS10CertificationRequest(@com.francetelecom.rd.stubs.annotation.FieldSet("mEncoded") byte [] arg1){
    super();
  }
  public PKCS10CertificationRequest(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public PKCS10CertificationRequest(java.lang.String arg1, com.android.org.bouncycastle.asn1.x509.X509Name arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg3, com.android.org.bouncycastle.asn1.ASN1Set arg4, java.security.PrivateKey arg5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    super();
  }
  public PKCS10CertificationRequest(java.lang.String arg1, javax.security.auth.x500.X500Principal arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg3, com.android.org.bouncycastle.asn1.ASN1Set arg4, java.security.PrivateKey arg5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    super();
  }
  public PKCS10CertificationRequest(java.lang.String arg1, javax.security.auth.x500.X500Principal arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg3, com.android.org.bouncycastle.asn1.ASN1Set arg4, java.security.PrivateKey arg5, java.lang.String arg6) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    super();
  }
  public PKCS10CertificationRequest(java.lang.String arg1, com.android.org.bouncycastle.asn1.x509.X509Name arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") java.security.PublicKey arg3, com.android.org.bouncycastle.asn1.ASN1Set arg4, java.security.PrivateKey arg5, java.lang.String arg6) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mEncoded")
  public byte [] getEncoded(){
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPublicKey") 
  public java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException{
    return (java.security.PublicKey) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPublicKey") 
  public java.security.PublicKey getPublicKey(java.lang.String arg1) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException{
    return (java.security.PublicKey) null;
  }
  public boolean verify() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    return false;
  }
  public boolean verify(java.lang.String arg1) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    return false;
  }
  public boolean verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException{
    return false;
  }
}
