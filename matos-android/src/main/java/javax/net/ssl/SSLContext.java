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


public class SSLContext
{
  // Constructors

  protected SSLContext(SSLContextSpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static SSLContext getDefault() throws java.security.NoSuchAlgorithmException{
    return (SSLContext) null;
  }
  public static SSLContext getInstance(java.lang.String arg1) throws java.security.NoSuchAlgorithmException{
    return (SSLContext) null;
  }
  public static SSLContext getInstance(java.lang.String arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException{
    return (SSLContext) null;
  }
  public static SSLContext getInstance(java.lang.String arg1, java.security.Provider arg2) throws java.security.NoSuchAlgorithmException{
    return (SSLContext) null;
  }
  public final void init(KeyManager [] arg1, TrustManager [] arg2, java.security.SecureRandom arg3) throws java.security.KeyManagementException{
  }
  public final java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public static void setDefault(SSLContext arg1){
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final SSLSocketFactory getSocketFactory(){
    return (SSLSocketFactory) null;
  }
  public final SSLSessionContext getClientSessionContext(){
    return (SSLSessionContext) null;
  }
  public final SSLSessionContext getServerSessionContext(){
    return (SSLSessionContext) null;
  }
  public final SSLServerSocketFactory getServerSocketFactory(){
    return (SSLServerSocketFactory) null;
  }
  public final SSLEngine createSSLEngine(){
    return (SSLEngine) null;
  }
  public final SSLEngine createSSLEngine(java.lang.String arg1, int arg2){
    return (SSLEngine) null;
  }
  public final SSLParameters getDefaultSSLParameters(){
    return (SSLParameters) null;
  }
  public final SSLParameters getSupportedSSLParameters(){
    return (SSLParameters) null;
  }
}
