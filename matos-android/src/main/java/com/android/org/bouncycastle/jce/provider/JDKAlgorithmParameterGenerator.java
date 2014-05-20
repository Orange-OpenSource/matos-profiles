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
public abstract class JDKAlgorithmParameterGenerator
  extends java.security.AlgorithmParameterGeneratorSpi{
  // Classes

  public static class DH
    extends JDKAlgorithmParameterGenerator  {
    // Constructors

    public DH(){
      super();
    }
    // Methods

    protected void engineInit(java.security.spec.AlgorithmParameterSpec arg1, java.security.SecureRandom arg2) throws java.security.InvalidAlgorithmParameterException{
    }
    protected java.security.AlgorithmParameters engineGenerateParameters(){
      return (java.security.AlgorithmParameters) null;
    }
  }
  public static class DSA
    extends JDKAlgorithmParameterGenerator  {
    // Constructors

    public DSA(){
      super();
    }
    // Methods

    protected void engineInit(int arg1, java.security.SecureRandom arg2){
    }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec arg1, java.security.SecureRandom arg2) throws java.security.InvalidAlgorithmParameterException{
    }
    protected java.security.AlgorithmParameters engineGenerateParameters(){
      return (java.security.AlgorithmParameters) null;
    }
  }
  // Fields

  protected java.security.SecureRandom random;

  protected int strength;

  // Constructors

  public JDKAlgorithmParameterGenerator(){
    super();
  }
  // Methods

  protected void engineInit(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("algName") java.security.SecureRandom arg2){
  }
}
