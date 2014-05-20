package com.android.internal.policy.impl;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.KeyuardScreenCallbackImpl", superClass = "")
public interface KeyguardScreenCallback
  extends KeyguardViewCallback
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public boolean isSecure();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void takeEmergencyCallAction();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void reportSuccessfulUnlockAttempt();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void reportFailedUnlockAttempt();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void recreateMe(android.content.res.Configuration arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void goToLockScreen();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void forgotPattern(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public void goToUnlockScreen();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public boolean doesFallbackUnlockScreenExist();
  @com.francetelecom.rd.stubs.annotation.CallBack("keyguardScreenCallback")
  public boolean isVerifyUnlockOnly();
}
