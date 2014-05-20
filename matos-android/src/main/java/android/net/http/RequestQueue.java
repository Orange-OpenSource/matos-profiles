package android.net.http;

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
public class RequestQueue
{
  // Constructors

  public RequestQueue(android.content.Context arg1){
  }
  public RequestQueue(android.content.Context arg1, int arg2){
  }
  // Methods

  public void shutdown(){
  }
  public synchronized void enablePlatformNotifications(){
  }
  public synchronized void disablePlatformNotifications(){
  }
  public org.apache.http.HttpHost getProxyHost(){
    return (org.apache.http.HttpHost) null;
  }
  public void startTiming(){
  }
  public void stopTiming(){
  }
  public RequestHandle queueSynchronousRequest(java.lang.String arg1, android.net.WebAddress arg2, java.lang.String arg3, java.util.Map<java.lang.String, java.lang.String> arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("eventHandler") EventHandler arg5, java.io.InputStream arg6, int arg7){
    return (RequestHandle) null;
  }
  public RequestHandle queueRequest(java.lang.String arg1, java.lang.String arg2, java.util.Map<java.lang.String, java.lang.String> arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("eventHandler") EventHandler arg4, java.io.InputStream arg5, int arg6){
    return (RequestHandle) null;
  }
  public RequestHandle queueRequest(java.lang.String arg1, android.net.WebAddress arg2, java.lang.String arg3, java.util.Map<java.lang.String, java.lang.String> arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("eventHandler") EventHandler arg5, java.io.InputStream arg6, int arg7){
    return (RequestHandle) null;
  }
  public synchronized boolean haveRequest(org.apache.http.HttpHost arg1){
    return false;
  }
}
