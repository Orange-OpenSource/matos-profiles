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

import com.francetelecom.rd.stubs.annotation.Real;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class KeyguardViewManager
  implements KeyguardWindowController
{
  // Classes

  @Real("com.francetelecom.fakeandroid.KeyguardShowListenerImpl")
  public static interface ShowListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("ShowListener")
    public void onShown(android.os.IBinder arg1);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public KeyguardViewManager(android.content.Context arg1, android.view.ViewManager arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("keyguardViewCallback") KeyguardViewCallback arg3, KeyguardViewProperties arg4, KeyguardUpdateMonitor arg5){
  }
  // Methods

  public synchronized void reset(){
  }
  public synchronized void show(){
  }
  public synchronized void hide(){
  }
  public synchronized boolean isShowing(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onScreenTurnedOff(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onScreenTurnedOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ShowListener") KeyguardViewManager.ShowListener arg1){
  }
  public boolean wakeWhenReadyTq(int arg1){
    return false;
  }
  public synchronized void verifyUnlock(){
  }
  public void setNeedsInput(boolean arg1){
  }
}
