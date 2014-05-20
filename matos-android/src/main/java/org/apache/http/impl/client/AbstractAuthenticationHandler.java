package org.apache.http.impl.client;

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
public abstract class AbstractAuthenticationHandler
  implements org.apache.http.client.AuthenticationHandler
{
  // Constructors

  public AbstractAuthenticationHandler(){
  }
  // Methods

  public org.apache.http.auth.AuthScheme selectScheme(java.util.Map<java.lang.String, org.apache.http.Header> arg1, org.apache.http.HttpResponse arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.auth.AuthenticationException{
    return (org.apache.http.auth.AuthScheme) null;
  }
  protected java.util.Map<java.lang.String, org.apache.http.Header> parseChallenges(org.apache.http.Header [] arg1) throws org.apache.http.auth.MalformedChallengeException{
    return (java.util.Map) null;
  }
  protected java.util.List<java.lang.String> getAuthPreferences(){
    return (java.util.List) null;
  }
}
