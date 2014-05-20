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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Field(type = "java.lang.Runnable", value = "callback", modifier = 2)
public final class Message
  implements Parcelable
{
  // Fields

  public int what;

  public int arg1;

  public int arg2;

  public java.lang.Object obj;

  public Messenger replyTo;

  public static final Parcelable.Creator<Message> CREATOR = null;

  // Constructors

  public Message(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mData")
  public Bundle getData(){
    return (Bundle) null;
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public Handler getTarget(){
    return (Handler) null;
  }
  public void setData(@com.francetelecom.rd.stubs.annotation.FieldSet("mData") Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("callback")
  public java.lang.Runnable getCallback(){
    return (java.lang.Runnable) null;
  }
  public void setTarget( Handler arg1){
  }
  public void copyFrom(Message arg1){
  }
  public static Message obtain(){
    return (Message) null;
  }
  public static Message obtain(Message arg1){
    return (Message) null;
  }
  public static Message obtain(Handler arg1){
    return (Message) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Message m = obtain();", "arg2.run();", "m.callback=arg2;", "return m;"})
  public static Message obtain(Handler arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg2){
    return (Message) null;
  }
  public static Message obtain(Handler arg1, int arg2){
    return (Message) null;
  }
  @Code({"Message m = new Message();","m.obj=arg3;","return m;"})
  public static Message obtain(Handler arg1, int arg2, java.lang.Object arg3){
    return (Message) null;
  }
  
  public static Message obtain(Handler arg1, int arg2, int arg3, int arg4){
    return (Message) null;
  }
  @Code({"Message m = new Message();","m.obj=arg5;","return m;"})
  public static Message obtain(Handler arg1, int arg2, int arg3, int arg4, java.lang.Object arg5){
    return (Message) null;
  }
  public void recycle(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mData")
  public Bundle peekData(){
    return (Bundle) null;
  }
  public void sendToTarget(){
  }
  public long getWhen(){
    return 0l;
  }
}
