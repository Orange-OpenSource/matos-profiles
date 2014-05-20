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
public class DatePickerDialog
  extends AlertDialog  implements android.widget.DatePicker.OnDateChangedListener, android.content.DialogInterface.OnClickListener
{
  // Classes

  public static interface OnDateSetListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onSet")
    public void onDateSet(android.widget.DatePicker arg1, int arg2, int arg3, int arg4);
  }
  // Constructors

  public DatePickerDialog(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onSet") DatePickerDialog.OnDateSetListener arg2, int arg3, int arg4, int arg5){
    super((android.content.Context) null);
  }
  public DatePickerDialog(android.content.Context arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onSet") DatePickerDialog.OnDateSetListener arg3, int arg4, int arg5, int arg6){
    super((android.content.Context) null);
  }
  // Methods

  public void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onSaveInstanceState")
  public android.os.Bundle onSaveInstanceState(){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onClick")
  public void onClick(android.content.DialogInterface arg1, int arg2){
  }
  public void updateDate(int arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onDateChanged")
  public void onDateChanged(android.widget.DatePicker arg1, int arg2, int arg3, int arg4){
  }
  public android.widget.DatePicker getDatePicker(){
    return (android.widget.DatePicker) null;
  }
}
