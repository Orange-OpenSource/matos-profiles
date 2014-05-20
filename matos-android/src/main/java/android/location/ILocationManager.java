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
public interface ILocationManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements ILocationManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ILocationManager asInterface(android.os.IBinder arg1){
      return (ILocationManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public java.lang.String getFromLocation(double arg1, double arg2, int arg3, GeocoderParams arg4, java.util.List<Address> arg5) throws android.os.RemoteException;
  public java.lang.String getFromLocationName(java.lang.String arg1, double arg2, double arg3, double arg4, double arg5, int arg6, GeocoderParams arg7, java.util.List<Address> arg8) throws android.os.RemoteException;
  public void reportLocation(Location arg1, boolean arg2) throws android.os.RemoteException;
  public Location getLastKnownLocation(java.lang.String arg1) throws android.os.RemoteException;
  public boolean sendExtraCommand(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException;
  public java.util.List<java.lang.String> getProviders(Criteria arg1, boolean arg2) throws android.os.RemoteException;
  public java.lang.String getBestProvider(Criteria arg1, boolean arg2) throws android.os.RemoteException;
  public boolean providerMeetsCriteria(java.lang.String arg1, Criteria arg2) throws android.os.RemoteException;
  public void requestLocationUpdates(java.lang.String arg1, Criteria arg2, long arg3, float arg4, boolean arg5, ILocationListener arg6) throws android.os.RemoteException;
  public void requestLocationUpdatesPI(java.lang.String arg1, Criteria arg2, long arg3, float arg4, boolean arg5, android.app.PendingIntent arg6) throws android.os.RemoteException;
  public void removeUpdates(ILocationListener arg1) throws android.os.RemoteException;
  public void removeUpdatesPI(android.app.PendingIntent arg1) throws android.os.RemoteException;
  public boolean addGpsStatusListener(IGpsStatusListener arg1) throws android.os.RemoteException;
  public void removeGpsStatusListener(IGpsStatusListener arg1) throws android.os.RemoteException;
  public void locationCallbackFinished(ILocationListener arg1) throws android.os.RemoteException;
  public void addProximityAlert(double arg1, double arg2, float arg3, long arg4, android.app.PendingIntent arg5) throws android.os.RemoteException;
  public void removeProximityAlert(android.app.PendingIntent arg1) throws android.os.RemoteException;
  public android.os.Bundle getProviderInfo(java.lang.String arg1) throws android.os.RemoteException;
  public boolean isProviderEnabled(java.lang.String arg1) throws android.os.RemoteException;
  public boolean geocoderIsPresent() throws android.os.RemoteException;
  public void addTestProvider(java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, int arg10) throws android.os.RemoteException;
  public void removeTestProvider(java.lang.String arg1) throws android.os.RemoteException;
  public void setTestProviderLocation(java.lang.String arg1, Location arg2) throws android.os.RemoteException;
  public void clearTestProviderLocation(java.lang.String arg1) throws android.os.RemoteException;
  public void setTestProviderEnabled(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public void clearTestProviderEnabled(java.lang.String arg1) throws android.os.RemoteException;
  public void setTestProviderStatus(java.lang.String arg1, int arg2, android.os.Bundle arg3, long arg4) throws android.os.RemoteException;
  public void clearTestProviderStatus(java.lang.String arg1) throws android.os.RemoteException;
  public boolean sendNiResponse(int arg1, int arg2) throws android.os.RemoteException;
}
