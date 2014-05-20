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


public class CertStore
{
  // Constructors

  protected CertStore(CertStoreSpi arg1, java.security.Provider arg2, java.lang.String arg3, CertStoreParameters arg4){
  }
  // Methods

  public static CertStore getInstance(java.lang.String arg1, CertStoreParameters arg2) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException{
    return (CertStore) null;
  }
  public static CertStore getInstance(java.lang.String arg1, CertStoreParameters arg2, java.lang.String arg3) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (CertStore) null;
  }
  public static CertStore getInstance(java.lang.String arg1, CertStoreParameters arg2, java.security.Provider arg3) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException{
    return (CertStore) null;
  }
  public final java.util.Collection<? extends Certificate> getCertificates(CertSelector arg1) throws CertStoreException{
    return (java.util.Collection) null;
  }
  public final java.lang.String getType(){
    return (java.lang.String) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final java.util.Collection<? extends CRL> getCRLs(CRLSelector arg1) throws CertStoreException{
    return (java.util.Collection) null;
  }
  public static final java.lang.String getDefaultType(){
    return (java.lang.String) null;
  }
  public final CertStoreParameters getCertStoreParameters(){
    return (CertStoreParameters) null;
  }
}
