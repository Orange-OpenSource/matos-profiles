package org.apache.http.client.methods;

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
public abstract class HttpRequestBase
  extends org.apache.http.message.AbstractHttpMessage  implements AbortableHttpRequest, HttpUriRequest, java.lang.Cloneable
{
  // Constructors

  public HttpRequestBase(){
    super((org.apache.http.params.HttpParams) null);
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public abstract java.lang.String getMethod();
  public org.apache.http.ProtocolVersion getProtocolVersion(){
    return (org.apache.http.ProtocolVersion) null;
  }
  public boolean isAborted(){
    return false;
  }
  public void abort(){
  }
  public java.net.URI getURI(){
    return (java.net.URI) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpRequestBase.setURI", pos = {0, 1}, report = "-")
  public void setURI(java.net.URI arg1){
  }
  public org.apache.http.RequestLine getRequestLine(){
    return (org.apache.http.RequestLine) null;
  }
  public void setConnectionRequest(org.apache.http.conn.ClientConnectionRequest arg1) throws java.io.IOException{
  }
  public void setReleaseTrigger(org.apache.http.conn.ConnectionReleaseTrigger arg1) throws java.io.IOException{
  }
}
