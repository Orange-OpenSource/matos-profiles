package android.nfc.tech;

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


public abstract class BasicTagTechnology
  implements TagTechnology
{
  // Constructors

  BasicTagTechnology(android.nfc.Tag arg1, int arg2) throws android.os.RemoteException{
  }
  // Methods

  public void close() throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value="BasicTagTechnology.connect", pos=0)
  public void connect() throws java.io.IOException{
  }
  public boolean isConnected(){
    return false;
  }
  public void reconnect() throws java.io.IOException{
  }
  public android.nfc.Tag getTag(){
    return (android.nfc.Tag) null;
  }
}
