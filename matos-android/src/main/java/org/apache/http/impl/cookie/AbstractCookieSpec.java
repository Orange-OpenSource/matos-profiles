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
public abstract class AbstractCookieSpec
  implements org.apache.http.cookie.CookieSpec
{
  // Constructors

  public AbstractCookieSpec(){
  }
  // Methods

  public void registerAttribHandler(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.apache.http.cookie.CookieAttributeHandler arg2){
  }
  protected org.apache.http.cookie.CookieAttributeHandler findAttribHandler(java.lang.String arg1){
    return (org.apache.http.cookie.CookieAttributeHandler) null;
  }
  protected org.apache.http.cookie.CookieAttributeHandler getAttribHandler(java.lang.String arg1){
    return (org.apache.http.cookie.CookieAttributeHandler) null;
  }
  protected java.util.Collection<org.apache.http.cookie.CookieAttributeHandler> getAttribHandlers(){
    return (java.util.Collection) null;
  }
}
