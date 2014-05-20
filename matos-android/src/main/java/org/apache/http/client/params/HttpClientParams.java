package org.apache.http.client.params;

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
public class HttpClientParams
{
  // Constructors

  private HttpClientParams(){
  }
  // Methods

  public static boolean isAuthenticating(org.apache.http.params.HttpParams arg1){
    return false;
  }
  public static boolean isRedirecting(org.apache.http.params.HttpParams arg1){
    return false;
  }
  public static void setRedirecting(org.apache.http.params.HttpParams arg1, boolean arg2){
  }
  public static void setAuthenticating(org.apache.http.params.HttpParams arg1, boolean arg2){
  }
  public static java.lang.String getCookiePolicy(org.apache.http.params.HttpParams arg1){
    return (java.lang.String) null;
  }
  public static void setCookiePolicy(org.apache.http.params.HttpParams arg1, java.lang.String arg2){
  }
}
