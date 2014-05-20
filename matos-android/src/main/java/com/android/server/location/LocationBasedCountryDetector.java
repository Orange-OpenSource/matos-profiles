package com.android.server.location;

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
public class LocationBasedCountryDetector
  extends CountryDetectorBase{
  // Fields

  protected java.util.Timer mTimer;

  protected java.lang.Thread mQueryThread;

  protected java.util.List<android.location.LocationListener> mLocationListeners;

  // Constructors

  public LocationBasedCountryDetector(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  public synchronized void stop(){
  }
  public synchronized android.location.Country detectCountry(){
    return (android.location.Country) null;
  }
  protected void registerListener(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.location.LocationListener arg2){
  }
  protected void unregisterListener(android.location.LocationListener arg1){
  }
  protected android.location.Location getLastKnownLocation(){
    return (android.location.Location) null;
  }
  protected java.lang.String getCountryFromLocation(android.location.Location arg1){
    return (java.lang.String) null;
  }
  protected boolean isAcceptableProvider(java.lang.String arg1){
    return false;
  }
  protected long getQueryLocationTimeout(){
    return 0l;
  }
  protected java.util.List<java.lang.String> getEnabledProviders(){
    return (java.util.List) null;
  }
}
