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


public abstract class IccPhoneBookInterfaceManager
  extends IIccPhoneBook.Stub{
  // Fields

  protected static final boolean DBG = false;

  protected PhoneBase phone;

  protected AdnRecordCache adnCache;

  protected final java.lang.Object mLock = (java.lang.Object) null;

  protected int [] recordSize;

  protected boolean success;

  protected java.util.List<AdnRecord> records;

  protected static final boolean ALLOW_SIM_OP_IN_UI_THREAD = false;

  protected static final int EVENT_GET_SIZE_DONE = 0;

  protected static final int EVENT_LOAD_DONE = 0;

  protected static final int EVENT_UPDATE_DONE = 0;

  protected android.os.Handler mBaseHandler;

  // Constructors

  public IccPhoneBookInterfaceManager(@com.francetelecom.rd.stubs.annotation.FieldSet("this.phone") PhoneBase arg1){
    super();
  }
  // Methods

  protected void publish(){
  }
  protected abstract void logd(java.lang.String arg1);
  protected abstract void loge(java.lang.String arg1);
  public void dispose(){
  }
  public java.util.List<AdnRecord> getAdnRecordsInEf(int arg1){
    return (java.util.List) null;
  }
  public boolean updateAdnRecordsInEfBySearch(int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6){
    return false;
  }
  public boolean updateAdnRecordsInEfByIndex(int arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5){
    return false;
  }
  public abstract int [] getAdnRecordsSize(int arg1);
  protected void checkThread(){
  }
  protected void waitForResult(java.util.concurrent.atomic.AtomicBoolean arg1){
  }
}
