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


public class WifiP2pGroup
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<WifiP2pGroup> CREATOR = null;

  // Constructors

  public WifiP2pGroup(){
  }
  public WifiP2pGroup(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public WifiP2pGroup(WifiP2pGroup arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public WifiP2pDevice getOwner(){
    return (WifiP2pDevice) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void addClient(java.lang.String arg1){
  }
  public void addClient(WifiP2pDevice arg1){
  }
  public boolean isGroupOwner(){
    return false;
  }
  public void setInterface(java.lang.String arg1){
  }
  public java.lang.String getInterface(){
    return (java.lang.String) null;
  }
  public boolean removeClient(java.lang.String arg1){
    return false;
  }
  public boolean removeClient(WifiP2pDevice arg1){
    return false;
  }
  public void setNetworkName(java.lang.String arg1){
  }
  public void setOwner(WifiP2pDevice arg1){
  }
  public void setIsGroupOwner(boolean arg1){
  }
  public void setPassphrase(java.lang.String arg1){
  }
  public boolean isClientListEmpty(){
    return false;
  }
  public java.util.Collection<WifiP2pDevice> getClientList(){
    return (java.util.Collection) null;
  }
  public java.lang.String getNetworkName(){
    return (java.lang.String) null;
  }
  public java.lang.String getPassphrase(){
    return (java.lang.String) null;
  }
}
