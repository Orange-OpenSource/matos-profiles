package java.net;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CookieStoreImplem", superClass = "")
public interface CookieStore
{
  // Methods

  public void add(URI arg1, HttpCookie arg2);
  public java.util.List<HttpCookie> get(URI arg1);
  public boolean remove(URI arg1, HttpCookie arg2);
  public boolean removeAll();
  public java.util.List<HttpCookie> getCookies();
  public java.util.List<URI> getURIs();
}
