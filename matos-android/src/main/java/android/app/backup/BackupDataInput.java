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


public class BackupDataInput
{
  // Constructors

  public BackupDataInput(java.io.FileDescriptor arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public int getDataSize(){
    return 0;
  }
  public boolean readNextHeader() throws java.io.IOException{
    return false;
  }
  public void skipEntityData() throws java.io.IOException{
  }
  public int readEntityData(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
}
