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
public class X509V3CertificateGenerator
{
  // Constructors

  public X509V3CertificateGenerator(){
  }
  // Methods

  public void reset(){
  }
  public java.security.cert.X509Certificate generate(java.security.PrivateKey arg1) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generate(java.security.PrivateKey arg1, java.security.SecureRandom arg2) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generate(java.security.PrivateKey arg1, java.lang.String arg2) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generate(java.security.PrivateKey arg1, java.lang.String arg2, java.security.SecureRandom arg3) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public void setSerialNumber(java.math.BigInteger arg1){
  }
  public void setIssuerUniqueID(boolean [] arg1){
  }
  public void setSubjectUniqueID(boolean [] arg1){
  }
  public void setIssuerDN(javax.security.auth.x500.X500Principal arg1){
  }
  public void setIssuerDN(com.android.org.bouncycastle.asn1.x509.X509Name arg1){
  }
  public void setNotBefore(java.util.Date arg1){
  }
  public void setNotAfter(java.util.Date arg1){
  }
  public void setSubjectDN(javax.security.auth.x500.X500Principal arg1){
  }
  public void setSubjectDN(com.android.org.bouncycastle.asn1.x509.X509Name arg1){
  }
  public void setPublicKey(java.security.PublicKey arg1) throws java.lang.IllegalArgumentException{
  }
  public void setSignatureAlgorithm(java.lang.String arg1){
  }
  public void addExtension(java.lang.String arg1, boolean arg2, com.android.org.bouncycastle.asn1.DEREncodable arg3){
  }
  public void addExtension(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, boolean arg2, com.android.org.bouncycastle.asn1.DEREncodable arg3){
  }
  public void addExtension(java.lang.String arg1, boolean arg2, byte [] arg3){
  }
  public void addExtension(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, boolean arg2, byte [] arg3){
  }
  public void copyAndAddExtension(java.lang.String arg1, boolean arg2, java.security.cert.X509Certificate arg3) throws java.security.cert.CertificateParsingException{
  }
  public void copyAndAddExtension(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, boolean arg2, java.security.cert.X509Certificate arg3) throws java.security.cert.CertificateParsingException{
  }
  public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey arg1) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey arg1, java.security.SecureRandom arg2) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey arg1, java.lang.String arg2) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey arg1, java.lang.String arg2, java.security.SecureRandom arg3) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException{
    return (java.security.cert.X509Certificate) null;
  }
  public java.util.Iterator getSignatureAlgNames(){
    return (java.util.Iterator) null;
  }
}
