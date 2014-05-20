package android.test.mock;

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
public class MockContext
  extends android.content.Context{
  // Constructors

  public MockContext(){
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
  public java.lang.Object getSystemService(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void startActivity(android.content.Intent arg1){
  }
  public void startActivities(android.content.Intent [] arg1){
  }
  public void startIntentSender(android.content.IntentSender arg1, android.content.Intent arg2, int arg3, int arg4, int arg5) throws android.content.IntentSender.SendIntentException{
  }
  public android.content.res.Resources.Theme getTheme(){
    return (android.content.res.Resources.Theme) null;
  }
  public void setTheme(int arg1){
  }
  public android.content.ContentResolver getContentResolver(){
    return (android.content.ContentResolver) null;
  }
  public android.content.Intent registerReceiver(android.content.BroadcastReceiver arg1, android.content.IntentFilter arg2){
    return (android.content.Intent) null;
  }
  public android.content.Intent registerReceiver(android.content.BroadcastReceiver arg1, android.content.IntentFilter arg2, java.lang.String arg3, android.os.Handler arg4){
    return (android.content.Intent) null;
  }
  public void unregisterReceiver(android.content.BroadcastReceiver arg1){
  }
  public void sendStickyBroadcast(android.content.Intent arg1){
  }
  public void sendBroadcast(android.content.Intent arg1){
  }
  public void sendBroadcast(android.content.Intent arg1, java.lang.String arg2){
  }
  public android.content.pm.ApplicationInfo getApplicationInfo(){
    return (android.content.pm.ApplicationInfo) null;
  }
  public android.content.SharedPreferences getSharedPreferences(java.lang.String arg1, int arg2){
    return (android.content.SharedPreferences) null;
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
  public android.content.Context getApplicationContext(){
    return (android.content.Context) null;
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
  public void clearWallpaper(){
  }
  public void sendOrderedBroadcast(android.content.Intent arg1, java.lang.String arg2){
  }
  public void sendOrderedBroadcast(android.content.Intent arg1, java.lang.String arg2, android.content.BroadcastReceiver arg3, android.os.Handler arg4, int arg5, java.lang.String arg6, android.os.Bundle arg7){
  }
  public void sendStickyOrderedBroadcast(android.content.Intent arg1, android.content.BroadcastReceiver arg2, android.os.Handler arg3, int arg4, java.lang.String arg5, android.os.Bundle arg6){
  }
  public void removeStickyBroadcast(android.content.Intent arg1){
  }
  public android.content.ComponentName startService(android.content.Intent arg1){
    return (android.content.ComponentName) null;
  }
  public boolean stopService(android.content.Intent arg1){
    return false;
  }
  public boolean bindService(android.content.Intent arg1, android.content.ServiceConnection arg2, int arg3){
    return false;
  }
  public void unbindService(android.content.ServiceConnection arg1){
  }
  public boolean startInstrumentation(android.content.ComponentName arg1, java.lang.String arg2, android.os.Bundle arg3){
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
  public android.content.Context createPackageContext(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.Context) null;
  }
  public boolean isRestricted(){
    return false;
  }
}
