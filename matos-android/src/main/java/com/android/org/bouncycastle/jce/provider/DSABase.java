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


public abstract class DSABase
  extends java.security.SignatureSpi  implements com.android.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, com.android.org.bouncycastle.asn1.x509.X509ObjectIdentifiers
{
  // Fields

  protected com.android.org.bouncycastle.crypto.Digest digest;

  protected com.android.org.bouncycastle.crypto.DSA signer;

  protected DSAEncoder encoder;

  // Constructors

  protected DSABase(@com.francetelecom.rd.stubs.annotation.FieldSet("this.digest") com.android.org.bouncycastle.crypto.Digest arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.signer") com.android.org.bouncycastle.crypto.DSA arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.encoder") DSAEncoder arg3){
    super();
  }
  // Methods

  protected void engineUpdate(byte arg1) throws java.security.SignatureException{
  }
  protected void engineUpdate(byte [] arg1, int arg2, int arg3) throws java.security.SignatureException{
  }
  protected void engineInitSign(java.security.PrivateKey arg1) throws java.security.InvalidKeyException{
  }
  protected byte [] engineSign() throws java.security.SignatureException{
    return (byte []) null;
  }
  protected boolean engineVerify(byte [] arg1) throws java.security.SignatureException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameter")
  protected java.lang.Object engineGetParameter(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec arg1){
  }
  protected void engineSetParameter(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mParameter") java.lang.Object arg2){
  }
}
