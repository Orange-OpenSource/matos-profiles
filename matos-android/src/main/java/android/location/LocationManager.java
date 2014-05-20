package android.location;

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

import com.francetelecom.rd.stubs.annotation.UseRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class LocationManager
{
  // Fields

  public static final java.lang.String NETWORK_PROVIDER = "network";

  public static final java.lang.String GPS_PROVIDER = "gps";

  public static final java.lang.String PASSIVE_PROVIDER = "passive";

  public static final java.lang.String KEY_PROXIMITY_ENTERING = "entering";

  public static final java.lang.String KEY_STATUS_CHANGED = "status";

  public static final java.lang.String KEY_PROVIDER_ENABLED = "providerEnabled";

  public static final java.lang.String KEY_LOCATION_CHANGED = "location";

  public static final java.lang.String GPS_ENABLED_CHANGE_ACTION = "android.location.GPS_ENABLED_CHANGE";

  public static final java.lang.String PROVIDERS_CHANGED_ACTION = "android.location.PROVIDERS_CHANGED";

  public static final java.lang.String GPS_FIX_CHANGE_ACTION = "android.location.GPS_FIX_CHANGE";

  public static final java.lang.String EXTRA_GPS_ENABLED = "enabled";

  // Constructors

  public LocationManager(ILocationManager arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.getProvider", pos = 1, report = "-")
  public LocationProvider getProvider(java.lang.String arg1){
    return (LocationProvider) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.getLastKnownLocation", pos = 1, report = "-")
  public Location getLastKnownLocation(java.lang.String arg1){
    return (Location) null;
  }
  public boolean sendExtraCommand(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3){
    return false;
  }
  public java.util.List<java.lang.String> getAllProviders(){
    return (java.util.List) null;
  }
  public java.util.List<java.lang.String> getProviders(boolean arg1){
    return (java.util.List) null;
  }
  public java.util.List<java.lang.String> getProviders(Criteria arg1, boolean arg2){
    return (java.util.List) null;
  }
  public java.lang.String getBestProvider(Criteria arg1, boolean arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestLocationUpdates-1", pos = 1, report = "-")
  public void requestLocationUpdates(java.lang.String arg1, long arg2, float arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") LocationListener arg4){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestLocationUpdates-2", pos = 1, report = "-")
  public void requestLocationUpdates(java.lang.String arg1, long arg2, float arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") LocationListener arg4, android.os.Looper arg5){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestLocationUpdates-4", pos = 1, report = "-")
  public void requestLocationUpdates(long arg1, float arg2, Criteria arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") LocationListener arg4, android.os.Looper arg5){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestLocationUpdates-3", pos = {1, 4}, report = "-")
  public void requestLocationUpdates(java.lang.String arg1, long arg2, float arg3, android.app.PendingIntent arg4){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestLocationUpdates-5", pos = {1, 4}, report = "-")
  public void requestLocationUpdates(long arg1, float arg2, Criteria arg3, android.app.PendingIntent arg4){
  }
  public void removeUpdates(LocationListener arg1){
  }
  public void removeUpdates(android.app.PendingIntent arg1){
  }
  public boolean addGpsStatusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.location.GpsStatus.Listener.onGpsStatusChanged") GpsStatus.Listener arg1){
    return false;
  }
  public void removeGpsStatusListener(GpsStatus.Listener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.addProximityAlert", pos = 5, report = "-")
  public void addProximityAlert(double arg1, double arg2, float arg3, long arg4, android.app.PendingIntent arg5){
  }
  public void removeProximityAlert(android.app.PendingIntent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.isProviderEnabled", pos = 1, report = "-")
  public boolean isProviderEnabled(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.addTestProvider", pos = 1, report = "-")
  public void addTestProvider(java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, int arg10){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.removeTestProvider", pos = 1, report = "-")
  public void removeTestProvider(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.setTestProvider", pos = 1, report = "-")
  public void setTestProviderLocation(java.lang.String arg1, Location arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.clearTestProviderLocation", pos = 1, report = "-")
  public void clearTestProviderLocation(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.setTestProviderEnabled", pos = 1, report = "-")
  public void setTestProviderEnabled(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.clearTestProviderEnabled", pos = 1, report = "-")
  public void clearTestProviderEnabled(java.lang.String arg1){
  }
  public void setTestProviderStatus(java.lang.String arg1, int arg2, android.os.Bundle arg3, long arg4){
  }
  public void clearTestProviderStatus(java.lang.String arg1){
  }
  public boolean sendNiResponse(int arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestSingleUpdate-1", pos = 1, report = "-")
  public void requestSingleUpdate(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") LocationListener arg2, android.os.Looper arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestSingleUpdate-2", pos = 1, report = "-")
  public void requestSingleUpdate(Criteria arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") LocationListener arg2, android.os.Looper arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestSingleUpdate-3", pos = {1, 2}, report = "-")
  public void requestSingleUpdate(java.lang.String arg1, android.app.PendingIntent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LocationManager.requestSingleUpdate-4", pos = 2, report = "-")
  public void requestSingleUpdate(Criteria arg1, android.app.PendingIntent arg2){
  }
  @UseRule(value = "LocationManager.addNmeaListener")
  public boolean addNmeaListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.location.GpsStatus.Listener.onNmeaReceived") GpsStatus.NmeaListener arg1){
    return false;
  }
  public void removeNmeaListener(GpsStatus.NmeaListener arg1){
  }
  public GpsStatus getGpsStatus(GpsStatus arg1){
    return (GpsStatus) null;
  }
}
