package com.android.internal.telephony.cdma;

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
public class CdmaDataConnection
  extends com.android.internal.telephony.DataConnection{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private CdmaDataConnection(CDMAPhone arg1, java.lang.String arg2, int arg3, com.android.internal.telephony.RetryManager arg4){
    super((com.android.internal.telephony.PhoneBase) null, (java.lang.String) null, 0, (com.android.internal.telephony.RetryManager) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected void log(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConnect(com.android.internal.telephony.DataConnection.ConnectionParams arg1){
  }
  protected boolean isDnsOk(java.lang.String [] arg1){
    return false;
  }
}
