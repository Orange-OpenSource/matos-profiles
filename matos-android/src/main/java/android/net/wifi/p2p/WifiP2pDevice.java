package android.net.wifi.p2p;

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


public class WifiP2pDevice
  implements android.os.Parcelable
{
  // Fields

  public java.lang.String deviceName;

  public java.lang.String deviceAddress;

  public java.lang.String interfaceAddress;

  public java.lang.String primaryDeviceType;

  public java.lang.String secondaryDeviceType;

  public int wpsConfigMethodsSupported;

  public int deviceCapability;

  public int groupCapability;

  public static final int CONNECTED = 0;

  public static final int INVITED = 1;

  public static final int FAILED = 2;

  public static final int AVAILABLE = 3;

  public static final int UNAVAILABLE = 4;

  public int status;

  public static final android.os.Parcelable.Creator<WifiP2pDevice> CREATOR = null;

  // Constructors

  public WifiP2pDevice(){
  }
  public WifiP2pDevice(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public WifiP2pDevice(WifiP2pDevice arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isGroupOwner(){
    return false;
  }
  public boolean wpsPbcSupported(){
    return false;
  }
  public boolean wpsKeypadSupported(){
    return false;
  }
  public boolean wpsDisplaySupported(){
    return false;
  }
  public boolean isServiceDiscoveryCapable(){
    return false;
  }
}
