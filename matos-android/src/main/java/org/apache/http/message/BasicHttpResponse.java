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
public class BasicHttpResponse
  extends AbstractHttpMessage  implements org.apache.http.HttpResponse
{
  // Constructors

  public BasicHttpResponse(org.apache.http.StatusLine arg1, org.apache.http.ReasonPhraseCatalog arg2, java.util.Locale arg3){
    super((org.apache.http.params.HttpParams) null);
  }
  public BasicHttpResponse(org.apache.http.StatusLine arg1){
    super((org.apache.http.params.HttpParams) null);
  }
  public BasicHttpResponse(org.apache.http.ProtocolVersion arg1, int arg2, java.lang.String arg3){
    super((org.apache.http.params.HttpParams) null);
  }
  // Methods

  public org.apache.http.ProtocolVersion getProtocolVersion(){
    return (org.apache.http.ProtocolVersion) null;
  }
  public void setLocale(java.util.Locale arg1){
  }
  public org.apache.http.HttpEntity getEntity(){
    return (org.apache.http.HttpEntity) null;
  }
  public void setEntity(org.apache.http.HttpEntity arg1){
  }
  public java.util.Locale getLocale(){
    return (java.util.Locale) null;
  }
  public org.apache.http.StatusLine getStatusLine(){
    return (org.apache.http.StatusLine) null;
  }
  public void setStatusLine(org.apache.http.StatusLine arg1){
  }
  public void setStatusLine(org.apache.http.ProtocolVersion arg1, int arg2){
  }
  public void setStatusLine(org.apache.http.ProtocolVersion arg1, int arg2, java.lang.String arg3){
  }
  public void setStatusCode(int arg1){
  }
  public void setReasonPhrase(java.lang.String arg1){
  }
  protected java.lang.String getReason(int arg1){
    return (java.lang.String) null;
  }
}
