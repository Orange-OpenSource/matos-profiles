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


public class WifiP2pConfig
  implements android.os.Parcelable
{
  // Classes

  public static enum Persist
  {
    // Enum Constants

    SYSTEM_DEFAULT()
, YES()
, NO()
;
    // Fields

    // Constructors

    private Persist(){
    }
    // Methods

  }
  // Fields

  public java.lang.String deviceAddress;

  public android.net.wifi.WpsInfo wps;

  public int groupOwnerIntent;

  public WifiP2pConfig.Persist persist;

  public static final android.os.Parcelable.Creator<WifiP2pConfig> CREATOR = null;

  // Constructors

  public WifiP2pConfig(){
  }
  public WifiP2pConfig(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public WifiP2pConfig(WifiP2pConfig arg1){
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
