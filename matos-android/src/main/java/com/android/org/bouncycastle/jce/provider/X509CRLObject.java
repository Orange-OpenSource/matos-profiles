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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class X509CRLObject
  extends java.security.cert.X509CRL{
  // Constructors

  public X509CRLObject(com.android.org.bouncycastle.asn1.x509.CertificateList arg1) throws java.security.cert.CRLException{
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public byte [] getSignature(){
    return (byte []) null;
  }
  public byte [] getEncoded() throws java.security.cert.CRLException{
    return (byte []) null;
  }
  public void verify(java.security.PublicKey arg1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public void verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public java.security.Principal getIssuerDN(){
    return (java.security.Principal) null;
  }
  public int getVersion(){
    return 0;
  }
  public javax.security.auth.x500.X500Principal getIssuerX500Principal(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public java.util.Date getThisUpdate(){
    return (java.util.Date) null;
  }
  public java.util.Date getNextUpdate(){
    return (java.util.Date) null;
  }
  public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger arg1){
    return (java.security.cert.X509CRLEntry) null;
  }
  public java.util.Set getRevokedCertificates(){
    return (java.util.Set) null;
  }
  public byte [] getTBSCertList() throws java.security.cert.CRLException{
    return (byte []) null;
  }
  public java.lang.String getSigAlgName(){
    return (java.lang.String) null;
  }
  public java.lang.String getSigAlgOID(){
    return (java.lang.String) null;
  }
  public byte [] getSigAlgParams(){
    return (byte []) null;
  }
  public java.util.Set getCriticalExtensionOIDs(){
    return (java.util.Set) null;
  }
  public byte [] getExtensionValue(java.lang.String arg1){
    return (byte []) null;
  }
  public java.util.Set getNonCriticalExtensionOIDs(){
    return (java.util.Set) null;
  }
  public boolean hasUnsupportedCriticalExtension(){
    return false;
  }
  public boolean isRevoked(java.security.cert.Certificate arg1){
    return false;
  }
}
