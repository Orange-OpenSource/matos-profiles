package javax.net.ssl;

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


public abstract class KeyManagerFactorySpi
{
  // Constructors

  public KeyManagerFactorySpi(){
  }
  // Methods

  protected abstract void engineInit(java.security.KeyStore arg1, char [] arg2) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException;
  protected abstract void engineInit(ManagerFactoryParameters arg1) throws java.security.InvalidAlgorithmParameterException;
  protected abstract KeyManager [] engineGetKeyManagers();
}
