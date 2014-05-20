package org.apache.http.conn;

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
public interface OperatedClientConnection
  extends org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection
{
  // Methods

  public void update(java.net.Socket arg1, org.apache.http.HttpHost arg2, boolean arg3, org.apache.http.params.HttpParams arg4) throws java.io.IOException;
  public boolean isSecure();
  public org.apache.http.HttpHost getTargetHost();
  public java.net.Socket getSocket();
  public void opening(java.net.Socket arg1, org.apache.http.HttpHost arg2) throws java.io.IOException;
  public void openCompleted(boolean arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException;
}
