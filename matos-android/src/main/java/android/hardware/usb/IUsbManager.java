package android.hardware.usb;

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


public interface IUsbManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IUsbManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IUsbManager asInterface(android.os.IBinder arg1){
      return (IUsbManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IUsbManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void getDeviceList(android.os.Bundle arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public UsbAccessory getCurrentAccessory() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void clearDefaults(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public android.os.ParcelFileDescriptor openDevice(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public android.os.ParcelFileDescriptor openAccessory(UsbAccessory arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void setDevicePackage(UsbDevice arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void setAccessoryPackage(UsbAccessory arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public boolean hasDevicePermission(UsbDevice arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public boolean hasAccessoryPermission(UsbAccessory arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void requestDevicePermission(UsbDevice arg1, java.lang.String arg2, android.app.PendingIntent arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void requestAccessoryPermission(UsbAccessory arg1, java.lang.String arg2, android.app.PendingIntent arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void grantDevicePermission(UsbDevice arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void grantAccessoryPermission(UsbAccessory arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public boolean hasDefaults(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void setCurrentFunction(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsbManager")
  public void setMassStorageBackingFile(java.lang.String arg1) throws android.os.RemoteException;
}
