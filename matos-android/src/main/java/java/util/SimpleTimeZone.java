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


public class SimpleTimeZone
  extends TimeZone{
  // Fields

  public static final int UTC_TIME = 2;

  public static final int STANDARD_TIME = 1;

  public static final int WALL_TIME = 0;

  // Constructors

  public SimpleTimeZone(int arg1, java.lang.String arg2){
    super();
  }
  public SimpleTimeZone(int arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10){
    super();
  }
  public SimpleTimeZone(int arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11){
    super();
  }
  public SimpleTimeZone(int arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int getOffset(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public int getOffset(long arg1){
    return 0;
  }
  public boolean inDaylightTime(Date arg1){
    return false;
  }
  public int getRawOffset(){
    return 0;
  }
  public void setRawOffset(int arg1){
  }
  public boolean useDaylightTime(){
    return false;
  }
  public boolean hasSameRules(TimeZone arg1){
    return false;
  }
  public int getDSTSavings(){
    return 0;
  }
  public void setDSTSavings(int arg1){
  }
  public void setEndRule(int arg1, int arg2, int arg3){
  }
  public void setEndRule(int arg1, int arg2, int arg3, int arg4){
  }
  public void setEndRule(int arg1, int arg2, int arg3, int arg4, boolean arg5){
  }
  public void setStartRule(int arg1, int arg2, int arg3){
  }
  public void setStartRule(int arg1, int arg2, int arg3, int arg4){
  }
  public void setStartRule(int arg1, int arg2, int arg3, int arg4, boolean arg5){
  }
  public void setStartYear(int arg1){
  }
}
