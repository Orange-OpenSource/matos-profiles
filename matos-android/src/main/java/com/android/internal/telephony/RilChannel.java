package com.android.internal.telephony;

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
public class RilChannel
{
  // Constructors

  private RilChannel(){
  }
  // Methods

  public void close(){
  }
  public java.nio.channels.SocketChannel getChannel(){
    return (java.nio.channels.SocketChannel) null;
  }
  public static RilChannel makeRilChannel() throws java.io.IOException{
    return (RilChannel) null;
  }
  public final int sendAll(java.nio.ByteBuffer arg1) throws java.io.IOException{
    return 0;
  }
  public final int recvAll(java.nio.ByteBuffer arg1) throws java.io.IOException{
    return 0;
  }
  public final int rewindSendAll(java.nio.ByteBuffer arg1) throws java.io.IOException{
    return 0;
  }
  public final int recvAllRewind(java.nio.ByteBuffer arg1) throws java.io.IOException{
    return 0;
  }
}
