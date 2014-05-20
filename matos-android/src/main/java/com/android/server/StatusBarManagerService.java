package com.android.server;

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
public class StatusBarManagerService
  extends com.android.internal.statusbar.IStatusBarService.Stub  implements com.android.server.wm.WindowManagerService.OnHardKeyboardStatusChangeListener
{
  // Classes

  public static interface NotificationCallbacks
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("notificationCallbacks")
    public void onPanelRevealed();
    @com.francetelecom.rd.stubs.annotation.CallBack("notificationCallbacks")
    public void onNotificationClick(java.lang.String arg1, java.lang.String arg2, int arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("notificationCallbacks")
    public void onNotificationError(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6);
    public void onNotificationClear(java.lang.String arg1, java.lang.String arg2, int arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("notificationCallbacks")
    public void onSetDisabled(int arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("notificationCallbacks")
    public void onClearAll();
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public StatusBarManagerService(android.content.Context arg1, com.android.server.wm.WindowManagerService arg2){
    super();
  }
  // Methods

  public void disable(int arg1, android.os.IBinder arg2, java.lang.String arg3){
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void setSystemUiVisibility(int arg1){
  }
  public void setIcon(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, java.lang.String arg5){
  }
  public void removeIcon(java.lang.String arg1){
  }
  public void topAppWindowChanged(boolean arg1){
  }
  public void setImeWindowStatus(android.os.IBinder arg1, int arg2, int arg3){
  }
  public void toggleRecentApps(){
  }
  public android.os.IBinder addNotification(com.android.internal.statusbar.StatusBarNotification arg1){
    return (android.os.IBinder) null;
  }
  public void updateNotification(android.os.IBinder arg1, com.android.internal.statusbar.StatusBarNotification arg2){
  }
  public void removeNotification(android.os.IBinder arg1){
  }
  public void expand(){
  }
  public void collapse(){
  }
  public void setIconVisibility(java.lang.String arg1, boolean arg2){
  }
  public void registerStatusBar(com.android.internal.statusbar.IStatusBar arg1, com.android.internal.statusbar.StatusBarIconList arg2, java.util.List<android.os.IBinder> arg3, java.util.List<com.android.internal.statusbar.StatusBarNotification> arg4, int [] arg5, java.util.List<android.os.IBinder> arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPanelRevealed(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onNotificationClick(java.lang.String arg1, java.lang.String arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onNotificationError(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClearAllNotifications(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onNotificationClear(java.lang.String arg1, java.lang.String arg2, int arg3){
  }
  public void setHardKeyboardEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHardKeyboardStatusChange(boolean arg1, boolean arg2){
  }
  public void setNotificationCallbacks(@com.francetelecom.rd.stubs.annotation.CallBackRegister("notificationCallbacks") StatusBarManagerService.NotificationCallbacks arg1){
  }
}
