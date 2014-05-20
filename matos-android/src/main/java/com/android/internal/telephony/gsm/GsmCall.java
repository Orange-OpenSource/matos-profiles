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


public class GsmCall
  extends com.android.internal.telephony.Call{
  // Constructors

  GsmCall(GsmCallTracker arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void dispose(){
  }
  public void hangup() throws com.android.internal.telephony.CallStateException{
  }
  public java.util.List<com.android.internal.telephony.Connection> getConnections(){
    return (java.util.List) null;
  }
  public boolean isMultiparty(){
    return false;
  }
  public com.android.internal.telephony.Phone getPhone(){
    return (com.android.internal.telephony.Phone) null;
  }
}
