package android.net;

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


public class ThrottleManager
{
  // Fields

  public static final java.lang.String THROTTLE_POLL_ACTION = "android.net.thrott.POLL_ACTION";

  public static final java.lang.String EXTRA_CYCLE_READ = "cycleRead";

  public static final java.lang.String EXTRA_CYCLE_WRITE = "cycleWrite";

  public static final java.lang.String EXTRA_CYCLE_START = "cycleStart";

  public static final java.lang.String EXTRA_CYCLE_END = "cycleEnd";

  public static final java.lang.String THROTTLE_ACTION = "android.net.thrott.THROTTLE_ACTION";

  public static final java.lang.String EXTRA_THROTTLE_LEVEL = "level";

  public static final java.lang.String POLICY_CHANGED_ACTION = "android.net.thrott.POLICY_CHANGED_ACTION";

  public static final int DIRECTION_TX = 0;

  public static final int DIRECTION_RX = 1;

  public static final int PERIOD_CYCLE = 0;

  public static final int PERIOD_YEAR = 1;

  public static final int PERIOD_MONTH = 2;

  public static final int PERIOD_WEEK = 3;

  public static final int PERIOD_7DAY = 4;

  public static final int PERIOD_DAY = 5;

  public static final int PERIOD_24HOUR = 6;

  public static final int PERIOD_HOUR = 7;

  public static final int PERIOD_60MIN = 8;

  public static final int PERIOD_MINUTE = 9;

  public static final int PERIOD_60SEC = 10;

  public static final int PERIOD_SECOND = 11;

  // Constructors

  private ThrottleManager(){
  }
  public ThrottleManager(IThrottleManager arg1){
  }
  // Methods

  public long getResetTime(java.lang.String arg1){
    return 0l;
  }
  public long getPeriodStartTime(java.lang.String arg1){
    return 0l;
  }
  public long getCliffThreshold(java.lang.String arg1, int arg2){
    return 0l;
  }
  public int getCliffLevel(java.lang.String arg1, int arg2){
    return 0;
  }
  public java.lang.String getHelpUri(){
    return (java.lang.String) null;
  }
  public long getByteCount(java.lang.String arg1, int arg2, int arg3, int arg4){
    return 0l;
  }
}
