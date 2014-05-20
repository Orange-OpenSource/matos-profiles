package gov.nist.javax.sip.header;

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


public class SIPDate
  implements java.io.Serializable, java.lang.Cloneable
{
  // Fields

  public static final java.lang.String GMT = "GMT";

  public static final java.lang.String MON = "Mon";

  public static final java.lang.String TUE = "Tue";

  public static final java.lang.String WED = "Wed";

  public static final java.lang.String THU = "Thu";

  public static final java.lang.String FRI = "Fri";

  public static final java.lang.String SAT = "Sat";

  public static final java.lang.String SUN = "Sun";

  public static final java.lang.String JAN = "Jan";

  public static final java.lang.String FEB = "Feb";

  public static final java.lang.String MAR = "Mar";

  public static final java.lang.String APR = "Apr";

  public static final java.lang.String MAY = "May";

  public static final java.lang.String JUN = "Jun";

  public static final java.lang.String JUL = "Jul";

  public static final java.lang.String AUG = "Aug";

  public static final java.lang.String SEP = "Sep";

  public static final java.lang.String OCT = "Oct";

  public static final java.lang.String NOV = "Nov";

  public static final java.lang.String DEC = "Dec";

  protected java.lang.String sipWkDay;

  protected java.lang.String sipMonth;

  protected int wkday;

  protected int day;

  protected int month;

  protected int year;

  protected int hour;

  protected int minute;

  protected int second;

  // Constructors

  public SIPDate(){
  }
  public SIPDate(long arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.String getMonth(){
    return (java.lang.String) null;
  }
  public int getYear(){
    return 0;
  }
  public void setMonth(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public void setYear(int arg1) throws java.lang.IllegalArgumentException{
  }
  public java.util.Calendar getJavaCal(){
    return (java.util.Calendar) null;
  }
  public java.lang.String getWkday(){
    return (java.lang.String) null;
  }
  public int getHour(){
    return 0;
  }
  public int getMinute(){
    return 0;
  }
  public int getSecond(){
    return 0;
  }
  public void setWkday(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public void setDay(int arg1) throws java.lang.IllegalArgumentException{
  }
  public void setHour(int arg1) throws java.lang.IllegalArgumentException{
  }
  public void setMinute(int arg1) throws java.lang.IllegalArgumentException{
  }
  public void setSecond(int arg1) throws java.lang.IllegalArgumentException{
  }
  public int getDeltaSeconds(){
    return 0;
  }
}
