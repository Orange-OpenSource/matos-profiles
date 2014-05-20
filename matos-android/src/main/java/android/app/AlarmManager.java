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
public class AlarmManager
{
  // Fields

  public static final int RTC_WAKEUP = 0;

  public static final int RTC = 1;

  public static final int ELAPSED_REALTIME_WAKEUP = 2;

  public static final int ELAPSED_REALTIME = 3;

  public static final long INTERVAL_FIFTEEN_MINUTES = 900000l;

  public static final long INTERVAL_HALF_HOUR = 1800000l;

  public static final long INTERVAL_HOUR = 3600000l;

  public static final long INTERVAL_HALF_DAY = 43200000l;

  public static final long INTERVAL_DAY = 86400000l;

  // Constructors

  AlarmManager(IAlarmManager arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AlarmManager.set", pos = {1, 2, 3}, report = "-")
  public void set(int arg1, long arg2, PendingIntent arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AlarmManager.setTime", pos = 1, report = "-")
  public void setTime(long arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AlarmManager.setTimeZone", pos = 1, report = "-")
  public void setTimeZone(java.lang.String arg1){
  }
  public void cancel(PendingIntent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AlarmManager.setRepeating", pos = {1, 2, 3, 4}, report = "-")
  public void setRepeating(int arg1, long arg2, long arg3, PendingIntent arg4){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AlarmManager.setInexactRepeating", pos = {1, 2, 3, 4}, report = "-")
  public void setInexactRepeating(int arg1, long arg2, long arg3, PendingIntent arg4){
  }
}
