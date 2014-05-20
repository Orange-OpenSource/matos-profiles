package com.android.server;

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


public class PackageManagerBackupAgent
  extends android.app.backup.BackupAgent{
  // Classes

  public class Metadata
  {
    // Fields

    public int versionCode;

    public android.content.pm.Signature [] signatures;

    // Constructors

    Metadata(int arg1, android.content.pm.Signature [] arg2){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  PackageManagerBackupAgent(android.content.pm.PackageManager arg1, java.util.List<android.content.pm.PackageInfo> arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBackup(android.os.ParcelFileDescriptor arg1, android.app.backup.BackupDataOutput arg2, android.os.ParcelFileDescriptor arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestore(android.app.backup.BackupDataInput arg1, int arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException{
  }
  public boolean hasMetadata(){
    return false;
  }
  public PackageManagerBackupAgent.Metadata getRestoredMetadata(java.lang.String arg1){
    return (PackageManagerBackupAgent.Metadata) null;
  }
  public java.util.Set<java.lang.String> getRestoredPackages(){
    return (java.util.Set) null;
  }
}
