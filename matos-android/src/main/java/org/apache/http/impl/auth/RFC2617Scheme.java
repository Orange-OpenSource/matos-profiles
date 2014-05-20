package org.apache.http.impl.auth;

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
public abstract class RFC2617Scheme
  extends AuthSchemeBase{
  // Constructors

  public RFC2617Scheme(){
    super();
  }
  // Methods

  protected java.util.Map<java.lang.String, java.lang.String> getParameters(){
    return (java.util.Map) null;
  }
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected void parseChallenge(org.apache.http.util.CharArrayBuffer arg1, int arg2, int arg3) throws org.apache.http.auth.MalformedChallengeException{
  }
  public java.lang.String getRealm(){
    return (java.lang.String) null;
  }
}
