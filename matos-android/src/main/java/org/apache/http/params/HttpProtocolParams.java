package org.apache.http.params;

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
public final class HttpProtocolParams
  implements CoreProtocolPNames
{
  // Constructors

  private HttpProtocolParams(){
  }
  // Methods

  public static void setVersion(HttpParams arg1, org.apache.http.ProtocolVersion arg2){
  }
  public static org.apache.http.ProtocolVersion getVersion(HttpParams arg1){
    return (org.apache.http.ProtocolVersion) null;
  }
  public static void setUserAgent(HttpParams arg1, java.lang.String arg2){
  }
  public static void setContentCharset(HttpParams arg1, java.lang.String arg2){
  }
  public static void setUseExpectContinue(HttpParams arg1, boolean arg2){
  }
  public static void setHttpElementCharset(HttpParams arg1, java.lang.String arg2){
  }
  public static java.lang.String getUserAgent(HttpParams arg1){
    return (java.lang.String) null;
  }
  public static boolean useExpectContinue(HttpParams arg1){
    return false;
  }
  public static java.lang.String getHttpElementCharset(HttpParams arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getContentCharset(HttpParams arg1){
    return (java.lang.String) null;
  }
}
