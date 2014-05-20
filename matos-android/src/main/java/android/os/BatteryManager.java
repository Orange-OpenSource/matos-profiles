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
public class BatteryManager
{
  // Fields

  public static final java.lang.String EXTRA_STATUS = "status";

  public static final java.lang.String EXTRA_HEALTH = "health";

  public static final java.lang.String EXTRA_PRESENT = "present";

  public static final java.lang.String EXTRA_LEVEL = "level";

  public static final java.lang.String EXTRA_SCALE = "scale";

  public static final java.lang.String EXTRA_ICON_SMALL = "icon-small";

  public static final java.lang.String EXTRA_PLUGGED = "plugged";

  public static final java.lang.String EXTRA_VOLTAGE = "voltage";

  public static final java.lang.String EXTRA_TEMPERATURE = "temperature";

  public static final java.lang.String EXTRA_TECHNOLOGY = "technology";

  public static final java.lang.String EXTRA_INVALID_CHARGER = "invalid_charger";

  public static final int BATTERY_STATUS_UNKNOWN = 1;

  public static final int BATTERY_STATUS_CHARGING = 2;

  public static final int BATTERY_STATUS_DISCHARGING = 3;

  public static final int BATTERY_STATUS_NOT_CHARGING = 4;

  public static final int BATTERY_STATUS_FULL = 5;

  public static final int BATTERY_HEALTH_UNKNOWN = 1;

  public static final int BATTERY_HEALTH_GOOD = 2;

  public static final int BATTERY_HEALTH_OVERHEAT = 3;

  public static final int BATTERY_HEALTH_DEAD = 4;

  public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;

  public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;

  public static final int BATTERY_HEALTH_COLD = 7;

  public static final int BATTERY_PLUGGED_AC = 1;

  public static final int BATTERY_PLUGGED_USB = 2;

  // Constructors

  public BatteryManager(){
  }
}
