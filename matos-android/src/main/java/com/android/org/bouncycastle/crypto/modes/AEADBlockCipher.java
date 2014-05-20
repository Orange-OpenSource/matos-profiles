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
public interface AEADBlockCipher
{
  // Methods

  public void init(boolean arg1, com.android.org.bouncycastle.crypto.CipherParameters arg2) throws java.lang.IllegalArgumentException;
  public void reset();
  public int getOutputSize(int arg1);
  public com.android.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
  public java.lang.String getAlgorithmName();
  public int doFinal(byte [] arg1, int arg2) throws java.lang.IllegalStateException, com.android.org.bouncycastle.crypto.InvalidCipherTextException;
  public int processBytes(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws com.android.org.bouncycastle.crypto.DataLengthException;
  public byte [] getMac();
  public int getUpdateOutputSize(int arg1);
  public int processByte(byte arg1, byte [] arg2, int arg3) throws com.android.org.bouncycastle.crypto.DataLengthException;
}
