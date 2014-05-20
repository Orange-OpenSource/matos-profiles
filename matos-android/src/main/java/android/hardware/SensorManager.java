package android.hardware;

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
public class SensorManager
{
  // Fields

  public static final int SENSOR_ORIENTATION = 1;

  public static final int SENSOR_ACCELEROMETER = 2;

  public static final int SENSOR_TEMPERATURE = 4;

  public static final int SENSOR_MAGNETIC_FIELD = 8;

  public static final int SENSOR_LIGHT = 16;

  public static final int SENSOR_PROXIMITY = 32;

  public static final int SENSOR_TRICORDER = 64;

  public static final int SENSOR_ORIENTATION_RAW = 128;

  public static final int SENSOR_ALL = 127;

  public static final int SENSOR_MIN = 1;

  public static final int SENSOR_MAX = 64;

  public static final int DATA_X = 0;

  public static final int DATA_Y = 1;

  public static final int DATA_Z = 2;

  public static final int RAW_DATA_INDEX = 3;

  public static final int RAW_DATA_X = 3;

  public static final int RAW_DATA_Y = 4;

  public static final int RAW_DATA_Z = 5;

  public static final float STANDARD_GRAVITY = 9.80665f;

  public static final float GRAVITY_SUN = 275.0f;

  public static final float GRAVITY_MERCURY = 3.7f;

  public static final float GRAVITY_VENUS = 8.87f;

  public static final float GRAVITY_EARTH = 9.80665f;

  public static final float GRAVITY_MOON = 1.6f;

  public static final float GRAVITY_MARS = 3.71f;

  public static final float GRAVITY_JUPITER = 23.12f;

  public static final float GRAVITY_SATURN = 8.96f;

  public static final float GRAVITY_URANUS = 8.69f;

  public static final float GRAVITY_NEPTUNE = 11.0f;

  public static final float GRAVITY_PLUTO = 0.6f;

  public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7f;

  public static final float GRAVITY_THE_ISLAND = 4.815162f;

  public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0f;

  public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0f;

  public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25f;

  public static final float LIGHT_SUNLIGHT_MAX = 120000.0f;

  public static final float LIGHT_SUNLIGHT = 110000.0f;

  public static final float LIGHT_SHADE = 20000.0f;

  public static final float LIGHT_OVERCAST = 10000.0f;

  public static final float LIGHT_SUNRISE = 400.0f;

  public static final float LIGHT_CLOUDY = 100.0f;

  public static final float LIGHT_FULLMOON = 0.25f;

  public static final float LIGHT_NO_MOON = 0.0010f;

  public static final int SENSOR_DELAY_FASTEST = 0;

  public static final int SENSOR_DELAY_GAME = 1;

  public static final int SENSOR_DELAY_UI = 2;

  public static final int SENSOR_DELAY_NORMAL = 3;

  public static final int SENSOR_STATUS_UNRELIABLE = 0;

  public static final int SENSOR_STATUS_ACCURACY_LOW = 1;

  public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;

  public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;

  public static final int AXIS_X = 1;

  public static final int AXIS_Y = 2;

  public static final int AXIS_Z = 3;

  public static final int AXIS_MINUS_X = 129;

  public static final int AXIS_MINUS_Y = 130;

  public static final int AXIS_MINUS_Z = 131;

  // Constructors

  public SensorManager(android.os.Looper arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SensorManager.registerListener-1", pos = 2, report = "-")
  public boolean registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.hardware.SensorListener.onChange") SensorListener arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SensorManager.registerListener-2", pos = 2, report = "-")
  public boolean registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.hardware.SensorListener.onChange") SensorListener arg1, int arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SensorManager.registerListener-3", pos = 2, report = "-")
  public boolean registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.hardware.SensorEventListener.onChange") SensorEventListener arg1, Sensor arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SensorManager.registerListener-4", pos = 2, report = "-")
  public boolean registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.hardware.SensorEventListener.onChange") SensorEventListener arg1, Sensor arg2, int arg3, android.os.Handler arg4){
    return false;
  }
  public void unregisterListener(SensorListener arg1, int arg2){
  }
  public void unregisterListener(SensorListener arg1){
  }
  public void unregisterListener(SensorEventListener arg1, Sensor arg2){
  }
  public void unregisterListener(SensorEventListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SensorManager.getOrientation", report = "-")
  public static float [] getOrientation(float [] arg1, float [] arg2){
    return (float []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SensorManager.getInclination", report = "-")
  public static float getInclination(float [] arg1){
    return 0.0f;
  }
  public void onRotationChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SensorManager.getAltitude", report = "-")
  public static float getAltitude(float arg1, float arg2){
    return 0.0f;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SensorManager.getDefaultSensor", pos = 1, report = "-")
  public Sensor getDefaultSensor(int arg1){
    return (Sensor) null;
  }
  public java.util.List<Sensor> getSensorList(int arg1){
    return (java.util.List) null;
  }
  public static boolean getRotationMatrix(float [] arg1, float [] arg2, float [] arg3, float [] arg4){
    return false;
  }
  public int getSensors(){
    return 0;
  }
  public static boolean remapCoordinateSystem(float [] arg1, int arg2, int arg3, float [] arg4){
    return false;
  }
  public static void getAngleChange(float [] arg1, float [] arg2, float [] arg3){
  }
  public static void getRotationMatrixFromVector(float [] arg1, float [] arg2){
  }
  public static void getQuaternionFromVector(float [] arg1, float [] arg2){
  }
}
