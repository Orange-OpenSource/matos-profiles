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
public class JCERSACipher
  extends WrapCipherSpi{
  // Classes

  public static class NoPadding
    extends JCERSACipher  {
    // Constructors

    public NoPadding(){
      super((com.android.org.bouncycastle.crypto.AsymmetricBlockCipher) null);
    }
  }
  // Constructors

  public JCERSACipher(com.android.org.bouncycastle.crypto.AsymmetricBlockCipher arg1){
    super();
  }
  public JCERSACipher(javax.crypto.spec.OAEPParameterSpec arg1){
    super();
  }
  public JCERSACipher(boolean arg1, boolean arg2, com.android.org.bouncycastle.crypto.AsymmetricBlockCipher arg3){
    super();
  }
  // Methods

  protected void engineInit(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(int arg1, java.security.Key arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mParameters") java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameters")
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
  protected int engineUpdate(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5){
    return 0;
  }
  protected byte [] engineDoFinal(byte [] arg1, int arg2, int arg3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return (byte []) null;
  }
  protected int engineDoFinal(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
    return 0;
  }
}
