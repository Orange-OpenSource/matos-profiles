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


public class PasswordUnlockScreen
  extends android.widget.LinearLayout  implements android.widget.TextView.OnEditorActionListener, KeyguardScreen
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PasswordUnlockScreen(android.content.Context arg1, android.content.res.Configuration arg2, com.android.internal.widget.LockPatternUtils arg3, KeyguardUpdateMonitor arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("keyguardScreenCallback") KeyguardScreenCallback arg5){
    super((android.content.Context) null);
  }
  // Methods

  public boolean needsInput(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onRequestFocusInDescendants(int arg1, android.graphics.Rect arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onEditorAction(android.widget.TextView arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  public void cleanUp(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onKeyboardChange(boolean arg1){
  }
}
