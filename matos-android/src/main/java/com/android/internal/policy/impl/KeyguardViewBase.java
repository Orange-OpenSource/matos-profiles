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


public abstract class KeyguardViewBase
  extends android.widget.FrameLayout{
  // Constructors

  public KeyguardViewBase(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  public abstract void reset();
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public abstract void show();
  public void dispatchSystemUiVisibilityChanged(int arg1){
  }
  public abstract void cleanUp();
  public KeyguardViewCallback getCallback(){
    return (KeyguardViewCallback) null;
  }
  public void resetBackground(){
  }
  public abstract void onScreenTurnedOff();
  public abstract void onScreenTurnedOn();
  public abstract void wakeWhenReadyTq(int arg1);
  public abstract void verifyUnlock();
}
