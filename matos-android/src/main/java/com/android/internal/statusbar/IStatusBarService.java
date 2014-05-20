package com.android.internal.statusbar;

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
public interface IStatusBarService
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IStatusBarService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IStatusBarService asInterface(android.os.IBinder arg1){
      return (IStatusBarService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IStatusBarService")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void disable(int arg1, android.os.IBinder arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void setSystemUiVisibility(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void setIcon(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, java.lang.String arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void removeIcon(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void topAppWindowChanged(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void setImeWindowStatus(android.os.IBinder arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void toggleRecentApps() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void expand() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void collapse() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void setIconVisibility(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public void registerStatusBar(IStatusBar arg1, StatusBarIconList arg2, java.util.List<android.os.IBinder> arg3, java.util.List<StatusBarNotification> arg4, int [] arg5, java.util.List<android.os.IBinder> arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void onPanelRevealed() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void onNotificationClick(java.lang.String arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void onNotificationError(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void onClearAllNotifications() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void onNotificationClear(java.lang.String arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IStatusBarService")
  public void setHardKeyboardEnabled(boolean arg1) throws android.os.RemoteException;
}
