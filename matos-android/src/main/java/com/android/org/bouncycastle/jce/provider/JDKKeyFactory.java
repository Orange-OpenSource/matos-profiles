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
public abstract class JDKKeyFactory
  extends java.security.KeyFactorySpi{
  // Classes

  public static class RSA
    extends JDKKeyFactory  {
    // Constructors

    public RSA(){
      super();
    }
    // Methods

    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PrivateKey) null;
    }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PublicKey) null;
    }
  }
  public static class DH
    extends JDKKeyFactory  {
    // Constructors

    public DH(){
      super();
    }
    // Methods

    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PrivateKey) null;
    }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PublicKey) null;
    }
  }
  public static class DSA
    extends JDKKeyFactory  {
    // Constructors

    public DSA(){
      super();
    }
    // Methods

    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PrivateKey) null;
    }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (java.security.PublicKey) null;
    }
  }
  // Constructors

  public JDKKeyFactory(){
    super();
  }
  // Methods

  protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (java.security.PrivateKey) null;
  }
  protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (java.security.PublicKey) null;
  }
  protected static java.security.PrivateKey createPrivateKeyFromDERStream(byte [] arg1) throws java.io.IOException{
    return (java.security.PrivateKey) null;
  }
  public static java.security.PublicKey createPublicKeyFromDERStream(byte [] arg1) throws java.io.IOException{
    return (java.security.PublicKey) null;
  }
  protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key arg1, java.lang.Class arg2) throws java.security.spec.InvalidKeySpecException{
    return (java.security.spec.KeySpec) null;
  }
  protected java.security.Key engineTranslateKey(java.security.Key arg1) throws java.security.InvalidKeyException{
    return (java.security.Key) null;
  }
}
