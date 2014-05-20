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


public abstract class SSLContextSpi
{
  // Constructors

  public SSLContextSpi(){
  }
  // Methods

  protected abstract void engineInit(KeyManager [] arg1, TrustManager [] arg2, java.security.SecureRandom arg3) throws java.security.KeyManagementException;
  protected abstract SSLSocketFactory engineGetSocketFactory();
  protected abstract SSLServerSocketFactory engineGetServerSocketFactory();
  protected abstract SSLEngine engineCreateSSLEngine(java.lang.String arg1, int arg2);
  protected abstract SSLEngine engineCreateSSLEngine();
  protected abstract SSLSessionContext engineGetServerSessionContext();
  protected abstract SSLSessionContext engineGetClientSessionContext();
  protected SSLParameters engineGetDefaultSSLParameters(){
    return (SSLParameters) null;
  }
  protected SSLParameters engineGetSupportedSSLParameters(){
    return (SSLParameters) null;
  }
}
