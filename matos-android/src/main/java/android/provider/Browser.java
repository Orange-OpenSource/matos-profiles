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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.UseRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Browser
{
  // Classes

  public static class BookmarkColumns
    implements BaseColumns
  {
    // Fields

    public static final java.lang.String URL = "url";

    public static final java.lang.String VISITS = "visits";

    public static final java.lang.String DATE = "date";

    public static final java.lang.String BOOKMARK = "bookmark";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String CREATED = "created";

    public static final java.lang.String FAVICON = "favicon";

    public static final java.lang.String THUMBNAIL = "thumbnail";

    public static final java.lang.String TOUCH_ICON = "touch_icon";

    public static final java.lang.String USER_ENTERED = "user_entered";

    // Constructors

    public BookmarkColumns(){
    }
  }
  public static class SearchColumns
    implements BaseColumns
  {
    // Fields

    public static final java.lang.String URL = "url";

    public static final java.lang.String SEARCH = "search";

    public static final java.lang.String DATE = "date";

    // Constructors

    public SearchColumns(){
    }
  }
  // Fields

  @com.francetelecom.rd.stubs.annotation.FieldValueImpl("BrowserBookmarksURI")
  public static final android.net.Uri BOOKMARKS_URI = null;

  public static final java.lang.String INITIAL_ZOOM_LEVEL = "browser.initialZoomLevel";

  public static final java.lang.String EXTRA_APPLICATION_ID = "com.android.browser.application_id";

  public static final java.lang.String EXTRA_HEADERS = "com.android.browser.headers";

  public static final java.lang.String [] HISTORY_PROJECTION = null;

  public static final int HISTORY_PROJECTION_ID_INDEX = 0;

  public static final int HISTORY_PROJECTION_URL_INDEX = 1;

  public static final int HISTORY_PROJECTION_VISITS_INDEX = 2;

  public static final int HISTORY_PROJECTION_DATE_INDEX = 3;

  public static final int HISTORY_PROJECTION_BOOKMARK_INDEX = 4;

  public static final int HISTORY_PROJECTION_TITLE_INDEX = 5;

  public static final int HISTORY_PROJECTION_FAVICON_INDEX = 6;

  public static final int HISTORY_PROJECTION_THUMBNAIL_INDEX = 7;

  public static final int HISTORY_PROJECTION_TOUCH_ICON_INDEX = 8;

  public static final java.lang.String [] TRUNCATE_HISTORY_PROJECTION = null;

  public static final int TRUNCATE_HISTORY_PROJECTION_ID_INDEX = 0;

  public static final int TRUNCATE_N_OLDEST = 5;

  public static final android.net.Uri SEARCHES_URI = null;

  public static final java.lang.String [] SEARCHES_PROJECTION = null;

  public static final int SEARCHES_PROJECTION_SEARCH_INDEX = 1;

  public static final int SEARCHES_PROJECTION_DATE_INDEX = 2;

  public static final java.lang.String EXTRA_CREATE_NEW_TAB = "create_new_tab";

  public static final java.lang.String EXTRA_SHARE_SCREENSHOT = "share_screenshot";

  public static final java.lang.String EXTRA_SHARE_FAVICON = "share_favicon";

  // Constructors

  public Browser(){
  }
  // Methods

  public static final void clearHistory(android.content.ContentResolver arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Browser.getVisitedHistory", report = "-")
  public static final java.lang.String [] getVisitedHistory(android.content.ContentResolver arg1){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Browser.saveBookmark", pos = {2, 3}, report = "-")
  public static final void saveBookmark(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Browser.sendString-1", pos = 2, report = "-")
  public static final void sendString(android.content.Context arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Browser.sendString-2", pos = {2, 3}, report = "-")
  public static final void sendString(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Browser.getAllBookmarks", report = "-")
  public static final android.database.Cursor getAllBookmarks(android.content.ContentResolver arg1) throws java.lang.IllegalStateException{
    return (android.database.Cursor) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Browser.getAllVisitedUrls", report = "-")
  public static final android.database.Cursor getAllVisitedUrls(android.content.ContentResolver arg1) throws java.lang.IllegalStateException{
    return (android.database.Cursor) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Browser.updateVisitedHistory", report = "-")
  public static final void updateVisitedHistory(android.content.ContentResolver arg1, java.lang.String arg2, boolean arg3){
  }
  @UseRule(value="Browser.truncateHistory")
  public static final void truncateHistory(android.content.ContentResolver arg1){
  }
  public static final boolean canClearHistory(android.content.ContentResolver arg1){
    return false;
  }
  @UseRule(value="Browser.deleteHistoryTimeFrame")
  public static final void deleteHistoryTimeFrame(android.content.ContentResolver arg1, long arg2, long arg3){
  }
  @ArgsRule(value="Browser.deleteFromHistory", pos=2)
  public static final void deleteFromHistory(android.content.ContentResolver arg1, java.lang.String arg2){
  }
  @ArgsRule(value="Browser.truncateHistory", pos=2)
  public static final void addSearchUrl(android.content.ContentResolver arg1, java.lang.String arg2){
  }
  public static final void clearSearches(android.content.ContentResolver arg1){
  }
  public static final void requestAllIcons(android.content.ContentResolver arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.webkit.WebIconDatabase.IconListener.onReceivedIcon") android.webkit.WebIconDatabase.IconListener arg3){
  }
}
