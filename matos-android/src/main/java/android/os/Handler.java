package android.os;

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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldSet;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Handler
{
  // Classes

  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") 
    public boolean handleMessage(Message arg1);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.Code("handleMessage(message);")
  public Handler(){
  }
  
  @com.francetelecom.rd.stubs.annotation.Code({"handleMessage(message);","arg1.handleMessage(message);"})
  public Handler(Handler.Callback arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("handleMessage(message);")
  public Handler(Looper arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"handleMessage(message);","arg2.handleMessage(message);"})
  public Handler(Looper arg1, Handler.Callback arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  
  public void handleMessage(Message arg1){
  }
  public final boolean post(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
    return false;
  }
  public final Looper getLooper(){
    return (Looper) null;
  }
  public final Message obtainMessage(){
    return (Message) null;
  }
  public final Message obtainMessage(int arg1){
    return (Message) null;
  }
  @Code({"Message m = new Message();","m.obj=arg2;","return m;"})
  public final Message obtainMessage(int arg1, java.lang.Object arg2){
    return (Message) null;
  }
  public final Message obtainMessage(int arg1, int arg2, int arg3){
    return (Message) null;
  }
  @Code({"Message m = new Message();","m.obj=arg4;","return m;"})
  public final Message obtainMessage(int arg1, int arg2, int arg3, java.lang.Object arg4){
    return (Message) null;
  }
  public final boolean sendMessage(@FieldSet("message")Message arg1){
    return false;
  }
  public final boolean sendMessageDelayed(@FieldSet("message")Message arg1, long arg2){
    return false;
  }
  public final boolean sendMessageAtFrontOfQueue(@FieldSet("message")Message arg1){
    return false;
  }
  public final void removeMessages(int arg1){
  }
  public final void removeMessages(int arg1, java.lang.Object arg2){
  }
  public void dispatchMessage(@FieldSet("message") Message arg1){
  }
  public java.lang.String getMessageName(Message arg1){
    return (java.lang.String) null;
  }
  public final boolean postAtTime(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2){
    return false;
  }
  public final boolean postAtTime(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, java.lang.Object arg2, long arg3){
    return false;
  }
  public final boolean postDelayed(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2){
    return false;
  }
  public final boolean postAtFrontOfQueue(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
    return false;
  }
  public final void removeCallbacks(java.lang.Runnable arg1){
  }
  public final void removeCallbacks(java.lang.Runnable arg1, java.lang.Object arg2){
  }
  public final boolean sendEmptyMessage(int arg1){
    return false;
  }
  public final boolean sendEmptyMessageDelayed(int arg1, long arg2){
    return false;
  }
  public final boolean sendEmptyMessageAtTime(int arg1, long arg2){
    return false;
  }
  public boolean sendMessageAtTime(@FieldSet("message")Message arg1, long arg2){
    return false;
  }
  public final void removeCallbacksAndMessages(java.lang.Object arg1){
  }
  public final boolean hasMessages(int arg1){
    return false;
  }
  public final boolean hasMessages(int arg1, java.lang.Object arg2){
    return false;
  }
}
