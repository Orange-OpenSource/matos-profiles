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
public abstract class IccRecords
  extends android.os.Handler  implements IccConstants
{
  // Classes

  public static interface IccRecordLoaded
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("IccRecordLoaded")
    public void onRecordLoaded(android.os.AsyncResult arg1);
    public java.lang.String getEfName();
  }
  // Fields

  protected static final boolean DBG = false;

  protected PhoneBase phone;

  protected android.os.RegistrantList recordsLoadedRegistrants;

  protected int recordsToLoad;

  protected AdnRecordCache adnCache;

  protected boolean recordsRequested;

  public java.lang.String iccid;

  protected java.lang.String msisdn;

  protected java.lang.String msisdnTag;

  protected java.lang.String voiceMailNum;

  protected java.lang.String voiceMailTag;

  protected java.lang.String newVoiceMailNum;

  protected java.lang.String newVoiceMailTag;

  protected boolean isVoiceMailFixed;

  protected int countVoiceMessages;

  protected int mncLength;

  protected int mailboxIndex;

  protected java.lang.String spn;

  protected int spnDisplayCondition;

  protected static final int UNINITIALIZED = 0;

  protected static final int UNKNOWN = 0;

  protected static final int SPN_RULE_SHOW_SPN = 0;

  protected static final int SPN_RULE_SHOW_PLMN = 0;

  protected static final int EVENT_SET_MSISDN_DONE = 0;

  public static final int EVENT_GET_ICC_RECORD_DONE = 100;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public IccRecords(@com.francetelecom.rd.stubs.annotation.FieldSet("this.phone") PhoneBase arg1){
    super();
  }
  // Methods

  protected abstract void log(java.lang.String arg1);
  protected abstract void loge(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("handleMessage")
  public void handleMessage(android.os.Message arg1){
  }
  public abstract void dispose();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRadioOffOrNotAvailable();
  public AdnRecordCache getAdnCache(){
    return (AdnRecordCache) null;
  }
  public void registerForRecordsLoaded( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRecordsLoaded(android.os.Handler arg1){
  }
  public java.lang.String getIMSI(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("msisdn")
  public java.lang.String getMsisdnNumber(){
    return (java.lang.String) null;
  }
  public void setMsisdnNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("this.msisdnTag") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.msisdn") java.lang.String arg2, android.os.Message arg3){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("msisdnTag")
  public java.lang.String getMsisdnAlphaTag(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("voiceMailNum")
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("spn")
  public java.lang.String getServiceProviderName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("this.handleMessage(arg3)")
  public abstract void setVoiceMailNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public abstract void setVoiceMessageWaiting(int arg1, int arg2);
  public boolean getVoiceMessageWaiting(){
    return false;
  }
  public int getVoiceMessageCount(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onRefresh(boolean arg1, int [] arg2);
  public boolean getRecordsLoaded(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onRecordLoaded();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onAllRecordsLoaded();
  public abstract int getDisplayRule(java.lang.String arg1);
  public boolean isCspPlmnEnabled(){
    return false;
  }
  public java.lang.String getOperatorNumeric(){
    return (java.lang.String) null;
  }
  public boolean getVoiceCallForwardingFlag(){
    return false;
  }
  public void setVoiceCallForwardingFlag(int arg1, boolean arg2){
  }
  public boolean isProvisioned(){
    return false;
  }
  public com.android.internal.telephony.ims.IsimRecords getIsimRecords(){
    return (com.android.internal.telephony.ims.IsimRecords) null;
  }
}
