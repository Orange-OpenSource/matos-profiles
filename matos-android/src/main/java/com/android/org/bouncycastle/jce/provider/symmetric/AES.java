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
public final class AES
{
  // Classes

  public static class ECB
    extends com.android.org.bouncycastle.jce.provider.JCEBlockCipher  {
    // Constructors

    public ECB(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class Wrap
    extends com.android.org.bouncycastle.jce.provider.WrapCipherSpi  {
    // Constructors

    public Wrap(){
      super();
    }
  }
  public static class KeyGen
    extends com.android.org.bouncycastle.jce.provider.JCEKeyGenerator  {
    // Constructors

    public KeyGen(){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
    public KeyGen(int arg1){
      super((java.lang.String) null, 0, (com.android.org.bouncycastle.crypto.CipherKeyGenerator) null);
    }
  }
  public static class AlgParams
    extends com.android.org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters  {
    // Constructors

    public AlgParams(){
      super();
    }
    // Methods

    protected java.lang.String engineToString(){
      return (java.lang.String) null;
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

  private AES(){
  }
}
