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
public interface ILocationProvider
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IInterfaceStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements ILocationProvider
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ILocationProvider asInterface(android.os.IBinder arg1){
      return (ILocationProvider) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("ILocationProvider")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void disable() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void enable() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public int getStatus(android.os.Bundle arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void addListener(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void removeListener(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean sendExtraCommand(java.lang.String arg1, android.os.Bundle arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean requiresNetwork() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void updateNetworkState(int arg1, android.net.NetworkInfo arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public int getAccuracy() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void updateLocation(Location arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean requiresSatellite() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean requiresCell() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean hasMonetaryCost() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean supportsAltitude() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean supportsSpeed() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean supportsBearing() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public int getPowerRequirement() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public boolean meetsCriteria(Criteria arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public long getStatusUpdateTime() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public java.lang.String getInternalState() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void enableLocationTracking(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ILocationProvider")
  public void setMinTime(long arg1, android.os.WorkSource arg2) throws android.os.RemoteException;
}
