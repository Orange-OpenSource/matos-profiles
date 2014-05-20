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
public class JCEKeyGenerator
  extends javax.crypto.KeyGeneratorSpi{
  // Classes

  public static class DES
    extends JCEKeyGenerator  {
    // Constructors

    public DES(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class MD5HMAC
    extends JCEKeyGenerator  {
    // Constructors

    public MD5HMAC(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class HMACSHA1
    extends JCEKeyGenerator  {
    // Constructors

    public HMACSHA1(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class HMACSHA256
    extends JCEKeyGenerator  {
    // Constructors

    public HMACSHA256(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class HMACSHA384
    extends JCEKeyGenerator  {
    // Constructors

    public HMACSHA384(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class HMACSHA512
    extends JCEKeyGenerator  {
    // Constructors

    public HMACSHA512(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  // Fields

  protected java.lang.String algName;

  protected int keySize;

  protected int defaultKeySize;

  protected com.android.org.bouncycastle.crypto.CipherKeyGenerator engine;

  protected boolean uninitialised;

  // Constructors

  protected JCEKeyGenerator(@com.francetelecom.rd.stubs.annotation.FieldSet("this.algName") java.lang.String arg1, int arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.engine") com.android.org.bouncycastle.crypto.CipherKeyGenerator arg3){
    super();
  }
  // Methods

  protected void engineInit(java.security.spec.AlgorithmParameterSpec arg1, java.security.SecureRandom arg2) throws java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(java.security.SecureRandom arg1){
  }
  protected void engineInit(int arg1, java.security.SecureRandom arg2){
  }
  protected javax.crypto.SecretKey engineGenerateKey(){
    return (javax.crypto.SecretKey) null;
  }
}
