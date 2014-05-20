package org.apache.harmony.crypto.internal;

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
public class NullCipherSpi
  extends javax.crypto.CipherSpi{
  // Constructors

  public NullCipherSpi(){
    super();
  }
  // Methods

  public void engineInit(int arg1, java.security.Key arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException{
  }
  public void engineInit(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public void engineInit(int arg1, java.security.Key arg2, java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public int engineGetBlockSize(){
    return 0;
  }
  public byte [] engineGetIV(){
    return (byte []) null;
  }
  public int engineGetKeySize(java.security.Key arg1) throws java.security.InvalidKeyException{
    return 0;
  }
  public int engineGetOutputSize(int arg1){
    return 0;
  }
  public java.security.AlgorithmParameters engineGetParameters(){
    return (java.security.AlgorithmParameters) null;
  }
  public void engineSetMode(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
  }
  public void engineSetPadding(java.lang.String arg1) throws javax.crypto.NoSuchPaddingException{
  }
  public byte [] engineUpdate(byte [] arg1, int arg2, int arg3){
    return (byte []) null;
  }
  public int engineUpdate(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws javax.crypto.ShortBufferException{
    return 0;
  }
  public int engineUpdate(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws javax.crypto.ShortBufferException{
    return 0;
  }
  public byte [] engineDoFinal(byte [] arg1, int arg2, int arg3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return (byte []) null;
  }
  public int engineDoFinal(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return 0;
  }
  public int engineDoFinal(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return 0;
  }
  public byte [] engineWrap(java.security.Key arg1) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException{
    return (byte []) null;
  }
  public java.security.Key engineUnwrap(byte [] arg1, java.lang.String arg2, int arg3) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException{
    return (java.security.Key) null;
  }
}
