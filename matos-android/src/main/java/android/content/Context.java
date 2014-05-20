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
@com.francetelecom.rd.stubs.annotation.Accumulator("accu")
public abstract class Context
{
  // Fields

  public static final int MODE_PRIVATE = 0;

  public static final int MODE_WORLD_READABLE = 1;

  public static final int MODE_WORLD_WRITEABLE = 2;

  public static final int MODE_APPEND = 32768;

  public static final int MODE_MULTI_PROCESS = 4;

  public static final int BIND_AUTO_CREATE = 1;

  public static final int BIND_DEBUG_UNBIND = 2;

  public static final int BIND_NOT_FOREGROUND = 4;

  public static final int BIND_ABOVE_CLIENT = 8;

  public static final int BIND_ALLOW_OOM_MANAGEMENT = 16;

  public static final int BIND_WAIVE_PRIORITY = 32;

  public static final int BIND_IMPORTANT = 64;

  public static final int BIND_ADJUST_WITH_ACTIVITY = 64;

  public static final java.lang.String POWER_SERVICE = "power";

  public static final java.lang.String WINDOW_SERVICE = "window";

  public static final java.lang.String LAYOUT_INFLATER_SERVICE = "layout_inflater";

  public static final java.lang.String ACCOUNT_SERVICE = "account";

  public static final java.lang.String ACTIVITY_SERVICE = "activity";

  public static final java.lang.String ALARM_SERVICE = "alarm";

  public static final java.lang.String NOTIFICATION_SERVICE = "notification";

  public static final java.lang.String ACCESSIBILITY_SERVICE = "accessibility";

  public static final java.lang.String KEYGUARD_SERVICE = "keyguard";

  public static final java.lang.String LOCATION_SERVICE = "location";

  public static final java.lang.String COUNTRY_DETECTOR = "country_detector";

  public static final java.lang.String SEARCH_SERVICE = "search";

  public static final java.lang.String SENSOR_SERVICE = "sensor";

  public static final java.lang.String STORAGE_SERVICE = "storage";

  public static final java.lang.String WALLPAPER_SERVICE = "wallpaper";

  public static final java.lang.String VIBRATOR_SERVICE = "vibrator";

  public static final java.lang.String STATUS_BAR_SERVICE = "statusbar";

  public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";

  public static final java.lang.String THROTTLE_SERVICE = "throttle";

  public static final java.lang.String NETWORKMANAGEMENT_SERVICE = "network_management";

  public static final java.lang.String NETWORK_STATS_SERVICE = "netstats";

  public static final java.lang.String NETWORK_POLICY_SERVICE = "netpolicy";

  public static final java.lang.String WIFI_SERVICE = "wifi";

  public static final java.lang.String WIFI_P2P_SERVICE = "wifip2p";

  public static final java.lang.String AUDIO_SERVICE = "audio";

  public static final java.lang.String TELEPHONY_SERVICE = "phone";

  public static final java.lang.String CLIPBOARD_SERVICE = "clipboard";

  public static final java.lang.String INPUT_METHOD_SERVICE = "input_method";

  public static final java.lang.String TEXT_SERVICES_MANAGER_SERVICE = "textservices";

  public static final java.lang.String APPWIDGET_SERVICE = "appwidget";

  public static final java.lang.String BACKUP_SERVICE = "backup";

  public static final java.lang.String DROPBOX_SERVICE = "dropbox";

  public static final java.lang.String DEVICE_POLICY_SERVICE = "device_policy";

  public static final java.lang.String UI_MODE_SERVICE = "uimode";

  public static final java.lang.String DOWNLOAD_SERVICE = "download";

  public static final java.lang.String NFC_SERVICE = "nfc";

  public static final java.lang.String SIP_SERVICE = "sip";

  public static final java.lang.String USB_SERVICE = "usb";

  public static final int CONTEXT_INCLUDE_CODE = 1;

  public static final int CONTEXT_IGNORE_SECURITY = 2;

  public static final int CONTEXT_RESTRICTED = 4;

  // Constructors

  public Context(){
  }
  // Methods

