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
public class HttpService
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpService-1", pos = 0, report = "-")
  public HttpService(HttpProcessor arg1, org.apache.http.ConnectionReuseStrategy arg2, org.apache.http.HttpResponseFactory arg3){
  }
  // Methods

  protected void handleException(org.apache.http.HttpException arg1, org.apache.http.HttpResponse arg2){
  }
  public org.apache.http.params.HttpParams getParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpService.setParams", pos = {0, 1}, report = "-")
  public void setParams(org.apache.http.params.HttpParams arg1){
  }
  public void setHttpProcessor(HttpProcessor arg1){
  }
  public void setConnReuseStrategy(org.apache.http.ConnectionReuseStrategy arg1){
  }
  public void setResponseFactory(org.apache.http.HttpResponseFactory arg1){
  }
  public void setHandlerResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("httpRequestHandlerResolver") HttpRequestHandlerResolver arg1){
  }
  public void setExpectationVerifier(@com.francetelecom.rd.stubs.annotation.CallBackRegister("HttpExpectationVerifier") HttpExpectationVerifier arg1){
  }
  public void handleRequest(org.apache.http.HttpServerConnection arg1, HttpContext arg2) throws java.io.IOException, org.apache.http.HttpException{
  }
  protected void doService(org.apache.http.HttpRequest arg1, org.apache.http.HttpResponse arg2, HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
  }
}
