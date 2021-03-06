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


public class UsbInterface
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<UsbInterface> CREATOR = null;

  // Constructors

  public UsbInterface(int arg1, int arg2, int arg3, int arg4, android.os.Parcelable [] arg5){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getId(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public UsbEndpoint getEndpoint(int arg1){
    return (UsbEndpoint) null;
  }
  public int getInterfaceClass(){
    return 0;
  }
  public int getInterfaceSubclass(){
    return 0;
  }
  public int getInterfaceProtocol(){
    return 0;
  }
  public int getEndpointCount(){
    return 0;
  }
}
