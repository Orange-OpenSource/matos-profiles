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
public class DSAParameter
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public DSAParameter(java.math.BigInteger arg1, java.math.BigInteger arg2, java.math.BigInteger arg3){
    super();
  }
  public DSAParameter(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static DSAParameter getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (DSAParameter) null;
  }
  public static DSAParameter getInstance(java.lang.Object arg1){
    return (DSAParameter) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public java.math.BigInteger getQ(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getG(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getP(){
    return (java.math.BigInteger) null;
  }
}
