package com.android.org.bouncycastle.jce.provider;

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
public abstract class WrapCipherSpi
  extends javax.crypto.CipherSpi  implements PBE
{
  // Fields

  protected int pbeType;

  protected int pbeHash;

  protected int pbeKeySize;

  protected int pbeIvSize;

  protected java.security.AlgorithmParameters engineParams;

  protected com.android.org.bouncycastle.crypto.Wrapper wrapEngine;

  // Constructors

  protected WrapCipherSpi(){
    super();
  }
  protected WrapCipherSpi(com.android.org.bouncycastle.crypto.Wrapper arg1){
    super();
  }
  protected WrapCipherSpi(com.android.org.bouncycastle.crypto.Wrapper arg1, int arg2){
    super();
  }
  // Methods

  protected void engineInit(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(int arg1, java.security.Key arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.engineParams") java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(int arg1, java.security.Key arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException{
  }
  protected int engineGetBlockSize(){
    return 0;
  }
  protected byte [] engineGetIV(){
    return (byte []) null;
  }
  protected int engineGetKeySize(java.security.Key arg1){
    return 0;
  }
  protected int engineGetOutputSize(int arg1){
    return 0;
  }
  protected java.security.AlgorithmParameters engineGetParameters(){
    return (java.security.AlgorithmParameters) null;
  }
  protected void engineSetMode(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
  }
  protected void engineSetPadding(java.lang.String arg1) throws javax.crypto.NoSuchPaddingException{
  }
  protected byte [] engineUpdate(byte [] arg1, int arg2, int arg3){
    return (byte []) null;
  }
  protected int engineUpdate(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws javax.crypto.ShortBufferException{
    return 0;
  }
  protected byte [] engineDoFinal(byte [] arg1, int arg2, int arg3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return (byte []) null;
  }
  protected int engineDoFinal(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException{
    return 0;
  }
  protected byte [] engineWrap(java.security.Key arg1) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException{
    return (byte []) null;
  }
  protected java.security.Key engineUnwrap(byte [] arg1, java.lang.String arg2, int arg3) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException{
    return (java.security.Key) null;
  }
}
