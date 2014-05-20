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
public abstract class IccCard
{
  // Classes

  public static enum State
  {
    // Enum Constants

    UNKNOWN()
, ABSENT()
, PIN_REQUIRED()
, PUK_REQUIRED()
, NETWORK_LOCKED()
, READY()
, NOT_READY()
, PERM_DISABLED()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

    public boolean isPinLocked(){
      return false;
    }
    public boolean iccCardExist(){
      return false;
    }
  }
  // Fields

  protected java.lang.String mLogTag;

  protected boolean mDbg;

  protected IccCard.State mState;

  protected PhoneBase mPhone;

  public static final java.lang.String INTENT_KEY_ICC_STATE = "ss";

  public static final java.lang.String INTENT_VALUE_ICC_NOT_READY = "NOT_READY";

  public static final java.lang.String INTENT_VALUE_ICC_ABSENT = "ABSENT";

  public static final java.lang.String INTENT_VALUE_ICC_LOCKED = "LOCKED";

  public static final java.lang.String INTENT_VALUE_ICC_READY = "READY";

  public static final java.lang.String INTENT_VALUE_ICC_IMSI = "IMSI";

  public static final java.lang.String INTENT_VALUE_ICC_LOADED = "LOADED";

  public static final java.lang.String INTENT_KEY_LOCKED_REASON = "reason";

  public static final java.lang.String INTENT_VALUE_LOCKED_ON_PIN = "PIN";

  public static final java.lang.String INTENT_VALUE_LOCKED_ON_PUK = "PUK";

  public static final java.lang.String INTENT_VALUE_LOCKED_NETWORK = "NETWORK";

  public static final java.lang.String INTENT_VALUE_ABSENT_ON_PERM_DISABLED = "PERM_DISABLED";

  protected static final int EVENT_ICC_LOCKED_OR_ABSENT = 0;

  protected static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 0;

  protected static final int EVENT_ICC_READY = 0;

  protected android.os.Handler mHandler;

  // Constructors

  public IccCard(PhoneBase arg1, java.lang.String arg2, java.lang.Boolean arg3){
  }
  // Methods

  protected void finalize(){
  }
  public IccCard.State getState(){
    return (IccCard.State) null;
  }
  public void dispose(){
  }
  public abstract java.lang.String getServiceProviderName();
  public void supplyNetworkDepersonalization(java.lang.String arg1, android.os.Message arg2){
  }
  public void supplyPuk(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void supplyPin(java.lang.String arg1, android.os.Message arg2){
  }
  public boolean hasIccCard(){
    return false;
  }
  public void broadcastIccStateChangedIntent(java.lang.String arg1, java.lang.String arg2){
  }
  public boolean isApplicationOnIcc(IccCardApplication.AppType arg1){
    return false;
  }
  public void registerForAbsent( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForAbsent(android.os.Handler arg1){
  }
  public void registerForNetworkLocked( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNetworkLocked(android.os.Handler arg1){
  }
  public void registerForLocked( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForLocked(android.os.Handler arg1){
  }
  public void supplyPin2(java.lang.String arg1, android.os.Message arg2){
  }
  public void supplyPuk2(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public boolean getIccLockEnabled(){
    return false;
  }
  public boolean getIccFdnEnabled(){
    return false;
  }
  public void setIccLockEnabled(boolean arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void setIccFdnEnabled(boolean arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void changeIccLockPassword(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void changeIccFdnPassword(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  protected void updateStateProperty(){
  }
  public IccCard.State getIccCardState(){
    return (IccCard.State) null;
  }
}
