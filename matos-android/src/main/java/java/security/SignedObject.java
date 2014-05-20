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
public final class SignedObject
  implements java.io.Serializable
{
  // Constructors

  public SignedObject(java.io.Serializable arg1, PrivateKey arg2, Signature arg3) throws java.io.IOException, InvalidKeyException, SignatureException{
  }
  // Methods

  public java.lang.Object getObject() throws java.io.IOException, java.lang.ClassNotFoundException{
    return (java.lang.Object) null;
  }
  public byte [] getSignature(){
    return (byte []) null;
  }
  public boolean verify(PublicKey arg1, Signature arg2) throws InvalidKeyException, SignatureException{
    return false;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
}
