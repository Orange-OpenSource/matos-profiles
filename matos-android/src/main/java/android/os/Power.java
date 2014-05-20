package android.os;

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
public class Power
{
  // Fields

  public static final int PARTIAL_WAKE_LOCK = 1;

  public static final int FULL_WAKE_LOCK = 2;

  public static final int BRIGHTNESS_OFF = 0;

  public static final int BRIGHTNESS_DIM = 20;

  public static final int BRIGHTNESS_ON = 255;

  public static final int BRIGHTNESS_LOW_BATTERY = 10;

  public static final int LOW_BATTERY_THRESHOLD = 10;

  // Constructors

  private Power(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Power.shutdown", report = "-")
  public static void shutdown(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Power.reboot", report = "-")
  public static void reboot(java.lang.String arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Power.releaseWakeLock", pos = 1, report = "-")
  public static void releaseWakeLock(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Power.acquireWakeLock", pos = 2, report = "-")
  public static void acquireWakeLock(int arg1, java.lang.String arg2){
  }
  public static int setLastUserActivityTimeout(long arg1){
    return 0;
  }
  public static int setScreenState(boolean arg1){
    return 0;
  }
}
