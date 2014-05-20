package org.apache.http.impl.client;

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
public class RequestWrapper
  extends org.apache.http.message.AbstractHttpMessage  implements org.apache.http.client.methods.HttpUriRequest
{
  // Constructors

  public RequestWrapper(org.apache.http.HttpRequest arg1) throws org.apache.http.ProtocolException{
    super((org.apache.http.params.HttpParams) null);
  }
  // Methods

  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public org.apache.http.ProtocolVersion getProtocolVersion(){
    return (org.apache.http.ProtocolVersion) null;
  }
  public void setMethod(java.lang.String arg1){
  }
  public boolean isAborted(){
    return false;
  }
  public void abort() throws java.lang.UnsupportedOperationException{
  }
  public boolean isRepeatable(){
    return false;
  }
  public java.net.URI getURI(){
    return (java.net.URI) null;
  }
  public void setURI(java.net.URI arg1){
  }
  public org.apache.http.RequestLine getRequestLine(){
    return (org.apache.http.RequestLine) null;
  }
  public org.apache.http.HttpRequest getOriginal(){
    return (org.apache.http.HttpRequest) null;
  }
  public void resetHeaders(){
  }
  public void incrementExecCount(){
  }
  public int getExecCount(){
    return 0;
  }
  public void setProtocolVersion(org.apache.http.ProtocolVersion arg1){
  }
}
