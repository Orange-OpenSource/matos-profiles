package com.android.server.wm;

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


public class InputManager
  implements com.android.server.Watchdog.Monitor
{
  // Fields

  public static final int KEY_STATE_UNKNOWN = -1;

  public static final int KEY_STATE_UP = 0;

  public static final int KEY_STATE_DOWN = 1;

  public static final int KEY_STATE_VIRTUAL = 2;

  // Constructors

  public InputManager(android.content.Context arg1, WindowManagerService arg2){
  }
  // Methods

  public void start(){
  }
  public void dump(java.io.PrintWriter arg1){
  }
  public void setSystemUiVisibility(int arg1){
  }
  public void setDisplaySize(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setDisplayOrientation(int arg1, int arg2){
  }
  public void getInputConfiguration(android.content.res.Configuration arg1){
  }
  public int getKeyCodeState(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getScanCodeState(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getSwitchState(int arg1, int arg2, int arg3){
    return 0;
  }
  public boolean hasKeys(int arg1, int arg2, int [] arg3, boolean [] arg4){
    return false;
  }
  public android.view.InputChannel monitorInput(java.lang.String arg1){
    return (android.view.InputChannel) null;
  }
  public void registerInputChannel(android.view.InputChannel arg1, InputWindowHandle arg2){
  }
  public void unregisterInputChannel(android.view.InputChannel arg1){
  }
  public void setInputFilter(InputFilter arg1){
  }
  public int injectInputEvent(android.view.InputEvent arg1, int arg2, int arg3, int arg4, int arg5){
    return 0;
  }
  public android.view.InputDevice getInputDevice(int arg1){
    return (android.view.InputDevice) null;
  }
  public int [] getInputDeviceIds(){
    return (int []) null;
  }
  public void setInputWindows(InputWindowHandle [] arg1){
  }
  public void setFocusedApplication(InputApplicationHandle arg1){
  }
  public void setInputDispatchMode(boolean arg1, boolean arg2){
  }
  public boolean transferTouchFocus(android.view.InputChannel arg1, android.view.InputChannel arg2){
    return false;
  }
  public void setPointerSpeed(int arg1){
  }
  public void updatePointerSpeedFromSettings(){
  }
  public void updateShowTouchesFromSettings(){
  }
  public void monitor(){
  }
}
