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
public class CertificateList
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public CertificateList(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static CertificateList getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (CertificateList) null;
  }
  public static CertificateList getInstance(java.lang.Object arg1){
    return (CertificateList) null;
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
  public X509Name getIssuer(){
    return (X509Name) null;
  }
  public AlgorithmIdentifier getSignatureAlgorithm(){
    return (AlgorithmIdentifier) null;
  }
  public Time getThisUpdate(){
    return (Time) null;
  }
  public Time getNextUpdate(){
    return (Time) null;
  }
  public TBSCertList.CRLEntry [] getRevokedCertificates(){
    return (TBSCertList.CRLEntry []) null;
  }
  public TBSCertList getTBSCertList(){
    return (TBSCertList) null;
  }
  public java.util.Enumeration getRevokedCertificateEnumeration(){
    return (java.util.Enumeration) null;
  }
}
