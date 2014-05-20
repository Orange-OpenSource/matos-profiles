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
public class ObjectDigestInfo
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Fields

  public static final int publicKey = 0;

  public static final int publicKeyCert = 1;

  public static final int otherObjectDigest = 2;

  // Constructors

  public ObjectDigestInfo(int arg1, java.lang.String arg2, AlgorithmIdentifier arg3, byte [] arg4){
    super();
  }
  private ObjectDigestInfo(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static ObjectDigestInfo getInstance(java.lang.Object arg1){
    return (ObjectDigestInfo) null;
  }
  public static ObjectDigestInfo getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (ObjectDigestInfo) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public AlgorithmIdentifier getDigestAlgorithm(){
    return (AlgorithmIdentifier) null;
  }
  public com.android.org.bouncycastle.asn1.DEREnumerated getDigestedObjectType(){
    return (com.android.org.bouncycastle.asn1.DEREnumerated) null;
  }
  public com.android.org.bouncycastle.asn1.DERObjectIdentifier getOtherObjectTypeID(){
    return (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null;
  }
  public com.android.org.bouncycastle.asn1.DERBitString getObjectDigest(){
    return (com.android.org.bouncycastle.asn1.DERBitString) null;
  }
}
