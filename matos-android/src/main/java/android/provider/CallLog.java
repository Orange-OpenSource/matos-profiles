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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class CallLog
{
  // Classes

  public static class Calls
    implements BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_FILTER_URI = null;

    public static final java.lang.String ALLOW_VOICEMAILS_PARAM_KEY = "allow_voicemails";

    public static final android.net.Uri CONTENT_URI_WITH_VOICEMAIL = null;

    public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/calls";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/calls";

    public static final java.lang.String TYPE = "type";

    public static final int INCOMING_TYPE = 1;

    public static final int OUTGOING_TYPE = 2;

    public static final int MISSED_TYPE = 3;

    public static final int VOICEMAIL_TYPE = 4;

    public static final java.lang.String NUMBER = "number";

    public static final java.lang.String COUNTRY_ISO = "countryiso";

    public static final java.lang.String DATE = "date";

    public static final java.lang.String DURATION = "duration";

    public static final java.lang.String NEW = "new";

    public static final java.lang.String CACHED_NAME = "name";

    public static final java.lang.String CACHED_NUMBER_TYPE = "numbertype";

    public static final java.lang.String CACHED_NUMBER_LABEL = "numberlabel";

    public static final java.lang.String VOICEMAIL_URI = "voicemail_uri";

    public static final java.lang.String IS_READ = "is_read";

    public static final java.lang.String GEOCODED_LOCATION = "geocoded_location";

    public static final java.lang.String CACHED_LOOKUP_URI = "lookup_uri";

    public static final java.lang.String CACHED_MATCHED_NUMBER = "matched_number";

    public static final java.lang.String CACHED_NORMALIZED_NUMBER = "normalized_number";

    public static final java.lang.String CACHED_PHOTO_ID = "photo_id";

    public static final java.lang.String CACHED_FORMATTED_NUMBER = "formatted_number";

    // Constructors

    public Calls(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "CallLog.Calls.addCall", pos = {-1, 3}, report = "-")
    public static android.net.Uri addCall(com.android.internal.telephony.CallerInfo arg1, android.content.Context arg2, java.lang.String arg3, int arg4, int arg5, long arg6, int arg7){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.UseRule(value = "CallLog.Calls.getLastOutgoingCall", report = "-")
    public static java.lang.String getLastOutgoingCall(android.content.Context arg1){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "call_log";

  @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CallLogURI")
  public static final android.net.Uri CONTENT_URI = null;

  // Constructors

  public CallLog(){
  }
}
