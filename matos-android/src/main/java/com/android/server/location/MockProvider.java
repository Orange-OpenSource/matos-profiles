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


public class MockProvider
  implements LocationProviderInterface
{
  // Constructors

  public MockProvider(java.lang.String arg1, android.location.ILocationManager arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, int arg10, int arg11){
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void disable(){
  }
  public void enable(){
  }
  public void dump(java.io.PrintWriter arg1, java.lang.String arg2){
  }
  public boolean isEnabled(){
    return false;
  }
  public int getStatus(android.os.Bundle arg1){
    return 0;
  }
  public void addListener(int arg1){
  }
  public void removeListener(int arg1){
  }
  public void clearStatus(){
  }
  public boolean sendExtraCommand(java.lang.String arg1, android.os.Bundle arg2){
    return false;
  }
  public boolean requiresNetwork(){
    return false;
  }
  public void updateNetworkState(int arg1, android.net.NetworkInfo arg2){
  }
  public int getAccuracy(){
    return 0;
  }
  public void updateLocation(android.location.Location arg1){
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
  public boolean meetsCriteria(android.location.Criteria arg1){
    return false;
  }
  public long getStatusUpdateTime(){
    return 0l;
  }
  public java.lang.String getInternalState(){
    return (java.lang.String) null;
  }
  public void enableLocationTracking(boolean arg1){
  }
  public void setMinTime(long arg1, android.os.WorkSource arg2){
  }
  public boolean requestSingleShotFix(){
    return false;
  }
  public void setStatus(int arg1, android.os.Bundle arg2, long arg3){
  }
  public void setLocation(android.location.Location arg1){
  }
  public void clearLocation(){
  }
}
