package javax.crypto;

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


public class KeyGenerator
{
  // Constructors

  protected KeyGenerator(KeyGeneratorSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static final KeyGenerator getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (KeyGenerator) null;
  }
  public static final KeyGenerator getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (KeyGenerator) null;
  }
  public static final KeyGenerator getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (KeyGenerator) null;
  }
  public final void init(java.security.spec.AlgorithmParameterSpec arg1) throws java.security.InvalidAlgorithmParameterException{
  }
  public final void init(java.security.spec.AlgorithmParameterSpec arg1, java.security.SecureRandom arg2) throws java.security.InvalidAlgorithmParameterException{
  }
  public final void init(int arg1){
  }
  public final void init(int arg1, java.security.SecureRandom arg2){
  }
  public final void init(java.security.SecureRandom arg1){
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final SecretKey generateKey(){
    return (SecretKey) null;
  }
}
