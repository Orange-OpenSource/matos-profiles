package com.android.internal.util;

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
public class AsyncChannel
{
  // Fields

  public static final int CMD_CHANNEL_HALF_CONNECTED = 69632;

  public static final int CMD_CHANNEL_FULL_CONNECTION = 69633;

  public static final int CMD_CHANNEL_FULLY_CONNECTED = 69634;

  public static final int CMD_CHANNEL_DISCONNECT = 69635;

  public static final int CMD_CHANNEL_DISCONNECTED = 69636;

  public static final int STATUS_SUCCESSFUL = 0;

  public static final int STATUS_BINDING_UNSUCCESSFUL = 1;

  public static final int STATUS_SEND_UNSUCCESSFUL = 2;

  public static final int STATUS_FULL_CONNECTION_REFUSED_ALREADY_CONNECTED = 3;

  // Constructors

  public AsyncChannel(){
  }
  // Methods

  public void connect(android.content.Context arg1, android.os.Handler arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public void connect(android.content.Context arg1, android.os.Handler arg2, java.lang.Class<?> arg3){
  }
  public void connect(android.content.Context arg1, android.os.Handler arg2, android.os.Messenger arg3){
  }
  public void connect(android.content.Context arg1, android.os.Handler arg2, android.os.Handler arg3){
  }
  public void connect(AsyncService arg1, android.os.Messenger arg2){
  }
  public void connected(android.content.Context arg1,  android.os.Handler arg2, android.os.Messenger arg3){
  }
  public void disconnected(){
  }
  public void sendMessage(android.os.Message arg1){
  }
  public void sendMessage(int arg1){
  }
  public void sendMessage(int arg1, int arg2){
  }
  public void sendMessage(int arg1, int arg2, int arg3){
  }
  public void sendMessage(int arg1, int arg2, int arg3, java.lang.Object arg4){
  }
  public void sendMessage(int arg1, java.lang.Object arg2){
  }
  public void disconnect(){
  }
  public void replyToMessage(android.os.Message arg1, android.os.Message arg2){
  }
  public void replyToMessage(android.os.Message arg1, int arg2){
  }
  public void replyToMessage(android.os.Message arg1, int arg2, int arg3){
  }
  public void replyToMessage(android.os.Message arg1, int arg2, int arg3, int arg4){
  }
  public void replyToMessage(android.os.Message arg1, int arg2, int arg3, int arg4, java.lang.Object arg5){
  }
  public void replyToMessage(android.os.Message arg1, int arg2, java.lang.Object arg3){
  }
  public int fullyConnectSync(android.content.Context arg1,  android.os.Handler arg2,  android.os.Handler arg3){
    return 0;
  }
  public int connectSync(android.content.Context arg1,  android.os.Handler arg2, android.os.Messenger arg3){
    return 0;
  }
  public int connectSync(android.content.Context arg1,  android.os.Handler arg2,  android.os.Handler arg3){
    return 0;
  }
  public int connectSrcHandlerToPackageSync(android.content.Context arg1,  android.os.Handler arg2, java.lang.String arg3, java.lang.String arg4){
    return 0;
  }
  public android.os.Message sendMessageSynchronously(android.os.Message arg1){
    return (android.os.Message) null;
  }
  public android.os.Message sendMessageSynchronously(int arg1){
    return (android.os.Message) null;
  }
  public android.os.Message sendMessageSynchronously(int arg1, int arg2){
    return (android.os.Message) null;
  }
  public android.os.Message sendMessageSynchronously(int arg1, int arg2, int arg3){
    return (android.os.Message) null;
  }
  public android.os.Message sendMessageSynchronously(int arg1, int arg2, int arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public android.os.Message sendMessageSynchronously(int arg1, java.lang.Object arg2){
    return (android.os.Message) null;
  }
}
