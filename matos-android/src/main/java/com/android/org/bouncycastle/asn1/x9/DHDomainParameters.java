package com.android.org.bouncycastle.asn1.x9;

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
public class DHDomainParameters
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public DHDomainParameters(com.android.org.bouncycastle.asn1.DERInteger arg1, com.android.org.bouncycastle.asn1.DERInteger arg2, com.android.org.bouncycastle.asn1.DERInteger arg3, com.android.org.bouncycastle.asn1.DERInteger arg4, DHValidationParms arg5){
    super();
  }
  private DHDomainParameters(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static DHDomainParameters getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (DHDomainParameters) null;
  }
  public static DHDomainParameters getInstance(java.lang.Object arg1){
    return (DHDomainParameters) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getQ(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getG(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getP(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getJ(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public DHValidationParms getValidationParms(){
    return (DHValidationParms) null;
  }
}
