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
public interface AuthScheme
{
  // Methods

  public java.lang.String getParameter(java.lang.String arg1);
  public java.lang.String getRealm();
  public void processChallenge(org.apache.http.Header arg1) throws MalformedChallengeException;
  public java.lang.String getSchemeName();
  public boolean isConnectionBased();
  public boolean isComplete();
  public org.apache.http.Header authenticate(Credentials arg1, org.apache.http.HttpRequest arg2) throws AuthenticationException;
}
