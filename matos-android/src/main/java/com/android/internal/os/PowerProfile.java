package com.android.internal.os;

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


public class PowerProfile
{
  // Fields

  public static final java.lang.String POWER_NONE = "none";

  public static final java.lang.String POWER_CPU_IDLE = "cpu.idle";

  public static final java.lang.String POWER_CPU_AWAKE = "cpu.awake";

  public static final java.lang.String POWER_CPU_ACTIVE = "cpu.active";

  public static final java.lang.String POWER_WIFI_SCAN = "wifi.scan";

  public static final java.lang.String POWER_WIFI_ON = "wifi.on";

  public static final java.lang.String POWER_WIFI_ACTIVE = "wifi.active";

  public static final java.lang.String POWER_GPS_ON = "gps.on";

  public static final java.lang.String POWER_BLUETOOTH_ON = "bluetooth.on";

  public static final java.lang.String POWER_BLUETOOTH_ACTIVE = "bluetooth.active";

  public static final java.lang.String POWER_BLUETOOTH_AT_CMD = "bluetooth.at";

  public static final java.lang.String POWER_SCREEN_ON = "screen.on";

  public static final java.lang.String POWER_RADIO_ON = "radio.on";

  public static final java.lang.String POWER_RADIO_SCANNING = "radio.scanning";

  public static final java.lang.String POWER_RADIO_ACTIVE = "radio.active";

  public static final java.lang.String POWER_SCREEN_FULL = "screen.full";

  public static final java.lang.String POWER_AUDIO = "dsp.audio";

  public static final java.lang.String POWER_VIDEO = "dsp.video";

  public static final java.lang.String POWER_CPU_SPEEDS = "cpu.speeds";

  public static final java.lang.String POWER_BATTERY_CAPACITY = "battery.capacity";

  // Constructors

  public PowerProfile(android.content.Context arg1){
  }
  // Methods

  public int getNumSpeedSteps(){
    return 0;
  }
  public double getAveragePower(java.lang.String arg1){
    return 0.0d;
  }
  public double getAveragePower(java.lang.String arg1, int arg2){
    return 0.0d;
  }
  public double getBatteryCapacity(){
    return 0.0d;
  }
}
