package com.android.internal.telephony.gsm;

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
public class UsimPhoneBookManager
  extends android.os.Handler  implements com.android.internal.telephony.IccConstants
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public UsimPhoneBookManager(com.android.internal.telephony.PhoneBase arg1, com.android.internal.telephony.AdnRecordCache arg2){
    super();
  }
  // Methods

  public void reset(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void invalidateCache(){
  }
  public java.util.ArrayList<com.android.internal.telephony.AdnRecord> loadEfFilesFromUsim(){
    return (java.util.ArrayList) null;
  }
}
