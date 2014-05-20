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


public class ServerSessionContext
  extends AbstractSessionContext{
  // Constructors

  public ServerSessionContext(){
    super(0, 0);
  }
  // Methods

  public javax.net.ssl.SSLSession getSession(byte [] arg1){
    return (javax.net.ssl.SSLSession) null;
  }
  protected void sessionRemoved(javax.net.ssl.SSLSession arg1){
  }
  public void setPersistentCache(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SSLServerSessionCache") SSLServerSessionCache arg1){
  }
}
