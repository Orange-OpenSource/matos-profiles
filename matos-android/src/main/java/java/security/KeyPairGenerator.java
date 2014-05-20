package java.security;

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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.KeyPairGeneratorImpl")
public abstract class KeyPairGenerator
  extends KeyPairGeneratorSpi{
  // Constructors

  protected KeyPairGenerator(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1){
    super();
  }
  // Methods
  @Code("return new com.francetelecom.rd.fakeandroid.KeyPairGeneratorImpl(arg1);")
  public static KeyPairGenerator getInstance(java.lang.String arg1) throws NoSuchAlgorithmException{
    return (KeyPairGenerator) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.KeyPairGeneratorImpl(arg1);")
  public static KeyPairGenerator getInstance(java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (KeyPairGenerator) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.KeyPairGeneratorImpl(arg1);")
  public static KeyPairGenerator getInstance(java.lang.String arg1, Provider arg2) throws NoSuchAlgorithmException{
    return (KeyPairGenerator) null;
  }
  public void initialize(int arg1){
  }
  public void initialize(java.security.spec.AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException{
  }
  public void initialize(int arg1, SecureRandom arg2){
  }
  public void initialize(java.security.spec.AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidAlgorithmParameterException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }

  public final Provider getProvider(){
    return (Provider) null;
  }
  public KeyPair generateKeyPair(){
    return (KeyPair) null;
  }
  public final KeyPair genKeyPair(){
    return (KeyPair) null;
  }
}
