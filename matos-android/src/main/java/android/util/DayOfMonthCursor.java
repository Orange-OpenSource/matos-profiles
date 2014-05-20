package android.util;

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
public class DayOfMonthCursor
  extends MonthDisplayHelper{
  // Constructors

  public DayOfMonthCursor(int arg1, int arg2, int arg3, int arg4){
    super(0, 0, 0);
  }
  // Methods

  public boolean isSelected(int arg1, int arg2){
    return false;
  }
  public boolean left(){
    return false;
  }
  public boolean right(){
    return false;
  }
  public boolean down(){
    return false;
  }
  public boolean up(){
    return false;
  }
  public int getSelectedRow(){
    return 0;
  }
  public int getSelectedColumn(){
    return 0;
  }
  public void setSelectedRowColumn(int arg1, int arg2){
  }
  public int getSelectedDayOfMonth(){
    return 0;
  }
  public int getSelectedMonthOffset(){
    return 0;
  }
  public void setSelectedDayOfMonth(int arg1){
  }
}
