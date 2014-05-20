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
public class TransportControlView
  extends android.widget.FrameLayout  implements android.view.View.OnClickListener, LockScreenWidgetInterface
{
  // Fields

  protected static final boolean DEBUG = false;

  protected static final java.lang.String TAG = (java.lang.String) null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TransportControlView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onFinishInflate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onClick(android.view.View arg1){
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("LockScreenWidgetCallback") LockScreenWidgetCallback arg1){
  }
  public boolean providesClock(){
    return false;
  }
}
