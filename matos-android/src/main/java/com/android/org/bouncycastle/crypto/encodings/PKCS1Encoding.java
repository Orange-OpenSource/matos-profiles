package com.android.org.bouncycastle.crypto.encodings;

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
public class PKCS1Encoding
  implements com.android.org.bouncycastle.crypto.AsymmetricBlockCipher
{
  // Fields

  public static final java.lang.String STRICT_LENGTH_ENABLED_PROPERTY = "com.android.org.bouncycastle.pkcs1.strict";

  // Constructors

  public PKCS1Encoding(com.android.org.bouncycastle.crypto.AsymmetricBlockCipher arg1){
  }
  // Methods

  public void init(boolean arg1, com.android.org.bouncycastle.crypto.CipherParameters arg2){
  }
  public com.android.org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher(){
    return (com.android.org.bouncycastle.crypto.AsymmetricBlockCipher) null;
  }
  public byte [] processBlock(byte [] arg1, int arg2, int arg3) throws com.android.org.bouncycastle.crypto.InvalidCipherTextException{
    return (byte []) null;
  }
  public int getInputBlockSize(){
    return 0;
  }
  public int getOutputBlockSize(){
    return 0;
  }
}
