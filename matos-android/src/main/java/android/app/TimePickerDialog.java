package android.app;

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
public class TimePickerDialog
  extends AlertDialog  implements android.widget.TimePicker.OnTimeChangedListener, android.content.DialogInterface.OnClickListener
{
  // Classes

  public static interface OnTimeSetListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTime")
    public void onTimeSet(android.widget.TimePicker arg1, int arg2, int arg3);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TimePickerDialog(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onTime") TimePickerDialog.OnTimeSetListener arg2, int arg3, int arg4, boolean arg5){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TimePickerDialog(android.content.Context arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onTime") TimePickerDialog.OnTimeSetListener arg3, int arg4, int arg5, boolean arg6){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Bundle arg1){
  }
  public android.os.Bundle onSaveInstanceState(){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.content.DialogInterface arg1, int arg2){
  }
  public void updateTime(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTimeChanged(android.widget.TimePicker arg1, int arg2, int arg3){
  }
}
