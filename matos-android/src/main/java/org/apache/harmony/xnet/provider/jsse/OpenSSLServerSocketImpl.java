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


public class OpenSSLServerSocketImpl
  extends javax.net.ssl.SSLServerSocket{
  // Constructors

  protected OpenSSLServerSocketImpl(SSLParametersImpl arg1) throws java.io.IOException{
    super();
  }
  protected OpenSSLServerSocketImpl(int arg1, SSLParametersImpl arg2) throws java.io.IOException{
    super();
  }
  protected OpenSSLServerSocketImpl(int arg1, int arg2, SSLParametersImpl arg3) throws java.io.IOException{
    super();
  }
  protected OpenSSLServerSocketImpl(int arg1, int arg2, java.net.InetAddress arg3, SSLParametersImpl arg4) throws java.io.IOException{
    super();
  }
  // Methods

  public java.net.Socket accept() throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public void setUseClientMode(boolean arg1){
  }
  public java.lang.String [] getSupportedCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getSupportedProtocols(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledProtocols(){
    return (java.lang.String []) null;
  }
  public boolean getNeedClientAuth(){
    return false;
  }
  public void setNeedClientAuth(boolean arg1){
  }
  public boolean getWantClientAuth(){
    return false;
  }
  public void setWantClientAuth(boolean arg1){
  }
  public void setEnabledCipherSuites(java.lang.String [] arg1){
  }
  public void setEnabledProtocols(java.lang.String [] arg1){
  }
  public boolean getUseClientMode(){
    return false;
  }
  public void setEnableSessionCreation(boolean arg1){
  }
  public boolean getEnableSessionCreation(){
    return false;
  }
  public java.lang.String [] getSupportedCompressionMethods(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledCompressionMethods(){
    return (java.lang.String []) null;
  }
  public void setEnabledCompressionMethods(java.lang.String [] arg1){
  }
}
