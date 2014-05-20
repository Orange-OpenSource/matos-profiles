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


public class ExemptionMechanism
{
  // Constructors

  protected ExemptionMechanism(ExemptionMechanismSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  protected void finalize(){
  }
  public final java.lang.String getName(){
    return (java.lang.String) null;
  }
  public static final ExemptionMechanism getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (ExemptionMechanism) null;
  }
  public static final ExemptionMechanism getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (ExemptionMechanism) null;
  }
  public static final ExemptionMechanism getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (ExemptionMechanism) null;
  }
  public final void init(java.security.Key arg1) throws java.security.InvalidKeyException, ExemptionMechanismException{
  }
  public final void init(java.security.Key arg1, java.security.AlgorithmParameters arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, ExemptionMechanismException{
  }
  public final void init(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, ExemptionMechanismException{
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final int getOutputSize(int arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public final boolean isCryptoAllowed(java.security.Key arg1) throws ExemptionMechanismException{
    return false;
  }
  public final byte [] genExemptionBlob() throws java.lang.IllegalStateException, ExemptionMechanismException{
    return (byte []) null;
  }
  public final int genExemptionBlob(byte [] arg1) throws java.lang.IllegalStateException, ShortBufferException, ExemptionMechanismException{
    return 0;
  }
  public final int genExemptionBlob(byte [] arg1, int arg2) throws java.lang.IllegalStateException, ShortBufferException, ExemptionMechanismException{
    return 0;
  }
}
