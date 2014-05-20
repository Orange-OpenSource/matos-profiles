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


public abstract class PackageMonitor
  extends android.content.BroadcastReceiver{
  // Fields

  public static final int PACKAGE_UNCHANGED = 0;

  public static final int PACKAGE_UPDATING = 1;

  public static final int PACKAGE_TEMPORARY_CHANGE = 2;

  public static final int PACKAGE_PERMANENT_CHANGE = 3;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceive")
  public PackageMonitor(){
    super();
  }
  // Methods

  public void register(android.content.Context arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onReceive(android.content.Context arg1, android.content.Intent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageUpdateFinished(java.lang.String arg1, int arg2){
  }
  public void unregister(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onBeginPackageChanges(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageAdded(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageRemoved(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageUpdateStarted(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageChanged(java.lang.String arg1, int arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public boolean onHandleForceStop(android.content.Intent arg1, java.lang.String [] arg2, int arg3, boolean arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onUidRemoved(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackagesAvailable(java.lang.String [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackagesUnavailable(java.lang.String [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageDisappeared(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageAppeared(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onPackageModified(java.lang.String arg1){
  }
  public boolean didSomePackagesChange(){
    return false;
  }
  public int isPackageAppearing(java.lang.String arg1){
    return 0;
  }
  public boolean anyPackagesAppearing(){
    return false;
  }
  public int isPackageDisappearing(java.lang.String arg1){
    return 0;
  }
  public boolean anyPackagesDisappearing(){
    return false;
  }
  public boolean isPackageModified(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onSomePackagesChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public void onFinishPackageChanges(){
  }
}
