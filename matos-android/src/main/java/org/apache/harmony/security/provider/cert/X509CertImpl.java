package org.apache.harmony.security.provider.cert;

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
public final class X509CertImpl
  extends java.security.cert.X509Certificate{
  // Constructors

  public X509CertImpl(java.io.InputStream arg1) throws java.security.cert.CertificateException{
    super();
  }
  public X509CertImpl(org.apache.harmony.security.x509.Certificate arg1){
    super();
  }
  public X509CertImpl(byte [] arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public byte [] getSignature(){
    return (byte []) null;
  }
  public int getBasicConstraints(){
    return 0;
  }
  public byte [] getEncoded() throws java.security.cert.CertificateEncodingException{
    return (byte []) null;
  }
  public java.security.PublicKey getPublicKey(){
    return (java.security.PublicKey) null;
  }
  public void verify(java.security.PublicKey arg1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public void verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public java.security.Principal getIssuerDN(){
    return (java.security.Principal) null;
  }
  public java.security.Principal getSubjectDN(){
    return (java.security.Principal) null;
  }
  public javax.security.auth.x500.X500Principal getSubjectX500Principal(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public int getVersion(){
    return 0;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public javax.security.auth.x500.X500Principal getIssuerX500Principal(){
    return (javax.security.auth.x500.X500Principal) null;
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
  public java.util.Set<java.lang.String> getCriticalExtensionOIDs(){
    return (java.util.Set) null;
  }
  public byte [] getExtensionValue(java.lang.String arg1){
    return (byte []) null;
  }
  public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs(){
    return (java.util.Set) null;
  }
  public boolean hasUnsupportedCriticalExtension(){
    return false;
  }
  public java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException{
    return (java.util.Collection) null;
  }
  public java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException{
    return (java.util.Collection) null;
  }
  public java.util.Date getNotBefore(){
    return (java.util.Date) null;
  }
  public java.util.Date getNotAfter(){
    return (java.util.Date) null;
  }
  public boolean [] getIssuerUniqueID(){
    return (boolean []) null;
  }
  public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException{
  }
  public void checkValidity(java.util.Date arg1) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException{
  }
  public boolean [] getKeyUsage(){
    return (boolean []) null;
  }
  public byte [] getTBSCertificate() throws java.security.cert.CertificateEncodingException{
    return (byte []) null;
  }
  public boolean [] getSubjectUniqueID(){
    return (boolean []) null;
  }
  public java.util.List<java.lang.String> getExtendedKeyUsage() throws java.security.cert.CertificateParsingException{
    return (java.util.List) null;
  }
}
