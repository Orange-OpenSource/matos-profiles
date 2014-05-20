package org.apache.http;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.HttpMessageImplem", superClass = "")
public interface HttpMessage
{
  // Methods

  public ProtocolVersion getProtocolVersion();
  public Header [] getHeaders(java.lang.String arg1);
  public org.apache.http.params.HttpParams getParams();
  public void setHeader(Header arg1);
  public void setHeader(java.lang.String arg1, java.lang.String arg2);
  public void setHeaders(Header [] arg1);
  public void addHeader(Header arg1);
  public void addHeader(java.lang.String arg1, java.lang.String arg2);
  public void removeHeader(Header arg1);
  public void setParams(org.apache.http.params.HttpParams arg1);
  public Header [] getAllHeaders();
  public boolean containsHeader(java.lang.String arg1);
  public Header getFirstHeader(java.lang.String arg1);
  public Header getLastHeader(java.lang.String arg1);
  public void removeHeaders(java.lang.String arg1);
  public HeaderIterator headerIterator();
  public HeaderIterator headerIterator(java.lang.String arg1);
}
