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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class KeyFactory
{
  // Constructors

  protected KeyFactory(KeyFactorySpi arg1, Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static KeyFactory getInstance(java.lang.String arg1) throws NoSuchAlgorithmException{
    return (KeyFactory) null;
  }
  public static KeyFactory getInstance(java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (KeyFactory) null;
  }
  public static KeyFactory getInstance(java.lang.String arg1, Provider arg2) throws NoSuchAlgorithmException{
    return (KeyFactory) null;
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final Provider getProvider(){
    return (Provider) null;
  }
  public final PublicKey generatePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (PublicKey) null;
  }
  public final PrivateKey generatePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (PrivateKey) null;
  }
  public final <T extends java.security.spec.KeySpec>T getKeySpec(Key arg1, java.lang.Class<T> arg2) throws java.security.spec.InvalidKeySpecException{
    return null;
  }
  public final Key translateKey(Key arg1) throws InvalidKeyException{
    return (Key) null;
  }
}
