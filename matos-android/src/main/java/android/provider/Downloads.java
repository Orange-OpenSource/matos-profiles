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
public final class Downloads
{
  // Classes

  public static final class Impl
    implements BaseColumns
  {
    // Classes

    public static class RequestHeaders
    {
      // Fields

      public static final java.lang.String HEADERS_DB_TABLE = "request_headers";

      public static final java.lang.String COLUMN_DOWNLOAD_ID = "download_id";

      public static final java.lang.String COLUMN_HEADER = "header";

      public static final java.lang.String COLUMN_VALUE = "value";

      public static final java.lang.String URI_SEGMENT = "headers";

      public static final java.lang.String INSERT_KEY_PREFIX = "http_header_";

      // Constructors

      public RequestHeaders(){
      }
    }
    // Fields

    public static final java.lang.String PERMISSION_ACCESS = "android.permission.ACCESS_DOWNLOAD_MANAGER";

    public static final java.lang.String PERMISSION_ACCESS_ADVANCED = "android.permission.ACCESS_DOWNLOAD_MANAGER_ADVANCED";

    public static final java.lang.String PERMISSION_ACCESS_ALL = "android.permission.ACCESS_ALL_DOWNLOADS";

    public static final java.lang.String PERMISSION_CACHE = "android.permission.ACCESS_CACHE_FILESYSTEM";

    public static final java.lang.String PERMISSION_SEND_INTENTS = "android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS";

    public static final java.lang.String PERMISSION_CACHE_NON_PURGEABLE = "android.permission.DOWNLOAD_CACHE_NON_PURGEABLE";

    public static final java.lang.String PERMISSION_NO_NOTIFICATION = "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION";

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri ALL_DOWNLOADS_CONTENT_URI = null;

    public static final java.lang.String PUBLICLY_ACCESSIBLE_DOWNLOADS_URI_SEGMENT = "public_downloads";

    public static final android.net.Uri PUBLICLY_ACCESSIBLE_DOWNLOADS_URI = null;

    public static final java.lang.String ACTION_DOWNLOAD_COMPLETED = "android.intent.action.DOWNLOAD_COMPLETED";

    public static final java.lang.String ACTION_NOTIFICATION_CLICKED = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED";

    public static final java.lang.String COLUMN_URI = "uri";

    public static final java.lang.String COLUMN_APP_DATA = "entity";

    public static final java.lang.String COLUMN_NO_INTEGRITY = "no_integrity";

    public static final java.lang.String COLUMN_FILE_NAME_HINT = "hint";

    public static final java.lang.String _DATA = "_data";

    public static final java.lang.String COLUMN_MIME_TYPE = "mimetype";

    public static final java.lang.String COLUMN_DESTINATION = "destination";

    public static final java.lang.String COLUMN_VISIBILITY = "visibility";

    public static final java.lang.String COLUMN_CONTROL = "control";

    public static final java.lang.String COLUMN_STATUS = "status";

    public static final java.lang.String COLUMN_LAST_MODIFICATION = "lastmod";

    public static final java.lang.String COLUMN_NOTIFICATION_PACKAGE = "notificationpackage";

    public static final java.lang.String COLUMN_NOTIFICATION_CLASS = "notificationclass";

    public static final java.lang.String COLUMN_NOTIFICATION_EXTRAS = "notificationextras";

    public static final java.lang.String COLUMN_COOKIE_DATA = "cookiedata";

    public static final java.lang.String COLUMN_USER_AGENT = "useragent";

    public static final java.lang.String COLUMN_REFERER = "referer";

    public static final java.lang.String COLUMN_TOTAL_BYTES = "total_bytes";

    public static final java.lang.String COLUMN_CURRENT_BYTES = "current_bytes";

    public static final java.lang.String COLUMN_OTHER_UID = "otheruid";

    public static final java.lang.String COLUMN_TITLE = "title";

    public static final java.lang.String COLUMN_DESCRIPTION = "description";

    public static final java.lang.String COLUMN_IS_PUBLIC_API = "is_public_api";

    public static final java.lang.String COLUMN_ALLOW_ROAMING = "allow_roaming";

    public static final java.lang.String COLUMN_ALLOWED_NETWORK_TYPES = "allowed_network_types";

    public static final java.lang.String COLUMN_IS_VISIBLE_IN_DOWNLOADS_UI = "is_visible_in_downloads_ui";

    public static final java.lang.String COLUMN_BYPASS_RECOMMENDED_SIZE_LIMIT = "bypass_recommended_size_limit";

    public static final java.lang.String COLUMN_DELETED = "deleted";

    public static final java.lang.String COLUMN_MEDIAPROVIDER_URI = "mediaprovider_uri";

    public static final java.lang.String COLUMN_MEDIA_SCANNED = "scanned";

    public static final java.lang.String COLUMN_ERROR_MSG = "errorMsg";

    public static final java.lang.String COLUMN_LAST_UPDATESRC = "lastUpdateSrc";

    public static final int LAST_UPDATESRC_NOT_RELEVANT = 0;

    public static final int LAST_UPDATESRC_DONT_NOTIFY_DOWNLOADSVC = 1;

    public static final int DESTINATION_EXTERNAL = 0;

    public static final int DESTINATION_CACHE_PARTITION = 1;

    public static final int DESTINATION_CACHE_PARTITION_PURGEABLE = 2;

    public static final int DESTINATION_CACHE_PARTITION_NOROAMING = 3;

    public static final int DESTINATION_FILE_URI = 4;

    public static final int DESTINATION_SYSTEMCACHE_PARTITION = 5;

    public static final int DESTINATION_NON_DOWNLOADMANAGER_DOWNLOAD = 6;

    public static final int CONTROL_RUN = 0;

    public static final int CONTROL_PAUSED = 1;

    public static final int STATUS_PENDING = 190;

    public static final int STATUS_RUNNING = 192;

    public static final int STATUS_PAUSED_BY_APP = 193;

    public static final int STATUS_WAITING_TO_RETRY = 194;

    public static final int STATUS_WAITING_FOR_NETWORK = 195;

    public static final int STATUS_QUEUED_FOR_WIFI = 196;

    public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 198;

    public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 199;

    public static final int STATUS_SUCCESS = 200;

    public static final int STATUS_BAD_REQUEST = 400;

    public static final int STATUS_NOT_ACCEPTABLE = 406;

    public static final int STATUS_LENGTH_REQUIRED = 411;

    public static final int STATUS_PRECONDITION_FAILED = 412;

    public static final int MIN_ARTIFICIAL_ERROR_STATUS = 488;

    public static final int STATUS_FILE_ALREADY_EXISTS_ERROR = 488;

    public static final int STATUS_CANNOT_RESUME = 489;

    public static final int STATUS_CANCELED = 490;

    public static final int STATUS_UNKNOWN_ERROR = 491;

    public static final int STATUS_FILE_ERROR = 492;

    public static final int STATUS_UNHANDLED_REDIRECT = 493;

    public static final int STATUS_UNHANDLED_HTTP_CODE = 494;

    public static final int STATUS_HTTP_DATA_ERROR = 495;

    public static final int STATUS_HTTP_EXCEPTION = 496;

    public static final int STATUS_TOO_MANY_REDIRECTS = 497;

    public static final int STATUS_BLOCKED = 498;

    public static final int VISIBILITY_VISIBLE = 0;

    public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;

    public static final int VISIBILITY_HIDDEN = 2;

    // Constructors

    private Impl(){
    }
    // Methods

    public static boolean isStatusSuccess(int arg1){
      return false;
    }
    public static boolean isStatusError(int arg1){
      return false;
    }
    public static boolean isStatusCompleted(int arg1){
      return false;
    }
    public static boolean isStatusInformational(int arg1){
      return false;
    }
    public static boolean isStatusClientError(int arg1){
      return false;
    }
    public static boolean isStatusServerError(int arg1){
      return false;
    }
    public static boolean isNotificationToBeDisplayed(int arg1){
      return false;
    }
  }
  // Constructors

  private Downloads(){
  }
}
