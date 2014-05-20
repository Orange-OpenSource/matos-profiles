package com.android.internal.telephony.cat;

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
public class CatService
  extends android.os.Handler  implements AppInterface
{
  // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private CatService(com.android.internal.telephony.CommandsInterface arg1, com.android.internal.telephony.IccRecords arg2, android.content.Context arg3, com.android.internal.telephony.IccFileHandler arg4, com.android.internal.telephony.IccCard arg5){
    super();
  }
  // Methods

  protected void finalize(){
  }
  
  public static CatService getInstance(com.android.internal.telephony.CommandsInterface arg1, com.android.internal.telephony.IccRecords arg2, android.content.Context arg3, com.android.internal.telephony.IccFileHandler arg4, com.android.internal.telephony.IccCard arg5){
    return (CatService) null;
  }
  
  public static AppInterface getInstance(){
    return (AppInterface) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onCmdResponse(CatResponseMessage arg1){
  }
}
