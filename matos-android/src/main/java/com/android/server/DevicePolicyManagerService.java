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
public class DevicePolicyManagerService
  extends android.app.admin.IDevicePolicyManager.Stub{
  // Fields

  protected static final java.lang.String ACTION_EXPIRED_PASSWORD_NOTIFICATION = (java.lang.String) null;

  public static final java.lang.String SYSTEM_PROP_DISABLE_CAMERA = "sys.secpolicy.camera.disabled";

  // Constructors

  public DevicePolicyManagerService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void getRemoveWarning(android.content.ComponentName arg1, android.os.RemoteCallback arg2){
  }
  public boolean isAdminActive(android.content.ComponentName arg1){
    return false;
  }
  public java.util.List<android.content.ComponentName> getActiveAdmins(){
    return (java.util.List) null;
  }
  public boolean packageHasActiveAdmins(java.lang.String arg1){
    return false;
  }
  public void removeActiveAdmin(android.content.ComponentName arg1){
  }
  public boolean hasGrantedPolicy(android.content.ComponentName arg1, int arg2){
    return false;
  }
  public void setPasswordQuality(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordQuality(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumLength(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumLength(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumUpperCase(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumUpperCase(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumLowerCase(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumLowerCase(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumLetters(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumLetters(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumNumeric(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumNumeric(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumSymbols(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumSymbols(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordMinimumNonLetter(android.content.ComponentName arg1, int arg2){
  }
  public int getPasswordMinimumNonLetter(android.content.ComponentName arg1){
    return 0;
  }
  public void setPasswordHistoryLength(android.content.ComponentName arg1, int arg2){
  }
  public void setPasswordExpirationTimeout(android.content.ComponentName arg1, long arg2){
  }
  public long getPasswordExpirationTimeout(android.content.ComponentName arg1){
    return 0l;
  }
  public long getPasswordExpiration(android.content.ComponentName arg1){
    return 0l;
  }
  public int getPasswordHistoryLength(android.content.ComponentName arg1){
    return 0;
  }
  public boolean isActivePasswordSufficient(){
    return false;
  }
  public int getCurrentFailedPasswordAttempts(){
    return 0;
  }
  public void setMaximumFailedPasswordsForWipe(android.content.ComponentName arg1, int arg2){
  }
  public int getMaximumFailedPasswordsForWipe(android.content.ComponentName arg1){
    return 0;
  }
  public boolean resetPassword(java.lang.String arg1, int arg2){
    return false;
  }
  public void setMaximumTimeToLock(android.content.ComponentName arg1, long arg2){
  }
  public long getMaximumTimeToLock(android.content.ComponentName arg1){
    return 0l;
  }
  public void lockNow(){
  }
  public void wipeData(int arg1){
  }
  public android.content.ComponentName setGlobalProxy(android.content.ComponentName arg1, java.lang.String arg2, java.lang.String arg3){
    return (android.content.ComponentName) null;
  }
  public android.content.ComponentName getGlobalProxyAdmin(){
    return (android.content.ComponentName) null;
  }
  public int setStorageEncryption(android.content.ComponentName arg1, boolean arg2){
    return 0;
  }
  public boolean getStorageEncryption(android.content.ComponentName arg1){
    return false;
  }
  public int getStorageEncryptionStatus(){
    return 0;
  }
  public void setCameraDisabled(android.content.ComponentName arg1, boolean arg2){
  }
  public boolean getCameraDisabled(android.content.ComponentName arg1){
    return false;
  }
  public void setActiveAdmin(android.content.ComponentName arg1, boolean arg2){
  }
  public void setActivePasswordState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public void reportFailedPasswordAttempt(){
  }
  public void reportSuccessfulPasswordAttempt(){
  }
  protected void setExpirationAlarmCheckLocked(android.content.Context arg1){
  }
  public android.app.admin.DeviceAdminInfo findAdmin(android.content.ComponentName arg1){
    return (android.app.admin.DeviceAdminInfo) null;
  }
  public void systemReady(){
  }
}
