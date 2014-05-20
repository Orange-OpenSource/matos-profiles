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


public final class AdnRecordCache
  extends android.os.Handler  implements IccConstants
{
  // Constructors

  public AdnRecordCache(PhoneBase arg1){
    super();
  }
  // Methods

  public void reset(){
  }
  public void handleMessage(android.os.Message arg1){
  }
  public void requestLoadAllAdnLike(int arg1, int arg2, android.os.Message arg3){
  }
  public void updateAdnBySearch(int arg1, AdnRecord arg2, AdnRecord arg3, java.lang.String arg4, android.os.Message arg5){
  }
  public void updateAdnByIndex(int arg1, AdnRecord arg2, int arg3, java.lang.String arg4, android.os.Message arg5){
  }
  public java.util.ArrayList<AdnRecord> getRecordsIfLoaded(int arg1){
    return (java.util.ArrayList) null;
  }
}
