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
public class AuthorityKeyIdentifier
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public AuthorityKeyIdentifier(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public AuthorityKeyIdentifier(SubjectPublicKeyInfo arg1){
    super();
  }
  public AuthorityKeyIdentifier(SubjectPublicKeyInfo arg1, GeneralNames arg2, java.math.BigInteger arg3){
    super();
  }
  public AuthorityKeyIdentifier(GeneralNames arg1, java.math.BigInteger arg2){
    super();
  }
  public AuthorityKeyIdentifier(byte [] arg1){
    super();
  }
  public AuthorityKeyIdentifier(byte [] arg1, GeneralNames arg2, java.math.BigInteger arg3){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static AuthorityKeyIdentifier getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (AuthorityKeyIdentifier) null;
  }
  public static AuthorityKeyIdentifier getInstance(java.lang.Object arg1){
    return (AuthorityKeyIdentifier) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public byte [] getKeyIdentifier(){
    return (byte []) null;
  }
  public GeneralNames getAuthorityCertIssuer(){
    return (GeneralNames) null;
  }
  public java.math.BigInteger getAuthorityCertSerialNumber(){
    return (java.math.BigInteger) null;
  }
}
