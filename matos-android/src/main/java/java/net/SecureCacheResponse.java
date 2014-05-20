package java.net;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SecureCachResponseImpl", superClass = "")
public abstract class SecureCacheResponse
  extends CacheResponse{
  // Constructors

  public SecureCacheResponse(){
    super();
  }
  // Methods

  public abstract java.lang.String getCipherSuite();
  public abstract java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException;
  public abstract java.security.Principal getLocalPrincipal();
  public abstract java.util.List<java.security.cert.Certificate> getLocalCertificateChain();
  public abstract java.util.List<java.security.cert.Certificate> getServerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException;
}
