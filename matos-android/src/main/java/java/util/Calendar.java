package java.util;

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


public abstract class Calendar
  implements java.lang.Comparable<Calendar>, java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected boolean areFieldsSet;

  protected int [] fields;

  protected boolean [] isSet;

  protected boolean isTimeSet;

  protected long time;

  public static final int JANUARY = 0;

  public static final int FEBRUARY = 1;

  public static final int MARCH = 2;

  public static final int APRIL = 3;

  public static final int MAY = 4;

  public static final int JUNE = 5;

  public static final int JULY = 6;

  public static final int AUGUST = 7;

  public static final int SEPTEMBER = 8;

  public static final int OCTOBER = 9;

  public static final int NOVEMBER = 10;

  public static final int DECEMBER = 11;

  public static final int UNDECIMBER = 12;

  public static final int SUNDAY = 1;

  public static final int MONDAY = 2;

  public static final int TUESDAY = 3;

  public static final int WEDNESDAY = 4;

  public static final int THURSDAY = 5;

  public static final int FRIDAY = 6;

  public static final int SATURDAY = 7;

  public static final int ERA = 0;

  public static final int YEAR = 1;

  public static final int MONTH = 2;

  public static final int WEEK_OF_YEAR = 3;

  public static final int WEEK_OF_MONTH = 4;

  public static final int DATE = 5;

  public static final int DAY_OF_MONTH = 5;

  public static final int DAY_OF_YEAR = 6;

  public static final int DAY_OF_WEEK = 7;

  public static final int DAY_OF_WEEK_IN_MONTH = 8;

  public static final int AM_PM = 9;

  public static final int HOUR = 10;

  public static final int HOUR_OF_DAY = 11;

  public static final int MINUTE = 12;

  public static final int SECOND = 13;

  public static final int MILLISECOND = 14;

  public static final int ZONE_OFFSET = 15;

  public static final int DST_OFFSET = 16;

  public static final int FIELD_COUNT = 17;

  public static final int AM = 0;

  public static final int PM = 1;

  public static final int ALL_STYLES = 0;

  public static final int SHORT = 1;

  public static final int LONG = 2;

  // Constructors

  protected Calendar(){
  }
  Calendar(TimeZone arg1){
  }
  protected Calendar(TimeZone arg1, Locale arg2){
  }
  // Methods

  public abstract void add(int arg1, int arg2);
  public int get(int arg1){
    return 0;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int compareTo(Calendar arg1){
    return 0;
  }
  public final void clear(){
  }
  public final void clear(int arg1){
  }
  public static synchronized Calendar getInstance(){
    return (Calendar) null;
  }
  public static synchronized Calendar getInstance(Locale arg1){
    return (Calendar) null;
  }
  public static synchronized Calendar getInstance(TimeZone arg1){
    return (Calendar) null;
  }
  public static synchronized Calendar getInstance(TimeZone arg1, Locale arg2){
    return (Calendar) null;
  }
  public final boolean isSet(int arg1){
    return false;
  }
  public void set(int arg1, int arg2){
  }
  public final void set(int arg1, int arg2, int arg3){
  }
  public final void set(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public final void set(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public boolean after(java.lang.Object arg1){
    return false;
  }
  public boolean before(java.lang.Object arg1){
    return false;
  }
  protected void complete(){
  }
  public static synchronized Locale [] getAvailableLocales(){
    return (Locale []) null;
  }
  public java.lang.String getDisplayName(int arg1, int arg2, Locale arg3){
    return (java.lang.String) null;
  }
  public final Date getTime(){
    return (Date) null;
  }
  public final void setTime(Date arg1){
  }
  public TimeZone getTimeZone(){
    return (TimeZone) null;
  }
  public void setTimeZone(TimeZone arg1){
  }
  public void setLenient(boolean arg1){
  }
  public boolean isLenient(){
    return false;
  }
  public abstract int getMinimum(int arg1);
  public abstract int getMaximum(int arg1);
  public int getActualMaximum(int arg1){
    return 0;
  }
  protected abstract void computeFields();
  protected abstract void computeTime();
  public int getActualMinimum(int arg1){
    return 0;
  }
  public abstract int getGreatestMinimum(int arg1);
  public abstract int getLeastMaximum(int arg1);
  public void roll(int arg1, int arg2){
  }
  public abstract void roll(int arg1, boolean arg2);
  public void setFirstDayOfWeek(int arg1){
  }
  public void setMinimalDaysInFirstWeek(int arg1){
  }
  public long getTimeInMillis(){
    return 0l;
  }
  public void setTimeInMillis(long arg1){
  }
  public int getFirstDayOfWeek(){
    return 0;
  }
  public int getMinimalDaysInFirstWeek(){
    return 0;
  }
  protected final int internalGet(int arg1){
    return 0;
  }
  public Map<java.lang.String, java.lang.Integer> getDisplayNames(int arg1, int arg2, Locale arg3){
    return (Map) null;
  }
}
