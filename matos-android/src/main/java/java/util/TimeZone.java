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


public abstract class TimeZone
  implements java.io.Serializable, java.lang.Cloneable
{
  // Fields

  public static final int SHORT = 0;

  public static final int LONG = 1;

  // Constructors

  public TimeZone(){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public static synchronized TimeZone getDefault(){
    return (TimeZone) null;
  }
  public int getOffset(long arg1){
    return 0;
  }
  public abstract int getOffset(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
  public final java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  public final java.lang.String getDisplayName(Locale arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String getDisplayName(boolean arg1, int arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayName(boolean arg1, int arg2, Locale arg3){
    return (java.lang.String) null;
  }
  public static synchronized void setDefault(TimeZone arg1){
  }
  public static synchronized TimeZone getTimeZone(java.lang.String arg1){
    return (TimeZone) null;
  }
  public abstract boolean inDaylightTime(Date arg1);
  public abstract int getRawOffset();
  public abstract void setRawOffset(int arg1);
  public abstract boolean useDaylightTime();
  public boolean hasSameRules(TimeZone arg1){
    return false;
  }
  public void setID(java.lang.String arg1){
  }
  public java.lang.String getID(){
    return (java.lang.String) null;
  }
  public static synchronized java.lang.String [] getAvailableIDs(){
    return (java.lang.String []) null;
  }
  public static synchronized java.lang.String [] getAvailableIDs(int arg1){
    return (java.lang.String []) null;
  }
  public int getDSTSavings(){
    return 0;
  }
}
