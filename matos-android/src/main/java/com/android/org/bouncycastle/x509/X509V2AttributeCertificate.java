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
public class X509V2AttributeCertificate
  implements X509AttributeCertificate
{
  // Constructors

  public X509V2AttributeCertificate(java.io.InputStream arg1) throws java.io.IOException{
  }
  public X509V2AttributeCertificate(byte [] arg1) throws java.io.IOException{
  }
  X509V2AttributeCertificate(com.android.org.bouncycastle.asn1.x509.AttributeCertificate arg1) throws java.io.IOException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public byte [] getSignature(){
    return (byte []) null;
  }
  public X509Attribute [] getAttributes(){
    return (X509Attribute []) null;
  }
  public X509Attribute [] getAttributes(java.lang.String arg1){
    return (X509Attribute []) null;
  }
  public byte [] getEncoded() throws java.io.IOException{
    return (byte []) null;
  }
  public final void verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException{
  }
  public int getVersion(){
    return 0;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public AttributeCertificateIssuer getIssuer(){
    return (AttributeCertificateIssuer) null;
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
  public AttributeCertificateHolder getHolder(){
    return (AttributeCertificateHolder) null;
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
}
