package org.apache.harmony.security.provider.crypto;

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
public class DSAKeyFactoryImpl
  extends java.security.KeyFactorySpi{
  // Constructors

  public DSAKeyFactoryImpl(){
    super();
  }
  // Methods

  protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (java.security.PrivateKey) null;
  }
  protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (java.security.PublicKey) null;
  }
  protected <T extends java.security.spec.KeySpec>T engineGetKeySpec(java.security.Key arg1, java.lang.Class<T> arg2) throws java.security.spec.InvalidKeySpecException{
    return null;
  }
  protected java.security.Key engineTranslateKey(java.security.Key arg1) throws java.security.InvalidKeyException{
    return (java.security.Key) null;
  }
}
