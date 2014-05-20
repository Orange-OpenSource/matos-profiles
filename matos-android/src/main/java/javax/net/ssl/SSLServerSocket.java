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


public abstract class SSLServerSocket
  extends java.net.ServerSocket{
  // Constructors

  protected SSLServerSocket() throws java.io.IOException{
    super();
  }
  protected SSLServerSocket(int arg1) throws java.io.IOException{
    super();
  }
  protected SSLServerSocket(int arg1, int arg2) throws java.io.IOException{
    super();
  }
  protected SSLServerSocket(int arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    super();
  }
  // Methods

  public abstract void setUseClientMode(boolean arg1);
  public abstract java.lang.String [] getSupportedCipherSuites();
  public abstract java.lang.String [] getSupportedProtocols();
  public abstract java.lang.String [] getEnabledCipherSuites();
  public abstract java.lang.String [] getEnabledProtocols();
  public abstract boolean getNeedClientAuth();
  public abstract void setNeedClientAuth(boolean arg1);
  public abstract boolean getWantClientAuth();
  public abstract void setWantClientAuth(boolean arg1);
  public abstract void setEnabledCipherSuites(java.lang.String [] arg1);
  public abstract void setEnabledProtocols(java.lang.String [] arg1);
  public abstract boolean getUseClientMode();
  public abstract void setEnableSessionCreation(boolean arg1);
  public abstract boolean getEnableSessionCreation();
}
