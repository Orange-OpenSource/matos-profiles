package javax.net.ssl;

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


public class TrustManagerFactory
{
  // Constructors

  protected TrustManagerFactory(TrustManagerFactorySpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static final TrustManagerFactory getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (TrustManagerFactory) null;
  }
  public static final TrustManagerFactory getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (TrustManagerFactory) null;
  }
  public static final TrustManagerFactory getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (TrustManagerFactory) null;
  }
  public final void init(java.security.KeyStore arg1) throws java.security.KeyStoreException{
  }
  public final void init(ManagerFactoryParameters arg1) throws java.security.InvalidAlgorithmParameterException{
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final TrustManager [] getTrustManagers(){
    return (TrustManager []) null;
  }
  public static final java.lang.String getDefaultAlgorithm(){
    return (java.lang.String) null;
  }
}
