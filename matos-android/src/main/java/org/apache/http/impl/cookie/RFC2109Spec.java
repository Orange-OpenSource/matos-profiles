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


public class RFC2109Spec
  extends CookieSpecBase{
  // Constructors

  public RFC2109Spec(java.lang.String [] arg1, boolean arg2){
    super();
  }
  public RFC2109Spec(){
    super();
  }
  // Methods

  public java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header arg1, org.apache.http.cookie.CookieOrigin arg2) throws org.apache.http.cookie.MalformedCookieException{
    return (java.util.List) null;
  }
  public int getVersion(){
    return 0;
  }
  public void validate(org.apache.http.cookie.Cookie arg1, org.apache.http.cookie.CookieOrigin arg2) throws org.apache.http.cookie.MalformedCookieException{
  }
  public java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> arg1){
    return (java.util.List) null;
  }
  public org.apache.http.Header getVersionHeader(){
    return (org.apache.http.Header) null;
  }
  protected void formatParamAsVer(org.apache.http.util.CharArrayBuffer arg1, java.lang.String arg2, java.lang.String arg3, int arg4){
  }
  protected void formatCookieAsVer(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.cookie.Cookie arg2, int arg3){
  }
}
