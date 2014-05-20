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
public class JCEDHKeyAgreement
  extends javax.crypto.KeyAgreementSpi{
  // Constructors

  public JCEDHKeyAgreement(){
    super();
  }
  // Methods

  protected void engineInit(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2, java.security.SecureRandom arg3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineInit(java.security.Key arg1, java.security.SecureRandom arg2) throws java.security.InvalidKeyException{
  }
  protected byte [] engineGenerateSecret() throws java.lang.IllegalStateException{
    return (byte []) null;
  }
  protected int engineGenerateSecret(byte [] arg1, int arg2) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException{
    return 0;
  }
  protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String arg1){
    return (javax.crypto.SecretKey) null;
  }
  protected java.security.Key engineDoPhase(java.security.Key arg1, boolean arg2) throws java.security.InvalidKeyException, java.lang.IllegalStateException{
    return (java.security.Key) null;
  }
}
