package com.android.org.bouncycastle.asn1.pkcs;

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
public class CertificationRequestInfo
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public CertificationRequestInfo(com.android.org.bouncycastle.asn1.x500.X500Name arg1, com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo arg2, com.android.org.bouncycastle.asn1.ASN1Set arg3){
    super();
  }
  public CertificationRequestInfo(com.android.org.bouncycastle.asn1.x509.X509Name arg1, com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo arg2, com.android.org.bouncycastle.asn1.ASN1Set arg3){
    super();
  }
  public CertificationRequestInfo(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static CertificationRequestInfo getInstance(java.lang.Object arg1){
    return (CertificationRequestInfo) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1Set getAttributes(){
    return (com.android.org.bouncycastle.asn1.ASN1Set) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getVersion(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.x509.X509Name getSubject(){
    return (com.android.org.bouncycastle.asn1.x509.X509Name) null;
  }
  public com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo(){
    return (com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) null;
  }
}
