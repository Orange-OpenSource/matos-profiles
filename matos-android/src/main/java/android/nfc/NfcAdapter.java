package android.nfc;

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


public final class NfcAdapter
{
  // Classes

  public static interface OnNdefPushCompleteCallback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnNdefPushCompleteCallback")
    public void onNdefPushComplete(NfcEvent arg1);
  }
  public static interface CreateNdefMessageCallback
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("CreateNdefMessageCallback")
    public NdefMessage createNdefMessage(NfcEvent arg1);
  }
  @java.lang.Deprecated
  public static interface NdefPushCallback
  {
    // Methods

    @java.lang.Deprecated
    @com.francetelecom.rd.stubs.annotation.CallBack("NdefPushCallback")
    public NdefMessage createMessage();
    @java.lang.Deprecated
    @com.francetelecom.rd.stubs.annotation.CallBack("NdefPushCallback")
    public void onMessagePushed();
  }
  // Fields

  public static final java.lang.String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";

  public static final java.lang.String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";

  public static final java.lang.String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";

  public static final java.lang.String ACTION_TAG_LEFT_FIELD = "android.nfc.action.TAG_LOST";

  public static final java.lang.String EXTRA_TAG = "android.nfc.extra.TAG";

  public static final java.lang.String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";

  public static final java.lang.String EXTRA_ID = "android.nfc.extra.ID";

  public static final java.lang.String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";

  public static final java.lang.String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";

  public static final int STATE_OFF = 1;

  public static final int STATE_TURNING_ON = 2;

  public static final int STATE_ON = 3;

  public static final int STATE_TURNING_OFF = 4;

  // Constructors

  NfcAdapter(){
  }
  // Methods

  public boolean disable(){
    return false;
  }
  public boolean enable(){
    return false;
  }
  public INfcAdapter getService(){
    return (INfcAdapter) null;
  }
  public boolean isEnabled(){
    return false;
  }
  public INfcTag getTagService(){
    return (INfcTag) null;
  }
  public static NfcAdapter getDefaultAdapter(android.content.Context arg1){
    return (NfcAdapter) null;
  }
  public static NfcAdapter getDefaultAdapter(){
    return (NfcAdapter) null;
  }
  public void attemptDeadServiceRecovery(java.lang.Exception arg1){
  }
  public int getAdapterState(){
    return 0;
  }
  public void setNdefPushMessage(NdefMessage arg1, android.app.Activity arg2, android.app.Activity [] arg3){
  }
  public void setNdefPushMessageCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("CreateNdefMessageCallback") NfcAdapter.CreateNdefMessageCallback arg1, android.app.Activity arg2, android.app.Activity [] arg3){
  }
  public void setOnNdefPushCompleteCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnNdefPushCompleteCallback") NfcAdapter.OnNdefPushCompleteCallback arg1, android.app.Activity arg2, android.app.Activity [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "NfcAdapter.enableForegroundDispatch", pos = {1, 2, 3, 4}, report = "-")
  public void enableForegroundDispatch(android.app.Activity arg1, android.app.PendingIntent arg2, android.content.IntentFilter [] arg3, java.lang.String [] [] arg4){
  }
  public void disableForegroundDispatch(android.app.Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "NfcAdapter.enableForegroundNdefPush", pos = 1, report = "-")
  public void enableForegroundNdefPush(android.app.Activity arg1, NdefMessage arg2){
  }
  @java.lang.Deprecated
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "NfcAdapter.enableForegroundNdefPush-2", pos = 1, report = "-")
  public void enableForegroundNdefPush(android.app.Activity arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("NdefPushCallback") NfcAdapter.NdefPushCallback arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "NfcAdapter.disableForegroundNdefPush", pos = 1, report = "-")
  public void disableForegroundNdefPush(android.app.Activity arg1){
  }
  public boolean enableNdefPush(){
    return false;
  }
  public boolean disableNdefPush(){
    return false;
  }
  public boolean isNdefPushEnabled(){
    return false;
  }
  public INfcAdapterExtras getNfcAdapterExtrasInterface(){
    return (INfcAdapterExtras) null;
  }
}
