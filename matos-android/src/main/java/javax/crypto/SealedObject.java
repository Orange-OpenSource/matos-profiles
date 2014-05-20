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


public class SealedObject
  implements java.io.Serializable
{
  // Fields

  protected byte [] encodedParams;

  // Constructors

  public SealedObject(java.io.Serializable arg1, Cipher arg2) throws java.io.IOException, IllegalBlockSizeException{
  }
  protected SealedObject(SealedObject arg1){
  }
  // Methods

  public final java.lang.Object getObject(java.security.Key arg1) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException{
    return (java.lang.Object) null;
  }
  public final java.lang.Object getObject(Cipher arg1) throws java.io.IOException, java.lang.ClassNotFoundException, IllegalBlockSizeException, BadPaddingException{
    return (java.lang.Object) null;
  }
  public final java.lang.Object getObject(java.security.Key arg1, java.lang.String arg2) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException{
    return (java.lang.Object) null;
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
}
