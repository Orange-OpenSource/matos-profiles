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


public class BrowserContract
{
  // Classes

  public static final class ChromeSyncColumns
  {
    // Fields

    public static final java.lang.String SERVER_UNIQUE = "sync3";

    public static final java.lang.String FOLDER_NAME_ROOT = "google_chrome";

    public static final java.lang.String FOLDER_NAME_BOOKMARKS = "google_chrome_bookmarks";

    public static final java.lang.String FOLDER_NAME_BOOKMARKS_BAR = "bookmark_bar";

    public static final java.lang.String FOLDER_NAME_OTHER_BOOKMARKS = "other_bookmarks";

    public static final java.lang.String CLIENT_UNIQUE = "sync4";

    // Constructors

    private ChromeSyncColumns(){
    }
  }
  public static final class Bookmarks
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_URI_DEFAULT_FOLDER = null;

    public static final java.lang.String PARAM_ACCOUNT_NAME = "acct_name";

    public static final java.lang.String PARAM_ACCOUNT_TYPE = "acct_type";

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/bookmark";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/bookmark";

    public static final java.lang.String QUERY_PARAMETER_SHOW_DELETED = "show_deleted";

    public static final java.lang.String IS_FOLDER = "folder";

    public static final java.lang.String PARENT = "parent";

    public static final java.lang.String PARENT_SOURCE_ID = "parent_source";

    public static final java.lang.String POSITION = "position";

    public static final java.lang.String INSERT_AFTER = "insert_after";

    public static final java.lang.String INSERT_AFTER_SOURCE_ID = "insert_after_source";

    public static final java.lang.String IS_DELETED = "deleted";

    // Constructors

    private Bookmarks(){
    }
    // Methods

    public static final android.net.Uri buildFolderUri(long arg1){
      return (android.net.Uri) null;
    }
  }
  public static final class Accounts
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String ROOT_ID = "root_id";

    // Constructors

    public Accounts(){
    }
  }
  public static final class History
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/browser-history";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/browser-history";

    // Constructors

    private History(){
    }
  }
  public static final class Searches
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/searches";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/searches";

    public static final java.lang.String _ID = "_id";

    public static final java.lang.String SEARCH = "search";

    public static final java.lang.String DATE = "date";

    // Constructors

    private Searches(){
    }
  }
  public static final class SyncState
    implements SyncStateContract.Columns
  {
    // Fields

    public static final java.lang.String CONTENT_DIRECTORY = "syncstate";

    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private SyncState(){
    }
    // Methods

    public static byte [] get(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (byte []) null;
    }
    public static void set(android.content.ContentProviderClient arg1, android.accounts.Account arg2, byte [] arg3) throws android.os.RemoteException{
    }
    public static android.util.Pair<android.net.Uri, byte []> getWithUri(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (android.util.Pair) null;
    }
    public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account arg1, byte [] arg2){
      return (android.content.ContentProviderOperation) null;
    }
  }
  public static final class Images
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String URL = "url_key";

    // Constructors

    private Images(){
    }
  }
  public static final class Combined
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String IS_BOOKMARK = "bookmark";

    // Constructors

    private Combined(){
    }
  }
  public static final class Settings
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String KEY = "key";

    public static final java.lang.String VALUE = "value";

    public static final java.lang.String KEY_SYNC_ENABLED = "sync_enabled";

    // Constructors

    private Settings(){
    }
    // Methods

    public static boolean isSyncEnabled(android.content.Context arg1){
      return false;
    }
    public static void setSyncEnabled(android.content.Context arg1, boolean arg2){
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "com.android.browser";

  public static final android.net.Uri AUTHORITY_URI = null;

  public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";

  public static final java.lang.String PARAM_LIMIT = "limit";

  // Constructors

  public BrowserContract(){
  }
}
