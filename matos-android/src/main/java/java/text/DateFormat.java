package java.text;

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


public abstract class DateFormat
  extends Format{
  // Classes

  public static class Field
    extends Format.Field  {
    // Fields

    public static final DateFormat.Field ERA = null;

    public static final DateFormat.Field YEAR = null;

    public static final DateFormat.Field MONTH = null;

    public static final DateFormat.Field HOUR_OF_DAY0 = null;

    public static final DateFormat.Field HOUR_OF_DAY1 = null;

    public static final DateFormat.Field MINUTE = null;

    public static final DateFormat.Field SECOND = null;

    public static final DateFormat.Field MILLISECOND = null;

    public static final DateFormat.Field DAY_OF_WEEK = null;

    public static final DateFormat.Field DAY_OF_MONTH = null;

    public static final DateFormat.Field DAY_OF_YEAR = null;

    public static final DateFormat.Field DAY_OF_WEEK_IN_MONTH = null;

    public static final DateFormat.Field WEEK_OF_YEAR = null;

    public static final DateFormat.Field WEEK_OF_MONTH = null;

    public static final DateFormat.Field AM_PM = null;

    public static final DateFormat.Field HOUR0 = null;

    public static final DateFormat.Field HOUR1 = null;

    public static final DateFormat.Field TIME_ZONE = null;

    // Constructors

    protected Field(java.lang.String arg1, int arg2){
      super((java.lang.String) null);
    }
    // Methods

    public int getCalendarField(){
      return 0;
    }
    public static DateFormat.Field ofCalendarField(int arg1){
      return (DateFormat.Field) null;
    }
  }
  // Fields

  protected java.util.Calendar calendar;

  protected NumberFormat numberFormat;

  public static final int DEFAULT = 2;

  public static final int FULL = 0;

  public static final int LONG = 1;

  public static final int MEDIUM = 2;

  public static final int SHORT = 3;

  public static final int ERA_FIELD = 0;

  public static final int YEAR_FIELD = 1;

  public static final int MONTH_FIELD = 2;

  public static final int DATE_FIELD = 3;

  public static final int HOUR_OF_DAY1_FIELD = 4;

  public static final int HOUR_OF_DAY0_FIELD = 5;

  public static final int MINUTE_FIELD = 6;

  public static final int SECOND_FIELD = 7;

  public static final int MILLISECOND_FIELD = 8;

  public static final int DAY_OF_WEEK_FIELD = 9;

  public static final int DAY_OF_YEAR_FIELD = 10;

  public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;

  public static final int WEEK_OF_YEAR_FIELD = 12;

  public static final int WEEK_OF_MONTH_FIELD = 13;

  public static final int AM_PM_FIELD = 14;

  public static final int HOUR1_FIELD = 15;

  public static final int HOUR0_FIELD = 16;

  public static final int TIMEZONE_FIELD = 17;

  // Constructors

  protected DateFormat(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public final java.lang.StringBuffer format(java.lang.Object arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public final java.lang.String format(java.util.Date arg1){
    return (java.lang.String) null;
  }
  public abstract java.lang.StringBuffer format(java.util.Date arg1, java.lang.StringBuffer arg2, FieldPosition arg3);
  public static final DateFormat getInstance(){
    return (DateFormat) null;
  }
  public java.util.Date parse(java.lang.String arg1) throws ParseException{
    return (java.util.Date) null;
  }
  public abstract java.util.Date parse(java.lang.String arg1, ParsePosition arg2);
  public static java.util.Locale [] getAvailableLocales(){
    return (java.util.Locale []) null;
  }
  public java.util.TimeZone getTimeZone(){
    return (java.util.TimeZone) null;
  }
  public void setTimeZone(java.util.TimeZone arg1){
  }
  public void setLenient(boolean arg1){
  }
  public boolean isLenient(){
    return false;
  }
  public NumberFormat getNumberFormat(){
    return (NumberFormat) null;
  }
  public java.lang.Object parseObject(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Object) null;
  }
  public static final DateFormat getDateTimeInstance(){
    return (DateFormat) null;
  }
  public static final DateFormat getDateTimeInstance(int arg1, int arg2){
    return (DateFormat) null;
  }
  public static final DateFormat getDateTimeInstance(int arg1, int arg2, java.util.Locale arg3){
    return (DateFormat) null;
  }
  public static final DateFormat getTimeInstance(){
    return (DateFormat) null;
  }
  public static final DateFormat getTimeInstance(int arg1){
    return (DateFormat) null;
  }
  public static final DateFormat getTimeInstance(int arg1, java.util.Locale arg2){
    return (DateFormat) null;
  }
  public static final DateFormat getDateInstance(){
    return (DateFormat) null;
  }
  public static final DateFormat getDateInstance(int arg1){
    return (DateFormat) null;
  }
  public static final DateFormat getDateInstance(int arg1, java.util.Locale arg2){
    return (DateFormat) null;
  }
  public java.util.Calendar getCalendar(){
    return (java.util.Calendar) null;
  }
  public void setCalendar(java.util.Calendar arg1){
  }
  public void setNumberFormat(NumberFormat arg1){
  }
}
