package com.android.server;

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


public class LocationManagerService
  extends android.location.ILocationManager.Stub  implements java.lang.Runnable
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LocationManagerService(android.content.Context arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void run(){
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public java.lang.String getFromLocation(double arg1, double arg2, int arg3, android.location.GeocoderParams arg4, java.util.List<android.location.Address> arg5){
    return (java.lang.String) null;
  }
  public java.lang.String getFromLocationName(java.lang.String arg1, double arg2, double arg3, double arg4, double arg5, int arg6, android.location.GeocoderParams arg7, java.util.List<android.location.Address> arg8){
    return (java.lang.String) null;
  }
  public void reportLocation(android.location.Location arg1, boolean arg2){
  }
  public android.location.Location getLastKnownLocation(java.lang.String arg1){
    return (android.location.Location) null;
  }
  public boolean sendExtraCommand(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3){
    return false;
  }
  public java.util.List<java.lang.String> getAllProviders(){
    return (java.util.List) null;
  }
  public java.util.List<java.lang.String> getProviders(android.location.Criteria arg1, boolean arg2){
    return (java.util.List) null;
  }
  public java.lang.String getBestProvider(android.location.Criteria arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public boolean providerMeetsCriteria(java.lang.String arg1, android.location.Criteria arg2){
    return false;
  }
  public void requestLocationUpdates(java.lang.String arg1, android.location.Criteria arg2, long arg3, float arg4, boolean arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iLocationListener") android.location.ILocationListener arg6){
  }
  public void requestLocationUpdatesPI(java.lang.String arg1, android.location.Criteria arg2, long arg3, float arg4, boolean arg5, android.app.PendingIntent arg6){
  }
  public void removeUpdates(android.location.ILocationListener arg1){
  }
  public void removeUpdatesPI(android.app.PendingIntent arg1){
  }
  public boolean addGpsStatusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("iGpsStatusListener") android.location.IGpsStatusListener arg1){
    return false;
  }
  public void removeGpsStatusListener(android.location.IGpsStatusListener arg1){
  }
  public void locationCallbackFinished(@com.francetelecom.rd.stubs.annotation.CallBackRegister("iLocationListener") android.location.ILocationListener arg1){
  }
  public void addProximityAlert(double arg1, double arg2, float arg3, long arg4, android.app.PendingIntent arg5){
  }
  public void removeProximityAlert(android.app.PendingIntent arg1){
  }
  public android.os.Bundle getProviderInfo(java.lang.String arg1){
    return (android.os.Bundle) null;
  }
  public boolean isProviderEnabled(java.lang.String arg1){
    return false;
  }
  public boolean geocoderIsPresent(){
    return false;
  }
  public void addTestProvider(java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, int arg10){
  }
  public void removeTestProvider(java.lang.String arg1){
  }
  public void setTestProviderLocation(java.lang.String arg1, android.location.Location arg2){
  }
  public void clearTestProviderLocation(java.lang.String arg1){
  }
  public void setTestProviderEnabled(java.lang.String arg1, boolean arg2){
  }
  public void clearTestProviderEnabled(java.lang.String arg1){
  }
  public void setTestProviderStatus(java.lang.String arg1, int arg2, android.os.Bundle arg3, long arg4){
  }
  public void clearTestProviderStatus(java.lang.String arg1){
  }
  public boolean sendNiResponse(int arg1, int arg2){
    return false;
  }
}
