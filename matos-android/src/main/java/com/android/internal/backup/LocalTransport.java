package com.android.internal.backup;

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


public class LocalTransport
  extends IBackupTransport.Stub{
  // Constructors

  public LocalTransport(android.content.Context arg1){
    super();
  }
  // Methods

  public int performBackup(android.content.pm.PackageInfo arg1, android.os.ParcelFileDescriptor arg2){
    return 0;
  }
  public int clearBackupData(android.content.pm.PackageInfo arg1){
    return 0;
  }
  public android.content.Intent configurationIntent(){
    return (android.content.Intent) null;
  }
  public java.lang.String currentDestinationString(){
    return (java.lang.String) null;
  }
  public java.lang.String transportDirName(){
    return (java.lang.String) null;
  }
  public long requestBackupTime(){
    return 0l;
  }
  public int initializeDevice(){
    return 0;
  }
  public int finishBackup(){
    return 0;
  }
  public android.app.backup.RestoreSet [] getAvailableRestoreSets() throws android.os.RemoteException{
    return (android.app.backup.RestoreSet []) null;
  }
  public long getCurrentRestoreSet(){
    return 0l;
  }
  public int startRestore(long arg1, android.content.pm.PackageInfo [] arg2){
    return 0;
  }
  public java.lang.String nextRestorePackage(){
    return (java.lang.String) null;
  }
  public int getRestoreData(android.os.ParcelFileDescriptor arg1){
    return 0;
  }
  public void finishRestore(){
  }
}
