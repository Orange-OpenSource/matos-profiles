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


public class EncryptedPrivateKeyInfo
{
  // Constructors

  public EncryptedPrivateKeyInfo(byte [] arg1) throws java.io.IOException{
  }
  public EncryptedPrivateKeyInfo(java.lang.String arg1, byte [] arg2) throws java.security.NoSuchAlgorithmException{
  }
  public EncryptedPrivateKeyInfo(java.security.AlgorithmParameters arg1, byte [] arg2) throws java.security.NoSuchAlgorithmException{
  }
  // Methods

  public byte [] getEncoded() throws java.io.IOException{
    return (byte []) null;
  }
  public java.security.spec.PKCS8EncodedKeySpec getKeySpec(Cipher arg1) throws java.security.spec.InvalidKeySpecException{
    return (java.security.spec.PKCS8EncodedKeySpec) null;
  }
  public java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key arg1) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException{
    return (java.security.spec.PKCS8EncodedKeySpec) null;
  }
  public java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key arg1, java.lang.String arg2) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException{
    return (java.security.spec.PKCS8EncodedKeySpec) null;
  }
  public java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException{
    return (java.security.spec.PKCS8EncodedKeySpec) null;
  }
  public java.lang.String getAlgName(){
    return (java.lang.String) null;
  }
  public java.security.AlgorithmParameters getAlgParameters(){
    return (java.security.AlgorithmParameters) null;
  }
  public byte [] getEncryptedData(){
    return (byte []) null;
  }
}
