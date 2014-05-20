package android.widget;

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
public class TimePicker
  extends FrameLayout{
  // Classes

  public static interface OnTimeChangedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTimeChanged")
    public void onTimeChanged(TimePicker arg1, int arg2, int arg3);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TimePicker(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TimePicker(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TimePicker(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  public boolean isEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void setEnabled(boolean arg1){
  }
  public int getBaseline(){
    return 0;
  }
  public boolean is24HourView(){
    return false;
  }
  public void setOnTimeChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.TimePicker.OnTimeChangedListener.onTimeChanged") TimePicker.OnTimeChangedListener arg1){
  }
  public java.lang.Integer getCurrentHour(){
    return (java.lang.Integer) null;
  }
  public void setCurrentHour(java.lang.Integer arg1){
  }
  public void setIs24HourView(java.lang.Boolean arg1){
  }
  public java.lang.Integer getCurrentMinute(){
    return (java.lang.Integer) null;
  }
  public void setCurrentMinute(java.lang.Integer arg1){
  }
}
