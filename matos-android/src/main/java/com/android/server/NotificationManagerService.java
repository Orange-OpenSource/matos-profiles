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


public class NotificationManagerService
  extends android.app.INotificationManager.Stub{
  // Constructors

  NotificationManagerService(android.content.Context arg1, StatusBarManagerService arg2, LightsService arg3){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void cancelNotification(java.lang.String arg1, int arg2){
  }
  public void enqueueNotification(java.lang.String arg1, int arg2, android.app.Notification arg3, int [] arg4){
  }
  public void cancelAllNotifications(java.lang.String arg1){
  }
  public void enqueueToast(java.lang.String arg1, android.app.ITransientNotification arg2, int arg3){
  }
  public void cancelToast(java.lang.String arg1, android.app.ITransientNotification arg2){
  }
  public void enqueueNotificationWithTag(java.lang.String arg1, java.lang.String arg2, int arg3, android.app.Notification arg4, int [] arg5){
  }
  public void enqueueNotificationWithTagPriority(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, android.app.Notification arg5, int [] arg6){
  }
  public void cancelNotificationWithTag(java.lang.String arg1, java.lang.String arg2, int arg3){
  }
  public void enqueueNotificationInternal(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4, int arg5, android.app.Notification arg6, int [] arg7){
  }
  public void enqueueNotificationInternal(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4, int arg5, int arg6, android.app.Notification arg7, int [] arg8){
  }
}
