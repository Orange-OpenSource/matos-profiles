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
public class SHA1PRNG_SecureRandomImpl
  extends java.security.SecureRandomSpi  implements SHA1_Data, java.io.Serializable
{
  // Constructors

  public SHA1PRNG_SecureRandomImpl(){
    super();
  }
  // Methods

  protected synchronized void engineSetSeed(byte [] arg1){
  }
  protected synchronized void engineNextBytes(byte [] arg1){
  }
  protected synchronized byte [] engineGenerateSeed(int arg1){
    return (byte []) null;
  }
}
