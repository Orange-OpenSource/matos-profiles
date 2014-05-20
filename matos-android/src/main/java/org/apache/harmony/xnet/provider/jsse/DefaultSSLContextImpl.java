package org.apache.harmony.xnet.provider.jsse;

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


public final class DefaultSSLContextImpl
  extends OpenSSLContextImpl{
  // Constructors

  public DefaultSSLContextImpl() throws java.security.GeneralSecurityException, java.io.IOException{
    super();
  }
  // Methods

  public void engineInit(javax.net.ssl.KeyManager [] arg1, javax.net.ssl.TrustManager [] arg2, java.security.SecureRandom arg3) throws java.security.KeyManagementException{
  }
}
