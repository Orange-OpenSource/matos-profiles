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
public class JDKDSAPrivateKey
  implements com.android.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, java.security.interfaces.DSAPrivateKey
{
  // Constructors

  protected JDKDSAPrivateKey(){
  }
  JDKDSAPrivateKey(java.security.interfaces.DSAPrivateKey arg1){
  }
  JDKDSAPrivateKey(java.security.spec.DSAPrivateKeySpec arg1){
  }
  JDKDSAPrivateKey(com.android.org.bouncycastle.asn1.pkcs.PrivateKeyInfo arg1){
  }
  JDKDSAPrivateKey(com.android.org.bouncycastle.crypto.params.DSAPrivateKeyParameters arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public java.security.interfaces.DSAParams getParams(){
    return (java.security.interfaces.DSAParams) null;
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public java.math.BigInteger getX(){
    return (java.math.BigInteger) null;
  }
  public void setBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mBagAttribute") com.android.org.bouncycastle.asn1.DEREncodable arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mBagAttribute")
  public com.android.org.bouncycastle.asn1.DEREncodable getBagAttribute(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1){
    return (com.android.org.bouncycastle.asn1.DEREncodable) null;
  }
  public java.util.Enumeration getBagAttributeKeys(){
    return (java.util.Enumeration) null;
  }
}
