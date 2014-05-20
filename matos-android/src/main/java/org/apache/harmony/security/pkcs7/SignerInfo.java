package org.apache.harmony.security.pkcs7;

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
public final class SignerInfo
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ISSUER_AND_SERIAL_NUMBER = null;

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  public SignerInfo(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public javax.security.auth.x500.X500Principal getIssuer(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public java.lang.String getDigestAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getDigestEncryptionAlgorithm(){
    return (java.lang.String) null;
  }
  public java.util.List<org.apache.harmony.security.x501.AttributeTypeAndValue> getAuthenticatedAttributes(){
    return (java.util.List) null;
  }
  public byte [] getEncodedAuthenticatedAttributes(){
    return (byte []) null;
  }
  public byte [] getEncryptedDigest(){
    return (byte []) null;
  }
}
