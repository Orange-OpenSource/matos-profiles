package java.security.cert;

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


public class CertPathValidator
{
  // Constructors

  protected CertPathValidator(CertPathValidatorSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static CertPathValidator getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (CertPathValidator) null;
  }
  public static CertPathValidator getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (CertPathValidator) null;
  }
  public static CertPathValidator getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (CertPathValidator) null;
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final CertPathValidatorResult validate(CertPath arg1, CertPathParameters arg2) throws CertPathValidatorException, java.security.InvalidAlgorithmParameterException{
    return (CertPathValidatorResult) null;
  }
  public static final java.lang.String getDefaultType(){
    return (java.lang.String) null;
  }
}
