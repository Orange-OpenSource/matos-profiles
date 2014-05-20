package com.android.org.bouncycastle.crypto.signers;

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
public class RSADigestSigner
  implements com.android.org.bouncycastle.crypto.Signer
{
  // Constructors

  public RSADigestSigner(com.android.org.bouncycastle.crypto.Digest arg1){
  }
  // Methods

  public void init(boolean arg1, com.android.org.bouncycastle.crypto.CipherParameters arg2){
  }
  public void reset(){
  }
  public void update(byte arg1){
  }
  public void update(byte [] arg1, int arg2, int arg3){
  }
  public java.lang.String getAlgorithmName(){
    return (java.lang.String) null;
  }
  public byte [] generateSignature() throws com.android.org.bouncycastle.crypto.CryptoException, com.android.org.bouncycastle.crypto.DataLengthException{
    return (byte []) null;
  }
  public boolean verifySignature(byte [] arg1){
    return false;
  }
}
