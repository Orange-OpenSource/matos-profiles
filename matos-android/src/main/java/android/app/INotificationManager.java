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
public interface INotificationManager
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.INotificationManagerStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements INotificationManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static INotificationManager asInterface(android.os.IBinder arg1){
      return (INotificationManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("INotificationManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void cancelNotification(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void enqueueNotification(java.lang.String arg1, int arg2, Notification arg3, int [] arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void cancelAllNotifications(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void enqueueToast(java.lang.String arg1, ITransientNotification arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void cancelToast(java.lang.String arg1, ITransientNotification arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void enqueueNotificationWithTag(java.lang.String arg1, java.lang.String arg2, int arg3, Notification arg4, int [] arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void enqueueNotificationWithTagPriority(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, Notification arg5, int [] arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INotificationManager")
  public void cancelNotificationWithTag(java.lang.String arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
}
