package android.os;

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
public interface IPowerManager
  extends IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IPowerManagerStubImpl", superClass = "")
  public abstract static class Stub
    extends Binder    implements IPowerManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public IBinder asBinder(){
      return (IBinder) null;
    }
    public static IPowerManager asInterface(IBinder arg1){
      return (IPowerManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IPowerManager")
    public boolean onTransact(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void reboot(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void releaseWakeLock(IBinder arg1, int arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void acquireWakeLock(int arg1, IBinder arg2, java.lang.String arg3, WorkSource arg4) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void setMaximumScreenOffTimeount(int arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void goToSleepWithReason(long arg1, int arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public boolean isScreenOn() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void updateWakeLockWorkSource(IBinder arg1, WorkSource arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void goToSleep(long arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void userActivity(long arg1, boolean arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void userActivityWithForce(long arg1, boolean arg2, boolean arg3) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void clearUserActivityTimeout(long arg1, long arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void setPokeLock(int arg1, IBinder arg2, java.lang.String arg3) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public int getSupportedWakeLockFlags() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void setStayOnSetting(int arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void preventScreenOn(boolean arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void crash(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void setBacklightBrightness(int arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPowerManager")
  public void setAttentionLight(boolean arg1, int arg2) throws RemoteException;
}
