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
public class CalendarView
  extends FrameLayout{
  // Classes

  public static interface OnDateChangeListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnDateChangeListener")
    public void onSelectedDayChange(CalendarView arg1, int arg2, int arg3, int arg4);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CalendarView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CalendarView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CalendarView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public long getDate(){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public boolean isEnabled(){
    return false;
  }
  public void setEnabled(boolean arg1){
  }
  public void setDate(long arg1){
  }
  public void setDate(long arg1, boolean arg2, boolean arg3){
  }
  public void setFirstDayOfWeek(int arg1){
  }
  public int getFirstDayOfWeek(){
    return 0;
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
  public void setShowWeekNumber(boolean arg1){
  }
  public boolean getShowWeekNumber(){
    return false;
  }
  public void setOnDateChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnDateChangeListener") CalendarView.OnDateChangeListener arg1){
  }
}
