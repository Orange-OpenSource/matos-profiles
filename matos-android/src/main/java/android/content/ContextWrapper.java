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

import com.francetelecom.rd.stubs.annotation.UseRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ContextWrapper
  extends Context{
  // Constructors

  public ContextWrapper(Context arg1){
    super();
  }
  // Methods

  public int checkPermission(java.lang.String arg1, int arg2, int arg3){
    return 0;
  }
  public java.lang.ClassLoader getClassLoader(){
    return (java.lang.ClassLoader) null;
  }
  public android.content.res.Resources getResources(){
    return (android.content.res.Resources) null;
  }
  public java.lang.String getPackageName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContextWrapper.getSystemService", pos = 1, report = "-")
  @com.francetelecom.rd.stubs.annotation.MayBe({
	  "android.view.accessibility.AccessibilityManager", // accessibility
	  "android.accounts.AccountManager",
	  "android.app.ActivityManager",
	  "android.app.AlarmManager", 
	  "android.media.AudioManager",
	  "android.content.ClipboardManager",
	  "android.net.ConnectivityManager",
	  "android.location.CountryDetector",
	  "android.app.admin.DevicePolicyManager",
	  "android.app.DownloadManager",
	  "android.nfc.NfcManager",
	  "android.os.DropBoxManager",
	  "android.view.inputmethod.InputMethodManager",
	  "android.view.textservice.TextServicesManager",
	  "android.app.KeyguardManager",
	  "com.android.internal.policy.impl.PhoneLayoutInflater",
	  "android.location.LocationManager",
	  "android.net.NetworkPolicyManager",
	  "android.app.NotificationManager",
	  "android.os.PowerManager", 
	  "android.app.SearchManager", 
	  "android.hardware.SensorManager",
	  "android.app.StatusBarManager",
	  "android.os.storage.StorageManager",
	  "android.telephony.TelephonyManager",
	  "android.net.ThrottleManager",
	  "android.app.UiModeManager",
	  "android.hardware.usb.UsbManager",
	  "android.os.Vibrator",  
	  "android.net.wifi.WifiManager",  
	  "android.net.wifi.p2p.WifiP2pManager",
	    "android.view.WindowManagerImpl"
	  })
  public java.lang.Object getSystemService(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void startActivity(Intent arg1){
  }
  public void startActivities(Intent [] arg1){
  }
  public void startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5) throws IntentSender.SendIntentException{
  }
  public android.content.res.Resources.Theme getTheme(){
    return (android.content.res.Resources.Theme) null;
  }
  protected void attachBaseContext(Context arg1){
  }
  public void setTheme(int arg1){
  }
  public int getThemeResId(){
    return 0;
  }
  public ContentResolver getContentResolver(){
    return (ContentResolver) null;
  }
  public Intent registerReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1, IntentFilter arg2){
    return (Intent) null;
  }
  public Intent registerReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1, IntentFilter arg2, java.lang.String arg3, android.os.Handler arg4){
    return (Intent) null;
  }
  public void unregisterReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.BroadcastReceiver.onReceive") BroadcastReceiver arg1){
  }
  public void sendStickyBroadcast(Intent arg1){
  }
  public void sendBroadcast(Intent arg1){
  }
  public void sendBroadcast(Intent arg1, java.lang.String arg2){
  }
  public android.content.pm.ApplicationInfo getApplicationInfo(){
    return (android.content.pm.ApplicationInfo) null;
  }
  public SharedPreferences getSharedPreferences(java.lang.String arg1, int arg2){
    return (SharedPreferences) null;
  }
  public Context getBaseContext(){
    return (Context) null;
  }
  public android.content.res.AssetManager getAssets(){
    return (android.content.res.AssetManager) null;
  }
  public android.content.pm.PackageManager getPackageManager(){
    return (android.content.pm.PackageManager) null;
  }
  public android.os.Looper getMainLooper(){
    return (android.os.Looper) null;
  }
  public Context getApplicationContext(){
    return (Context) null;
  }
  public java.lang.String getPackageResourcePath(){
    return (java.lang.String) null;
  }
  public java.lang.String getPackageCodePath(){
    return (java.lang.String) null;
  }
  public java.io.File getSharedPrefsFile(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.io.FileInputStream openFileInput(java.lang.String arg1) throws java.io.FileNotFoundException{
    return (java.io.FileInputStream) null;
  }
  public java.io.FileOutputStream openFileOutput(java.lang.String arg1, int arg2) throws java.io.FileNotFoundException{
    return (java.io.FileOutputStream) null;
  }
  public boolean deleteFile(java.lang.String arg1){
    return false;
  }
  public java.io.File getFileStreamPath(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.lang.String [] fileList(){
    return (java.lang.String []) null;
  }
  public java.io.File getFilesDir(){
    return (java.io.File) null;
  }
  public java.io.File getExternalFilesDir(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.io.File getObbDir(){
    return (java.io.File) null;
  }
  public java.io.File getCacheDir(){
    return (java.io.File) null;
  }
  public java.io.File getExternalCacheDir(){
    return (java.io.File) null;
  }
  public java.io.File getDir(java.lang.String arg1, int arg2){
    return (java.io.File) null;
  }
  public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3){
    return (android.database.sqlite.SQLiteDatabase) null;
  }
  public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg4){
    return (android.database.sqlite.SQLiteDatabase) null;
  }
  public boolean deleteDatabase(java.lang.String arg1){
    return false;
  }
  public java.io.File getDatabasePath(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.lang.String [] databaseList(){
    return (java.lang.String []) null;
  }
  public android.graphics.drawable.Drawable getWallpaper(){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable peekWallpaper(){
    return (android.graphics.drawable.Drawable) null;
  }
  public int getWallpaperDesiredMinimumWidth(){
    return 0;
  }
  public int getWallpaperDesiredMinimumHeight(){
    return 0;
  }
  
  public void setWallpaper(android.graphics.Bitmap arg1) throws java.io.IOException{
  }
  
  public void setWallpaper(java.io.InputStream arg1) throws java.io.IOException{
  }
  public void clearWallpaper() throws java.io.IOException{
  }
  public void sendOrderedBroadcast(Intent arg1, java.lang.String arg2){
  }
  public void sendOrderedBroadcast(Intent arg1, java.lang.String arg2, BroadcastReceiver arg3, android.os.Handler arg4, int arg5, java.lang.String arg6, android.os.Bundle arg7){
  }
  public void sendStickyOrderedBroadcast(Intent arg1, BroadcastReceiver arg2, android.os.Handler arg3, int arg4, java.lang.String arg5, android.os.Bundle arg6){
  }
  public void removeStickyBroadcast(Intent arg1){
  }
  public ComponentName startService(Intent arg1){
    return (ComponentName) null;
  }
  public boolean stopService(Intent arg1){
    return false;
  }
  public boolean bindService(Intent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.ServiceConnection.onServiceConnected") ServiceConnection arg2, int arg3){
    return false;
  }
  public void unbindService(ServiceConnection arg1){
  }
  public boolean startInstrumentation(ComponentName arg1, java.lang.String arg2, android.os.Bundle arg3){
    return false;
  }
  public int checkCallingPermission(java.lang.String arg1){
    return 0;
  }
  public int checkCallingOrSelfPermission(java.lang.String arg1){
    return 0;
  }
  public void enforcePermission(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4){
  }
  public void enforceCallingPermission(java.lang.String arg1, java.lang.String arg2){
  }
  public void enforceCallingOrSelfPermission(java.lang.String arg1, java.lang.String arg2){
  }
  public void grantUriPermission(java.lang.String arg1, android.net.Uri arg2, int arg3){
  }
  public void revokeUriPermission(android.net.Uri arg1, int arg2){
  }
  public int checkUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public int checkUriPermission(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public int checkCallingUriPermission(android.net.Uri arg1, int arg2){
    return 0;
  }
  public int checkCallingOrSelfUriPermission(android.net.Uri arg1, int arg2){
    return 0;
  }
  public void enforceUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4, java.lang.String arg5){
  }
  public void enforceUriPermission(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6, java.lang.String arg7){
  }
  public void enforceCallingUriPermission(android.net.Uri arg1, int arg2, java.lang.String arg3){
  }
  public void enforceCallingOrSelfUriPermission(android.net.Uri arg1, int arg2, java.lang.String arg3){
  }
  public Context createPackageContext(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (Context) null;
  }
  public boolean isRestricted(){
    return false;
  }
}
