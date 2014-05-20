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
public class SearchManager
  implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{
  // Classes

  public static interface OnDismissListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDismiss")
    public void onDismiss();
  }
  public static interface OnCancelListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCancel")
    public void onCancel();
  }
  // Fields

  public static final char MENU_KEY = 's';

  public static final int MENU_KEYCODE = 47;

  public static final java.lang.String QUERY = "query";

  public static final java.lang.String USER_QUERY = "user_query";

  public static final java.lang.String APP_DATA = "app_data";

  public static final java.lang.String SEARCH_MODE = "search_mode";

  public static final java.lang.String ACTION_KEY = "action_key";

  public static final java.lang.String EXTRA_DATA_KEY = "intent_extra_data_key";

  public static final java.lang.String EXTRA_SELECT_QUERY = "select_query";

  public static final java.lang.String EXTRA_NEW_SEARCH = "new_search";

  public static final java.lang.String EXTRA_WEB_SEARCH_PENDINGINTENT = "web_search_pendingintent";

  public static final java.lang.String CURSOR_EXTRA_KEY_IN_PROGRESS = "in_progress";

  public static final java.lang.String ACTION_MSG = "action_msg";

  public static final int FLAG_QUERY_REFINEMENT = 1;

  public static final java.lang.String SUGGEST_URI_PATH_QUERY = "search_suggest_query";

  public static final java.lang.String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";

  public static final java.lang.String SUGGEST_URI_PATH_SHORTCUT = "search_suggest_shortcut";

  public static final java.lang.String SHORTCUT_MIME_TYPE = "vnd.android.cursor.item/vnd.android.search.suggest";

  public static final java.lang.String SUGGEST_COLUMN_FORMAT = "suggest_format";

  public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";

  public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";

  public static final java.lang.String SUGGEST_COLUMN_TEXT_2_URL = "suggest_text_2_url";

  public static final java.lang.String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";

  public static final java.lang.String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";

  public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";

  public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";

  public static final java.lang.String SUGGEST_COLUMN_INTENT_EXTRA_DATA = "suggest_intent_extra_data";

  public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";

  public static final java.lang.String SUGGEST_COLUMN_QUERY = "suggest_intent_query";

  public static final java.lang.String SUGGEST_COLUMN_SHORTCUT_ID = "suggest_shortcut_id";

  public static final java.lang.String SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING = "suggest_spinner_while_refreshing";

  public static final java.lang.String SUGGEST_COLUMN_FLAGS = "suggest_flags";

  public static final java.lang.String SUGGEST_COLUMN_LAST_ACCESS_HINT = "suggest_last_access_hint";

  public static final java.lang.String SUGGEST_NEVER_MAKE_SHORTCUT = "_-1";

  public static final java.lang.String SUGGEST_PARAMETER_LIMIT = "limit";

  public static final java.lang.String INTENT_ACTION_GLOBAL_SEARCH = "android.search.action.GLOBAL_SEARCH";

  public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";

  public static final java.lang.String INTENT_ACTION_WEB_SEARCH_SETTINGS = "android.search.action.WEB_SEARCH_SETTINGS";

  public static final java.lang.String INTENT_ACTION_SEARCHABLES_CHANGED = "android.search.action.SEARCHABLES_CHANGED";

  public static final java.lang.String INTENT_GLOBAL_SEARCH_ACTIVITY_CHANGED = "android.search.action.GLOBAL_SEARCH_ACTIVITY_CHANGED";

  public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS_CHANGED = "android.search.action.SETTINGS_CHANGED";

  public static final java.lang.String CONTEXT_IS_VOICE = "android.search.CONTEXT_IS_VOICE";

  public static final java.lang.String DISABLE_VOICE_SEARCH = "android.search.DISABLE_VOICE_SEARCH";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  SearchManager(android.content.Context arg1, android.os.Handler arg2){
  }
  // Methods

  public boolean isVisible(){
    return false;
  }
  public void startSearch(java.lang.String arg1, boolean arg2, android.content.ComponentName arg3, android.os.Bundle arg4, boolean arg5){
  }
  public void triggerSearch(java.lang.String arg1, android.content.ComponentName arg2, android.os.Bundle arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDismiss(android.content.DialogInterface arg1){
  }
  public SearchableInfo getSearchableInfo(android.content.ComponentName arg1){
    return (SearchableInfo) null;
  }
  public java.util.List<SearchableInfo> getSearchablesInGlobalSearch(){
    return (java.util.List) null;
  }
  public java.util.List<android.content.pm.ResolveInfo> getGlobalSearchActivities(){
    return (java.util.List) null;
  }
  public android.content.ComponentName getGlobalSearchActivity(){
    return (android.content.ComponentName) null;
  }
  public android.content.ComponentName getWebSearchActivity(){
    return (android.content.ComponentName) null;
  }
  public void setOnCancelListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCancel") SearchManager.OnCancelListener arg1){
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onDismiss") SearchManager.OnDismissListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCancel(android.content.DialogInterface arg1){
  }
  public android.database.Cursor getSuggestions(SearchableInfo arg1, java.lang.String arg2){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor getSuggestions(SearchableInfo arg1, java.lang.String arg2, int arg3){
    return (android.database.Cursor) null;
  }
  public void stopSearch(){
  }
}
