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
public class TelephonyManager
{
  // Fields

  public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";

  public static final java.lang.String EXTRA_STATE = "state";

  public static final java.lang.String EXTRA_STATE_IDLE = null;

  public static final java.lang.String EXTRA_STATE_RINGING = null;

  public static final java.lang.String EXTRA_STATE_OFFHOOK = null;

  public static final java.lang.String EXTRA_INCOMING_NUMBER = "incoming_number";

  public static final int PHONE_TYPE_NONE = 0;

  public static final int PHONE_TYPE_GSM = 1;

  public static final int PHONE_TYPE_CDMA = 2;

  public static final int PHONE_TYPE_SIP = 3;

  public static final int NETWORK_TYPE_UNKNOWN = 0;

  public static final int NETWORK_TYPE_GPRS = 1;

  public static final int NETWORK_TYPE_EDGE = 2;

  public static final int NETWORK_TYPE_UMTS = 3;

  public static final int NETWORK_TYPE_CDMA = 4;

  public static final int NETWORK_TYPE_EVDO_0 = 5;

  public static final int NETWORK_TYPE_EVDO_A = 6;

  public static final int NETWORK_TYPE_1xRTT = 7;

  public static final int NETWORK_TYPE_HSDPA = 8;

  public static final int NETWORK_TYPE_HSUPA = 9;

  public static final int NETWORK_TYPE_HSPA = 10;

  public static final int NETWORK_TYPE_IDEN = 11;

  public static final int NETWORK_TYPE_EVDO_B = 12;

  public static final int NETWORK_TYPE_LTE = 13;

  public static final int NETWORK_TYPE_EHRPD = 14;

  public static final int NETWORK_TYPE_HSPAP = 15;

  public static final int NETWORK_CLASS_UNKNOWN = 0;

  public static final int NETWORK_CLASS_2_G = 1;

  public static final int NETWORK_CLASS_3_G = 2;

  public static final int NETWORK_CLASS_4_G = 3;

  public static final int SIM_STATE_UNKNOWN = 0;

  public static final int SIM_STATE_ABSENT = 1;

  public static final int SIM_STATE_PIN_REQUIRED = 2;

  public static final int SIM_STATE_PUK_REQUIRED = 3;

  public static final int SIM_STATE_NETWORK_LOCKED = 4;

  public static final int SIM_STATE_READY = 5;

  public static final int CALL_STATE_IDLE = 0;

  public static final int CALL_STATE_RINGING = 1;

  public static final int CALL_STATE_OFFHOOK = 2;

  public static final int DATA_ACTIVITY_NONE = 0;

  public static final int DATA_ACTIVITY_IN = 1;

  public static final int DATA_ACTIVITY_OUT = 2;

  public static final int DATA_ACTIVITY_INOUT = 3;

  public static final int DATA_ACTIVITY_DORMANT = 4;

  public static final int DATA_UNKNOWN = -1;

  public static final int DATA_DISCONNECTED = 0;

  public static final int DATA_CONNECTING = 1;

  public static final int DATA_CONNECTED = 2;

  public static final int DATA_SUSPENDED = 3;

  // Constructors

  public TelephonyManager(android.content.Context arg1){
  }
  private TelephonyManager(){
  }
  // Methods

  public static TelephonyManager getDefault(){
    return (TelephonyManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "TelephonyManager.listen", pos = {1, 2}, report = "-")
  public void listen(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.telephonyPhoneStateListener.onPhoneStateChange") PhoneStateListener arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getVoiceMailNumber", report = "-")
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public int getVoiceMessageCount(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSimState", report = "-")
  public int getSimState(){
    return 0;
  }
  public int getLteOnCdmaMode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getDeviceId", report = "-")
  public java.lang.String getDeviceId(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSuscriberId", report = "-")
  public java.lang.String getSubscriberId(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getLine1Number", report = "-")
  public java.lang.String getLine1Number(){
    return (java.lang.String) null;
  }
  public java.lang.String getLine1AlphaTag(){
    return (java.lang.String) null;
  }
  public void enableLocationUpdates(){
  }
  public void disableLocationUpdates(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getCellLocation", report = "-")
  public CellLocation getCellLocation(){
    return (CellLocation) null;
  }
  public int getPhoneType(){
    return 0;
  }
  public int getCdmaEriIconIndex(){
    return 0;
  }
  public int getCdmaEriIconMode(){
    return 0;
  }
  public java.lang.String getCdmaEriText(){
    return (java.lang.String) null;
  }
  public java.lang.String getMsisdn(){
    return (java.lang.String) null;
  }
  public java.lang.String getIsimImpi(){
    return (java.lang.String) null;
  }
  public java.lang.String getIsimDomain(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getIsimImpu(){
    return (java.lang.String []) null;
  }
  public java.lang.String getCompleteVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public int getNetworkType(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getNeighbouringCellInfo", report = "-")
  public java.util.List<NeighboringCellInfo> getNeighboringCellInfo(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getCallState", report = "-")
  public int getCallState(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getDataActivity", report = "-")
  public int getDataActivity(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getDataState", report = "-")
  public int getDataState(){
    return 0;
  }
  public boolean hasIccCard(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getNetworkCountryIso", report = "-")
  public java.lang.String getNetworkCountryIso(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSimCountryIso", report = "-")
  public java.lang.String getSimCountryIso(){
    return (java.lang.String) null;
  }
  public static int getNetworkClass(int arg1){
    return 0;
  }
  public java.lang.String getDeviceSoftwareVersion(){
    return (java.lang.String) null;
  }
  public int getCurrentPhoneType(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getNetworkOperatorName", report = "-")
  public java.lang.String getNetworkOperatorName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getNetworkOperator", report = "-")
  public java.lang.String getNetworkOperator(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.isNetworkRoaming", report = "-")
  public boolean isNetworkRoaming(){
    return false;
  }
  public java.lang.String getNetworkTypeName(){
    return (java.lang.String) null;
  }
  public static java.lang.String getNetworkTypeName(int arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSimOperator", report = "-")
  public java.lang.String getSimOperator(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSimOperatorName", report = "-")
  public java.lang.String getSimOperatorName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "TelephonyManager.getSimSerialNumber", report = "-")
  public java.lang.String getSimSerialNumber(){
    return (java.lang.String) null;
  }
  public boolean isVoiceCapable(){
    return false;
  }
  public boolean isSmsCapable(){
    return false;
  }
}
