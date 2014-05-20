package org.apache.http.message;

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
public class BasicHttpRequest
  extends AbstractHttpMessage  implements org.apache.http.HttpRequest
{
  // Constructors

  public BasicHttpRequest(java.lang.String arg1, java.lang.String arg2){
    super((org.apache.http.params.HttpParams) null);
  }
  public BasicHttpRequest(java.lang.String arg1, java.lang.String arg2, org.apache.http.ProtocolVersion arg3){
    super((org.apache.http.params.HttpParams) null);
  }
  public BasicHttpRequest(org.apache.http.RequestLine arg1){
    super((org.apache.http.params.HttpParams) null);
  }
  // Methods

  public org.apache.http.ProtocolVersion getProtocolVersion(){
    return (org.apache.http.ProtocolVersion) null;
  }
  public org.apache.http.RequestLine getRequestLine(){
    return (org.apache.http.RequestLine) null;
  }
}
