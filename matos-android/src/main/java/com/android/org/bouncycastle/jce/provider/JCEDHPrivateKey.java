package com.android.org.bouncycastle.jce.provider;

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
public class JCEDHPrivateKey
  implements com.android.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, javax.crypto.interfaces.DHPrivateKey
{
  // Constructors

  protected JCEDHPrivateKey(){
  }
  JCEDHPrivateKey(javax.crypto.interfaces.DHPrivateKey arg1){
  }
  JCEDHPrivateKey(javax.crypto.spec.DHPrivateKeySpec arg1){
  }
  JCEDHPrivateKey(com.android.org.bouncycastle.asn1.pkcs.PrivateKeyInfo arg1){
  }
  JCEDHPrivateKey(com.android.org.bouncycastle.crypto.params.DHPrivateKeyParameters arg1){
  }
  // Methods

  public byte [] getEncoded(){
    return (byte []) null;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public javax.crypto.spec.DHParameterSpec getParams(){
    return (javax.crypto.spec.DHParameterSpec) null;
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public java.math.BigInteger getX(){
    return (java.math.BigInteger) null;
  }
  public void setBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, com.android.org.bouncycastle.asn1.DEREncodable arg2){
  }
  public com.android.org.bouncycastle.asn1.DEREncodable getBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1){
    return (com.android.org.bouncycastle.asn1.DEREncodable) null;
  }
  public java.util.Enumeration getBagAttributeKeys(){
    return (java.util.Enumeration) null;
  }
}
