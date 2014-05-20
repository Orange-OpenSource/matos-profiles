package org.apache.http.impl.cookie;

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


public class NetscapeDraftSpec
  extends CookieSpecBase{
  // Fields

  protected static final java.lang.String EXPIRES_PATTERN = (java.lang.String) null;

  // Constructors

  public NetscapeDraftSpec(java.lang.String [] arg1){
    super();
  }
  public NetscapeDraftSpec(){
    super();
  }
  // Methods

  public java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header arg1, org.apache.http.cookie.CookieOrigin arg2) throws org.apache.http.cookie.MalformedCookieException{
    return (java.util.List) null;
  }
  public int getVersion(){
    return 0;
  }
  public java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> arg1){
    return (java.util.List) null;
  }
  public org.apache.http.Header getVersionHeader(){
    return (org.apache.http.Header) null;
  }
}
