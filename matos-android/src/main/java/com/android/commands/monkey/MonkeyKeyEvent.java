package com.android.commands.monkey;

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


public class MonkeyKeyEvent
  extends MonkeyEvent{
  // Constructors

  public MonkeyKeyEvent(int arg1, int arg2){
    super(0);
  }
  public MonkeyKeyEvent(android.view.KeyEvent arg1){
    super(0);
  }
  public MonkeyKeyEvent(long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
    super(0);
  }
  // Methods

  public int getAction(){
    return 0;
  }
  public long getEventTime(){
    return 0l;
  }
  public void setEventTime(long arg1){
  }
  public long getDownTime(){
    return 0l;
  }
  public void setDownTime(long arg1){
  }
  public boolean isThrottlable(){
    return false;
  }
  public int injectEvent(android.view.IWindowManager arg1, android.app.IActivityManager arg2, int arg3){
    return 0;
  }
  public int getKeyCode(){
    return 0;
  }
}
