package android.app.admin;

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


public class DeviceAdminReceiver
  extends android.content.BroadcastReceiver{
  // Fields

  public static final java.lang.String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";

  public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";

  public static final java.lang.String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";

  public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";

  public static final java.lang.String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";

  public static final java.lang.String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";

  public static final java.lang.String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";

  public static final java.lang.String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";

  public static final java.lang.String DEVICE_ADMIN_META_DATA = "android.app.device_admin";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceive")
  public DeviceAdminReceiver(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onReceive(android.content.Context arg1, android.content.Intent arg2){
  }
  public DevicePolicyManager getManager(android.content.Context arg1){
    return (DevicePolicyManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onEnabled(android.content.Context arg1, android.content.Intent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onDisabled(android.content.Context arg1, android.content.Intent arg2){
  }
  public android.content.ComponentName getWho(android.content.Context arg1){
    return (android.content.ComponentName) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public java.lang.CharSequence onDisableRequested(android.content.Context arg1, android.content.Intent arg2){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPasswordChanged(android.content.Context arg1, android.content.Intent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPasswordFailed(android.content.Context arg1, android.content.Intent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPasswordSucceeded(android.content.Context arg1, android.content.Intent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPasswordExpiring(android.content.Context arg1, android.content.Intent arg2){
  }
}
