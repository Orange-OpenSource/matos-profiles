package org.apache.http.impl.conn;

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
public class DefaultClientConnectionOperator
  implements org.apache.http.conn.ClientConnectionOperator
{
  // Fields

  protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;

  // Constructors

  public DefaultClientConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry arg1){
  }
  // Methods

  public void openConnection(org.apache.http.conn.OperatedClientConnection arg1, org.apache.http.HttpHost arg2, java.net.InetAddress arg3, org.apache.http.protocol.HttpContext arg4, org.apache.http.params.HttpParams arg5) throws java.io.IOException{
  }
  public org.apache.http.conn.OperatedClientConnection createConnection(){
    return (org.apache.http.conn.OperatedClientConnection) null;
  }
  public void updateSecureConnection(org.apache.http.conn.OperatedClientConnection arg1, org.apache.http.HttpHost arg2, org.apache.http.protocol.HttpContext arg3, org.apache.http.params.HttpParams arg4) throws java.io.IOException{
  }
  protected void prepareSocket(java.net.Socket arg1, org.apache.http.protocol.HttpContext arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
  }
}