  public abstract int checkPermission(java.lang.String arg1, int arg2, int arg3);
  public abstract java.lang.ClassLoader getClassLoader();
  public abstract android.content.res.Resources getResources();
  public abstract java.lang.String getPackageName();
  public final java.lang.String getString(int arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String getString(int arg1, java.lang.Object [] arg2){
    return (java.lang.String) null;
  }
  public abstract java.lang.Object getSystemService(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.startActivity", pos = 1, report = "-")
  public abstract void startActivity(Intent arg1);
  public abstract void startActivities(Intent [] arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.startIntentSender", pos = {1, 2}, report = "-")
  public abstract void startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5) throws IntentSender.SendIntentException;
  public abstract android.content.res.Resources.Theme getTheme();
  public abstract void setTheme(int arg1);
  public int getThemeResId(){
    return 0;
  }
  public abstract ContentResolver getContentResolver();
  public abstract Intent registerReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1, IntentFilter arg2);
  public abstract Intent registerReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1, IntentFilter arg2, java.lang.String arg3, android.os.Handler arg4);
  public abstract void unregisterReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendStickyBroadcast-1", pos = 1, report = "-")
  public abstract void sendStickyBroadcast(Intent arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendBroadcast-1", pos = 1, report = "-")
  public abstract void sendBroadcast(Intent arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendBroadcast-2", pos = {1, 2}, report = "-")
  public abstract void sendBroadcast(Intent arg1, java.lang.String arg2);
  public abstract android.content.pm.ApplicationInfo getApplicationInfo();
  public abstract SharedPreferences getSharedPreferences(java.lang.String arg1, int arg2);
  public abstract android.content.res.AssetManager getAssets();
  public abstract android.content.pm.PackageManager getPackageManager();
  public abstract android.os.Looper getMainLooper();
  public abstract Context getApplicationContext();
  public abstract java.lang.String getPackageResourcePath();
  public abstract java.lang.String getPackageCodePath();
  public abstract java.io.File getSharedPrefsFile(java.lang.String arg1);
  public abstract java.io.FileInputStream openFileInput(java.lang.String arg1) throws java.io.FileNotFoundException;
  public abstract java.io.FileOutputStream openFileOutput(java.lang.String arg1, int arg2) throws java.io.FileNotFoundException;
  public abstract boolean deleteFile(java.lang.String arg1);
  public abstract java.io.File getFileStreamPath(java.lang.String arg1);
  public abstract java.lang.String [] fileList();
  public abstract java.io.File getFilesDir();
  public abstract java.io.File getExternalFilesDir(java.lang.String arg1);
  public abstract java.io.File getObbDir();
  public abstract java.io.File getCacheDir();
  public abstract java.io.File getExternalCacheDir();
  public abstract java.io.File getDir(java.lang.String arg1, int arg2);
  public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3);
  public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg4);
  public abstract boolean deleteDatabase(java.lang.String arg1);
  public abstract java.io.File getDatabasePath(java.lang.String arg1);
  public abstract java.lang.String [] databaseList();
  public abstract android.graphics.drawable.Drawable getWallpaper();
  public abstract android.graphics.drawable.Drawable peekWallpaper();
  public abstract int getWallpaperDesiredMinimumWidth();
  public abstract int getWallpaperDesiredMinimumHeight();
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Context.setWallpaper-1", report = "-")
  public abstract void setWallpaper(android.graphics.Bitmap arg1) throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Context.setWallpaper-2", report = "-")
  public abstract void setWallpaper(java.io.InputStream arg1) throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Context.clearWallpaper", report = "-")
  public abstract void clearWallpaper() throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendOrderedBroadcast-1", pos = {1, 2}, report = "-")
  public abstract void sendOrderedBroadcast(Intent arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendOrderedBroadcast-2", pos = {1, 2}, report = "-")
  public abstract void sendOrderedBroadcast(Intent arg1, java.lang.String arg2, BroadcastReceiver arg3, android.os.Handler arg4, int arg5, java.lang.String arg6, android.os.Bundle arg7);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.sendStickyBroadcast-2", pos = 1, report = "-")
  public abstract void sendStickyOrderedBroadcast(Intent arg1, BroadcastReceiver arg2, android.os.Handler arg3, int arg4, java.lang.String arg5, android.os.Bundle arg6);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.removeStickyBroadcast-1", pos = 1, report = "-")
  public abstract void removeStickyBroadcast(Intent arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.startService", pos = 1, report = "-")
  public abstract ComponentName startService(Intent arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.stopService", pos = 1, report = "-")
  public abstract boolean stopService(Intent arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Context.bindService", pos = 1, report = "-")
  public abstract boolean bindService(Intent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.ServiceConnection.onServiceConnected") ServiceConnection arg2, int arg3);
  public abstract void unbindService(ServiceConnection arg1);
  public abstract boolean startInstrumentation(ComponentName arg1, java.lang.String arg2, android.os.Bundle arg3);
  public abstract int checkCallingPermission(java.lang.String arg1);
  public abstract int checkCallingOrSelfPermission(java.lang.String arg1);
  public abstract void enforcePermission(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4);
  public abstract void enforceCallingPermission(java.lang.String arg1, java.lang.String arg2);
  public abstract void enforceCallingOrSelfPermission(java.lang.String arg1, java.lang.String arg2);
  public abstract void grantUriPermission(java.lang.String arg1, android.net.Uri arg2, int arg3);
  public abstract void revokeUriPermission(android.net.Uri arg1, int arg2);
  public abstract int checkUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4);
  public abstract int checkUriPermission(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6);
  public abstract int checkCallingUriPermission(android.net.Uri arg1, int arg2);
  public abstract int checkCallingOrSelfUriPermission(android.net.Uri arg1, int arg2);
  public abstract void enforceUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4, java.lang.String arg5);
  public abstract void enforceUriPermission(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6, java.lang.String arg7);
  public abstract void enforceCallingUriPermission(android.net.Uri arg1, int arg2, java.lang.String arg3);
  public abstract void enforceCallingOrSelfUriPermission(android.net.Uri arg1, int arg2, java.lang.String arg3);
  public abstract Context createPackageContext(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException;
  public boolean isRestricted(){
    return false;
  }
  public final java.lang.CharSequence getText(int arg1){
    return (java.lang.CharSequence) null;
  }
  public final android.content.res.TypedArray obtainStyledAttributes(int [] arg1){
    return (android.content.res.TypedArray) null;
  }
  public final android.content.res.TypedArray obtainStyledAttributes(int arg1, int [] arg2) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.TypedArray) null;
  }
  public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet arg1, int [] arg2){
    return (android.content.res.TypedArray) null;
  }
  public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet arg1, int [] arg2, int arg3, int arg4){
    return (android.content.res.TypedArray) null;
  }
  public void registerComponentCallbacks(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ComponentCallbacks") ComponentCallbacks arg1){
  }
  public void unregisterComponentCallbacks(ComponentCallbacks arg1){
  }
}
