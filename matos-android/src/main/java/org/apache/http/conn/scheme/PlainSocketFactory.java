package org.apache.http.conn.scheme;

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
public final class PlainSocketFactory
  implements SocketFactory
{
  // Constructors

  public PlainSocketFactory(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") HostNameResolver arg1){
  }
  public PlainSocketFactory(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public final boolean isSecure(java.net.Socket arg1) throws java.lang.IllegalArgumentException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PlainSocketFactory.createSocket-1", pos = 0, report = "-")
  public java.net.Socket createSocket(){
    return (java.net.Socket) null;
  }
  public static PlainSocketFactory getSocketFactory(){
    return (PlainSocketFactory) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PlainSocketFactory.createSocket-2", pos = {0, 1, 2, 4, 6}, report = "-")
  public java.net.Socket connectSocket(java.net.Socket arg1, java.lang.String arg2, int arg3, java.net.InetAddress arg4, int arg5, org.apache.http.params.HttpParams arg6) throws java.io.IOException{
    return (java.net.Socket) null;
  }
}
