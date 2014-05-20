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
public abstract class JDKKeyPairGenerator
  extends java.security.KeyPairGenerator{
  // Classes

  public static class RSA
    extends JDKKeyPairGenerator  {
    // Constructors

    public RSA(){
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
  public static class DH
    extends JDKKeyPairGenerator  {
    // Constructors

    public DH(){
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
  public static class DSA
    extends JDKKeyPairGenerator  {
    // Constructors

    public DSA(){
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
  // Constructors

  public JDKKeyPairGenerator(java.lang.String arg1){
    super((java.lang.String) null);
  }
  // Methods

  public abstract void initialize(int arg1, java.security.SecureRandom arg2);
  public abstract java.security.KeyPair generateKeyPair();
}
