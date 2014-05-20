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


public abstract class ExemptionMechanismSpi
{
  // Constructors

  public ExemptionMechanismSpi(){
  }
  // Methods

  protected abstract void engineInit(java.security.Key arg1) throws java.security.InvalidKeyException, ExemptionMechanismException;
  protected abstract void engineInit(java.security.Key arg1, java.security.AlgorithmParameters arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, ExemptionMechanismException;
  protected abstract void engineInit(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, ExemptionMechanismException;
  protected abstract int engineGetOutputSize(int arg1);
  protected abstract byte [] engineGenExemptionBlob() throws ExemptionMechanismException;
  protected abstract int engineGenExemptionBlob(byte [] arg1, int arg2) throws ShortBufferException, ExemptionMechanismException;
}
