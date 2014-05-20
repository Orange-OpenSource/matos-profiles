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
public final class CdmaMmiCode
  extends android.os.Handler  implements com.android.internal.telephony.MmiCode
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  CdmaMmiCode(CDMAPhone arg1){
    super();
  }
  // Methods

  public java.lang.CharSequence getMessage(){
    return (java.lang.CharSequence) null;
  }
  public com.android.internal.telephony.MmiCode.State getState(){
    return (com.android.internal.telephony.MmiCode.State) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void cancel(){
  }
  public boolean isUssdRequest(){
    return false;
  }
  public boolean isCancelable(){
    return false;
  }
  public static CdmaMmiCode newFromDialString(java.lang.String arg1, CDMAPhone arg2){
    return (CdmaMmiCode) null;
  }
}
