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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class DevicePolicyManager
{
  // Fields

  public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";

  public static final java.lang.String ACTION_DEVICE_POLICY_MANAGER_STATE_CHANGED = "android.app.action.DEVICE_POLICY_MANAGER_STATE_CHANGED";

  public static final java.lang.String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";

  public static final java.lang.String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";

  public static final java.lang.String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";

  public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;

  public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = 32768;

  public static final int PASSWORD_QUALITY_SOMETHING = 65536;

  public static final int PASSWORD_QUALITY_NUMERIC = 131072;

  public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;

  public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;

  public static final int PASSWORD_QUALITY_COMPLEX = 393216;

  public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;

  public static final int WIPE_EXTERNAL_STORAGE = 1;

  public static final int ENCRYPTION_STATUS_UNSUPPORTED = 0;

  public static final int ENCRYPTION_STATUS_INACTIVE = 1;

  public static final int ENCRYPTION_STATUS_ACTIVATING = 2;

  public static final int ENCRYPTION_STATUS_ACTIVE = 3;

  public static final java.lang.String ACTION_START_ENCRYPTION = "android.app.action.START_ENCRYPTION";

  // Constructors

  private DevicePolicyManager(android.content.Context arg1, android.os.Handler arg2){
  }
  // Methods

  public static DevicePolicyManager create(android.content.Context arg1, android.os.Handler arg2){
    return (DevicePolicyManager) null;
  }
  public void getRemoveWarning(android.content.ComponentName arg1, android.os.RemoteCallback arg2){
  }
  public boolean isAdminActive(android.content.ComponentName arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.List<android.content.ComponentName> l = new java.util.ArrayList<android.content.ComponentName>();", "l.add(activeAdmin);", "return l;"})
  public java.util.List<android.content.ComponentName> getActiveAdmins(){
    return (java.util.List) null;
  }
  public boolean packageHasActiveAdmins(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.removeActiveAdmin", pos = 1, report = "-")
  public void removeActiveAdmin(android.content.ComponentName arg1){
  }
  public boolean hasGrantedPolicy(android.content.ComponentName arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.setPasswordQuality", pos = {1, 2}, report = "-")
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
  public int getPasswordMaximumLength(int arg1){
    return 0;
  }
  public boolean isActivePasswordSufficient(){
    return false;
  }
  public int getCurrentFailedPasswordAttempts(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.setMaximumFailedPasswordsForWipe", pos = {1, 2}, report = "-")
  public void setMaximumFailedPasswordsForWipe(android.content.ComponentName arg1, int arg2){
  }
  public int getMaximumFailedPasswordsForWipe(android.content.ComponentName arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.resetPassword", pos = 1, report = "-")
  public boolean resetPassword(java.lang.String arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.setMaximumTimeToLock", pos = {1, 2}, report = "-")
  public void setMaximumTimeToLock(android.content.ComponentName arg1, long arg2){
  }
  public long getMaximumTimeToLock(android.content.ComponentName arg1){
    return 0l;
  }
  public void lockNow(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "DevicePolicyManager.wipeData", report = "-")
  public void wipeData(int arg1){
  }
  public android.content.ComponentName setGlobalProxy(android.content.ComponentName arg1, java.net.Proxy arg2, java.util.List<java.lang.String> arg3){
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
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.setActiveAdmin", pos=1, report = "")
  public void setActiveAdmin(@com.francetelecom.rd.stubs.annotation.FieldSet(value = "activeAdmin", type = "android.content.ComponentName") android.content.ComponentName arg1, boolean arg2){
  }
  public DeviceAdminInfo getAdminInfo(android.content.ComponentName arg1){
    return (DeviceAdminInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DevicePolicyManager.setActivePasswordState", pos={1,2}, report = "-")
  public void setActivePasswordState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public void reportFailedPasswordAttempt(){
  }
  public void reportSuccessfulPasswordAttempt(){
  }
}
