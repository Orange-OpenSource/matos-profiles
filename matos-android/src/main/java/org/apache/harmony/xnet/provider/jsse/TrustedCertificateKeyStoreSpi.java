package org.apache.harmony.xnet.provider.jsse;

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
public final class TrustedCertificateKeyStoreSpi
  extends java.security.KeyStoreSpi{
  // Constructors

  public TrustedCertificateKeyStoreSpi(){
    super();
  }
  // Methods

  public java.util.Enumeration<java.lang.String> engineAliases(){
    return (java.util.Enumeration) null;
  }
  public boolean engineContainsAlias(java.lang.String arg1){
    return false;
  }
  public void engineDeleteEntry(java.lang.String arg1){
  }
  public java.security.cert.Certificate engineGetCertificate(java.lang.String arg1){
    return (java.security.cert.Certificate) null;
  }
  public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate arg1){
    return (java.lang.String) null;
  }
  public java.security.cert.Certificate [] engineGetCertificateChain(java.lang.String arg1){
    return (java.security.cert.Certificate []) null;
  }
  public java.util.Date engineGetCreationDate(java.lang.String arg1){
    return (java.util.Date) null;
  }
  public java.security.Key engineGetKey(java.lang.String arg1, char [] arg2){
    return (java.security.Key) null;
  }
  public boolean engineIsCertificateEntry(java.lang.String arg1){
    return false;
  }
  public boolean engineIsKeyEntry(java.lang.String arg1){
    return false;
  }
  public void engineSetCertificateEntry(java.lang.String arg1, java.security.cert.Certificate arg2){
  }
  public void engineSetKeyEntry(java.lang.String arg1, java.security.Key arg2, char [] arg3, java.security.cert.Certificate [] arg4){
  }
  public void engineSetKeyEntry(java.lang.String arg1, byte [] arg2, java.security.cert.Certificate [] arg3){
  }
  public int engineSize(){
    return 0;
  }
  public void engineLoad(java.io.InputStream arg1, char [] arg2){
  }
  public void engineStore(java.io.OutputStream arg1, char [] arg2){
  }
}
