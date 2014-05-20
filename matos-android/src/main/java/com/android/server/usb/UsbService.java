package com.android.server.usb;

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


public class UsbService
  extends android.hardware.usb.IUsbManager.Stub{
  // Constructors

  public UsbService(android.content.Context arg1){
    super();
  }
  // Methods

  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void systemReady(){
  }
  public void getDeviceList(android.os.Bundle arg1){
  }
  public android.hardware.usb.UsbAccessory getCurrentAccessory(){
    return (android.hardware.usb.UsbAccessory) null;
  }
  public void clearDefaults(java.lang.String arg1){
  }
  public android.os.ParcelFileDescriptor openDevice(java.lang.String arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
  public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
  public void setDevicePackage(android.hardware.usb.UsbDevice arg1, java.lang.String arg2){
  }
  public void setAccessoryPackage(android.hardware.usb.UsbAccessory arg1, java.lang.String arg2){
  }
  public boolean hasDevicePermission(android.hardware.usb.UsbDevice arg1){
    return false;
  }
  public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory arg1){
    return false;
  }
  public void requestDevicePermission(android.hardware.usb.UsbDevice arg1, java.lang.String arg2, android.app.PendingIntent arg3){
  }
  public void requestAccessoryPermission(android.hardware.usb.UsbAccessory arg1, java.lang.String arg2, android.app.PendingIntent arg3){
  }
  public void grantDevicePermission(android.hardware.usb.UsbDevice arg1, int arg2){
  }
  public void grantAccessoryPermission(android.hardware.usb.UsbAccessory arg1, int arg2){
  }
  public boolean hasDefaults(java.lang.String arg1){
    return false;
  }
  public void setCurrentFunction(java.lang.String arg1, boolean arg2){
  }
  public void setMassStorageBackingFile(java.lang.String arg1){
  }
}
