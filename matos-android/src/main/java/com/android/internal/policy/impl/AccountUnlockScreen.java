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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AccountUnlockScreen
  extends android.widget.RelativeLayout  implements android.text.TextWatcher, android.view.View.OnClickListener, KeyguardScreen
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AccountUnlockScreen(android.content.Context arg1, android.content.res.Configuration arg2, KeyguardUpdateMonitor arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("keyguardScreenCallback") KeyguardScreenCallback arg4, com.android.internal.widget.LockPatternUtils arg5){
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
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  protected boolean onRequestFocusInDescendants(int arg1, android.graphics.Rect arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.view.View arg1){
  }
  public void beforeTextChanged(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  public void onTextChanged(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  public void afterTextChanged(android.text.Editable arg1){
  }
  public void cleanUp(){
  }
}
