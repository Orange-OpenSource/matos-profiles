package com.android.internal.telephony;

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
public class EventLogTags
{
  // Fields

  public static final int PDP_BAD_DNS_ADDRESS = 50100;

  public static final int PDP_RADIO_RESET_COUNTDOWN_TRIGGERED = 50101;

  public static final int PDP_RADIO_RESET = 50102;

  public static final int PDP_CONTEXT_RESET = 50103;

  public static final int PDP_REREGISTER_NETWORK = 50104;

  public static final int PDP_SETUP_FAIL = 50105;

  public static final int CALL_DROP = 50106;

  public static final int DATA_NETWORK_REGISTRATION_FAIL = 50107;

  public static final int DATA_NETWORK_STATUS_ON_RADIO_OFF = 50108;

  public static final int PDP_NETWORK_DROP = 50109;

  public static final int CDMA_DATA_SETUP_FAILED = 50110;

  public static final int CDMA_DATA_DROP = 50111;

  public static final int GSM_RAT_SWITCHED = 50112;

  public static final int GSM_DATA_STATE_CHANGE = 50113;

  public static final int GSM_SERVICE_STATE_CHANGE = 50114;

  public static final int CDMA_DATA_STATE_CHANGE = 50115;

  public static final int CDMA_SERVICE_STATE_CHANGE = 50116;

  public static final int BAD_IP_ADDRESS = 50117;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writePdpBadDnsAddress(java.lang.String arg1){
  }
  public static void writePdpRadioResetCountdownTriggered(int arg1){
  }
  public static void writePdpRadioReset(int arg1){
  }
  public static void writePdpContextReset(int arg1){
  }
  public static void writePdpReregisterNetwork(int arg1){
  }
  public static void writePdpSetupFail(int arg1, int arg2, int arg3){
  }
  public static void writeCallDrop(int arg1, int arg2, int arg3){
  }
  public static void writeDataNetworkRegistrationFail(int arg1, int arg2){
  }
  public static void writeDataNetworkStatusOnRadioOff(java.lang.String arg1, int arg2){
  }
  public static void writePdpNetworkDrop(int arg1, int arg2){
  }
  public static void writeCdmaDataSetupFailed(int arg1, int arg2, int arg3){
  }
  public static void writeCdmaDataDrop(int arg1, int arg2){
  }
  public static void writeGsmRatSwitched(int arg1, int arg2, int arg3){
  }
  public static void writeGsmDataStateChange(java.lang.String arg1, java.lang.String arg2){
  }
  public static void writeGsmServiceStateChange(int arg1, int arg2, int arg3, int arg4){
  }
  public static void writeCdmaDataStateChange(java.lang.String arg1, java.lang.String arg2){
  }
  public static void writeCdmaServiceStateChange(int arg1, int arg2, int arg3, int arg4){
  }
  public static void writeBadIpAddress(java.lang.String arg1){
  }
}
