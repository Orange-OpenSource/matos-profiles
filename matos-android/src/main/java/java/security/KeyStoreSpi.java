package java.security;

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
public abstract class KeyStoreSpi
{
  // Constructors

  public KeyStoreSpi(){
  }
  // Methods

  public abstract java.util.Enumeration<java.lang.String> engineAliases();
  public abstract boolean engineContainsAlias(java.lang.String arg1);
  public abstract void engineDeleteEntry(java.lang.String arg1) throws KeyStoreException;
  public abstract java.security.cert.Certificate engineGetCertificate(java.lang.String arg1);
  public abstract java.lang.String engineGetCertificateAlias(java.security.cert.Certificate arg1);
  public abstract java.security.cert.Certificate [] engineGetCertificateChain(java.lang.String arg1);
  public abstract java.util.Date engineGetCreationDate(java.lang.String arg1);
  public abstract Key engineGetKey(java.lang.String arg1, char [] arg2) throws NoSuchAlgorithmException, UnrecoverableKeyException;
  public abstract boolean engineIsCertificateEntry(java.lang.String arg1);
  public abstract boolean engineIsKeyEntry(java.lang.String arg1);
  public abstract void engineSetCertificateEntry(java.lang.String arg1, java.security.cert.Certificate arg2) throws KeyStoreException;
  public abstract void engineSetKeyEntry(java.lang.String arg1, Key arg2, char [] arg3, java.security.cert.Certificate [] arg4) throws KeyStoreException;
  public abstract void engineSetKeyEntry(java.lang.String arg1, byte [] arg2, java.security.cert.Certificate [] arg3) throws KeyStoreException;
  public abstract int engineSize();
  public abstract void engineLoad(java.io.InputStream arg1, char [] arg2) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException;
  public void engineLoad(KeyStore.LoadStoreParameter arg1) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public abstract void engineStore(java.io.OutputStream arg1, char [] arg2) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException;
  public void engineStore(KeyStore.LoadStoreParameter arg1) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public KeyStore.Entry engineGetEntry(java.lang.String arg1, KeyStore.ProtectionParameter arg2) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException{
    return (KeyStore.Entry) null;
  }
  public void engineSetEntry(java.lang.String arg1, KeyStore.Entry arg2, KeyStore.ProtectionParameter arg3) throws KeyStoreException{
  }
  public boolean engineEntryInstanceOf(java.lang.String arg1, java.lang.Class<? extends KeyStore.Entry> arg2){
    return false;
  }
}
