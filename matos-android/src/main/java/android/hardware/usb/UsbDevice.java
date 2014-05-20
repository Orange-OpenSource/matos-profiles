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


public class UsbDevice
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<UsbDevice> CREATOR = null;

  // Constructors

  public UsbDevice(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, android.os.Parcelable [] arg7){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getDeviceId(){
    return 0;
  }
  public static int getDeviceId(java.lang.String arg1){
    return 0;
  }
  public int getDeviceClass(){
    return 0;
  }
  public UsbInterface getInterface(int arg1){
    return (UsbInterface) null;
  }
  public java.lang.String getDeviceName(){
    return (java.lang.String) null;
  }
  public static java.lang.String getDeviceName(int arg1){
    return (java.lang.String) null;
  }
  public int getVendorId(){
    return 0;
  }
  public int getProductId(){
    return 0;
  }
  public int getDeviceSubclass(){
    return 0;
  }
  public int getDeviceProtocol(){
    return 0;
  }
  public int getInterfaceCount(){
    return 0;
  }
}
