package com.android.internal.content;

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


public class PackageHelper
{
  // Fields

  public static final int RECOMMEND_INSTALL_INTERNAL = 1;

  public static final int RECOMMEND_INSTALL_EXTERNAL = 2;

  public static final int RECOMMEND_FAILED_INSUFFICIENT_STORAGE = -1;

  public static final int RECOMMEND_FAILED_INVALID_APK = -2;

  public static final int RECOMMEND_FAILED_INVALID_LOCATION = -3;

  public static final int RECOMMEND_FAILED_ALREADY_EXISTS = -4;

  public static final int RECOMMEND_MEDIA_UNAVAILABLE = -5;

  public static final int RECOMMEND_FAILED_INVALID_URI = -6;

  public static final int APP_INSTALL_AUTO = 0;

  public static final int APP_INSTALL_INTERNAL = 1;

  public static final int APP_INSTALL_EXTERNAL = 2;

  // Constructors

  public PackageHelper(){
  }
  // Methods

  public static android.os.storage.IMountService getMountService(){
    return (android.os.storage.IMountService) null;
  }
  public static java.lang.String createSdDir(int arg1, java.lang.String arg2, java.lang.String arg3, int arg4){
    return (java.lang.String) null;
  }
  public static java.lang.String mountSdDir(java.lang.String arg1, java.lang.String arg2, int arg3){
    return (java.lang.String) null;
  }
  public static boolean unMountSdDir(java.lang.String arg1){
    return false;
  }
  public static boolean renameSdDir(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static java.lang.String getSdDir(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getSdFilesystem(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean finalizeSdDir(java.lang.String arg1){
    return false;
  }
  public static boolean destroySdDir(java.lang.String arg1){
    return false;
  }
  public static java.lang.String [] getSecureContainerList(){
    return (java.lang.String []) null;
  }
  public static boolean isContainerMounted(java.lang.String arg1){
    return false;
  }
}
