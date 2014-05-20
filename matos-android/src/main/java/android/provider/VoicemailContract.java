package android.provider;

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


public class VoicemailContract
{
  // Classes

  public static final class Voicemails
    implements OpenableColumns, BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String DIR_TYPE = "vnd.android.cursor.dir/voicemails";

    public static final java.lang.String ITEM_TYPE = "vnd.android.cursor.item/voicemail";

    public static final java.lang.String NUMBER = "number";

    public static final java.lang.String DATE = "date";

    public static final java.lang.String DURATION = "duration";

    public static final java.lang.String IS_READ = "is_read";

    public static final java.lang.String STATE = "state";

    public static int STATE_INBOX;

    public static int STATE_DELETED;

    public static int STATE_UNDELETED;

    public static final java.lang.String SOURCE_PACKAGE = "source_package";

    public static final java.lang.String SOURCE_DATA = "source_data";

    public static final java.lang.String HAS_CONTENT = "has_content";

    public static final java.lang.String MIME_TYPE = "mime_type";

    public static final java.lang.String _DATA = "_data";

    // Constructors

    private Voicemails(){
    }
    // Methods

    public static android.net.Uri buildSourceUri(java.lang.String arg1){
      return (android.net.Uri) null;
    }
  }
  public static final class Status
    implements BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String DIR_TYPE = "vnd.android.cursor.dir/voicemail.source.status";

    public static final java.lang.String ITEM_TYPE = "vnd.android.cursor.item/voicemail.source.status";

    public static final java.lang.String SOURCE_PACKAGE = "source_package";

    public static final java.lang.String SETTINGS_URI = "settings_uri";

    public static final java.lang.String VOICEMAIL_ACCESS_URI = "voicemail_access_uri";

    public static final java.lang.String CONFIGURATION_STATE = "configuration_state";

    public static final int CONFIGURATION_STATE_OK = 0;

    public static final int CONFIGURATION_STATE_NOT_CONFIGURED = 1;

    public static final int CONFIGURATION_STATE_CAN_BE_CONFIGURED = 2;

    public static final java.lang.String DATA_CHANNEL_STATE = "data_channel_state";

    public static final int DATA_CHANNEL_STATE_OK = 0;

    public static final int DATA_CHANNEL_STATE_NO_CONNECTION = 1;

    public static final java.lang.String NOTIFICATION_CHANNEL_STATE = "notification_channel_state";

    public static final int NOTIFICATION_CHANNEL_STATE_OK = 0;

    public static final int NOTIFICATION_CHANNEL_STATE_NO_CONNECTION = 1;

    public static final int NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING = 2;

    // Constructors

    private Status(){
    }
    // Methods

    public static android.net.Uri buildSourceUri(java.lang.String arg1){
      return (android.net.Uri) null;
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "com.android.voicemail";

  public static final java.lang.String PARAM_KEY_SOURCE_PACKAGE = "source_package";

  public static final java.lang.String ACTION_NEW_VOICEMAIL = "android.intent.action.NEW_VOICEMAIL";

  public static final java.lang.String ACTION_FETCH_VOICEMAIL = "android.intent.action.FETCH_VOICEMAIL";

  public static final java.lang.String EXTRA_SELF_CHANGE = "com.android.voicemail.extra.SELF_CHANGE";

  public static final java.lang.String SOURCE_PACKAGE_FIELD = "source_package";

  // Constructors

  private VoicemailContract(){
  }
}
