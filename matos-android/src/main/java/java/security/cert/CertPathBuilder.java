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


public class CertPathBuilder
{
  // Constructors

  protected CertPathBuilder(CertPathBuilderSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static CertPathBuilder getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (CertPathBuilder) null;
  }
  public static CertPathBuilder getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (CertPathBuilder) null;
  }
  public static CertPathBuilder getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (CertPathBuilder) null;
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final CertPathBuilderResult build(CertPathParameters arg1) throws CertPathBuilderException, java.security.InvalidAlgorithmParameterException{
    return (CertPathBuilderResult) null;
  }
  public static final java.lang.String getDefaultType(){
    return (java.lang.String) null;
  }
}
