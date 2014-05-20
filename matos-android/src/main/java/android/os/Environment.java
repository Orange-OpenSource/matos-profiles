package android.os;

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
public class Environment
{
  // Fields

  public static java.lang.String DIRECTORY_MUSIC;

  public static java.lang.String DIRECTORY_PODCASTS;

  public static java.lang.String DIRECTORY_RINGTONES;

  public static java.lang.String DIRECTORY_ALARMS;

  public static java.lang.String DIRECTORY_NOTIFICATIONS;

  public static java.lang.String DIRECTORY_PICTURES;

  public static java.lang.String DIRECTORY_MOVIES;

  public static java.lang.String DIRECTORY_DOWNLOADS;

  public static java.lang.String DIRECTORY_DCIM;

  public static final java.lang.String MEDIA_REMOVED = "removed";

  public static final java.lang.String MEDIA_UNMOUNTED = "unmounted";

  public static final java.lang.String MEDIA_CHECKING = "checking";

  public static final java.lang.String MEDIA_NOFS = "nofs";

  public static final java.lang.String MEDIA_MOUNTED = "mounted";

  public static final java.lang.String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";

  public static final java.lang.String MEDIA_SHARED = "shared";

  public static final java.lang.String MEDIA_BAD_REMOVAL = "bad_removal";

  public static final java.lang.String MEDIA_UNMOUNTABLE = "unmountable";

  // Constructors

  public Environment(){
  }
  // Methods

  public static boolean isExternalStorageEmulated(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getDataDirectory", pos = -1, report = "-")
  public static java.io.File getDataDirectory(){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getDownloadCacheDirectory", pos = -1, report = "-")
  public static java.io.File getDownloadCacheDirectory(){
    return (java.io.File) null;
  }
  public static boolean isExternalStorageRemovable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStorageDirectory(){
    return (java.io.File) null;
  }
  public static java.lang.String getExternalStorageState(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageAppCacheDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStorageAppCacheDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageAppDataDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStorageAppDataDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageAppMediaDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStorageAppMediaDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  public static java.io.File getExternalStorageAppObbDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStoragePublicDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStoragePublicDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getRootDirectory", pos = -1, report = "-")
  public static java.io.File getRootDirectory(){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageAppFilesDirectory", pos = -1, report = "-")
  public static java.io.File getExternalStorageAppFilesDirectory(java.lang.String arg1){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getExternalStorageDataDir", pos = -1, report = "-")
  public static java.io.File getExternalStorageAndroidDataDir(){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getSecureDataDirectory", pos = -1, report = "-")
  public static java.io.File getSecureDataDirectory(){
    return (java.io.File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Environment.getSystemSecureDirectory", pos = -1, report = "-")
  public static java.io.File getSystemSecureDirectory(){
    return (java.io.File) null;
  }
  public static boolean isEncryptedFilesystemEnabled(){
    return false;
  }
}
