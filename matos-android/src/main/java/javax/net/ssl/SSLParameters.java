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


public class SSLParameters
{
  // Constructors

  public SSLParameters(){
  }
  public SSLParameters(java.lang.String [] arg1){
  }
  public SSLParameters(java.lang.String [] arg1, java.lang.String [] arg2){
  }
  // Methods

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
  public void setCipherSuites(java.lang.String [] arg1){
  }
  public void setProtocols(java.lang.String [] arg1){
  }
  public java.lang.String [] getCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getProtocols(){
    return (java.lang.String []) null;
  }
}
