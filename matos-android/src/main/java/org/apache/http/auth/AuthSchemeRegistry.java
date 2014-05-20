package org.apache.http.auth;

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
public final class AuthSchemeRegistry
{
  // Constructors

  public AuthSchemeRegistry(){
  }
  // Methods

  public synchronized void register(java.lang.String arg1, AuthSchemeFactory arg2){
  }
  public synchronized void unregister(java.lang.String arg1){
  }
  public synchronized void setItems(java.util.Map<java.lang.String, AuthSchemeFactory> arg1){
  }
  public synchronized AuthScheme getAuthScheme(java.lang.String arg1, org.apache.http.params.HttpParams arg2) throws java.lang.IllegalStateException{
    return (AuthScheme) null;
  }
  public synchronized java.util.List<java.lang.String> getSchemeNames(){
    return (java.util.List) null;
  }
}
