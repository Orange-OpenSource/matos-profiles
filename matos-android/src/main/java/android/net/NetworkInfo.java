package android.net;

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
public class NetworkInfo
  implements android.os.Parcelable
{
  // Classes

  public static enum State
  {
    // Enum Constants

    CONNECTING()
, CONNECTED()
, SUSPENDED()
, DISCONNECTING()
, DISCONNECTED()
, UNKNOWN()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  public static enum DetailedState
  {
    // Enum Constants

    IDLE()
, SCANNING()
, CONNECTING()
, AUTHENTICATING()
, OBTAINING_IPADDR()
, CONNECTED()
, SUSPENDED()
, DISCONNECTING()
, DISCONNECTED()
, FAILED()
, BLOCKED()
;
    // Fields

    // Constructors

    private DetailedState(){
    }
    // Methods

  }
  // Fields

  public static final android.os.Parcelable.Creator<NetworkInfo> CREATOR = null;

  // Constructors

  public NetworkInfo(int arg1){
  }
  public NetworkInfo(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public NetworkInfo(NetworkInfo arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public NetworkInfo.State getState(){
    return (NetworkInfo.State) null;
  }
  public int getType(){
    return 0;
  }
  public java.lang.String getTypeName(){
    return (java.lang.String) null;
  }
  public boolean isConnected(){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isAvailable(){
    return false;
  }
  public java.lang.String getReason(){
    return (java.lang.String) null;
  }
  public int getSubtype(){
    return 0;
  }
  public boolean isFailover(){
    return false;
  }
  public void setDetailedState(NetworkInfo.DetailedState arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public NetworkInfo.DetailedState getDetailedState(){
    return (NetworkInfo.DetailedState) null;
  }
  public boolean isRoaming(){
    return false;
  }
  public void setIsAvailable(boolean arg1){
  }
  public boolean isConnectedOrConnecting(){
    return false;
  }
  public void setFailover(boolean arg1){
  }
  public java.lang.String getExtraInfo(){
    return (java.lang.String) null;
  }
  public java.lang.String getSubtypeName(){
    return (java.lang.String) null;
  }
}
