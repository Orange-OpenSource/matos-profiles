package com.android.org.bouncycastle.jce.provider.asymmetric.ec;

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
public abstract class KeyPairGenerator
  extends com.android.org.bouncycastle.jce.provider.JDKKeyPairGenerator{
  // Classes

  public static class EC
    extends KeyPairGenerator  {
    // Constructors

    public EC(){
      super((java.lang.String) null);
    }
    public EC(java.lang.String arg1){
      super((java.lang.String) null);
    }
    // Methods

    public void initialize(int arg1, java.security.SecureRandom arg2){
    }
    public void initialize(java.security.spec.AlgorithmParameterSpec arg1, java.security.SecureRandom arg2) throws java.security.InvalidAlgorithmParameterException{
    }
    public java.security.KeyPair generateKeyPair(){
      return (java.security.KeyPair) null;
    }
  }
  public static class ECDSA
    extends KeyPairGenerator.EC  {
    // Constructors

    public ECDSA(){
      super();
    }
  }
  public static class ECDH
    extends KeyPairGenerator.EC  {
    // Constructors

    public ECDH(){
      super();
    }
  }
  public static class ECDHC
    extends KeyPairGenerator.EC  {
    // Constructors

    public ECDHC(){
      super();
    }
  }
  public static class ECMQV
    extends KeyPairGenerator.EC  {
    // Constructors

    public ECMQV(){
      super();
    }
  }
  // Constructors

  public KeyPairGenerator(java.lang.String arg1){
    super((java.lang.String) null);
  }
}
