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


public class BackupAgentHelper
  extends BackupAgent{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BackupAgentHelper(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBackup(android.os.ParcelFileDescriptor arg1, BackupDataOutput arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestore(BackupDataInput arg1, int arg2, android.os.ParcelFileDescriptor arg3) throws java.io.IOException{
  }
  public void addHelper(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("BackupHelper") BackupHelper arg2){
  }
  public BackupHelperDispatcher getDispatcher(){
    return (BackupHelperDispatcher) null;
  }
}
