package android.app;

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
public final class PendingIntent
  implements android.os.Parcelable
{
  // Classes

  public static class CanceledException
    extends android.util.AndroidException  {
    // Constructors

    public CanceledException(){
      super();
    }
    public CanceledException(java.lang.String arg1){
      super();
    }
    public CanceledException(java.lang.Exception arg1){
      super();
    }
  }
  public static interface OnFinished
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnFinished")
    public void onSendFinished(PendingIntent arg1, android.content.Intent arg2, int arg3, java.lang.String arg4, android.os.Bundle arg5);
  }
  // Fields

  public static final int FLAG_ONE_SHOT = 1073741824;

  public static final int FLAG_NO_CREATE = 536870912;

  public static final int FLAG_CANCEL_CURRENT = 268435456;

  public static final int FLAG_UPDATE_CURRENT = 134217728;

  public static final android.os.Parcelable.Creator<PendingIntent> CREATOR = null;

  // Constructors

  PendingIntent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentSender") android.content.IIntentSender arg1){
  }
  PendingIntent(android.os.IBinder arg1){
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
  public void send() throws PendingIntent.CanceledException{
  }
  public void send(int arg1) throws PendingIntent.CanceledException{
  }
  public void send(android.content.Context arg1, int arg2, android.content.Intent arg3) throws PendingIntent.CanceledException{
  }
  public void send(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnFinished") PendingIntent.OnFinished arg2, android.os.Handler arg3) throws PendingIntent.CanceledException{
  }
  public void send(android.content.Context arg1, int arg2, android.content.Intent arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnFinished") PendingIntent.OnFinished arg4, android.os.Handler arg5) throws PendingIntent.CanceledException{
  }
  public void send(android.content.Context arg1, int arg2, android.content.Intent arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnFinished") PendingIntent.OnFinished arg4, android.os.Handler arg5, java.lang.String arg6) throws PendingIntent.CanceledException{
  }
  public void cancel(){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public static PendingIntent getService(android.content.Context arg1, int arg2, android.content.Intent arg3, int arg4){
    return (PendingIntent) null;
  }
  public static PendingIntent getActivity(android.content.Context arg1, int arg2, android.content.Intent arg3, int arg4){
    return (PendingIntent) null;
  }
  public android.content.IntentSender getIntentSender(){
    return (android.content.IntentSender) null;
  }
  public int describeContents(){
    return 0;
  }
  public static PendingIntent getActivities(android.content.Context arg1, int arg2, android.content.Intent [] arg3, int arg4){
    return (PendingIntent) null;
  }
  public static PendingIntent getBroadcast(android.content.Context arg1, int arg2, android.content.Intent arg3, int arg4){
    return (PendingIntent) null;
  }
  public java.lang.String getTargetPackage(){
    return (java.lang.String) null;
  }
  public boolean isTargetedToPackage(){
    return false;
  }
  public static void writePendingIntentOrNullToParcel(PendingIntent arg1, android.os.Parcel arg2){
  }
  public static PendingIntent readPendingIntentOrNullFromParcel(android.os.Parcel arg1){
    return (PendingIntent) null;
  }
  public android.content.IIntentSender getTarget(){
    return (android.content.IIntentSender) null;
  }
}
