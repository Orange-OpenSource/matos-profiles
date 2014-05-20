package org.apache.http.impl;

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
public class DefaultHttpResponseFactory
  implements org.apache.http.HttpResponseFactory
{
  // Fields

  protected final org.apache.http.ReasonPhraseCatalog reasonCatalog = (org.apache.http.ReasonPhraseCatalog) null;

  // Constructors

  public DefaultHttpResponseFactory(org.apache.http.ReasonPhraseCatalog arg1){
  }
  public DefaultHttpResponseFactory(){
  }
  // Methods

  public org.apache.http.HttpResponse newHttpResponse(org.apache.http.ProtocolVersion arg1, int arg2, org.apache.http.protocol.HttpContext arg3){
    return (org.apache.http.HttpResponse) null;
  }
  public org.apache.http.HttpResponse newHttpResponse(org.apache.http.StatusLine arg1, org.apache.http.protocol.HttpContext arg2){
    return (org.apache.http.HttpResponse) null;
  }
  protected java.util.Locale determineLocale(org.apache.http.protocol.HttpContext arg1){
    return (java.util.Locale) null;
  }
}
