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
public abstract class AbstractHttpMessage
  implements org.apache.http.HttpMessage
{
  // Fields

  protected HeaderGroup headergroup;

  protected org.apache.http.params.HttpParams params;

  // Constructors

  protected AbstractHttpMessage(org.apache.http.params.HttpParams arg1){
  }
  protected AbstractHttpMessage(){
  }
  // Methods

  public org.apache.http.Header [] getHeaders(java.lang.String arg1){
    return (org.apache.http.Header []) null;
  }
  public org.apache.http.params.HttpParams getParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public void setHeader(org.apache.http.Header arg1){
  }
  public void setHeader(java.lang.String arg1, java.lang.String arg2){
  }
  public void setHeaders(org.apache.http.Header [] arg1){
  }
  public void addHeader(org.apache.http.Header arg1){
  }
  public void addHeader(java.lang.String arg1, java.lang.String arg2){
  }
  public void removeHeader(org.apache.http.Header arg1){
  }
  public void setParams(org.apache.http.params.HttpParams arg1){
  }
  public org.apache.http.Header [] getAllHeaders(){
    return (org.apache.http.Header []) null;
  }
  public boolean containsHeader(java.lang.String arg1){
    return false;
  }
  public org.apache.http.Header getFirstHeader(java.lang.String arg1){
    return (org.apache.http.Header) null;
  }
  public org.apache.http.Header getLastHeader(java.lang.String arg1){
    return (org.apache.http.Header) null;
  }
  public void removeHeaders(java.lang.String arg1){
  }
  public org.apache.http.HeaderIterator headerIterator(){
    return (org.apache.http.HeaderIterator) null;
  }
  public org.apache.http.HeaderIterator headerIterator(java.lang.String arg1){
    return (org.apache.http.HeaderIterator) null;
  }
}
