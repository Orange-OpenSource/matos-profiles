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
public final class TrustedCertificateStore
{
  // Constructors

  public TrustedCertificateStore(){
  }
  public TrustedCertificateStore(java.io.File arg1, java.io.File arg2, java.io.File arg3){
  }
  // Methods

  public java.util.Set<java.lang.String> aliases(){
    return (java.util.Set) null;
  }
  public java.security.cert.Certificate getCertificate(java.lang.String arg1){
    return (java.security.cert.Certificate) null;
  }
  public java.security.cert.Certificate getCertificate(java.lang.String arg1, boolean arg2){
    return (java.security.cert.Certificate) null;
  }
  public static final boolean isSystem(java.lang.String arg1){
    return false;
  }
  public static final boolean isUser(java.lang.String arg1){
    return false;
  }
  public java.util.Date getCreationDate(java.lang.String arg1){
    return (java.util.Date) null;
  }
  public java.util.Set<java.lang.String> userAliases(){
    return (java.util.Set) null;
  }
  public java.util.Set<java.lang.String> allSystemAliases(){
    return (java.util.Set) null;
  }
  public boolean containsAlias(java.lang.String arg1){
    return false;
  }
  public java.lang.String getCertificateAlias(java.security.cert.Certificate arg1){
    return (java.lang.String) null;
  }
  public boolean isTrustAnchor(java.security.cert.X509Certificate arg1){
    return false;
  }
  public java.security.cert.X509Certificate findIssuer(java.security.cert.X509Certificate arg1){
    return (java.security.cert.X509Certificate) null;
  }
  public void installCertificate(java.security.cert.X509Certificate arg1) throws java.io.IOException, java.security.cert.CertificateException{
  }
  public void deleteCertificateEntry(java.lang.String arg1) throws java.io.IOException, java.security.cert.CertificateException{
  }
}
