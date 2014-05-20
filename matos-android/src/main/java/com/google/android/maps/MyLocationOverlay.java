package com.google.android.maps;

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
public class MyLocationOverlay
  extends Overlay  implements Overlay.Snappable, android.location.LocationListener, android.hardware.SensorListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MyLocationOverlay(android.content.Context arg1, MapView arg2){
    super();
  }
  // Methods

  public synchronized boolean draw(android.graphics.Canvas arg1, MapView arg2, boolean arg3, long arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAccuracyChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onSensorChanged(int arg1, float [] arg2){
  }
  public float getOrientation(){
    return 0.0f;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onLocationChanged(android.location.Location arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onProviderDisabled(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onProviderEnabled(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStatusChanged(java.lang.String arg1, int arg2, android.os.Bundle arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTap(GeoPoint arg1, MapView arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSnapToItem(int arg1, int arg2, android.graphics.Point arg3, MapView arg4){
    return false;
  }
  public synchronized boolean enableCompass(){
    return false;
  }
  public synchronized void disableCompass(){
  }
  public boolean isCompassEnabled(){
    return false;
  }
  public synchronized boolean enableMyLocation(){
    return false;
  }
  public synchronized void disableMyLocation(){
  }
  protected boolean dispatchTap(){
    return false;
  }
  protected void drawMyLocation(android.graphics.Canvas arg1, MapView arg2, android.location.Location arg3, GeoPoint arg4, long arg5){
  }
  protected void drawCompass(android.graphics.Canvas arg1, float arg2){
  }
  public GeoPoint getMyLocation(){
    return (GeoPoint) null;
  }
  public android.location.Location getLastFix(){
    return (android.location.Location) null;
  }
  public boolean isMyLocationEnabled(){
    return false;
  }
  public synchronized boolean runOnFirstFix(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
    return false;
  }
}
