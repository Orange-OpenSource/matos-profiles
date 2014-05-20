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
public class DateUtils
{
  // Fields

  public static final long SECOND_IN_MILLIS = 1000l;

  public static final long MINUTE_IN_MILLIS = 60000l;

  public static final long HOUR_IN_MILLIS = 3600000l;

  public static final long DAY_IN_MILLIS = 86400000l;

  public static final long WEEK_IN_MILLIS = 604800000l;

  public static final long YEAR_IN_MILLIS = 31449600000l;

  public static final int FORMAT_SHOW_TIME = 1;

  public static final int FORMAT_SHOW_WEEKDAY = 2;

  public static final int FORMAT_SHOW_YEAR = 4;

  public static final int FORMAT_NO_YEAR = 8;

  public static final int FORMAT_SHOW_DATE = 16;

  public static final int FORMAT_NO_MONTH_DAY = 32;

  public static final int FORMAT_12HOUR = 64;

  public static final int FORMAT_24HOUR = 128;

  public static final int FORMAT_CAP_AMPM = 256;

  public static final int FORMAT_NO_NOON = 512;

  public static final int FORMAT_CAP_NOON = 1024;

  public static final int FORMAT_NO_MIDNIGHT = 2048;

  public static final int FORMAT_CAP_MIDNIGHT = 4096;

  public static final int FORMAT_UTC = 8192;

  public static final int FORMAT_ABBREV_TIME = 16384;

  public static final int FORMAT_ABBREV_WEEKDAY = 32768;

  public static final int FORMAT_ABBREV_MONTH = 65536;

  public static final int FORMAT_NUMERIC_DATE = 131072;

  public static final int FORMAT_ABBREV_RELATIVE = 262144;

  public static final int FORMAT_ABBREV_ALL = 524288;

  public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;

  public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;

  public static final java.lang.String HOUR_MINUTE_24 = "%H:%M";

  public static final java.lang.String MONTH_FORMAT = "%B";

  public static final java.lang.String ABBREV_MONTH_FORMAT = "%b";

  public static final java.lang.String NUMERIC_MONTH_FORMAT = "%m";

  public static final java.lang.String MONTH_DAY_FORMAT = "%-d";

  public static final java.lang.String YEAR_FORMAT = "%Y";

  public static final java.lang.String YEAR_FORMAT_TWO_DIGITS = "%g";

  public static final java.lang.String WEEKDAY_FORMAT = "%A";

  public static final java.lang.String ABBREV_WEEKDAY_FORMAT = "%a";

  public static final int [] sameYearTable = null;

  public static final int [] sameMonthTable = null;

  public static final int LENGTH_LONG = 10;

  public static final int LENGTH_MEDIUM = 20;

  public static final int LENGTH_SHORT = 30;

  public static final int LENGTH_SHORTER = 40;

  public static final int LENGTH_SHORTEST = 50;

  // Constructors

  public DateUtils(){
  }
  // Methods

  public static java.lang.String getDayOfWeekString(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String getAMPMString(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getMonthString(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String getStandaloneMonthString(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public static java.lang.CharSequence getRelativeTimeSpanString(long arg1){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence getRelativeTimeSpanString(long arg1, long arg2, long arg3){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence getRelativeTimeSpanString(long arg1, long arg2, long arg3, int arg4){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence getRelativeTimeSpanString(android.content.Context arg1, long arg2, boolean arg3){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence getRelativeTimeSpanString(android.content.Context arg1, long arg2){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence getRelativeDateTimeString(android.content.Context arg1, long arg2, long arg3, long arg4, int arg5){
    return (java.lang.CharSequence) null;
  }
  public static final java.lang.CharSequence timeString(long arg1){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.String formatElapsedTime(long arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String formatElapsedTime(java.lang.StringBuilder arg1, long arg2){
    return (java.lang.String) null;
  }
  public static final java.lang.CharSequence formatSameDayTime(long arg1, long arg2, int arg3, int arg4){
    return (java.lang.CharSequence) null;
  }
  public static java.util.Calendar newCalendar(boolean arg1){
    return (java.util.Calendar) null;
  }
  public static boolean isToday(long arg1){
    return false;
  }
  public static boolean isUTC(java.lang.String arg1){
    return false;
  }
  public static java.lang.String writeDateTime(java.util.Calendar arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String writeDateTime(java.util.Calendar arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String writeDateTime(java.util.Calendar arg1, java.lang.StringBuilder arg2){
    return (java.lang.String) null;
  }
  public static void assign(java.util.Calendar arg1, java.util.Calendar arg2){
  }
  public static java.lang.String formatDateRange(android.content.Context arg1, long arg2, long arg3, int arg4){
    return (java.lang.String) null;
  }
  public static java.util.Formatter formatDateRange(android.content.Context arg1, java.util.Formatter arg2, long arg3, long arg4, int arg5){
    return (java.util.Formatter) null;
  }
  public static java.util.Formatter formatDateRange(android.content.Context arg1, java.util.Formatter arg2, long arg3, long arg4, int arg5, java.lang.String arg6){
    return (java.util.Formatter) null;
  }
  public static java.lang.String formatDateTime(android.content.Context arg1, long arg2, int arg3){
    return (java.lang.String) null;
  }
}
