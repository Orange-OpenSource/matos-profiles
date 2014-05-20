package android.app.backup;

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


public abstract class BackupAgent
  extends android.content.ContextWrapper{
  // Fields

  public static final int TYPE_EOF = 0;

  public static final int TYPE_FILE = 1;

  public static final int TYPE_DIRECTORY = 2;

  public static final int TYPE_SYMLINK = 3;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BackupAgent(){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  public void attach(android.content.Context arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final android.os.IBinder onBind(){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onBackup(android.os.ParcelFileDescriptor arg1, BackupDataOutput arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onRestore(BackupDataInput arg1, int arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFullBackup(FullBackupDataOutput arg1) throws java.io.IOException{
  }
  public final void fullBackupFile(java.io.File arg1, FullBackupDataOutput arg2){
  }
  protected final void fullBackupFileTree(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.util.HashSet<java.lang.String> arg4, FullBackupDataOutput arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreFile(android.os.ParcelFileDescriptor arg1, long arg2, java.io.File arg3, int arg4, long arg5, long arg6) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreFile(android.os.ParcelFileDescriptor arg1, long arg2, int arg3, java.lang.String arg4, java.lang.String arg5, long arg6, long arg7) throws java.io.IOException{
  }
}
