package android.app;

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
public class DownloadManager
{
  // Classes

  public static class Request
  {
    // Fields

    public static final int NETWORK_MOBILE = 1;

    public static final int NETWORK_WIFI = 2;

    public static final int VISIBILITY_VISIBLE = 0;

    public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;

    public static final int VISIBILITY_HIDDEN = 2;

    public static final int VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION = 3;

    // Constructors

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DownloadManager.Request", pos = 1, report = "-")
    public Request(android.net.Uri arg1){
    }
    Request(java.lang.String arg1){
    }
    // Methods

    public DownloadManager.Request setTitle(java.lang.CharSequence arg1){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setMimeType(java.lang.String arg1){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setDescription(java.lang.CharSequence arg1){
      return (DownloadManager.Request) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DownloadManager.Request.setDestinationUri", pos = {0, 1}, report = "-")
    public DownloadManager.Request setDestinationUri(android.net.Uri arg1){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setDestinationToSystemCache(){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setDestinationInExternalFilesDir(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setDestinationInExternalPublicDir(java.lang.String arg1, java.lang.String arg2){
      return (DownloadManager.Request) null;
    }
    public void allowScanningByMediaScanner(){
    }
    public DownloadManager.Request addRequestHeader(java.lang.String arg1, java.lang.String arg2){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setShowRunningNotification(boolean arg1){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setNotificationVisibility(int arg1){
      return (DownloadManager.Request) null;
    }
    public DownloadManager.Request setAllowedNetworkTypes(int arg1){
      return (DownloadManager.Request) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DownloadManager.Request.setAllowedOverRoaming", pos = {0, 1}, report = "-")
    public DownloadManager.Request setAllowedOverRoaming(boolean arg1){
      return (DownloadManager.Request) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DownloadManager.Request.setVisibleInDownloadsUi", pos = {0, 1}, report = "-")
    public DownloadManager.Request setVisibleInDownloadsUi(boolean arg1){
      return (DownloadManager.Request) null;
    }
  }
  public static class Query
  {
    // Fields

    public static final int ORDER_ASCENDING = 1;

    public static final int ORDER_DESCENDING = 2;

    // Constructors

    public Query(){
    }
    // Methods

    public DownloadManager.Query orderBy(java.lang.String arg1, int arg2){
      return (DownloadManager.Query) null;
    }
    public DownloadManager.Query setFilterById(long [] arg1){
      return (DownloadManager.Query) null;
    }
    public DownloadManager.Query setFilterByStatus(int arg1){
      return (DownloadManager.Query) null;
    }
    public DownloadManager.Query setOnlyIncludeVisibleInDownloadsUi(boolean arg1){
      return (DownloadManager.Query) null;
    }
  }
  // Fields

  public static final java.lang.String COLUMN_ID = "_id";

  public static final java.lang.String COLUMN_TITLE = "title";

  public static final java.lang.String COLUMN_DESCRIPTION = "description";

  public static final java.lang.String COLUMN_URI = "uri";

  public static final java.lang.String COLUMN_MEDIA_TYPE = "media_type";

  public static final java.lang.String COLUMN_TOTAL_SIZE_BYTES = "total_size";

  public static final java.lang.String COLUMN_LOCAL_URI = "local_uri";

  public static final java.lang.String COLUMN_LOCAL_FILENAME = "local_filename";

  public static final java.lang.String COLUMN_STATUS = "status";

  public static final java.lang.String COLUMN_REASON = "reason";

  public static final java.lang.String COLUMN_BYTES_DOWNLOADED_SO_FAR = "bytes_so_far";

  public static final java.lang.String COLUMN_LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";

  public static final java.lang.String COLUMN_MEDIAPROVIDER_URI = "mediaprovider_uri";

  public static final int STATUS_PENDING = 1;

  public static final int STATUS_RUNNING = 2;

  public static final int STATUS_PAUSED = 4;

  public static final int STATUS_SUCCESSFUL = 8;

  public static final int STATUS_FAILED = 16;

  public static final int ERROR_UNKNOWN = 1000;

  public static final int ERROR_FILE_ERROR = 1001;

  public static final int ERROR_UNHANDLED_HTTP_CODE = 1002;

  public static final int ERROR_HTTP_DATA_ERROR = 1004;

  public static final int ERROR_TOO_MANY_REDIRECTS = 1005;

  public static final int ERROR_INSUFFICIENT_SPACE = 1006;

  public static final int ERROR_DEVICE_NOT_FOUND = 1007;

  public static final int ERROR_CANNOT_RESUME = 1008;

  public static final int ERROR_FILE_ALREADY_EXISTS = 1009;

  public static final int ERROR_BLOCKED = 1010;

  public static final int PAUSED_WAITING_TO_RETRY = 1;

  public static final int PAUSED_WAITING_FOR_NETWORK = 2;

  public static final int PAUSED_QUEUED_FOR_WIFI = 3;

  public static final int PAUSED_UNKNOWN = 4;

  public static final java.lang.String ACTION_DOWNLOAD_COMPLETE = "android.intent.action.DOWNLOAD_COMPLETE";

  public static final java.lang.String ACTION_NOTIFICATION_CLICKED = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED";

  public static final java.lang.String ACTION_VIEW_DOWNLOADS = "android.intent.action.VIEW_DOWNLOADS";

  public static final java.lang.String INTENT_EXTRAS_SORT_BY_SIZE = "android.app.DownloadManager.extra_sortBySize";

  public static final java.lang.String EXTRA_DOWNLOAD_ID = "extra_download_id";

  public static final java.lang.String EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS = "extra_click_download_ids";

  public static final java.lang.String [] UNDERLYING_COLUMNS = null;

  // Constructors

  public DownloadManager(android.content.ContentResolver arg1, java.lang.String arg2){
  }
  // Methods

  public int remove(long [] arg1){
    return 0;
  }
  public long enqueue(DownloadManager.Request arg1){
    return 0l;
  }
  public android.database.Cursor query(DownloadManager.Query arg1){
    return (android.database.Cursor) null;
  }
  public void setAccessAllDownloads(boolean arg1){
  }
  public int markRowDeleted(long [] arg1){
    return 0;
  }
  public android.os.ParcelFileDescriptor openDownloadedFile(long arg1) throws java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  public android.net.Uri getUriForDownloadedFile(long arg1){
    return (android.net.Uri) null;
  }
  public java.lang.String getMimeTypeForDownloadedFile(long arg1){
    return (java.lang.String) null;
  }
  public void restartDownload(long [] arg1){
  }
  public static java.lang.Long getMaxBytesOverMobile(android.content.Context arg1){
    return (java.lang.Long) null;
  }
  public static java.lang.Long getRecommendedMaxBytesOverMobile(android.content.Context arg1){
    return (java.lang.Long) null;
  }
  public long addCompletedDownload(java.lang.String arg1, java.lang.String arg2, boolean arg3, java.lang.String arg4, java.lang.String arg5, long arg6, boolean arg7){
    return 0l;
  }
}
