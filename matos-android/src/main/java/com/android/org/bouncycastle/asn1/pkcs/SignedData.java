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
public class SignedData
  extends com.android.org.bouncycastle.asn1.ASN1Encodable  implements PKCSObjectIdentifiers
{
  // Constructors

  public SignedData(com.android.org.bouncycastle.asn1.DERInteger arg1, com.android.org.bouncycastle.asn1.ASN1Set arg2, ContentInfo arg3, com.android.org.bouncycastle.asn1.ASN1Set arg4, com.android.org.bouncycastle.asn1.ASN1Set arg5, com.android.org.bouncycastle.asn1.ASN1Set arg6){
    super();
  }
  public SignedData(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static SignedData getInstance(java.lang.Object arg1){
    return (SignedData) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1Set getCertificates(){
    return (com.android.org.bouncycastle.asn1.ASN1Set) null;
  }
  public ContentInfo getContentInfo(){
    return (ContentInfo) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1Set getCRLs(){
    return (com.android.org.bouncycastle.asn1.ASN1Set) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1Set getSignerInfos(){
    return (com.android.org.bouncycastle.asn1.ASN1Set) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getVersion(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1Set getDigestAlgorithms(){
    return (com.android.org.bouncycastle.asn1.ASN1Set) null;
  }
}
