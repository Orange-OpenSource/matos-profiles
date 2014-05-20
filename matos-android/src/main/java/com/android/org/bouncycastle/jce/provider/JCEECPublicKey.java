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
public class JCEECPublicKey
  implements com.android.org.bouncycastle.jce.interfaces.ECPublicKey, java.security.interfaces.ECPublicKey, com.android.org.bouncycastle.jce.interfaces.ECPointEncoder
{
  // Constructors

  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, JCEECPublicKey arg2){
  }
  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, java.security.spec.ECPublicKeySpec arg2){
  }
  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, com.android.org.bouncycastle.jce.spec.ECPublicKeySpec arg2){
  }
  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mParams") java.security.spec.ECParameterSpec arg3){
  }
  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mParameters") com.android.org.bouncycastle.jce.spec.ECParameterSpec arg3){
  }
  public JCEECPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters arg2){
  }
  public JCEECPublicKey(java.security.interfaces.ECPublicKey arg1){
  }
  JCEECPublicKey(com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo arg1){
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameters")
  public com.android.org.bouncycastle.jce.spec.ECParameterSpec getParameters(){
    return (com.android.org.bouncycastle.jce.spec.ECParameterSpec) null;
  }
  public com.android.org.bouncycastle.math.ec.ECPoint getQ(){
    return (com.android.org.bouncycastle.math.ec.ECPoint) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParams")
  public java.security.spec.ECParameterSpec getParams(){
    return (java.security.spec.ECParameterSpec) null;
  }
  public java.security.spec.ECPoint getW(){
    return (java.security.spec.ECPoint) null;
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public com.android.org.bouncycastle.math.ec.ECPoint engineGetQ(){
    return (com.android.org.bouncycastle.math.ec.ECPoint) null;
  }
  public void setPointFormat(java.lang.String arg1){
  }
}
