package android.net;

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


public final class Downloads
{
  // Classes

  public static final class StatusInfo
  {
    // Fields

    public boolean completed;

    public java.lang.String filename;

    public long id;

    public int statusCode;

    public long bytesSoFar;

    // Constructors

    public StatusInfo(){
    }
    // Methods

    public boolean isComplete(){
      return false;
    }
    public boolean isSuccessful(){
      return false;
    }
  }
  public static final class ByUri
    extends Downloads.DownloadBase  {
    // Constructors

    private ByUri(){
      super();
    }
    // Methods

    public static final Downloads.StatusInfo getStatus(android.content.Context arg1, java.lang.String arg2, long arg3){
      return (Downloads.StatusInfo) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Downloads.removeAllDownloadsByPackage", pos = {1, 2, 3}, report = "-")
    public static final void removeAllDownloadsByPackage(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
    }
    public static final int getProgressColumnId(){
      return 0;
    }
    public static final int getProgressColumnCurrentBytes(){
      return 0;
    }
    public static final int getProgressColumnTotalBytes(){
      return 0;
    }
    public static final android.database.Cursor getProgressCursor(android.content.Context arg1, long arg2){
      return (android.database.Cursor) null;
    }
  }
  public static final class ById
    extends Downloads.DownloadBase  {
    // Constructors

    private ById(){
      super();
    }
    // Methods

    public static final Downloads.StatusInfo getStatus(android.content.Context arg1, long arg2){
      return (Downloads.StatusInfo) null;
    }
    public static java.lang.String getMimeTypeForId(android.content.Context arg1, long arg2){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Downloads.deleteDownload", pos = 1, report = "-")
    public static void deleteDownload(android.content.Context arg1, long arg2){
    }
    public static android.os.ParcelFileDescriptor openDownload(android.content.Context arg1, long arg2, java.lang.String arg3) throws java.io.FileNotFoundException{
      return (android.os.ParcelFileDescriptor) null;
    }
    public static java.io.InputStream openDownloadStream(android.content.Context arg1, long arg2) throws java.io.FileNotFoundException, java.io.IOException{
      return (java.io.InputStream) null;
    }
  }
  public static class DownloadBase
  {
    // Constructors

    DownloadBase(){
    }
    // Methods

    public static long startDownloadByUri(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, int arg5, boolean arg6, boolean arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11){
      return 0l;
    }
  }
  // Fields

  public static final int STATUS_PENDING = 190;

  public static final int STATUS_RUNNING = 192;

  public static final int STATUS_SUCCESS = 200;

  public static final int STATUS_NOT_ACCEPTABLE = 406;

  public static final int STATUS_UNKNOWN_ERROR = 491;

  public static final int STATUS_UNHANDLED_REDIRECT = 493;

  public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 498;

  public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 499;

  public static final int DOWNLOAD_DESTINATION_EXTERNAL = 1;

  public static final int DOWNLOAD_DESTINATION_CACHE = 2;

  public static final int DOWNLOAD_DESTINATION_CACHE_PURGEABLE = 3;

  public static final long DOWNLOAD_ID_INVALID = -1l;

  public static final java.lang.String ACTION_DOWNLOAD_COMPLETED = "android.intent.action.DOWNLOAD_COMPLETED";

  public static final java.lang.String COLUMN_NOTIFICATION_EXTRAS = "notificationextras";

  // Constructors

  private Downloads(){
  }
  // Methods

  public static boolean isStatusSuccess(int arg1){
    return false;
  }
  public static boolean isStatusError(int arg1){
    return false;
  }
}
