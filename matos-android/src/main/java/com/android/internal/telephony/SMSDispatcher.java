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

import com.francetelecom.rd.stubs.annotation.FieldNoValue;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class SMSDispatcher
  extends android.os.Handler{
  // Classes

  protected static final class SmsTracker
  {
    // Fields
	@FieldNoValue
    public final java.util.HashMap<java.lang.String, java.lang.Object> mData = (java.util.HashMap) null;

    public int mRetryCount;

    public int mMessageRef;
    @FieldNoValue
    public final android.app.PendingIntent mSentIntent = (android.app.PendingIntent) null;
    @FieldNoValue
    public final android.app.PendingIntent mDeliveryIntent = (android.app.PendingIntent) null;

    // Constructors

    public SmsTracker(@com.francetelecom.rd.stubs.annotation.FieldSet("mData") java.util.HashMap<java.lang.String, java.lang.Object> arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mSentIntent") android.app.PendingIntent arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mDeliveryIntent") android.app.PendingIntent arg3){
    }
    // Methods

    protected boolean isMultipart(){
      return false;
    }
  }
  // Fields

  public static final java.lang.String RECEIVE_SMS_PERMISSION = "android.permission.RECEIVE_SMS";

  public static final java.lang.String RECEIVE_EMERGENCY_BROADCAST_PERMISSION = "android.permission.RECEIVE_EMERGENCY_BROADCAST";

  protected static final int EVENT_NEW_SMS = 0;

  protected static final int EVENT_SEND_SMS_COMPLETE = 0;

  @FieldNoValue
  protected final Phone mPhone = (Phone) null;

  protected final android.content.Context mContext = (android.content.Context) null;

  protected final android.content.ContentResolver mResolver = (android.content.ContentResolver) null;

  protected final CommandsInterface mCm = (CommandsInterface) null;

  @FieldNoValue
  protected final SmsStorageMonitor mStorageMonitor = (SmsStorageMonitor) null;

  protected final WapPushOverSms mWapPush = (WapPushOverSms) null;

  protected static final android.net.Uri mRawUri = null;

  protected boolean mSmsCapable;

  protected boolean mSmsReceiveDisabled;

  protected boolean mSmsSendDisabled;

  protected int mRemainingMessages;

  protected final java.util.ArrayList<SMSDispatcher.SmsTracker> deliveryPendingList = (java.util.ArrayList) null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected SMSDispatcher(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mPhone") PhoneBase arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mStorageMonitor") SmsStorageMonitor arg2, SmsUsageMonitor arg3){
    super();
  }
  // Methods

  protected void finalize(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public abstract void dispose();
  public abstract int dispatchMessage(SmsMessageBase arg1);
  protected abstract java.lang.String getFormat();
  protected abstract SmsMessageBase.TextEncodingDetails calculateLength(java.lang.CharSequence arg1, boolean arg2);
  protected abstract void sendData(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6);
  protected abstract void sendText(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5);
  protected void sendMultipartText(java.lang.String arg1, java.lang.String arg2, java.util.ArrayList<java.lang.String> arg3, java.util.ArrayList<android.app.PendingIntent> arg4, java.util.ArrayList<android.app.PendingIntent> arg5){
  }
  protected static int getNextConcatenatedRef(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handleSendComplete(android.os.AsyncResult arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected static void handleNotInService(int arg1, SMSDispatcher.SmsTracker arg2){
  }
  protected int dispatchNormalMessage(SmsMessageBase arg1){
    return 0;
  }
  protected int processMessagePart(byte [] arg1, java.lang.String arg2, int arg3, int arg4, int arg5, long arg6, int arg7, boolean arg8){
    return 0;
  }
  protected void dispatchPdus(byte [] [] arg1){
  }
  protected void dispatchPortAddressedPdus(byte [] [] arg1, int arg2){
  }
  protected abstract void sendNewSubmitPdu(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, SmsHeader arg4, int arg5, android.app.PendingIntent arg6, android.app.PendingIntent arg7, boolean arg8);
  protected void sendRawPdu(byte [] arg1, byte [] arg2, android.app.PendingIntent arg3, android.app.PendingIntent arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handleReachSentLimit(SMSDispatcher.SmsTracker arg1){
  }
  protected static java.lang.String getAppNameByIntent(android.app.PendingIntent arg1){
    return (java.lang.String) null;
  }
  protected abstract void sendSms(SMSDispatcher.SmsTracker arg1);
  protected abstract void acknowledgeLastIncomingSms(boolean arg1, int arg2, android.os.Message arg3);
  protected void dispatchBroadcastPdus(byte [] [] arg1, boolean arg2){
  }
}
