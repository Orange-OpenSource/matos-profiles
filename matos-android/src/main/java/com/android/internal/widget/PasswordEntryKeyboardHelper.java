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
public class PasswordEntryKeyboardHelper
  implements android.inputmethodservice.KeyboardView.OnKeyboardActionListener
{
  // Fields

  public static final int KEYBOARD_MODE_ALPHA = 0;

  public static final int KEYBOARD_MODE_NUMERIC = 1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PasswordEntryKeyboardHelper(android.content.Context arg1, android.inputmethodservice.KeyboardView arg2, android.view.View arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PasswordEntryKeyboardHelper(android.content.Context arg1, android.inputmethodservice.KeyboardView arg2, android.view.View arg3, boolean arg4){
  }
  // Methods

  public boolean isAlpha(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onKey(int arg1, int [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onRelease(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onText(java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onPress(int arg1){
  }
  public void setEnableHaptics(boolean arg1){
  }
  public void setKeyboardMode(int arg1){
  }
  public void swipeLeft(){
  }
  public void swipeRight(){
  }
  public void swipeUp(){
  }
  public void swipeDown(){
  }
  public void sendDownUpKeyEvents(int arg1){
  }
  public void setVibratePattern(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void handleBackspace(){
  }
}
