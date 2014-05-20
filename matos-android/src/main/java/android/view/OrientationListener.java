package android.view;

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
public abstract class OrientationListener
  implements android.hardware.SensorListener
{
  // Fields

  public static final int ORIENTATION_UNKNOWN = -1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public OrientationListener(android.content.Context arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public OrientationListener(android.content.Context arg1, int arg2){
  }
  // Methods

  public void disable(){
  }
  public void enable(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAccuracyChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSensorChanged(int arg1, float [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onOrientationChanged(int arg1);
}
