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


public abstract class SSLSocketFactory
  extends javax.net.SocketFactory{
  // Constructors

  public SSLSocketFactory(){
    super();
  }
  // Methods

  public static synchronized javax.net.SocketFactory getDefault(){
    return (javax.net.SocketFactory) null;
  }
  public abstract java.net.Socket createSocket(java.net.Socket arg1, java.lang.String arg2, int arg3, boolean arg4) throws java.io.IOException;
  public abstract java.lang.String [] getSupportedCipherSuites();
  public abstract java.lang.String [] getDefaultCipherSuites();
}
