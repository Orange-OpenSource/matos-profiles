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
public class RSASSAPSSparams
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Fields

  public static final com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_HASH_ALGORITHM = null;

  public static final com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION = null;

  public static final com.android.org.bouncycastle.asn1.DERInteger DEFAULT_SALT_LENGTH = null;

  public static final com.android.org.bouncycastle.asn1.DERInteger DEFAULT_TRAILER_FIELD = null;

  // Constructors

  public RSASSAPSSparams(){
    super();
  }
  public RSASSAPSSparams(com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg1, com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier arg2, com.android.org.bouncycastle.asn1.DERInteger arg3, com.android.org.bouncycastle.asn1.DERInteger arg4){
    super();
  }
  public RSASSAPSSparams(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public static RSASSAPSSparams getInstance(java.lang.Object arg1){
    return (RSASSAPSSparams) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm(){
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
  public com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getMaskGenAlgorithm(){
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getSaltLength(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
  public com.android.org.bouncycastle.asn1.DERInteger getTrailerField(){
    return (com.android.org.bouncycastle.asn1.DERInteger) null;
  }
}
