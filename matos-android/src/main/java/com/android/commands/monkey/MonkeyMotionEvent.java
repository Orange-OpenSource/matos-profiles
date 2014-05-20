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


public abstract class MonkeyMotionEvent
  extends MonkeyEvent{
  // Constructors

  protected MonkeyMotionEvent(int arg1, int arg2, int arg3){
    super(0);
  }
  // Methods

  public int getAction(){
    return 0;
  }
  protected abstract java.lang.String getTypeLabel();
  public long getEventTime(){
    return 0l;
  }
  public MonkeyMotionEvent setEventTime(long arg1){
    return (MonkeyMotionEvent) null;
  }
  protected abstract boolean injectMotionEvent(android.view.IWindowManager arg1, android.view.MotionEvent arg2) throws android.os.RemoteException;
  public long getDownTime(){
    return 0l;
  }
  public MonkeyMotionEvent setDownTime(long arg1){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent setMetaState(int arg1){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent setPrecision(float arg1, float arg2){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent setDeviceId(int arg1){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent setEdgeFlags(int arg1){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent addPointer(int arg1, float arg2, float arg3){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent addPointer(int arg1, float arg2, float arg3, float arg4, float arg5){
    return (MonkeyMotionEvent) null;
  }
  public MonkeyMotionEvent setIntermediateNote(boolean arg1){
    return (MonkeyMotionEvent) null;
  }
  public boolean isThrottlable(){
    return false;
  }
  public boolean getIntermediateNote(){
    return false;
  }
  public int injectEvent(android.view.IWindowManager arg1, android.app.IActivityManager arg2, int arg3){
    return 0;
  }
}
