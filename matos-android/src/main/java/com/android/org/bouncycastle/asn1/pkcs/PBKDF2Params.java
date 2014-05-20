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
public class PBKDF2Params
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public PBKDF2Params(byte [] arg1, int arg2){
    super();
  }
  public PBKDF2Params(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static PBKDF2Params getInstance(java.lang.Object arg1){
    return (PBKDF2Params) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public byte [] getSalt(){
    return (byte []) null;
  }
  public java.math.BigInteger getIterationCount(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getKeyLength(){
    return (java.math.BigInteger) null;
  }
}
