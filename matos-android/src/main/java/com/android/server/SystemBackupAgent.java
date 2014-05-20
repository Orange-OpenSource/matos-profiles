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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SystemBackupAgent
  extends android.app.backup.BackupAgentHelper{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SystemBackupAgent(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBackup(android.os.ParcelFileDescriptor arg1, android.app.backup.BackupDataOutput arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestore(android.app.backup.BackupDataInput arg1, int arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFullBackup(android.app.backup.FullBackupDataOutput arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreFile(android.os.ParcelFileDescriptor arg1, long arg2, int arg3, java.lang.String arg4, java.lang.String arg5, long arg6, long arg7) throws java.io.IOException{
  }
}
