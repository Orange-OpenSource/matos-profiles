package com.android.internal.widget;

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
public class LockPatternUtils
{
  // Fields

  public static final int FAILED_ATTEMPTS_BEFORE_TIMEOUT = 5;

  public static final int FAILED_ATTEMPTS_BEFORE_RESET = 20;

  public static final long FAILED_ATTEMPT_TIMEOUT_MS = 30000l;

  public static final long FAILED_ATTEMPT_COUNTDOWN_INTERVAL_MS = 1000l;

  public static final int FAILED_ATTEMPTS_BEFORE_WIPE_GRACE = 5;

  public static final int MIN_LOCK_PATTERN_SIZE = 4;

  public static final int MIN_PATTERN_REGISTER_FAIL = 4;

  public static final java.lang.String PASSWORD_TYPE_KEY = "lockscreen.password_type";

  public static final java.lang.String PASSWORD_TYPE_ALTERNATE_KEY = "lockscreen.password_type_alternate";

  public static final java.lang.String LOCKSCREEN_BIOMETRIC_WEAK_FALLBACK = "lockscreen.biometric_weak_fallback";

  public static final java.lang.String BIOMETRIC_WEAK_EVER_CHOSEN_KEY = "lockscreen.biometricweakeverchosen";

  // Constructors

  public LockPatternUtils(android.content.Context arg1){
  }
  // Methods

  public void reportFailedPasswordAttempt(){
  }
  public void reportSuccessfulPasswordAttempt(){
  }
  public boolean isSecure(){
    return false;
  }
  public boolean isTactileFeedbackEnabled(){
    return false;
  }
  public void setTactileFeedbackEnabled(boolean arg1){
  }
  public void updateEmergencyCallButtonState(android.widget.Button arg1, int arg2, boolean arg3){
  }
  public java.lang.String getNextAlarm(){
    return (java.lang.String) null;
  }
  public boolean isPukUnlockScreenEnable(){
    return false;
  }
  public int getActivePasswordQuality(){
    return 0;
  }
  public static int computePasswordQuality(java.lang.String arg1){
    return 0;
  }
  public void saveLockPassword(java.lang.String arg1, int arg2){
  }
  public void saveLockPassword(java.lang.String arg1, int arg2, boolean arg3){
  }
  public int getKeyguardStoredPasswordQuality(){
    return 0;
  }
  public long getLockoutAttemptDeadline(){
    return 0l;
  }
  public boolean checkPassword(java.lang.String arg1){
    return false;
  }
  public long setLockoutAttemptDeadline(){
    return 0l;
  }
  public boolean isPermanentlyLocked(){
    return false;
  }
  public android.app.admin.DevicePolicyManager getDevicePolicyManager(){
    return (android.app.admin.DevicePolicyManager) null;
  }
  public static java.lang.String patternToString(java.util.List<LockPatternView.Cell> arg1){
    return (java.lang.String) null;
  }
  public static java.util.List<LockPatternView.Cell> stringToPattern(java.lang.String arg1){
    return (java.util.List) null;
  }
  public boolean isVisiblePatternEnabled(){
    return false;
  }
  public void setPermanentlyLocked(boolean arg1){
  }
  public void setLockPatternEnabled(boolean arg1){
  }
  public void saveLockPattern(java.util.List<LockPatternView.Cell> arg1){
  }
  public void saveLockPattern(java.util.List<LockPatternView.Cell> arg1, boolean arg2){
  }
  public boolean isLockScreenDisabled(){
    return false;
  }
  public boolean checkPattern(java.util.List<LockPatternView.Cell> arg1){
    return false;
  }
  public int getRequestedMinimumPasswordLength(){
    return 0;
  }
  public int getRequestedPasswordQuality(){
    return 0;
  }
  public int getRequestedPasswordHistoryLength(){
    return 0;
  }
  public int getRequestedPasswordMinimumLetters(){
    return 0;
  }
  public int getRequestedPasswordMinimumUpperCase(){
    return 0;
  }
  public int getRequestedPasswordMinimumLowerCase(){
    return 0;
  }
  public int getRequestedPasswordMinimumNumeric(){
    return 0;
  }
  public int getRequestedPasswordMinimumSymbols(){
    return 0;
  }
  public int getRequestedPasswordMinimumNonLetter(){
    return 0;
  }
  public boolean checkPasswordHistory(java.lang.String arg1){
    return false;
  }
  public boolean savedPatternExists(){
    return false;
  }
  public boolean savedPasswordExists(){
    return false;
  }
  public boolean isPatternEverChosen(){
    return false;
  }
  public boolean isBiometricWeakEverChosen(){
    return false;
  }
  public void clearLock(boolean arg1){
  }
  public void setLockScreenDisabled(boolean arg1){
  }
  public void deleteTempGallery(){
  }
  public boolean usingBiometricWeak(){
    return false;
  }
  public byte [] passwordToHash(java.lang.String arg1){
    return (byte []) null;
  }
  public boolean isLockPasswordEnabled(){
    return false;
  }
  public boolean isLockPatternEnabled(){
    return false;
  }
  public boolean isBiometricWeakInstalled(){
    return false;
  }
  public void setVisiblePatternEnabled(boolean arg1){
  }
  public boolean isEmergencyCallCapable(){
    return false;
  }
  public boolean resumeCall(){
    return false;
  }
}
