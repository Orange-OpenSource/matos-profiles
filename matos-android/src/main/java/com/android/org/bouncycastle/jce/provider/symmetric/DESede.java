package com.android.org.bouncycastle.jce.provider.symmetric;

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
public final class DESede
{
  // Classes

  public static class ECB
    extends com.android.org.bouncycastle.jce.provider.JCEBlockCipher  {
    // Constructors

    public ECB(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class CBC
    extends com.android.org.bouncycastle.jce.provider.JCEBlockCipher  {
    // Constructors

    public CBC(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class DESede64
    extends com.android.org.bouncycastle.jce.provider.JCEMac  {
    // Constructors

    public DESede64(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class DESede64with7816d4
    extends com.android.org.bouncycastle.jce.provider.JCEMac  {
    // Constructors

    public DESede64with7816d4(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class CBCMAC
    extends com.android.org.bouncycastle.jce.provider.JCEMac  {
    // Constructors

    public CBCMAC(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class Wrap
    extends com.android.org.bouncycastle.jce.provider.WrapCipherSpi  {
    // Constructors

    public Wrap(){
      super();
    }
  }
  public static class KeyGenerator
    extends com.android.org.bouncycastle.jce.provider.JCEKeyGenerator  {
    // Constructors

    public KeyGenerator(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
    // Methods

    protected void engineInit(int arg1, java.security.SecureRandom arg2){
    }
    protected javax.crypto.SecretKey engineGenerateKey(){
      return (javax.crypto.SecretKey) null;
    }
  }
  public static class KeyGenerator3
    extends com.android.org.bouncycastle.jce.provider.JCEKeyGenerator  {
    // Constructors

    public KeyGenerator3(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class KeyFactory
    extends com.android.org.bouncycastle.jce.provider.JCESecretKeyFactory  {
    // Constructors

    public KeyFactory(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
    // Methods

    protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey arg1, java.lang.Class arg2) throws java.security.spec.InvalidKeySpecException{
      return (java.security.spec.KeySpec) null;
    }
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (javax.crypto.SecretKey) null;
    }
  }
  public static class Mappings
    extends java.util.HashMap  {
    // Constructors

    public Mappings(){
      super();
    }
  }
  // Constructors

  private DESede(){
  }
}
