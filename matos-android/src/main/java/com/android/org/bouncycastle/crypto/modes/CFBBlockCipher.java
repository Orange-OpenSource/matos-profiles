package com.android.org.bouncycastle.crypto.modes;

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
public class CFBBlockCipher
  implements com.android.org.bouncycastle.crypto.BlockCipher
{
  // Constructors

  public CFBBlockCipher(com.android.org.bouncycastle.crypto.BlockCipher arg1, int arg2){
  }
  // Methods

  public void init(boolean arg1, com.android.org.bouncycastle.crypto.CipherParameters arg2) throws java.lang.IllegalArgumentException{
  }
  public void reset(){
  }
  public com.android.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher(){
    return (com.android.org.bouncycastle.crypto.BlockCipher) null;
  }
  public int getBlockSize(){
    return 0;
  }
  public java.lang.String getAlgorithmName(){
    return (java.lang.String) null;
  }
  public int processBlock(byte [] arg1, int arg2, byte [] arg3, int arg4) throws com.android.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
  public int encryptBlock(byte [] arg1, int arg2, byte [] arg3, int arg4) throws com.android.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
  public int decryptBlock(byte [] arg1, int arg2, byte [] arg3, int arg4) throws com.android.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
}
