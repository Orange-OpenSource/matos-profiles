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
public class JCEBlockCipher
  extends WrapCipherSpi  implements PBE
{
  // Classes

  public static class DES
    extends JCEBlockCipher  {
    // Constructors

    public DES(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithMD5AndDES
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithMD5AndDES(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithMD5AndRC2
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithMD5AndRC2(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHA1AndDES
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHA1AndDES(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHA1AndRC2
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHA1AndRC2(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHAAndDES3Key
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHAAndDES3Key(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHAAndDES2Key
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHAAndDES2Key(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHAAnd128BitRC2
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHAAnd128BitRC2(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHAAnd40BitRC2
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHAAnd40BitRC2(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithSHAAndTwofish
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithSHAAndTwofish(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  public static class PBEWithAESCBC
    extends JCEBlockCipher  {
    // Constructors

    public PBEWithAESCBC(){
      super((com.android.org.bouncycastle.crypto.BlockCipher) null);
    }
  }
  // Constructors

  protected JCEBlockCipher(com.android.org.bouncycastle.crypto.BlockCipher arg1){
    super();
  }
  protected JCEBlockCipher(com.android.org.bouncycastle.crypto.BlockCipher arg1, int arg2){
    super();
  }
  protected JCEBlockCipher(com.android.org.bouncycastle.crypto.BufferedBlockCipher arg1, int arg2){
    super();
  }
  // Methods

  protected void engineInit(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(int arg1, java.security.Key arg2, java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
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
}
