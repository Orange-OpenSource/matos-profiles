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


public class PKIXBuilderParameters
  extends PKIXParameters{
  // Constructors

  public PKIXBuilderParameters(java.util.Set<TrustAnchor> arg1, CertSelector arg2) throws java.security.InvalidAlgorithmParameterException{
    super((java.util.Set) null);
  }
  public PKIXBuilderParameters(java.security.KeyStore arg1, CertSelector arg2) throws java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException{
    super((java.util.Set) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getMaxPathLength(){
    return 0;
  }
  public void setMaxPathLength(int arg1){
  }
}
