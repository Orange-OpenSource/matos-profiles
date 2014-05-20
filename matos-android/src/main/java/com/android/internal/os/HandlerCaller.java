package com.android.internal.os;

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


public class HandlerCaller
{
  // Classes

  public static class SomeArgs
  {
    // Fields

    public java.lang.Object arg1;

    public java.lang.Object arg2;

    public java.lang.Object arg3;

    public java.lang.Object arg4;

    public int argi1;

    public int argi2;

    public int argi3;

    public int argi4;

    public int argi5;

    public int argi6;

    // Constructors

    public SomeArgs(){
    }
  }
  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("executeMessage")
    public void executeMessage(android.os.Message arg1);
  }
  // Fields

  public final android.content.Context mContext = (android.content.Context) null;

  // Constructors

  public HandlerCaller(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("executeMessage") HandlerCaller.Callback arg2){
  }
  public HandlerCaller(android.content.Context arg1, android.os.Looper arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("executeMessage") HandlerCaller.Callback arg3){
  }
  // Methods

  public android.os.Message obtainMessage(int arg1){
    return (android.os.Message) null;
  }
  public void sendMessage(android.os.Message arg1){
  }
  public void removeMessages(int arg1){
  }
  public void removeMessages(int arg1, java.lang.Object arg2){
  }
  public boolean hasMessages(int arg1){
    return false;
  }
  public android.os.Message obtainMessageI(int arg1, int arg2){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageII(int arg1, int arg2, int arg3){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageO(int arg1, java.lang.Object arg2){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIO(int arg1, int arg2, java.lang.Object arg3){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageOO(int arg1, java.lang.Object arg2, java.lang.Object arg3){
    return (android.os.Message) null;
  }
  public void recycleArgs(HandlerCaller.SomeArgs arg1){
  }
  public void executeOrSendMessage(android.os.Message arg1){
  }
  public android.os.Message obtainMessageIOO(int arg1, int arg2, java.lang.Object arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIIIIII(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageOOO(int arg1, java.lang.Object arg2, java.lang.Object arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageOOOO(int arg1, java.lang.Object arg2, java.lang.Object arg3, java.lang.Object arg4, java.lang.Object arg5){
    return (android.os.Message) null;
  }
  public HandlerCaller.SomeArgs obtainArgs(){
    return (HandlerCaller.SomeArgs) null;
  }
  public android.os.Message obtainMessageBO(int arg1, boolean arg2, java.lang.Object arg3){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageBOO(int arg1, boolean arg2, java.lang.Object arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIIO(int arg1, int arg2, int arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIIOO(int arg1, int arg2, int arg3, java.lang.Object arg4, java.lang.Object arg5){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIIII(int arg1, int arg2, int arg3, int arg4, int arg5){
    return (android.os.Message) null;
  }
  public android.os.Message obtainMessageIIIIO(int arg1, int arg2, int arg3, int arg4, int arg5, java.lang.Object arg6){
    return (android.os.Message) null;
  }
}
