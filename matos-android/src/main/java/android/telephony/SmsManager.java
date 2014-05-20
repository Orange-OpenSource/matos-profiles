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
public final class SmsManager
{
  // Fields

  public static final int STATUS_ON_ICC_FREE = 0;

  public static final int STATUS_ON_ICC_READ = 1;

  public static final int STATUS_ON_ICC_UNREAD = 3;

  public static final int STATUS_ON_ICC_SENT = 5;

  public static final int STATUS_ON_ICC_UNSENT = 7;

  public static final int RESULT_ERROR_GENERIC_FAILURE = 1;

  public static final int RESULT_ERROR_RADIO_OFF = 2;

  public static final int RESULT_ERROR_NULL_PDU = 3;

  public static final int RESULT_ERROR_NO_SERVICE = 4;

  public static final int RESULT_ERROR_LIMIT_EXCEEDED = 5;

  public static final int RESULT_ERROR_FDN_CHECK_FAILURE = 6;

  // Constructors

  private SmsManager(){
  }
  // Methods

  public static SmsManager getDefault(){
    return (SmsManager) null;
  }
  public boolean enableCellBroadcast(int arg1){
    return false;
  }
  public boolean disableCellBroadcast(int arg1){
    return false;
  }
  public boolean enableCellBroadcastRange(int arg1, int arg2){
    return false;
  }
  public boolean disableCellBroadcastRange(int arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SmsManager.sendTextMessage", pos = {1, 2, 3}, report = "-")
  public void sendTextMessage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5){
  }
  public java.util.ArrayList<java.lang.String> divideMessage(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SmsManager.sendMultiparTextMessage", pos = {1, 2, 3, 4}, report = "-")
  public void sendMultipartTextMessage(java.lang.String arg1, java.lang.String arg2, java.util.ArrayList<java.lang.String> arg3, java.util.ArrayList<android.app.PendingIntent> arg4, java.util.ArrayList<android.app.PendingIntent> arg5){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SmsManager.sendDataMessage", pos = {1, 2, 5, 6}, report = "-")
  public void sendDataMessage(java.lang.String arg1, java.lang.String arg2, short arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SmsManager.copyMessageToIcc", report = "-")
  public boolean copyMessageToIcc(byte [] arg1, byte [] arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SmsManager.deleteMessageFromIcc", report = "-")
  public boolean deleteMessageFromIcc(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SmsManager.updateMessageOnIcc", report = "-")
  public boolean updateMessageOnIcc(int arg1, int arg2, byte [] arg3){
    return false;
  }
  
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "SmsManager.getAllMessagesFromIcc", report = "-")
  public static java.util.ArrayList<SmsMessage> getAllMessagesFromIcc(){
    return (java.util.ArrayList) null;
  }
}
