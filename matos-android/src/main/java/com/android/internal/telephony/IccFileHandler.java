package com.android.internal.telephony;

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
public abstract class IccFileHandler
  extends android.os.Handler  implements IccConstants
{
  // Fields

  protected static final int COMMAND_READ_BINARY = 0;

  protected static final int COMMAND_UPDATE_BINARY = 0;

  protected static final int COMMAND_READ_RECORD = 0;

  protected static final int COMMAND_UPDATE_RECORD = 0;

  protected static final int COMMAND_SEEK = 0;

  protected static final int COMMAND_GET_RESPONSE = 0;

  protected static final int READ_RECORD_MODE_ABSOLUTE = 0;

  protected static final int EF_TYPE_TRANSPARENT = 0;

  protected static final int EF_TYPE_LINEAR_FIXED = 0;

  protected static final int EF_TYPE_CYCLIC = 0;

  protected static final int TYPE_RFU = 0;

  protected static final int TYPE_MF = 0;

  protected static final int TYPE_DF = 0;

  protected static final int TYPE_EF = 0;

  protected static final int GET_RESPONSE_EF_SIZE_BYTES = 0;

  protected static final int GET_RESPONSE_EF_IMG_SIZE_BYTES = 0;

  protected static final int RESPONSE_DATA_RFU_1 = 0;

  protected static final int RESPONSE_DATA_RFU_2 = 0;

  protected static final int RESPONSE_DATA_FILE_SIZE_1 = 0;

  protected static final int RESPONSE_DATA_FILE_SIZE_2 = 0;

  protected static final int RESPONSE_DATA_FILE_ID_1 = 0;

  protected static final int RESPONSE_DATA_FILE_ID_2 = 0;

  protected static final int RESPONSE_DATA_FILE_TYPE = 0;

  protected static final int RESPONSE_DATA_RFU_3 = 0;

  protected static final int RESPONSE_DATA_ACCESS_CONDITION_1 = 0;

  protected static final int RESPONSE_DATA_ACCESS_CONDITION_2 = 0;

  protected static final int RESPONSE_DATA_ACCESS_CONDITION_3 = 0;

  protected static final int RESPONSE_DATA_FILE_STATUS = 0;

  protected static final int RESPONSE_DATA_LENGTH = 0;

  protected static final int RESPONSE_DATA_STRUCTURE = 0;

  protected static final int RESPONSE_DATA_RECORD_LENGTH = 0;

  protected static final int EVENT_GET_BINARY_SIZE_DONE = 0;

  protected static final int EVENT_READ_BINARY_DONE = 0;

  protected static final int EVENT_GET_RECORD_SIZE_DONE = 0;

  protected static final int EVENT_READ_RECORD_DONE = 0;

  protected static final int EVENT_GET_EF_LINEAR_RECORD_SIZE_DONE = 0;

  protected static final int EVENT_READ_IMG_DONE = 0;

  protected static final int EVENT_READ_ICON_DONE = 0;

  protected PhoneBase phone;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")
  protected IccFileHandler(PhoneBase arg1){
    super();
  }
  // Methods

  protected abstract void logd(java.lang.String arg1);
  protected abstract void loge(java.lang.String arg1);
  protected abstract java.lang.String getEFPath(int arg1);
  public void loadEFTransparent(int arg1, android.os.Message arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handleMessage")
  public void handleMessage(android.os.Message arg1){
  }
  protected java.lang.String getCommonIccEFPath(int arg1){
    return (java.lang.String) null;
  }
  public void dispose(){
  }
  public void loadEFLinearFixed(int arg1, int arg2, android.os.Message arg3){
  }
  public void loadEFImgLinearFixed(int arg1, android.os.Message arg2){
  }
  public void getEFLinearRecordSize(int arg1, android.os.Message arg2){
  }
  public void loadEFLinearFixedAll(int arg1, android.os.Message arg2){
  }
  public void loadEFImgTransparent(int arg1, int arg2, int arg3, int arg4, android.os.Message arg5){
  }
  public void updateEFLinearFixed(int arg1, int arg2, byte [] arg3, java.lang.String arg4, android.os.Message arg5){
  }
  public void updateEFTransparent(int arg1, byte [] arg2, android.os.Message arg3){
  }
}
