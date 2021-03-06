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
public class IssuerAndSerialNumber
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public IssuerAndSerialNumber(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public IssuerAndSerialNumber(com.android.org.bouncycastle.asn1.x509.X509Name arg1, java.math.BigInteger arg2){
    super();
  }
  public IssuerAndSerialNumber(com.android.org.bouncycastle.asn1.x509.X509Name arg1, com.android.org.bouncycastle.asn1.DERInteger arg2){
    super();
  }
  // Methods

  public com.android.org.bouncycastle.asn1.x509.X509Name getName(){
    return (com.android.org.bouncycastle.asn1.x509.X509Name) null;
  }
  public static IssuerAndSerialNumber getInstance(java.lang.Object arg1){
    return (IssuerAndSerialNumber) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getCertificateSerialNumber(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
}
