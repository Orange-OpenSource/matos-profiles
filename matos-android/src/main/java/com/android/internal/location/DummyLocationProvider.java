package com.android.internal.location;

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


public class DummyLocationProvider
  extends android.location.LocationProvider{
  // Constructors

  public DummyLocationProvider(java.lang.String arg1, android.location.ILocationManager arg2){
    super((java.lang.String) null, (android.location.ILocationManager) null);
  }
  // Methods

  public boolean requiresNetwork(){
    return false;
  }
  public int getAccuracy(){
    return 0;
  }
  public boolean requiresSatellite(){
    return false;
  }
  public boolean requiresCell(){
    return false;
  }
  public boolean hasMonetaryCost(){
    return false;
  }
  public boolean supportsAltitude(){
    return false;
  }
  public boolean supportsSpeed(){
    return false;
  }
  public boolean supportsBearing(){
    return false;
  }
  public int getPowerRequirement(){
    return 0;
  }
  public void setAccuracy(int arg1){
  }
  public void setPowerRequirement(int arg1){
  }
  public void setRequiresNetwork(boolean arg1){
  }
  public void setRequiresSatellite(boolean arg1){
  }
  public void setRequiresCell(boolean arg1){
  }
  public void setHasMonetaryCost(boolean arg1){
  }
  public void setSupportsAltitude(boolean arg1){
  }
  public void setSupportsSpeed(boolean arg1){
  }
  public void setSupportsBearing(boolean arg1){
  }
}
