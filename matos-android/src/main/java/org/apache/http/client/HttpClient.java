package org.apache.http.client;

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
public interface HttpClient
{
  // Methods

  public org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1) throws java.io.IOException, ClientProtocolException;
  public org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1, org.apache.http.protocol.HttpContext arg2) throws java.io.IOException, ClientProtocolException;
  public org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2) throws java.io.IOException, ClientProtocolException;
  public org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws java.io.IOException, ClientProtocolException;
  public <T>T execute(org.apache.http.client.methods.HttpUriRequest arg1, ResponseHandler<? extends T> arg2) throws java.io.IOException, ClientProtocolException;
  public <T>T execute(org.apache.http.client.methods.HttpUriRequest arg1, ResponseHandler<? extends T> arg2, org.apache.http.protocol.HttpContext arg3) throws java.io.IOException, ClientProtocolException;
  public <T>T execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, ResponseHandler<? extends T> arg3) throws java.io.IOException, ClientProtocolException;
  public <T>T execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, ResponseHandler<? extends T> arg3, org.apache.http.protocol.HttpContext arg4) throws java.io.IOException, ClientProtocolException;
  public org.apache.http.params.HttpParams getParams();
  public org.apache.http.conn.ClientConnectionManager getConnectionManager();
}
