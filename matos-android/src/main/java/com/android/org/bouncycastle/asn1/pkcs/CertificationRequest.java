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
public class CertificationRequest
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Fields

  protected CertificationRequestInfo reqInfo;

  protected com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;

  protected com.android.org.bouncycastle.asn1.DERBitString sigBits;

  // Constructors

  protected CertificationRequest(){
    super();
  }
  public CertificationRequest(CertificationRequestInfo arg1, com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg2, com.android.org.bouncycastle.asn1.DERBitString arg3){
    super();
  }
  public CertificationRequest(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static CertificationRequest getInstance(java.lang.Object arg1){
    return (CertificationRequest) null;
  }
  public com.android.org.bouncycastle.asn1.DERBitString getSignature(){
    return (com.android.org.bouncycastle.asn1.DERBitString) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public CertificationRequestInfo getCertificationRequestInfo(){
    return (CertificationRequestInfo) null;
  }
  public com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm(){
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
}
