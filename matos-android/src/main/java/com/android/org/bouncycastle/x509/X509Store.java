package com.android.org.bouncycastle.x509;

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


public class X509Store
  implements com.android.org.bouncycastle.util.Store
{
  // Constructors

  private X509Store(java.security.Provider arg1, X509StoreSpi arg2){
  }
  // Methods

  public static X509Store getInstance(java.lang.String arg1, X509StoreParameters arg2) throws NoSuchStoreException{
    return (X509Store) null;
  }
  public static X509Store getInstance(java.lang.String arg1, X509StoreParameters arg2, java.lang.String arg3) throws NoSuchStoreException, java.security.NoSuchProviderException{
    return (X509Store) null;
  }
  public static X509Store getInstance(java.lang.String arg1, X509StoreParameters arg2, java.security.Provider arg3) throws NoSuchStoreException{
    return (X509Store) null;
  }
  public java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public java.util.Collection getMatches(com.android.org.bouncycastle.util.Selector arg1){
    return (java.util.Collection) null;
  }
}
