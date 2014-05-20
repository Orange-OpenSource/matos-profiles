package com.android.internal.location;

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


public class GpsNetInitiatedHandler
{
  // Classes

  public static class GpsNiNotification
  {
    // Fields

    public int notificationId;

    public int niType;

    public boolean needNotify;

    public boolean needVerify;

    public boolean privacyOverride;

    public int timeout;

    public int defaultResponse;

    public java.lang.String requestorId;

    public java.lang.String text;

    public int requestorIdEncoding;

    public int textEncoding;

    public android.os.Bundle extras;

    // Constructors

    public GpsNiNotification(){
    }
  }
  public static class GpsNiResponse
  {
    // Constructors

    public GpsNiResponse(){
    }
  }
  // Fields

  public static final java.lang.String ACTION_NI_VERIFY = "android.intent.action.NETWORK_INITIATED_VERIFY";

  public static final java.lang.String NI_INTENT_KEY_NOTIF_ID = "notif_id";

  public static final java.lang.String NI_INTENT_KEY_TITLE = "title";

  public static final java.lang.String NI_INTENT_KEY_MESSAGE = "message";

  public static final java.lang.String NI_INTENT_KEY_TIMEOUT = "timeout";

  public static final java.lang.String NI_INTENT_KEY_DEFAULT_RESPONSE = "default_resp";

  public static final java.lang.String NI_RESPONSE_EXTRA_CMD = "send_ni_response";

  public static final java.lang.String NI_EXTRA_CMD_NOTIF_ID = "notif_id";

  public static final java.lang.String NI_EXTRA_CMD_RESPONSE = "response";

  public static final int GPS_NI_TYPE_VOICE = 1;

  public static final int GPS_NI_TYPE_UMTS_SUPL = 2;

  public static final int GPS_NI_TYPE_UMTS_CTRL_PLANE = 3;

  public static final int GPS_NI_RESPONSE_ACCEPT = 1;

  public static final int GPS_NI_RESPONSE_DENY = 2;

  public static final int GPS_NI_RESPONSE_NORESP = 3;

  public static final int GPS_NI_NEED_NOTIFY = 1;

  public static final int GPS_NI_NEED_VERIFY = 2;

  public static final int GPS_NI_PRIVACY_OVERRIDE = 4;

  public static final int GPS_ENC_NONE = 0;

  public static final int GPS_ENC_SUPL_GSM_DEFAULT = 1;

  public static final int GPS_ENC_SUPL_UTF8 = 2;

  public static final int GPS_ENC_SUPL_UCS2 = 3;

  public static final int GPS_ENC_UNKNOWN = -1;

  // Constructors

  public GpsNetInitiatedHandler(android.content.Context arg1){
  }
  // Methods

  public static java.lang.String getDialogTitle(GpsNetInitiatedHandler.GpsNiNotification arg1, android.content.Context arg2){
    return (java.lang.String) null;
  }
  public void handleNiNotification(GpsNetInitiatedHandler.GpsNiNotification arg1){
  }
}
