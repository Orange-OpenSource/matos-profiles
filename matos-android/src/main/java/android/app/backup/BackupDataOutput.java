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


public class BackupDataOutput
{
  // Constructors

  public BackupDataOutput(java.io.FileDescriptor arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("backupOutput")
  public void setKeyPrefix(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("backupOutput")
  public int writeEntityHeader(java.lang.String arg1, int arg2) throws java.io.IOException{
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("backupOutput")
  public int writeEntityData(byte [] arg1, int arg2) throws java.io.IOException{
    return 0;
  }
}
