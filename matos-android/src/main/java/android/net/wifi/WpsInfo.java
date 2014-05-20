package android.net.wifi;

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


public class WpsInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int PBC = 0;

  public static final int DISPLAY = 1;

  public static final int KEYPAD = 2;

  public static final int LABEL = 3;

  public static final int INVALID = 4;

  public int setup;

  public java.lang.String BSSID;

  public java.lang.String pin;

  public WifiConfiguration.IpAssignment ipAssignment;

  public WifiConfiguration.ProxySettings proxySettings;

  public android.net.LinkProperties linkProperties;

  public static final android.os.Parcelable.Creator<WpsInfo> CREATOR = null;

  // Constructors

  public WpsInfo(){
  }
  public WpsInfo(WpsInfo arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
