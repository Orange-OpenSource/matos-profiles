package com.android.org.bouncycastle.asn1.x509;

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
public class X509CertificateStructure
  extends com.android.org.bouncycastle.asn1.ASN1Encodable  implements com.android.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, X509ObjectIdentifiers
{
  // Constructors

  public X509CertificateStructure(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static X509CertificateStructure getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (X509CertificateStructure) null;
  }
  public static X509CertificateStructure getInstance(java.lang.Object arg1){
    return (X509CertificateStructure) null;
  }
  public com.android.org.bouncycastle.asn1.DERBitString getSignature(){
    return (com.android.org.bouncycastle.asn1.DERBitString) null;
  }
  public int getVersion(){
    return 0;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getSerialNumber(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public X509Name getIssuer(){
    return (X509Name) null;
  }
  public AlgorithmIdentifier getSignatureAlgorithm(){
    return (AlgorithmIdentifier) null;
  }
  public X509Name getSubject(){
    return (X509Name) null;
  }
  public TBSCertificateStructure getTBSCertificate(){
    return (TBSCertificateStructure) null;
  }
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo(){
    return (SubjectPublicKeyInfo) null;
  }
  public Time getEndDate(){
    return (Time) null;
  }
  public Time getStartDate(){
    return (Time) null;
  }
}
