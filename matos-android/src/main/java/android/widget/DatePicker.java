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
public class DatePicker
  extends FrameLayout{
  // Classes

  public static interface OnDateChangedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDateChanged")
    public void onDateChanged(DatePicker arg1, int arg2, int arg3, int arg4);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DatePicker(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DatePicker(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DatePicker(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void init(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onDateChanged") DatePicker.OnDateChangedListener arg4){
  }
  public int getMonth(){
    return 0;
  }
  public int getYear(){
    return 0;
  }
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
  protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void setEnabled(boolean arg1){
  }
  public void updateDate(int arg1, int arg2, int arg3){
  }
  public long getMinDate(){
    return 0l;
  }
  public void setMinDate(long arg1){
  }
  public long getMaxDate(){
    return 0l;
  }
  public void setMaxDate(long arg1){
  }
  public int getDayOfMonth(){
    return 0;
  }
  public boolean getCalendarViewShown(){
    return false;
  }
  public CalendarView getCalendarView(){
    return (CalendarView) null;
  }
  public void setCalendarViewShown(boolean arg1){
  }
  public boolean getSpinnersShown(){
    return false;
  }
  public void setSpinnersShown(boolean arg1){
  }
}
