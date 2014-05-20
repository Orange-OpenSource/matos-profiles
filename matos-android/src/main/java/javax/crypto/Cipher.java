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


public class Cipher
{
  // Fields

  public static final int DECRYPT_MODE = 2;

  public static final int ENCRYPT_MODE = 1;

  public static final int PRIVATE_KEY = 2;

  public static final int PUBLIC_KEY = 1;

  public static final int SECRET_KEY = 3;

  public static final int UNWRAP_MODE = 4;

  public static final int WRAP_MODE = 3;

  // Constructors

  protected Cipher(CipherSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static final Cipher getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException, NoSuchPaddingException{
    return (Cipher) null;
  }
  public static final Cipher getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, NoSuchPaddingException{
    return (Cipher) null;
  }
  public static final Cipher getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException, NoSuchPaddingException{
    return (Cipher) null;
  }
  public final void init(int arg1, java.security.Key arg2) throws java.security.InvalidKeyException{
  }
  public final void init(int arg1, java.security.Key arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException{
  }
  public final void init(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(int arg1, java.security.Key arg2, java.security.spec.AlgorithmParameterSpec arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(int arg1, java.security.Key arg2, java.security.AlgorithmParameters arg3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(int arg1, java.security.Key arg2, java.security.AlgorithmParameters arg3, java.security.SecureRandom arg4) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(int arg1, java.security.cert.Certificate arg2) throws java.security.InvalidKeyException{
  }
  public final void init(int arg1, java.security.cert.Certificate arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException{
  }
  public final byte [] wrap(java.security.Key arg1) throws IllegalBlockSizeException, java.security.InvalidKeyException{
    return (byte []) null;
  }
  public final byte [] update(byte [] arg1){
    return (byte []) null;
  }
  public final byte [] update(byte [] arg1, int arg2, int arg3){
    return (byte []) null;
  }
  public final int update(byte [] arg1, int arg2, int arg3, byte [] arg4) throws ShortBufferException{
    return 0;
  }
  public final int update(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws ShortBufferException{
    return 0;
  }
  public final int update(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws ShortBufferException{
    return 0;
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.AlgorithmParameters getParameters(){
    return (java.security.AlgorithmParameters) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final int getOutputSize(int arg1){
    return 0;
  }
  public final int getBlockSize(){
    return 0;
  }
  public final byte [] getIV(){
    return (byte []) null;
  }
  public final java.security.Key unwrap(byte [] arg1, java.lang.String arg2, int arg3) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException{
    return (java.security.Key) null;
  }
  public final byte [] doFinal() throws IllegalBlockSizeException, BadPaddingException{
    return (byte []) null;
  }
  public final int doFinal(byte [] arg1, int arg2) throws IllegalBlockSizeException, ShortBufferException, BadPaddingException{
    return 0;
  }
  public final byte [] doFinal(byte [] arg1) throws IllegalBlockSizeException, BadPaddingException{
    return (byte []) null;
  }
  public final byte [] doFinal(byte [] arg1, int arg2, int arg3) throws IllegalBlockSizeException, BadPaddingException{
    return (byte []) null;
  }
  public final int doFinal(byte [] arg1, int arg2, int arg3, byte [] arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException{
    return 0;
  }
  public final int doFinal(byte [] arg1, int arg2, int arg3, byte [] arg4, int arg5) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException{
    return 0;
  }
  public final int doFinal(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException{
    return 0;
  }
  public final ExemptionMechanism getExemptionMechanism(){
    return (ExemptionMechanism) null;
  }
  public static final int getMaxAllowedKeyLength(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return 0;
  }
  public static final java.security.spec.AlgorithmParameterSpec getMaxAllowedParameterSpec(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (java.security.spec.AlgorithmParameterSpec) null;
  }
}
