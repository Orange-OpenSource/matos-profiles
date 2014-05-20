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


public class PhoneFactory
{
  // Constructors

  public PhoneFactory(){
  }
  // Methods

  public static int getPhoneType(int arg1){
    return 0;
  }
  public static Phone getCdmaPhone(){
    return (Phone) null;
  }
  public static Phone getGsmPhone(){
    return (Phone) null;
  }
  public static void makeDefaultPhones(android.content.Context arg1){
  }
  public static void makeDefaultPhone(android.content.Context arg1){
  }
  public static Phone getDefaultPhone(){
    return (Phone) null;
  }
  public static com.android.internal.telephony.sip.SipPhone makeSipPhone(java.lang.String arg1){
    return (com.android.internal.telephony.sip.SipPhone) null;
  }
}
