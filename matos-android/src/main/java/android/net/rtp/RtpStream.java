package android.net.rtp;

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


public class RtpStream
{
  // Fields

  public static final int MODE_NORMAL = 0;

  public static final int MODE_SEND_ONLY = 1;

  public static final int MODE_RECEIVE_ONLY = 2;

  // Constructors

  RtpStream(java.net.InetAddress arg1) throws java.net.SocketException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void release(){
  }
  public int getLocalPort(){
    return 0;
  }
  public java.net.InetAddress getLocalAddress(){
    return (java.net.InetAddress) null;
  }
  public java.net.InetAddress getRemoteAddress(){
    return (java.net.InetAddress) null;
  }
  public int getRemotePort(){
    return 0;
  }
  public int getMode(){
    return 0;
  }
  public void setMode(int arg1){
  }
  public boolean isBusy(){
    return false;
  }
  public void associate(java.net.InetAddress arg1, int arg2){
  }
}
