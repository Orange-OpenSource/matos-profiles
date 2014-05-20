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
public class X509CertificateObject
  extends java.security.cert.X509Certificate  implements com.android.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
{
  // Constructors

  public X509CertificateObject(com.android.org.bouncycastle.asn1.x509.X509CertificateStructure arg1) throws java.security.cert.CertificateParsingException{
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized int hashCode(){
    return 0;
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
  public final void verify(java.security.PublicKey arg1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public final void verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
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
  public void setBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mBagAttribute") com.android.org.bouncycastle.asn1.DEREncodable arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mBagAttribute")
  public com.android.org.bouncycastle.asn1.DEREncodable getBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1){
    return (com.android.org.bouncycastle.asn1.DEREncodable) null;
  }
  public java.util.Enumeration getBagAttributeKeys(){
    return (java.util.Enumeration) null;
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
  public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException{
    return (java.util.List) null;
  }
}
