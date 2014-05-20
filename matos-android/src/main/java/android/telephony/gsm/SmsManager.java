package android.telephony.gsm;

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


public final class SmsManager
{
  // Fields

  public static final int STATUS_ON_SIM_FREE = 0;

  public static final int STATUS_ON_SIM_READ = 1;

  public static final int STATUS_ON_SIM_UNREAD = 3;

  public static final int STATUS_ON_SIM_SENT = 5;

  public static final int STATUS_ON_SIM_UNSENT = 7;

  public static final int RESULT_ERROR_GENERIC_FAILURE = 1;

  public static final int RESULT_ERROR_RADIO_OFF = 2;

  public static final int RESULT_ERROR_NULL_PDU = 3;

  public static final int RESULT_ERROR_NO_SERVICE = 4;

  // Constructors

  private SmsManager(){
  }
  // Methods

  public static final SmsManager getDefault(){
    return (SmsManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "gsm.SMSManager.sendTextMessage", pos = {1, 2, 3}, report = "-")
  public final void sendTextMessage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5){
  }
  public final java.util.ArrayList<java.lang.String> divideMessage(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "gsm.SMSManager.sendMultipartTextMessage", pos = {1, 2, 3, 4}, report = "-")
  public final void sendMultipartTextMessage(java.lang.String arg1, java.lang.String arg2, java.util.ArrayList<java.lang.String> arg3, java.util.ArrayList<android.app.PendingIntent> arg4, java.util.ArrayList<android.app.PendingIntent> arg5){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "gsm.SMSManager.sendDataMessage", pos = {1, 2, 5, 6}, report = "-")
  public final void sendDataMessage(java.lang.String arg1, java.lang.String arg2, short arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "gsm.SMSManager.copyMessageToSim", report = "-")
  public final boolean copyMessageToSim(byte [] arg1, byte [] arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "gsm.SMSManager.deleteMessageFromSim", report = "-")
  public final boolean deleteMessageFromSim(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "gsm.SMSManager.updateMessageOnSim", report = "-")
  public final boolean updateMessageOnSim(int arg1, int arg2, byte [] arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "gsm.SMSManager.getAllMessagesFromSim", report = "-")
  public final java.util.ArrayList<android.telephony.SmsMessage> getAllMessagesFromSim(){
    return (java.util.ArrayList) null;
  }
}
