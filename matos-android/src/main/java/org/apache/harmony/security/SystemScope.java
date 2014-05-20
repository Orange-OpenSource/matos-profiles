package org.apache.harmony.security;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SystemScope
  extends java.security.IdentityScope{
  // Constructors

  public SystemScope(){
    super();
  }
  public SystemScope(java.lang.String arg1){
    super();
  }
  public SystemScope(java.lang.String arg1, java.security.IdentityScope arg2) throws java.security.KeyManagementException{
    super();
  }
  // Methods

  public int size(){
    return 0;
  }
  public synchronized java.security.Identity getIdentity(java.lang.String arg1){
    return (java.security.Identity) null;
  }
  public synchronized java.security.Identity getIdentity(java.security.PublicKey arg1){
    return (java.security.Identity) null;
  }
  public synchronized void addIdentity(java.security.Identity arg1) throws java.security.KeyManagementException{
  }
  public synchronized void removeIdentity(java.security.Identity arg1) throws java.security.KeyManagementException{
  }
  public java.util.Enumeration identities(){
    return (java.util.Enumeration) null;
  }
}
