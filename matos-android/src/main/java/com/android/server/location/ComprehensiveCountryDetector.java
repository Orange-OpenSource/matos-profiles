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


public class ComprehensiveCountryDetector
  extends CountryDetectorBase{
  // Fields

  protected CountryDetectorBase mLocationBasedCountryDetector;

  protected java.util.Timer mLocationRefreshTimer;

  // Constructors

  public ComprehensiveCountryDetector(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  public void stop(){
  }
  public android.location.Country detectCountry(){
    return (android.location.Country) null;
  }
  protected android.location.Country getNetworkBasedCountry(){
    return (android.location.Country) null;
  }
  protected android.location.Country getLastKnownLocationBasedCountry(){
    return (android.location.Country) null;
  }
  protected android.location.Country getSimBasedCountry(){
    return (android.location.Country) null;
  }
  protected android.location.Country getLocaleCountry(){
    return (android.location.Country) null;
  }
  protected void runAfterDetectionAsync(android.location.Country arg1, android.location.Country arg2, boolean arg3, boolean arg4){
  }
  public void setCountryListener(android.location.CountryListener arg1){
  }
  protected CountryDetectorBase createLocationBasedCountryDetector(){
    return (CountryDetectorBase) null;
  }
  protected boolean isAirplaneModeOff(){
    return false;
  }
  protected synchronized void addPhoneStateListener(){
  }
  protected synchronized void removePhoneStateListener(){
  }
  protected boolean isGeoCoderImplemented(){
    return false;
  }
}
