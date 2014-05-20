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
public class CCMBlockCipher
  implements AEADBlockCipher
{
  // Constructors

  public CCMBlockCipher(com.android.org.bouncycastle.crypto.BlockCipher arg1){
  }
  // Methods

  public void init(boolean arg1, com.android.org.bouncycastle.crypto.CipherParameters arg2) throws java.lang.IllegalArgumentException{
  }
  public void reset(){
  }
  public int getOutputSize(int arg1){
    return 0;
  }
  public com.android.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher(){
    return (com.android.org.bouncycastle.crypto.BlockCipher) null;
  }
  public java.lang.String getAlgorithmName(){
    return (java.lang.String) null;
  }
  public int doFinal(byte [] arg1, int arg2) throws java.lang.IllegalStateException, com.android.org.bouncycastle.crypto.InvalidCipherTextException{
    return 0;
  }
  public int processBytes(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws com.android.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
  public byte [] getMac(){
    return (byte []) null;
  }
  public int getUpdateOutputSize(int arg1){
    return 0;
  }
  public int processByte(byte arg1, byte [] arg2, int arg3) throws com.android.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
  public byte [] processPacket(byte [] arg1, int arg2, int arg3) throws java.lang.IllegalStateException, com.android.org.bouncycastle.crypto.InvalidCipherTextException{
    return (byte []) null;
  }
}
