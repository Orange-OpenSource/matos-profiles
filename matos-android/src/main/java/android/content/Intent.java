package android.content;

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
public class Intent
  implements android.os.Parcelable, java.lang.Cloneable
{
  // Classes

  public static class ShortcutIconResource
    implements android.os.Parcelable
  {
    // Fields

    public java.lang.String packageName;

    public java.lang.String resourceName;

    public static final android.os.Parcelable.Creator<Intent.ShortcutIconResource> CREATOR = null;

    // Constructors

    public ShortcutIconResource(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public static Intent.ShortcutIconResource fromContext(Context arg1, int arg2){
      return (Intent.ShortcutIconResource) null;
    }
  }
  public static final class FilterComparison
  {
    // Constructors

    public FilterComparison(Intent arg1){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    public Intent getIntent(){
      return (Intent) null;
    }
  }
  // Fields

  public static final java.lang.String ACTION_MAIN = "android.intent.action.MAIN";

  public static final java.lang.String ACTION_VIEW = "android.intent.action.VIEW";

  public static final java.lang.String ACTION_DEFAULT = "android.intent.action.VIEW";

  public static final java.lang.String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";

  public static final java.lang.String ACTION_EDIT = "android.intent.action.EDIT";

  public static final java.lang.String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";

  public static final java.lang.String ACTION_PICK = "android.intent.action.PICK";

  public static final java.lang.String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";

  public static final java.lang.String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";

  public static final java.lang.String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";

  public static final java.lang.String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";

  public static final java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";

  public static final java.lang.String ACTION_CHOOSER = "android.intent.action.CHOOSER";

  public static final java.lang.String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";

  public static final java.lang.String ACTION_DIAL = "android.intent.action.DIAL";

  public static final java.lang.String ACTION_CALL = "android.intent.action.CALL";

  public static final java.lang.String ACTION_CALL_EMERGENCY = "android.intent.action.CALL_EMERGENCY";

  public static final java.lang.String ACTION_CALL_PRIVILEGED = "android.intent.action.CALL_PRIVILEGED";

  public static final java.lang.String ACTION_SENDTO = "android.intent.action.SENDTO";

  public static final java.lang.String ACTION_SEND = "android.intent.action.SEND";

  public static final java.lang.String ACTION_SEND_MULTIPLE = "android.intent.action.SEND_MULTIPLE";

  public static final java.lang.String ACTION_ANSWER = "android.intent.action.ANSWER";

  public static final java.lang.String ACTION_INSERT = "android.intent.action.INSERT";

  public static final java.lang.String ACTION_PASTE = "android.intent.action.PASTE";

  public static final java.lang.String ACTION_DELETE = "android.intent.action.DELETE";

  public static final java.lang.String ACTION_RUN = "android.intent.action.RUN";

  public static final java.lang.String ACTION_SYNC = "android.intent.action.SYNC";

  public static final java.lang.String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";

  public static final java.lang.String ACTION_SEARCH = "android.intent.action.SEARCH";

  public static final java.lang.String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";

  public static final java.lang.String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";

  public static final java.lang.String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";

  public static final java.lang.String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";

  public static final java.lang.String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";

  public static final java.lang.String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";

  public static final java.lang.String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";

  public static final java.lang.String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";

  public static final java.lang.String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";

  public static final java.lang.String ACTION_APP_ERROR = "android.intent.action.APP_ERROR";

  public static final java.lang.String ACTION_POWER_USAGE_SUMMARY = "android.intent.action.POWER_USAGE_SUMMARY";

  public static final java.lang.String ACTION_UPGRADE_SETUP = "android.intent.action.UPGRADE_SETUP";

  public static final java.lang.String ACTION_MANAGE_NETWORK_USAGE = "android.intent.action.MANAGE_NETWORK_USAGE";

  public static final java.lang.String ACTION_INSTALL_PACKAGE = "android.intent.action.INSTALL_PACKAGE";

  public static final java.lang.String EXTRA_INSTALLER_PACKAGE_NAME = "android.intent.extra.INSTALLER_PACKAGE_NAME";

  public static final java.lang.String EXTRA_NOT_UNKNOWN_SOURCE = "android.intent.extra.NOT_UNKNOWN_SOURCE";

  public static final java.lang.String EXTRA_ALLOW_REPLACE = "android.intent.extra.ALLOW_REPLACE";

  public static final java.lang.String EXTRA_RETURN_RESULT = "android.intent.extra.RETURN_RESULT";

  public static final java.lang.String EXTRA_INSTALL_RESULT = "android.intent.extra.INSTALL_RESULT";

  public static final java.lang.String ACTION_UNINSTALL_PACKAGE = "android.intent.action.UNINSTALL_PACKAGE";

  public static final java.lang.String METADATA_SETUP_VERSION = "android.SETUP_VERSION";

  public static final java.lang.String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";

  public static final java.lang.String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";

  public static final java.lang.String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";

  public static final java.lang.String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";

  public static final java.lang.String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";

  public static final java.lang.String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";

  public static final java.lang.String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";

  public static final java.lang.String ACTION_CLEAR_DNS_CACHE = "android.intent.action.CLEAR_DNS_CACHE";

  public static final java.lang.String ACTION_ALARM_CHANGED = "android.intent.action.ALARM_CHANGED";

  public static final java.lang.String ACTION_SYNC_STATE_CHANGED = "android.intent.action.SYNC_STATE_CHANGED";

  public static final java.lang.String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";

  public static final java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";

  public static final java.lang.String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";

  public static final java.lang.String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";

  public static final java.lang.String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";

  public static final java.lang.String ACTION_MY_PACKAGE_REPLACED = "android.intent.action.MY_PACKAGE_REPLACED";

  public static final java.lang.String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";

  public static final java.lang.String ACTION_PACKAGE_FULLY_REMOVED = "android.intent.action.PACKAGE_FULLY_REMOVED";

  public static final java.lang.String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";

  public static final java.lang.String ACTION_QUERY_PACKAGE_RESTART = "android.intent.action.QUERY_PACKAGE_RESTART";

  public static final java.lang.String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";

  public static final java.lang.String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";

  public static final java.lang.String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";

  public static final java.lang.String ACTION_PACKAGE_FIRST_LAUNCH = "android.intent.action.PACKAGE_FIRST_LAUNCH";

  public static final java.lang.String ACTION_PACKAGE_NEEDS_VERIFICATION = "android.intent.action.PACKAGE_NEEDS_VERIFICATION";

  public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";

  public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";

  public static final java.lang.String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";

  public static final java.lang.String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";

  public static final java.lang.String ACTION_LOCALE_CHANGED = "android.intent.action.LOCALE_CHANGED";

  public static final java.lang.String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";

  public static final java.lang.String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";

  public static final java.lang.String ACTION_BATTERY_OKAY = "android.intent.action.BATTERY_OKAY";

  public static final java.lang.String ACTION_POWER_CONNECTED = "android.intent.action.ACTION_POWER_CONNECTED";

  public static final java.lang.String ACTION_POWER_DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";

  public static final java.lang.String ACTION_SHUTDOWN = "android.intent.action.ACTION_SHUTDOWN";

  public static final java.lang.String ACTION_REQUEST_SHUTDOWN = "android.intent.action.ACTION_REQUEST_SHUTDOWN";

  public static final java.lang.String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";

  public static final java.lang.String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";

  public static final java.lang.String ACTION_DEVICE_STORAGE_FULL = "android.intent.action.DEVICE_STORAGE_FULL";

  public static final java.lang.String ACTION_DEVICE_STORAGE_NOT_FULL = "android.intent.action.DEVICE_STORAGE_NOT_FULL";

  public static final java.lang.String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";

  public static final java.lang.String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";

  public static final java.lang.String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";

  public static final java.lang.String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";

  public static final java.lang.String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";

  public static final java.lang.String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";

  public static final java.lang.String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";

  public static final java.lang.String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";

  public static final java.lang.String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";

  public static final java.lang.String ACTION_MEDIA_UNSHARED = "android.intent.action.MEDIA_UNSHARED";

  public static final java.lang.String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";

  public static final java.lang.String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";

  public static final java.lang.String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";

  public static final java.lang.String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";

  public static final java.lang.String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";

  public static final java.lang.String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";

  public static final java.lang.String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";

  public static final java.lang.String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";

  public static final java.lang.String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";

  public static final java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";

  public static final java.lang.String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";

  public static final java.lang.String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";

  public static final java.lang.String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";

  public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";

  public static final java.lang.String ACTION_USB_ANLG_HEADSET_PLUG = "android.intent.action.USB_ANLG_HEADSET_PLUG";

  public static final java.lang.String ACTION_USB_DGTL_HEADSET_PLUG = "android.intent.action.USB_DGTL_HEADSET_PLUG";

  public static final java.lang.String ACTION_HDMI_AUDIO_PLUG = "android.intent.action.HDMI_AUDIO_PLUG";

  public static final java.lang.String ACTION_ADVANCED_SETTINGS_CHANGED = "android.intent.action.ADVANCED_SETTINGS";

  public static final java.lang.String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";

  public static final java.lang.String ACTION_REBOOT = "android.intent.action.REBOOT";

  public static final java.lang.String ACTION_DOCK_EVENT = "android.intent.action.DOCK_EVENT";

  public static final java.lang.String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";

  public static final java.lang.String ACTION_PRE_BOOT_COMPLETED = "android.intent.action.PRE_BOOT_COMPLETED";

  public static final java.lang.String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";

  public static final java.lang.String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";

  public static final java.lang.String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";

  public static final java.lang.String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";

  public static final java.lang.String CATEGORY_TAB = "android.intent.category.TAB";

  public static final java.lang.String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";

  public static final java.lang.String CATEGORY_INFO = "android.intent.category.INFO";

  public static final java.lang.String CATEGORY_HOME = "android.intent.category.HOME";

  public static final java.lang.String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";

  public static final java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";

  public static final java.lang.String CATEGORY_EMBED = "android.intent.category.EMBED";

  public static final java.lang.String CATEGORY_APP_MARKET = "android.intent.category.APP_MARKET";

  public static final java.lang.String CATEGORY_MONKEY = "android.intent.category.MONKEY";

  public static final java.lang.String CATEGORY_TEST = "android.intent.category.TEST";

  public static final java.lang.String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";

  public static final java.lang.String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";

  public static final java.lang.String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";

  public static final java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";

  public static final java.lang.String CATEGORY_CAR_DOCK = "android.intent.category.CAR_DOCK";

  public static final java.lang.String CATEGORY_DESK_DOCK = "android.intent.category.DESK_DOCK";

  public static final java.lang.String CATEGORY_LE_DESK_DOCK = "android.intent.category.LE_DESK_DOCK";

  public static final java.lang.String CATEGORY_HE_DESK_DOCK = "android.intent.category.HE_DESK_DOCK";

  public static final java.lang.String CATEGORY_CAR_MODE = "android.intent.category.CAR_MODE";

  public static final java.lang.String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";

  public static final java.lang.String EXTRA_TEXT = "android.intent.extra.TEXT";

  public static final java.lang.String EXTRA_STREAM = "android.intent.extra.STREAM";

  public static final java.lang.String EXTRA_EMAIL = "android.intent.extra.EMAIL";

  public static final java.lang.String EXTRA_CC = "android.intent.extra.CC";

  public static final java.lang.String EXTRA_BCC = "android.intent.extra.BCC";

  public static final java.lang.String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";

  public static final java.lang.String EXTRA_INTENT = "android.intent.extra.INTENT";

  public static final java.lang.String EXTRA_TITLE = "android.intent.extra.TITLE";

  public static final java.lang.String EXTRA_INITIAL_INTENTS = "android.intent.extra.INITIAL_INTENTS";

  public static final java.lang.String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";

  public static final java.lang.String EXTRA_KEY_CONFIRM = "android.intent.extra.KEY_CONFIRM";

  public static final java.lang.String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";

  public static final java.lang.String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";

  public static final java.lang.String EXTRA_UID = "android.intent.extra.UID";

  public static final java.lang.String EXTRA_PACKAGES = "android.intent.extra.PACKAGES";

  public static final java.lang.String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";

  public static final java.lang.String EXTRA_REPLACING = "android.intent.extra.REPLACING";

  public static final java.lang.String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";

  public static final java.lang.String EXTRA_DOCK_STATE = "android.intent.extra.DOCK_STATE";

  public static final int EXTRA_DOCK_STATE_UNDOCKED = 0;

  public static final int EXTRA_DOCK_STATE_DESK = 1;

  public static final int EXTRA_DOCK_STATE_CAR = 2;

  public static final int EXTRA_DOCK_STATE_LE_DESK = 3;

  public static final int EXTRA_DOCK_STATE_HE_DESK = 4;

  public static final java.lang.String METADATA_DOCK_HOME = "android.dock_home";

  public static final java.lang.String EXTRA_BUG_REPORT = "android.intent.extra.BUG_REPORT";

  public static final java.lang.String EXTRA_REMOTE_INTENT_TOKEN = "android.intent.extra.remote_intent_token";

  public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME = "android.intent.extra.changed_component_name";

  public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME_LIST = "android.intent.extra.changed_component_name_list";

  public static final java.lang.String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";

  public static final java.lang.String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";

  public static final java.lang.String EXTRA_CLIENT_LABEL = "android.intent.extra.client_label";

  public static final java.lang.String EXTRA_CLIENT_INTENT = "android.intent.extra.client_intent";

  public static final java.lang.String EXTRA_LOCAL_ONLY = "android.intent.extra.LOCAL_ONLY";

  public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;

  public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;

  public static final int FLAG_FROM_BACKGROUND = 4;

  public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;

  public static final int FLAG_EXCLUDE_STOPPED_PACKAGES = 16;

  public static final int FLAG_INCLUDE_STOPPED_PACKAGES = 32;

  public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;

  public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;

  public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;

  public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;

  public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;

  public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;

  public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;

  public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;

  public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;

  public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;

  public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;

  public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;

  public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;

  public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;

  public static final int FLAG_ACTIVITY_NO_ANIMATION = 65536;

  public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;

  public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;

  public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;

  public static final int FLAG_RECEIVER_REPLACE_PENDING = 536870912;

  public static final int FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT = 268435456;

  public static final int FLAG_RECEIVER_BOOT_UPGRADE = 134217728;

  public static final int IMMUTABLE_FLAGS = 3;

  public static final int URI_INTENT_SCHEME = 1;

  public static final int FILL_IN_ACTION = 1;

  public static final int FILL_IN_DATA = 2;

  public static final int FILL_IN_CATEGORIES = 4;

  public static final int FILL_IN_COMPONENT = 8;

  public static final int FILL_IN_PACKAGE = 16;

  public static final int FILL_IN_SOURCE_BOUNDS = 32;

  public static final android.os.Parcelable.Creator<Intent> CREATOR = null;

  // Constructors

  public Intent(){
  }
  public Intent(Intent arg1){
  }
  private Intent(Intent arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent-1", pos = {0, 1}, report = "-")
  public Intent(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent-2", pos = {0, 1, 2}, report = "-")
  public Intent(java.lang.String arg1, android.net.Uri arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent-3", pos = {0, 2}, report = "-")
  public Intent(Context arg1, java.lang.Class<?> arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent-4", pos = {0, 1, 2, 4}, report = "-")
  public Intent(java.lang.String arg1, android.net.Uri arg2, Context arg3, java.lang.Class<?> arg4){
  }
  protected Intent(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String getPackage(){
    return (java.lang.String) null;
  }
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  public java.lang.String toURI(){
    return (java.lang.String) null;
  }
  public java.lang.Object getExtra(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public java.lang.Object getExtra(java.lang.String arg1, java.lang.Object arg2){
    return (java.lang.Object) null;
  }
  public android.net.Uri getData(){
    return (android.net.Uri) null;
  }
  public Intent setPackage(java.lang.String arg1){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.getIntent", pos = {1, -1}, report = "-")
  public static Intent getIntent(java.lang.String arg1) throws java.net.URISyntaxException{
    return (Intent) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setData", pos = {0, 1}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setData(android.net.Uri arg1){
    return (Intent) null;
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setFlags(int arg1){
    return (Intent) null;
  }
  public int getFlags(){
    return 0;
  }
  public java.lang.String toShortString(boolean arg1, boolean arg2, boolean arg3){
    return (java.lang.String) null;
  }
  public void toShortString(java.lang.StringBuilder arg1, boolean arg2, boolean arg3, boolean arg4){
  }
  public java.lang.String getAction(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent addCategory(java.lang.String arg1){
    return (Intent) null;
  }
  public boolean hasCategory(java.lang.String arg1){
    return false;
  }
  public ComponentName getComponent(){
    return (ComponentName) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setClassName-1", pos = {0, 2}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setClassName(Context arg1, java.lang.String arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setClassName-2", pos = {0, 1, 2}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setClassName(java.lang.String arg1, java.lang.String arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setType", pos = {0, 1}, report = "-")
  public Intent setType(java.lang.String arg1){
    return (Intent) null;
  }
  public boolean hasFileDescriptors(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setAction", pos = {0, 1, -1}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setAction(java.lang.String arg1){
    return (Intent) null;
  }
  public void setExtrasClassLoader(java.lang.ClassLoader arg1){
  }
  public android.content.pm.ActivityInfo resolveActivityInfo(android.content.pm.PackageManager arg1, int arg2){
    return (android.content.pm.ActivityInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent addFlags(int arg1){
    return (Intent) null;
  }
  public ComponentName resolveActivity(android.content.pm.PackageManager arg1){
    return (ComponentName) null;
  }
  public void setAllowFds(boolean arg1){
  }
  public java.lang.String resolveTypeIfNeeded(ContentResolver arg1){
    return (java.lang.String) null;
  }
  public int [] getIntArrayExtra(java.lang.String arg1){
    return (int []) null;
  }
  public int getIntExtra(java.lang.String arg1, int arg2){
    return 0;
  }
  public boolean getBooleanExtra(java.lang.String arg1, boolean arg2){
    return false;
  }
  public java.lang.String [] getStringArrayExtra(java.lang.String arg1){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, boolean arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, byte arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, char arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, short arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, int arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, long arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, float arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, double arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.putExtra", pos = {0, 1, 2}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, java.lang.String arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, java.lang.CharSequence arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, android.os.Parcelable arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, android.os.Parcelable [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, java.io.Serializable arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, boolean [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, byte [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, short [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, char [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, int [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, long [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, float [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, double [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, java.lang.String [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, java.lang.CharSequence [] arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, android.os.Bundle arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtra(java.lang.String arg1, android.os.IBinder arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setComponent(ComponentName arg1){
    return (Intent) null;
  }
  public java.lang.String getStringExtra(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public <T extends android.os.Parcelable>T getParcelableExtra(java.lang.String arg1){
    return null;
  }
  public static Intent makeRestartActivityTask(ComponentName arg1){
    return (Intent) null;
  }
  public java.lang.String resolveType(Context arg1){
    return (java.lang.String) null;
  }
  public java.lang.String resolveType(ContentResolver arg1){
    return (java.lang.String) null;
  }
  public java.util.Set<java.lang.String> getCategories(){
    return (java.util.Set) null;
  }
  public java.lang.String toInsecureString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setDataAndType", pos = {0, 1, -1}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setDataAndType(android.net.Uri arg1, java.lang.String arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.parseUri", pos = {1, -1}, report = "-")
  public static Intent parseUri(java.lang.String arg1, int arg2) throws java.net.URISyntaxException{
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent replaceExtras(Intent arg1){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent replaceExtras(android.os.Bundle arg1){
    return (Intent) null;
  }
  public void removeCategory(java.lang.String arg1){
  }
  public int fillIn(Intent arg1, int arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.createChooser", pos = {1, 2, -1}, report = "-")
  public static Intent createChooser(Intent arg1, java.lang.CharSequence arg2){
    return (Intent) null;
  }
  public void setSourceBounds(android.graphics.Rect arg1){
  }
  public boolean filterEquals(Intent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Intent.parseIntent-1", report = "-")
  public static Intent parseIntent(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (Intent) null;
  }
  public int filterHashCode(){
    return 0;
  }
  public boolean isExcludingStopped(){
    return false;
  }
  public java.lang.String toUri(int arg1){
    return (java.lang.String) null;
  }
  public java.util.ArrayList<java.lang.String> getStringArrayListExtra(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public java.lang.String getDataString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.putExtras-1", pos = {0, 1}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtras(Intent arg1){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.putExtras-2", pos = {0, 1}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putExtras(android.os.Bundle arg1){
    return (Intent) null;
  }
  public android.os.Parcelable [] getParcelableArrayExtra(java.lang.String arg1){
    return (android.os.Parcelable []) null;
  }
  public long getLongExtra(java.lang.String arg1, long arg2){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.setClass", pos = {0, 2}, report = "-")
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent setClass(Context arg1, java.lang.Class<?> arg2){
    return (Intent) null;
  }
  public android.os.Bundle getBundleExtra(java.lang.String arg1){
    return (android.os.Bundle) null;
  }
  public boolean hasExtra(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putStringArrayListExtra(java.lang.String arg1, java.util.ArrayList<java.lang.String> arg2){
    return (Intent) null;
  }
  public java.io.Serializable getSerializableExtra(java.lang.String arg1){
    return (java.io.Serializable) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent cloneFilter(){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putParcelableArrayListExtra(java.lang.String arg1, java.util.ArrayList<? extends android.os.Parcelable> arg2){
    return (Intent) null;
  }
  public void removeExtra(java.lang.String arg1){
  }
  public java.lang.CharSequence getCharSequenceExtra(java.lang.String arg1){
    return (java.lang.CharSequence) null;
  }
  public static Intent makeMainActivity(ComponentName arg1){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Intent.getIntentOld", pos = {1, -1}, report = "-")
  public static Intent getIntentOld(java.lang.String arg1) throws java.net.URISyntaxException{
    return (Intent) null;
  }
  public byte getByteExtra(java.lang.String arg1, byte arg2){
    return (byte) 0;
  }
  public short getShortExtra(java.lang.String arg1, short arg2){
    return (short) 0;
  }
  public char getCharExtra(java.lang.String arg1, char arg2){
    return '\u0000';
  }
  public float getFloatExtra(java.lang.String arg1, float arg2){
    return 0.0f;
  }
  public double getDoubleExtra(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public <T extends android.os.Parcelable>java.util.ArrayList<T> getParcelableArrayListExtra(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public java.util.ArrayList<java.lang.Integer> getIntegerArrayListExtra(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayListExtra(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public boolean [] getBooleanArrayExtra(java.lang.String arg1){
    return (boolean []) null;
  }
  public byte [] getByteArrayExtra(java.lang.String arg1){
    return (byte []) null;
  }
  public short [] getShortArrayExtra(java.lang.String arg1){
    return (short []) null;
  }
  public char [] getCharArrayExtra(java.lang.String arg1){
    return (char []) null;
  }
  public long [] getLongArrayExtra(java.lang.String arg1){
    return (long []) null;
  }
  public float [] getFloatArrayExtra(java.lang.String arg1){
    return (float []) null;
  }
  public double [] getDoubleArrayExtra(java.lang.String arg1){
    return (double []) null;
  }
  public java.lang.CharSequence [] getCharSequenceArrayExtra(java.lang.String arg1){
    return (java.lang.CharSequence []) null;
  }
  public android.os.IBinder getIBinderExtra(java.lang.String arg1){
    return (android.os.IBinder) null;
  }
  public android.graphics.Rect getSourceBounds(){
    return (android.graphics.Rect) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putIntegerArrayListExtra(java.lang.String arg1, java.util.ArrayList<java.lang.Integer> arg2){
    return (Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public Intent putCharSequenceArrayListExtra(java.lang.String arg1, java.util.ArrayList<java.lang.CharSequence> arg2){
    return (Intent) null;
  }
}
