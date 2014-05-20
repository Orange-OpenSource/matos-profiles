package android.net;

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

@com.francetelecom.rd.stubs.annotation.ClassDone
public final class DnsPinger
  extends android.os.Handler{
  // Fields

  public static final int DNS_PING_RESULT = 327680;

  public static final int TIMEOUT = -1;

  public static final int SOCKET_EXCEPTION = -2;

  // Constructors

  public DnsPinger(android.content.Context arg1, java.lang.String arg2, android.os.Looper arg3,  android.os.Handler arg4, int arg5){
    super();
  }
  // Methods
  @com.francetelecom.rd.stubs.annotation.CallBack("handleMessage")
  public void handleMessage(android.os.Message arg1){
  }
  public java.util.List<java.net.InetAddress> getDnsList(){
    return (java.util.List) null;
  }
  public int pingDnsAsync(java.net.InetAddress arg1, int arg2, int arg3){
    return 0;
  }
  public void cancelPings(){
  }
}
