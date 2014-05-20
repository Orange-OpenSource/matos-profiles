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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class LocationProvider
{
  // Fields

  public static final int OUT_OF_SERVICE = 0;

  public static final int TEMPORARILY_UNAVAILABLE = 1;

  public static final int AVAILABLE = 2;

  // Constructors

  public LocationProvider(java.lang.String arg1, ILocationManager arg2){
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public abstract boolean requiresNetwork();
  public abstract int getAccuracy();
  public abstract boolean requiresSatellite();
  public abstract boolean requiresCell();
  public abstract boolean hasMonetaryCost();
  public abstract boolean supportsAltitude();
  public abstract boolean supportsSpeed();
  public abstract boolean supportsBearing();
  public abstract int getPowerRequirement();
  public boolean meetsCriteria(Criteria arg1){
    return false;
  }
}
