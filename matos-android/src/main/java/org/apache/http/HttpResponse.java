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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.HttpResponseImplem", superClass = "")
public interface HttpResponse
  extends HttpMessage
{
  // Methods

  public void setLocale(java.util.Locale arg1);
  public HttpEntity getEntity();
  public void setEntity(HttpEntity arg1);
  public java.util.Locale getLocale();
  public StatusLine getStatusLine();
  public void setStatusLine(StatusLine arg1);
  public void setStatusLine(ProtocolVersion arg1, int arg2);
  public void setStatusLine(ProtocolVersion arg1, int arg2, java.lang.String arg3);
  public void setStatusCode(int arg1) throws java.lang.IllegalStateException;
  public void setReasonPhrase(java.lang.String arg1) throws java.lang.IllegalStateException;
}
