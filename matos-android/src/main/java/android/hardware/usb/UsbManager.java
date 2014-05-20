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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.UseRule;


public class UsbManager
{
  // Fields

  public static final java.lang.String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";

  public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";

  public static final java.lang.String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";

  public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";

  public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";

  public static final java.lang.String USB_CONNECTED = "connected";

  public static final java.lang.String USB_CONFIGURED = "configured";

  public static final java.lang.String USB_FUNCTION_MASS_STORAGE = "mass_storage";

  public static final java.lang.String USB_FUNCTION_ADB = "adb";

  public static final java.lang.String USB_FUNCTION_RNDIS = "rndis";

  public static final java.lang.String USB_FUNCTION_MTP = "mtp";

  public static final java.lang.String USB_FUNCTION_PTP = "ptp";

  public static final java.lang.String USB_FUNCTION_ACCESSORY = "accessory";

  public static final java.lang.String EXTRA_DEVICE = "device";

  public static final java.lang.String EXTRA_ACCESSORY = "accessory";

  public static final java.lang.String EXTRA_PERMISSION_GRANTED = "permission";

  // Constructors

  public UsbManager(android.content.Context arg1, IUsbManager arg2){
  }
  // Methods

  @UseRule("UsbManager.getDeviceList")
  public java.util.HashMap<java.lang.String, UsbDevice> getDeviceList(){
    return (java.util.HashMap) null;
  }
  @ArgsRule(value="UsbManager.openDevice",pos=1)
  public UsbDeviceConnection openDevice(UsbDevice arg1){
    return (UsbDeviceConnection) null;
  }
  
  @ArgsRule(value="UsbManager.openAccessory",pos=1)
  public android.os.ParcelFileDescriptor openAccessory(UsbAccessory arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
  public void setCurrentFunction(java.lang.String arg1, boolean arg2){
  }
  public void setMassStorageBackingFile(java.lang.String arg1){
  }
  public boolean hasPermission(UsbDevice arg1){
    return false;
  }
  public boolean hasPermission(UsbAccessory arg1){
    return false;
  }
  @UseRule("UsbManager.getAccessoryList")
  public UsbAccessory [] getAccessoryList(){
    return (UsbAccessory []) null;
  }
  public void requestPermission(UsbDevice arg1, android.app.PendingIntent arg2){
  }
  public void requestPermission(UsbAccessory arg1, android.app.PendingIntent arg2){
  }
  public boolean isFunctionEnabled(java.lang.String arg1){
    return false;
  }
  public java.lang.String getDefaultFunction(){
    return (java.lang.String) null;
  }
}
