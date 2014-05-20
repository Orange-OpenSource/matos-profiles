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
public interface LocationProviderInterface
{
  // Methods

  public java.lang.String getName();
  public void disable();
  public void enable();
  public boolean isEnabled();
  public int getStatus(android.os.Bundle arg1);
  public void addListener(int arg1);
  public void removeListener(int arg1);
  public boolean sendExtraCommand(java.lang.String arg1, android.os.Bundle arg2);
  public boolean requiresNetwork();
  public void updateNetworkState(int arg1, android.net.NetworkInfo arg2);
  public int getAccuracy();
  public void updateLocation(android.location.Location arg1);
  public boolean requiresSatellite();
  public boolean requiresCell();
  public boolean hasMonetaryCost();
  public boolean supportsAltitude();
  public boolean supportsSpeed();
  public boolean supportsBearing();
  public int getPowerRequirement();
  public boolean meetsCriteria(android.location.Criteria arg1);
  public long getStatusUpdateTime();
  public java.lang.String getInternalState();
  public void enableLocationTracking(boolean arg1);
  public void setMinTime(long arg1, android.os.WorkSource arg2);
  public boolean requestSingleShotFix();
}
