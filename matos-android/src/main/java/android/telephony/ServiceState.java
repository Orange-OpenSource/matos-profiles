package android.telephony;

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
public class ServiceState
  implements android.os.Parcelable
{
  // Fields

  public static final int STATE_IN_SERVICE = 0;

  public static final int STATE_OUT_OF_SERVICE = 1;

  public static final int STATE_EMERGENCY_ONLY = 2;

  public static final int STATE_POWER_OFF = 3;

  public static final int RADIO_TECHNOLOGY_UNKNOWN = 0;

  public static final int RADIO_TECHNOLOGY_GPRS = 1;

  public static final int RADIO_TECHNOLOGY_EDGE = 2;

  public static final int RADIO_TECHNOLOGY_UMTS = 3;

  public static final int RADIO_TECHNOLOGY_IS95A = 4;

  public static final int RADIO_TECHNOLOGY_IS95B = 5;

  public static final int RADIO_TECHNOLOGY_1xRTT = 6;

  public static final int RADIO_TECHNOLOGY_EVDO_0 = 7;

  public static final int RADIO_TECHNOLOGY_EVDO_A = 8;

  public static final int RADIO_TECHNOLOGY_HSDPA = 9;

  public static final int RADIO_TECHNOLOGY_HSUPA = 10;

  public static final int RADIO_TECHNOLOGY_HSPA = 11;

  public static final int RADIO_TECHNOLOGY_EVDO_B = 12;

  public static final int RADIO_TECHNOLOGY_EHRPD = 13;

  public static final int RADIO_TECHNOLOGY_LTE = 14;

  public static final int RADIO_TECHNOLOGY_HSPAP = 15;

  public static final int REGISTRATION_STATE_NOT_REGISTERED_AND_NOT_SEARCHING = 0;

  public static final int REGISTRATION_STATE_HOME_NETWORK = 1;

  public static final int REGISTRATION_STATE_NOT_REGISTERED_AND_SEARCHING = 2;

  public static final int REGISTRATION_STATE_REGISTRATION_DENIED = 3;

  public static final int REGISTRATION_STATE_UNKNOWN = 4;

  public static final int REGISTRATION_STATE_ROAMING = 5;

  public static final android.os.Parcelable.Creator<ServiceState> CREATOR = null;

  // Constructors

  public ServiceState(){
  }
  public ServiceState(ServiceState arg1){
  }
  public ServiceState(android.os.Parcel arg1){
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
  public int getState(){
    return 0;
  }
  public void setState(int arg1){
  }
  public int getSystemId(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.String getOperatorNumeric(){
    return (java.lang.String) null;
  }
  public int getCdmaEriIconIndex(){
    return 0;
  }
  public int getCdmaEriIconMode(){
    return 0;
  }
  protected void copyFrom(ServiceState arg1){
  }
  public static ServiceState newFromBundle(android.os.Bundle arg1){
    return (ServiceState) null;
  }
  public void fillInNotifierBundle(android.os.Bundle arg1){
  }
  public int getRadioTechnology(){
    return 0;
  }
  public int getNetworkId(){
    return 0;
  }
  public boolean getRoaming(){
    return false;
  }
  public void setRadioTechnology(int arg1){
  }
  public void setStateOutOfService(){
  }
  public void setStateOff(){
  }
  public static java.lang.String radioTechnologyToString(int arg1){
    return (java.lang.String) null;
  }
  public void setOperatorAlphaLong(java.lang.String arg1){
  }
  public java.lang.String getOperatorAlphaLong(){
    return (java.lang.String) null;
  }
  public void setCssIndicator(int arg1){
  }
  public void setSystemAndNetworkId(int arg1, int arg2){
  }
  public void setOperatorName(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void setRoaming(boolean arg1){
  }
  public void setCdmaDefaultRoamingIndicator(int arg1){
  }
  public void setCdmaRoamingIndicator(int arg1){
  }
  public int getCdmaRoamingIndicator(){
    return 0;
  }
  public void setCdmaEriIconIndex(int arg1){
  }
  public void setCdmaEriIconMode(int arg1){
  }
  public java.lang.String getOperatorAlphaShort(){
    return (java.lang.String) null;
  }
  public boolean isEmergencyOnly(){
    return false;
  }
  public int getCdmaDefaultRoamingIndicator(){
    return 0;
  }
  public boolean getIsManualSelection(){
    return false;
  }
  public void setEmergencyOnly(boolean arg1){
  }
  public void setIsManualSelection(boolean arg1){
  }
  public int getCssIndicator(){
    return 0;
  }
}
