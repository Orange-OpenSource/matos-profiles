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
public class BasicSecureHandler
  extends AbstractCookieAttributeHandler{
  // Constructors

  public BasicSecureHandler(){
    super();
  }
  // Methods

  public void parse(org.apache.http.cookie.SetCookie arg1, java.lang.String arg2) throws org.apache.http.cookie.MalformedCookieException{
  }
  public boolean match(org.apache.http.cookie.Cookie arg1, org.apache.http.cookie.CookieOrigin arg2){
    return false;
  }
}
