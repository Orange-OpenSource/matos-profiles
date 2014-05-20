package android.content;

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
public class IntentSender
  implements android.os.Parcelable
{
  // Classes

  public static class SendIntentException
    extends android.util.AndroidException  {
    // Constructors

    public SendIntentException(){
      super();
    }
    public SendIntentException(java.lang.String arg1){
      super();
    }
    public SendIntentException(java.lang.Exception arg1){
      super();
    }
  }
  public static interface OnFinished
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onSendFinished")
    public void onSendFinished(IntentSender arg1, Intent arg2, int arg3, java.lang.String arg4, android.os.Bundle arg5);
  }
  // Fields

  public static final android.os.Parcelable.Creator<IntentSender> CREATOR = null;

  // Constructors

  public IntentSender(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentSender") IIntentSender arg1){
  }
  public IntentSender(android.os.IBinder arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.String getTargetPackage(){
    return (java.lang.String) null;
  }
  public IIntentSender getTarget(){
    return (IIntentSender) null;
  }
  public void sendIntent(Context arg1, int arg2, Intent arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.IntentSender.OnFinished.onSendFinished") IntentSender.OnFinished arg4, android.os.Handler arg5) throws IntentSender.SendIntentException{
  }
  public void sendIntent(Context arg1, int arg2, Intent arg3, IntentSender.OnFinished arg4, android.os.Handler arg5, java.lang.String arg6) throws IntentSender.SendIntentException{
  }
  public static void writeIntentSenderOrNullToParcel(IntentSender arg1, android.os.Parcel arg2){
  }
  public static IntentSender readIntentSenderOrNullFromParcel(android.os.Parcel arg1){
    return (IntentSender) null;
  }
}
