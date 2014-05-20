package android.drm;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


public class DrmInfoRequest
{
  // Fields

  public static final int TYPE_REGISTRATION_INFO = 1;

  public static final int TYPE_UNREGISTRATION_INFO = 2;

  public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;

  public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;

  public static final java.lang.String ACCOUNT_ID = "account_id";

  public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";

  // Constructors
  @ArgsRule(value="DrmInfoRequest",pos={1,2})
  public DrmInfoRequest(int arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.Object get(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void put(java.lang.String arg1, java.lang.Object arg2){
  }
  public java.util.Iterator<java.lang.Object> iterator(){
    return (java.util.Iterator) null;
  }
  public java.util.Iterator<java.lang.String> keyIterator(){
    return (java.util.Iterator) null;
  }
  public java.lang.String getMimeType(){
    return (java.lang.String) null;
  }
  public int getInfoType(){
    return 0;
  }
}
