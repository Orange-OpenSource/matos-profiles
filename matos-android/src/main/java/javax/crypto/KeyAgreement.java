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


public class KeyAgreement
{
  // Constructors

  protected KeyAgreement(KeyAgreementSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static final KeyAgreement getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (KeyAgreement) null;
  }
  public static final KeyAgreement getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (KeyAgreement) null;
  }
  public static final KeyAgreement getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (KeyAgreement) null;
  }
  public final void init(java.security.Key arg1) throws java.security.InvalidKeyException{
  }
  public final void init(java.security.Key arg1, java.security.SecureRandom arg2) throws java.security.InvalidKeyException{
  }
  public final void init(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final void init(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final byte [] generateSecret() throws java.lang.IllegalStateException{
    return (byte []) null;
  }
  public final int generateSecret(byte [] arg1, int arg2) throws java.lang.IllegalStateException, ShortBufferException{
    return 0;
  }
  public final SecretKey generateSecret(java.lang.String arg1) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException{
    return (SecretKey) null;
  }
  public final java.security.Key doPhase(java.security.Key arg1, boolean arg2) throws java.security.InvalidKeyException, java.lang.IllegalStateException{
    return (java.security.Key) null;
  }
}
