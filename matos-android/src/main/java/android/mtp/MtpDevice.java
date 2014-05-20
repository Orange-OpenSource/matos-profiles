package android.mtp;

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


public final class MtpDevice
{
  // Constructors

  public MtpDevice(android.hardware.usb.UsbDevice arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public byte [] getObject(int arg1, int arg2){
    return (byte []) null;
  }
  public long getParent(int arg1){
    return 0l;
  }
  public void close(){
  }
  public boolean open(android.hardware.usb.UsbDeviceConnection arg1){
    return false;
  }
  public byte [] getThumbnail(int arg1){
    return (byte []) null;
  }
  public int getDeviceId(){
    return 0;
  }
  public long getStorageId(int arg1){
    return 0l;
  }
  public MtpObjectInfo getObjectInfo(int arg1){
    return (MtpObjectInfo) null;
  }
  public java.lang.String getDeviceName(){
    return (java.lang.String) null;
  }
  public MtpDeviceInfo getDeviceInfo(){
    return (MtpDeviceInfo) null;
  }
  public int [] getStorageIds(){
    return (int []) null;
  }
  public int [] getObjectHandles(int arg1, int arg2, int arg3){
    return (int []) null;
  }
  public MtpStorageInfo getStorageInfo(int arg1){
    return (MtpStorageInfo) null;
  }
  public boolean deleteObject(int arg1){
    return false;
  }
  public boolean importFile(int arg1, java.lang.String arg2){
    return false;
  }
}
