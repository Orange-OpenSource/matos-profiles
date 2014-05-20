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


public abstract class CipherSpi
{
  // Constructors

  public CipherSpi(){
  }
  // Methods

  protected abstract void engineInit(int arg1, java.security.Key arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException;
  protected abstract void engineInit(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
  protected abstract void engineInit(int arg1, java.security.Key arg2, java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
  protected abstract int engineGetBlockSize();
  protected abstract byte [] engineGetIV();
  protected int engineGetKeySize(java.security.Key arg1) throws java.security.InvalidKeyException{
    return 0;
  }
  protected abstract int engineGetOutputSize(int arg1);
  protected abstract java.security.AlgorithmParameters engineGetParameters();
  protected abstract void engineSetMode(java.lang.String arg1) throws java.security.NoSuchAlgorithmException;
  protected abstract void engineSetPadding(java.lang.String arg1) throws NoSuchPaddingException;
  protected abstract byte [] engineUpdate(byte [] arg1, int arg2, int arg3);
  protected abstract int engineUpdate(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws ShortBufferException;
  protected int engineUpdate(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws ShortBufferException{
    return 0;
  }
  protected abstract byte [] engineDoFinal(byte [] arg1, int arg2, int arg3) throws IllegalBlockSizeException, BadPaddingException;
  protected abstract int engineDoFinal(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException;
  protected int engineDoFinal(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException{
    return 0;
  }
  protected byte [] engineWrap(java.security.Key arg1) throws IllegalBlockSizeException, java.security.InvalidKeyException{
    return (byte []) null;
  }
  protected java.security.Key engineUnwrap(byte [] arg1, java.lang.String arg2, int arg3) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException{
    return (java.security.Key) null;
  }
}
