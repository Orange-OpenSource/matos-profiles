package com.android.server.accessibility;

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
public class AccessibilityInputFilter
  extends com.android.server.wm.InputFilter{
  // Classes

  public static interface Explorer
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("Explorer")
	 public void clear(android.view.MotionEvent arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("Explorer")
    public void clear();
    @com.francetelecom.rd.stubs.annotation.CallBack("Explorer")
    public void onMotionEvent(android.view.MotionEvent arg1, int arg2);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AccessibilityInputFilter(android.content.Context arg1){
    super((android.os.Looper) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
 public void onInputEvent(android.view.InputEvent arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInstalled(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUninstalled(){
  }
}
