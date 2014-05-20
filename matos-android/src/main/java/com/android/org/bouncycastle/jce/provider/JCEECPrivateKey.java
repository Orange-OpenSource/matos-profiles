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
public class JCEECPrivateKey
  implements com.android.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, java.security.interfaces.ECPrivateKey, com.android.org.bouncycastle.jce.interfaces.ECPrivateKey, com.android.org.bouncycastle.jce.interfaces.ECPointEncoder
{
  // Constructors

  protected JCEECPrivateKey(){
  }
  public JCEECPrivateKey(java.security.interfaces.ECPrivateKey arg1){
  }
  public JCEECPrivateKey(java.lang.String arg1, com.android.org.bouncycastle.jce.spec.ECPrivateKeySpec arg2){
  }
  public JCEECPrivateKey(java.lang.String arg1, java.security.spec.ECPrivateKeySpec arg2){
  }
  public JCEECPrivateKey(java.lang.String arg1, JCEECPrivateKey arg2){
  }
  public JCEECPrivateKey(java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPrivateKeyParameters arg2, JCEECPublicKey arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mParams") java.security.spec.ECParameterSpec arg4){
  }
  public JCEECPrivateKey(java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPrivateKeyParameters arg2, JCEECPublicKey arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mParameters") com.android.org.bouncycastle.jce.spec.ECParameterSpec arg4){
  }
  public JCEECPrivateKey(java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPrivateKeyParameters arg2){
  }
  JCEECPrivateKey(com.android.org.bouncycastle.asn1.pkcs.PrivateKeyInfo arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameters")
  public com.android.org.bouncycastle.jce.spec.ECParameterSpec getParameters(){
    return (com.android.org.bouncycastle.jce.spec.ECParameterSpec) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParams")
  public java.security.spec.ECParameterSpec getParams(){
    return (java.security.spec.ECParameterSpec) null;
  }
  
  public java.lang.String getFormat(){
    return (java.lang.String) null;
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
  public java.math.BigInteger getS(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getD(){
    return (java.math.BigInteger) null;
  }
  public void setPointFormat(java.lang.String arg1){
  }
}
