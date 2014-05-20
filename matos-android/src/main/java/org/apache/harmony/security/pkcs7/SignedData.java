package org.apache.harmony.security.pkcs7;

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
public final class SignedData
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  private SignedData(int arg1, java.util.List<?> arg2, ContentInfo arg3, java.util.List<org.apache.harmony.security.x509.Certificate> arg4, java.util.List<org.apache.harmony.security.x509.CertificateList> arg5, java.util.List<SignerInfo> arg6){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.util.List<org.apache.harmony.security.x509.Certificate> getCertificates(){
    return (java.util.List) null;
  }
  public java.util.List<org.apache.harmony.security.x509.CertificateList> getCRLs(){
    return (java.util.List) null;
  }
  public java.util.List<SignerInfo> getSignerInfos(){
    return (java.util.List) null;
  }
  public int getVersion(){
    return 0;
  }
}
