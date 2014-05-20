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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class WifiInfo
  implements android.os.Parcelable
{
  // Fields

  public static final java.lang.String LINK_SPEED_UNITS = "Mbps";

  public static final android.os.Parcelable.Creator<WifiInfo> CREATOR = null;

  // Constructors

  WifiInfo(){
  }
  public WifiInfo(WifiInfo arg1){
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
  public int getIpAddress(){
    return 0;
  }
  public int getNetworkId(){
    return 0;
  }
  public void setExplicitConnect(boolean arg1){
  }
  public java.lang.String getSSID(){
    return (java.lang.String) null;
  }
  public java.lang.String getBSSID(){
    return (java.lang.String) null;
  }
  public int getRssi(){
    return 0;
  }
  public int getLinkSpeed(){
    return 0;
  }
  public java.lang.String getMacAddress(){
    return (java.lang.String) null;
  }
  public boolean isExplicitConnect(){
    return false;
  }
  public SupplicantState getSupplicantState(){
    return (SupplicantState) null;
  }
  public boolean getHiddenSSID(){
    return false;
  }
  public void setHiddenSSID(boolean arg1){
  }
  public static android.net.NetworkInfo.DetailedState getDetailedStateOf(SupplicantState arg1){
    return (android.net.NetworkInfo.DetailedState) null;
  }
}
