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
public class X509CRLEntryImpl
  extends java.security.cert.X509CRLEntry{
  // Constructors

  public X509CRLEntryImpl(org.apache.harmony.security.x509.TBSCertList.RevokedCertificate arg1, javax.security.auth.x500.X500Principal arg2){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public byte [] getEncoded() throws java.security.cert.CRLException{
    return (byte []) null;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
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
  public javax.security.auth.x500.X500Principal getCertificateIssuer(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public boolean hasExtensions(){
    return false;
  }
  public java.util.Date getRevocationDate(){
    return (java.util.Date) null;
  }
}
