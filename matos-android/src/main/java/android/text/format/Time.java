package android.text.format;

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
public class Time
{
  // Fields

  public static final java.lang.String TIMEZONE_UTC = "UTC";

  public static final int EPOCH_JULIAN_DAY = 2440588;

  public static final int MONDAY_BEFORE_JULIAN_EPOCH = 2440585;

  public boolean allDay;

  public int second;

  public int minute;

  public int hour;

  public int monthDay;

  public int month;

  public int year;

  public int weekDay;

  public int yearDay;

  public int isDst;

  public long gmtoff;

  public java.lang.String timezone;

  public static final int SECOND = 1;

  public static final int MINUTE = 2;

  public static final int HOUR = 3;

  public static final int MONTH_DAY = 4;

  public static final int MONTH = 5;

  public static final int YEAR = 6;

  public static final int WEEK_DAY = 7;

  public static final int YEAR_DAY = 8;

  public static final int WEEK_NUM = 9;

  public static final int SUNDAY = 0;

  public static final int MONDAY = 1;

  public static final int TUESDAY = 2;

  public static final int WEDNESDAY = 3;

  public static final int THURSDAY = 4;

  public static final int FRIDAY = 5;

  public static final int SATURDAY = 6;

  // Constructors

  public Time(java.lang.String arg1){
  }
  public Time(){
  }
  public Time(Time arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(java.lang.String arg1){
  }
  public static int compare(Time arg1, Time arg2){
    return 0;
  }
  public java.lang.String format(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void set(long arg1){
  }
  public void set(Time arg1){
  }
  public void set(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public void set(int arg1, int arg2, int arg3){
  }
  public long normalize(boolean arg1){
    return 0l;
  }
  public boolean after(Time arg1){
    return false;
  }
  public boolean before(Time arg1){
    return false;
  }
  public boolean parse(java.lang.String arg1){
    return false;
  }
  public long toMillis(boolean arg1){
    return 0l;
  }
  public int getActualMaximum(int arg1){
    return 0;
  }
  public void switchTimezone(java.lang.String arg1){
  }
  public boolean parse3339(java.lang.String arg1){
    return false;
  }
  public static java.lang.String getCurrentTimezone(){
    return (java.lang.String) null;
  }
  public void setToNow(){
  }
  public java.lang.String format2445(){
    return (java.lang.String) null;
  }
  public int getWeekNumber(){
    return 0;
  }
  public java.lang.String format3339(boolean arg1){
    return (java.lang.String) null;
  }
  public static boolean isEpoch(Time arg1){
    return false;
  }
  public static int getJulianDay(long arg1, long arg2){
    return 0;
  }
  public long setJulianDay(int arg1){
    return 0l;
  }
  public static int getWeeksSinceEpochFromJulianDay(int arg1, int arg2){
    return 0;
  }
  public static int getJulianMondayFromWeeksSinceEpoch(int arg1){
    return 0;
  }
}
