package com.android.org.bouncycastle.crypto;

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
public class BufferedBlockCipher
{
  // Fields

  protected byte [] buf;

  protected int bufOff;

  protected boolean forEncryption;

  protected BlockCipher cipher;

  protected boolean partialBlockOkay;

  protected boolean pgpCFB;

  // Constructors

  protected BufferedBlockCipher(){
  }
  public BufferedBlockCipher(BlockCipher arg1){
  }
  // Methods

  public void init(boolean arg1, CipherParameters arg2) throws java.lang.IllegalArgumentException{
  }
  public void reset(){
  }
  public int getOutputSize(int arg1){
    return 0;
  }
  public BlockCipher getUnderlyingCipher(){
    return (BlockCipher) null;
  }
  public int getBlockSize(){
    return 0;
  }
  public int doFinal(byte [] arg1, int arg2) throws DataLengthException, java.lang.IllegalStateException, InvalidCipherTextException{
    return 0;
  }
  public int processBytes(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
  public int getUpdateOutputSize(int arg1){
    return 0;
  }
  public int processByte(byte arg1, byte [] arg2, int arg3) throws DataLengthException, java.lang.IllegalStateException{
    return 0;
  }
}
