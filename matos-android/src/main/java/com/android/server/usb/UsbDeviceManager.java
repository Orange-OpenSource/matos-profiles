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


public class UsbDeviceManager
{
  // Constructors

  public UsbDeviceManager(){
  }
  // Methods

  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2){
  }
  public void systemReady(){
  }
  public android.hardware.usb.UsbAccessory getCurrentAccessory(){
    return (android.hardware.usb.UsbAccessory) null;
  }
  public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
  public void setCurrentFunction(java.lang.String arg1, boolean arg2){
  }
  public void setMassStorageBackingFile(java.lang.String arg1){
  }
}
