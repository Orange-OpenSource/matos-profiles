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
public abstract class DataConnectionTracker
  extends android.os.Handler{
  // Classes

  public static enum State
  {
    // Enum Constants

    IDLE()
, INITING()
, CONNECTING()
, SCANNING()
, CONNECTED()
, DISCONNECTING()
, FAILED()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  public static enum Activity
  {
    // Enum Constants

    NONE()
, DATAIN()
, DATAOUT()
, DATAINANDOUT()
, DORMANT()
;
    // Fields

    // Constructors

    private Activity(){
    }
    // Methods

  }
  // Fields

  protected static final boolean DBG = false;

  public static java.lang.String ACTION_DATA_CONNECTION_TRACKER_MESSENGER;

  public static java.lang.String EXTRA_MESSENGER;

  protected static final int BASE = 0;

  protected static final int EVENT_DATA_SETUP_COMPLETE = 0;

  protected static final int EVENT_RADIO_AVAILABLE = 0;

  protected static final int EVENT_RECORDS_LOADED = 0;

  protected static final int EVENT_TRY_SETUP_DATA = 0;

  protected static final int EVENT_DATA_STATE_CHANGED = 0;

  protected static final int EVENT_POLL_PDP = 0;

  protected static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 0;

  protected static final int EVENT_VOICE_CALL_STARTED = 0;

  protected static final int EVENT_VOICE_CALL_ENDED = 0;

  protected static final int EVENT_DATA_CONNECTION_DETACHED = 0;

  protected static final int EVENT_LINK_STATE_CHANGED = 0;

  protected static final int EVENT_ROAMING_ON = 0;

  protected static final int EVENT_ROAMING_OFF = 0;

  protected static final int EVENT_ENABLE_NEW_APN = 0;

  protected static final int EVENT_RESTORE_DEFAULT_APN = 0;

  protected static final int EVENT_DISCONNECT_DONE = 0;

  protected static final int EVENT_DATA_CONNECTION_ATTACHED = 0;

  protected static final int EVENT_START_NETSTAT_POLL = 0;

  protected static final int EVENT_START_RECOVERY = 0;

  protected static final int EVENT_APN_CHANGED = 0;

  protected static final int EVENT_CDMA_DATA_DETACHED = 0;

  protected static final int EVENT_NV_READY = 0;

  protected static final int EVENT_PS_RESTRICT_ENABLED = 0;

  protected static final int EVENT_PS_RESTRICT_DISABLED = 0;

  public static final int EVENT_CLEAN_UP_CONNECTION = 270360;

  protected static final int EVENT_CDMA_OTA_PROVISION = 0;

  protected static final int EVENT_RESTART_RADIO = 0;

  protected static final int EVENT_SET_INTERNAL_DATA_ENABLE = 0;

  protected static final int EVENT_RESET_DONE = 0;

  public static final int CMD_SET_USER_DATA_ENABLE = 270365;

  public static final int EVENT_CLEAN_UP_ALL_CONNECTIONS = 270366;

  public static final int CMD_SET_DEPENDENCY_MET = 270367;

  public static final int CMD_SET_POLICY_DATA_ENABLE = 270368;

  protected static final int APN_INVALID_ID = 0;

  protected static final int APN_DEFAULT_ID = 0;

  protected static final int APN_MMS_ID = 0;

  protected static final int APN_SUPL_ID = 0;

  protected static final int APN_DUN_ID = 0;

  protected static final int APN_HIPRI_ID = 0;

  protected static final int APN_IMS_ID = 0;

  protected static final int APN_FOTA_ID = 0;

  protected static final int APN_CBS_ID = 0;

  protected static final int APN_NUM_TYPES = 0;

  public static final int DISABLED = 0;

  public static final int ENABLED = 1;

  public static final java.lang.String APN_TYPE_KEY = "apnType";

  protected static final int APN_DELAY_MILLIS = 0;

  protected java.lang.Object mDataEnabledLock;

  protected boolean mInternalDataEnabled;

  protected boolean mUserDataEnabled;

  protected boolean mPolicyDataEnabled;

  protected java.lang.String mRequestedApnType;

  protected static final java.lang.String DEFAULT_DATA_RETRY_CONFIG = (java.lang.String) null;

  protected static final java.lang.String SECONDARY_DATA_RETRY_CONFIG = (java.lang.String) null;

  protected static final int POLL_NETSTAT_SLOW_MILLIS = 0;

  protected static final int DEFAULT_MAX_PDP_RESET_FAIL = 0;

  protected static final int NO_RECV_POLL_LIMIT = 0;

  protected static final int POLL_NETSTAT_MILLIS = 0;

  protected static final int POLL_NETSTAT_SCREEN_OFF_MILLIS = 0;

  protected static final int POLL_LONGEST_RTT = 0;

  protected static final int NUMBER_SENT_PACKETS_OF_HANG = 0;

  protected static final int RESTORE_DEFAULT_APN_DELAY = 0;

  protected static final java.lang.String APN_RESTORE_DELAY_PROP_NAME = (java.lang.String) null;

  protected static final java.lang.String NULL_IP = (java.lang.String) null;

  protected static final java.lang.String INTENT_RECONNECT_ALARM_EXTRA_REASON = (java.lang.String) null;

  protected static final java.lang.String INTENT_SET_FAIL_DATA_SETUP_COUNTER = (java.lang.String) null;

  protected static final java.lang.String FAIL_DATA_SETUP_COUNTER = (java.lang.String) null;

  protected int mFailDataSetupCounter;

  protected static final java.lang.String FAIL_DATA_SETUP_FAIL_CAUSE = (java.lang.String) null;

  protected DataConnection.FailCause mFailDataSetupFailCause;

  protected static final java.lang.String DEFALUT_DATA_ON_BOOT_PROP = (java.lang.String) null;

  protected PhoneBase mPhone;

  protected DataConnectionTracker.Activity mActivity;

  protected DataConnectionTracker.State mState;

  protected android.os.Handler mDataConnectionTracker;

  protected long mTxPkts;

  protected long mRxPkts;

  protected long mSentSinceLastRecv;

  protected int mNetStatPollPeriod;

  protected int mNoRecvPollCount;

  protected boolean mNetStatPollEnabled;

  protected boolean mIsWifiConnected;

  protected android.app.PendingIntent mReconnectIntent;

  protected int mCidActive;

  protected boolean mAutoAttachOnCreation;

  protected boolean mIsScreenOn;

  protected java.util.concurrent.atomic.AtomicInteger mUniqueIdGenerator;

  protected java.util.HashMap<java.lang.Integer, DataConnection> mDataConnections;

  protected java.util.HashMap<java.lang.Integer, DataConnectionAc> mDataConnectionAsyncChannels;

  protected java.util.HashMap<java.lang.String, java.lang.Integer> mApnToDataConnectionId;

  protected java.util.concurrent.ConcurrentHashMap<java.lang.String, ApnContext> mApnContexts;

  protected ApnSetting mActiveApn;

  protected java.util.ArrayList<ApnSetting> mAllApns;

  protected ApnSetting mPreferredApn;

  protected boolean mIsPsRestricted;

  protected boolean mIsDisposed;

  protected android.content.BroadcastReceiver mIntentReceiver;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected DataConnectionTracker(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mPhone") PhoneBase arg1){
    super();
  }
  // Methods

  protected abstract void log(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mState")
  public abstract DataConnectionTracker.State getState(java.lang.String arg1);
  protected abstract void setState(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mState") DataConnectionTracker.State arg1);
  protected abstract void loge(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mActivity")
  public DataConnectionTracker.Activity getActivity(){
    return (DataConnectionTracker.Activity) null;
  }
  protected void setEnabled(int arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRadioOffOrNotAvailable();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRadioAvailable();
  protected android.net.LinkProperties getLinkProperties(java.lang.String arg1){
    return (android.net.LinkProperties) null;
  }
  protected void notifyDataConnection(java.lang.String arg1){
  }
  public java.lang.String [] getActiveApnTypes(){
    return (java.lang.String []) null;
  }
  protected android.net.LinkCapabilities getLinkCapabilities(java.lang.String arg1){
    return (android.net.LinkCapabilities) null;
  }
  public synchronized int enableApnType(java.lang.String arg1){
    return 0;
  }
  public synchronized int disableApnType(java.lang.String arg1){
    return 0;
  }
  public abstract boolean isDisconnected();
  protected abstract boolean isDataPossible(java.lang.String arg1);
  protected abstract java.lang.String getActionIntentReconnectAlarm();
  protected abstract boolean isApnTypeAvailable(java.lang.String arg1);
  protected abstract boolean isDataAllowed();
  protected abstract void startNetStatPoll();
  protected abstract void stopNetStatPoll();
  protected abstract void restartRadio();
  protected abstract void gotoIdleAndNotifyDataConnection(java.lang.String arg1);
  protected void onEnableNewApn(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract boolean onTrySetupData(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRoamingOff();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRoamingOn();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onDataSetupComplete(android.os.AsyncResult arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onDisconnectDone(int arg1, android.os.AsyncResult arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onVoiceCallStarted();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onVoiceCallEnded();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onCleanUpConnection(boolean arg1, int arg2, java.lang.String arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onCleanUpAllConnections(java.lang.String arg1);
  public void cleanUpAllConnections(java.lang.String arg1){
  }
  public java.lang.String getActiveApnString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected void broadcastMessenger(){
  }
  public boolean getDataOnRoamingEnabled(){
    return false;
  }
  public boolean getAnyDataEnabled(){
    return false;
  }
  protected void notifyOffApnsOfAvailability(java.lang.String arg1){
  }
  protected boolean isEmergency(){
    return false;
  }
  protected boolean isDataSetupCompleteOk(android.os.AsyncResult arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onActionIntentReconnectAlarm(android.content.Intent arg1){
  }
  public boolean isApnTypeActive(java.lang.String arg1){
    return false;
  }
  protected ApnSetting fetchDunApn(){
    return (ApnSetting) null;
  }
  public void setDataOnRoamingEnabled(boolean arg1){
  }
  protected int apnTypeToId(java.lang.String arg1){
    return 0;
  }
  protected java.lang.String apnIdToType(int arg1){
    return (java.lang.String) null;
  }
  public boolean isApnTypeEnabled(java.lang.String arg1){
    return false;
  }
  protected synchronized boolean isApnIdEnabled(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onEnableApn(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onResetDone(android.os.AsyncResult arg1){
  }
  public boolean setInternalDataEnabled(boolean arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetInternalDataEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetUserDataEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetDependencyMet(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetPolicyDataEnabled(boolean arg1){
  }
  protected java.lang.String getReryConfig(boolean arg1){
    return (java.lang.String) null;
  }
  protected void resetAllRetryCounts(){
  }
}
