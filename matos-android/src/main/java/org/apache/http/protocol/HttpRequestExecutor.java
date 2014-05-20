package org.apache.http.protocol;

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
public class HttpRequestExecutor
{
  // Constructors

  public HttpRequestExecutor(){
  }
  // Methods

  public org.apache.http.HttpResponse execute(org.apache.http.HttpRequest arg1, org.apache.http.HttpClientConnection arg2, HttpContext arg3) throws java.io.IOException, org.apache.http.HttpException{
    return (org.apache.http.HttpResponse) null;
  }
  public void preProcess(org.apache.http.HttpRequest arg1, HttpProcessor arg2, HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void postProcess(org.apache.http.HttpResponse arg1, HttpProcessor arg2, HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
  }
  protected boolean canResponseHaveBody(org.apache.http.HttpRequest arg1, org.apache.http.HttpResponse arg2){
    return false;
  }
  protected org.apache.http.HttpResponse doSendRequest(org.apache.http.HttpRequest arg1, org.apache.http.HttpClientConnection arg2, HttpContext arg3) throws java.io.IOException, org.apache.http.HttpException{
    return (org.apache.http.HttpResponse) null;
  }
  protected org.apache.http.HttpResponse doReceiveResponse(org.apache.http.HttpRequest arg1, org.apache.http.HttpClientConnection arg2, HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
}
