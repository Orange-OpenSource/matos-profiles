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
public class PhoneStateListener
{
  // Fields

  public static final int LISTEN_NONE = 0;

  public static final int LISTEN_SERVICE_STATE = 1;

  public static final int LISTEN_SIGNAL_STRENGTH = 2;

  public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;

  public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;

  public static final int LISTEN_CELL_LOCATION = 16;

  public static final int LISTEN_CALL_STATE = 32;

  public static final int LISTEN_DATA_CONNECTION_STATE = 64;

  public static final int LISTEN_DATA_ACTIVITY = 128;

  public static final int LISTEN_SIGNAL_STRENGTHS = 256;

  public static final int LISTEN_OTASP_CHANGED = 512;

  // Constructors

  public PhoneStateListener(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onServiceStateChanged(ServiceState arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onSignalStrengthChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onMessageWaitingIndicatorChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onCallForwardingIndicatorChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onCellLocationChanged(CellLocation arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onCallStateChanged(int arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onDataConnectionStateChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onDataConnectionStateChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onDataActivity(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onSignalStrengthsChanged(SignalStrength arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onPhoneStateChange")
  public void onOtaspChanged(int arg1){
  }
}
