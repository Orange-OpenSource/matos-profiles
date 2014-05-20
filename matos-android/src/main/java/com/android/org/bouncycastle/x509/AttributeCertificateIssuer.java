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
public class AttributeCertificateIssuer
  implements java.security.cert.CertSelector, com.android.org.bouncycastle.util.Selector
{
  // Constructors

  public AttributeCertificateIssuer(com.android.org.bouncycastle.asn1.x509.AttCertIssuer arg1){
  }
  public AttributeCertificateIssuer(javax.security.auth.x500.X500Principal arg1) throws java.io.IOException{
  }
  public AttributeCertificateIssuer(com.android.org.bouncycastle.jce.X509Principal arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.security.Principal [] getPrincipals(){
    return (java.security.Principal []) null;
  }
  public boolean match(java.security.cert.Certificate arg1){
    return false;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
}
