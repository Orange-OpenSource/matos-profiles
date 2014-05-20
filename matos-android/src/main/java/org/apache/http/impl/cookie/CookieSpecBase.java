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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class CookieSpecBase
  extends AbstractCookieSpec{
  // Constructors

  public CookieSpecBase(){
    super();
  }
  // Methods

  protected static java.lang.String getDefaultDomain(org.apache.http.cookie.CookieOrigin arg1){
    return (java.lang.String) null;
  }
  protected java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.HeaderElement [] arg1, org.apache.http.cookie.CookieOrigin arg2) throws org.apache.http.cookie.MalformedCookieException{
    return (java.util.List) null;
  }
  public boolean match(org.apache.http.cookie.Cookie arg1, org.apache.http.cookie.CookieOrigin arg2){
    return false;
  }
  public void validate(org.apache.http.cookie.Cookie arg1, org.apache.http.cookie.CookieOrigin arg2) throws org.apache.http.cookie.MalformedCookieException{
  }
  protected static java.lang.String getDefaultPath(org.apache.http.cookie.CookieOrigin arg1){
    return (java.lang.String) null;
  }
}
