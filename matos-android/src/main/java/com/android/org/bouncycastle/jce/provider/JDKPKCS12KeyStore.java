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
public class JDKPKCS12KeyStore
  extends java.security.KeyStoreSpi  implements com.android.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, com.android.org.bouncycastle.jce.interfaces.BCKeyStore, com.android.org.bouncycastle.asn1.x509.X509ObjectIdentifiers
{
  // Classes

  public static class BCPKCS12KeyStore
    extends JDKPKCS12KeyStore  {
    // Constructors

    public BCPKCS12KeyStore(){
      super((java.security.Provider) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
  }
  // Fields

  protected java.security.SecureRandom random;

  // Constructors

  public JDKPKCS12KeyStore(java.security.Provider arg1, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg2, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg3){
    super();
  }
  // Methods

  public void setRandom(@com.francetelecom.rd.stubs.annotation.FieldSet("this.random") java.security.SecureRandom arg1){
  }
  public java.util.Enumeration engineAliases(){
    return (java.util.Enumeration) null;
  }
  public boolean engineContainsAlias(java.lang.String arg1){
    return false;
  }
  public void engineDeleteEntry(java.lang.String arg1) throws java.security.KeyStoreException{
  }
  @com.francetelecom.rd.stubs.annotation.Code("return mCertificateChain[0];")
  public java.security.cert.Certificate engineGetCertificate(java.lang.String arg1){
    return (java.security.cert.Certificate) null;
  }
  public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCertificateChain")
  public java.security.cert.Certificate [] engineGetCertificateChain(java.lang.String arg1){
    return (java.security.cert.Certificate []) null;
  }
  public java.util.Date engineGetCreationDate(java.lang.String arg1){
    return (java.util.Date) null;
  }
  public java.security.Key engineGetKey(java.lang.String arg1, char [] arg2) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException{
    return (java.security.Key) null;
  }
  public boolean engineIsCertificateEntry(java.lang.String arg1){
    return false;
  }
  public boolean engineIsKeyEntry(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("mCertificateChain[0]=arg2;")
  public void engineSetCertificateEntry(java.lang.String arg1,   java.security.cert.Certificate arg2) throws java.security.KeyStoreException{
  }
  public void engineSetKeyEntry(java.lang.String arg1, byte [] arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mCertificateChain") java.security.cert.Certificate [] arg3) throws java.security.KeyStoreException{
  }
  public void engineSetKeyEntry(java.lang.String arg1, java.security.Key arg2, char [] arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mCertificateChain") java.security.cert.Certificate [] arg4) throws java.security.KeyStoreException{
  }
  public int engineSize(){
    return 0;
  }
  public void engineLoad(java.io.InputStream arg1, char [] arg2) throws java.io.IOException{
  }
  public void engineStore(java.security.KeyStore.LoadStoreParameter arg1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public void engineStore(java.io.OutputStream arg1, char [] arg2) throws java.io.IOException{
  }
  protected java.security.PrivateKey unwrapKey(com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg1, byte [] arg2, char [] arg3, boolean arg4) throws java.io.IOException{
    return (java.security.PrivateKey) null;
  }
  protected byte [] wrapKey(java.lang.String arg1, java.security.Key arg2, com.android.org.bouncycastle.asn1.pkcs.PKCS12PBEParams arg3, char [] arg4) throws java.io.IOException{
    return (byte []) null;
  }
  protected byte [] cryptData(boolean arg1, com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg2, char [] arg3, boolean arg4, byte [] arg5) throws java.io.IOException{
    return (byte []) null;
  }
}
