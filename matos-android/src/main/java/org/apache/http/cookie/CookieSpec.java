package org.apache.http.cookie;

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
public interface CookieSpec
{
  // Methods

  public java.util.List<Cookie> parse(org.apache.http.Header arg1, CookieOrigin arg2) throws MalformedCookieException;
  public boolean match(Cookie arg1, CookieOrigin arg2);
  public int getVersion();
  public void validate(Cookie arg1, CookieOrigin arg2) throws MalformedCookieException;
  public java.util.List<org.apache.http.Header> formatCookies(java.util.List<Cookie> arg1);
  public org.apache.http.Header getVersionHeader();
}
