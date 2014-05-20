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
public final class GpsStatus
{
  // Classes

  public static interface Listener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGpsStatusChanged")
    public void onGpsStatusChanged(int arg1);
  }
  public static interface NmeaListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onNmeaReceived")
    public void onNmeaReceived(long arg1, java.lang.String arg2);
  }
  // Fields

  public static final int GPS_EVENT_STARTED = 1;

  public static final int GPS_EVENT_STOPPED = 2;

  public static final int GPS_EVENT_FIRST_FIX = 3;

  public static final int GPS_EVENT_SATELLITE_STATUS = 4;

  // Constructors

  GpsStatus(){
  }
  // Methods

  public int getTimeToFirstFix(){
    return 0;
  }
  public java.lang.Iterable<GpsSatellite> getSatellites(){
    return (java.lang.Iterable) null;
  }
  public int getMaxSatellites(){
    return 0;
  }
}
