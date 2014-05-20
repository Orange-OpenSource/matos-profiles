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


public class Mac
  implements java.lang.Cloneable
{
  // Constructors

  protected Mac(MacSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public final java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public static final Mac getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (Mac) null;
  }
  public static final Mac getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (Mac) null;
  }
  public static final Mac getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (Mac) null;
  }
  public final void init(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(java.security.Key arg1) throws java.security.InvalidKeyException{
  }
  public final void reset(){
  }
  public final void update(byte arg1) throws java.lang.IllegalStateException{
  }
  public final void update(byte [] arg1, int arg2, int arg3) throws java.lang.IllegalStateException{
  }
  public final void update(byte [] arg1) throws java.lang.IllegalStateException{
  }
  public final void update(java.nio.ByteBuffer arg1){
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final byte [] doFinal() throws java.lang.IllegalStateException{
    return (byte []) null;
  }
  public final void doFinal(byte [] arg1, int arg2) throws ShortBufferException, java.lang.IllegalStateException{
  }
  public final byte [] doFinal(byte [] arg1) throws java.lang.IllegalStateException{
    return (byte []) null;
  }
  public final int getMacLength(){
    return 0;
  }
}
