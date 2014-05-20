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


public class PhoneSubInfoProxy
  extends IPhoneSubInfo.Stub{
  // Constructors

  public PhoneSubInfoProxy(PhoneSubInfo arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public java.lang.String getDeviceId(){
    return (java.lang.String) null;
  }
  public java.lang.String getDeviceSvn(){
    return (java.lang.String) null;
  }
  public java.lang.String getSubscriberId(){
    return (java.lang.String) null;
  }
  public java.lang.String getIccSerialNumber(){
    return (java.lang.String) null;
  }
  public java.lang.String getLine1Number(){
    return (java.lang.String) null;
  }
  public java.lang.String getLine1AlphaTag(){
    return (java.lang.String) null;
  }
  public java.lang.String getMsisdn(){
    return (java.lang.String) null;
  }
  public java.lang.String getIsimImpi(){
    return (java.lang.String) null;
  }
  public java.lang.String getIsimDomain(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getIsimImpu(){
    return (java.lang.String []) null;
  }
  public void setmPhoneSubInfo(PhoneSubInfo arg1){
  }
  public java.lang.String getCompleteVoiceMailNumber(){
    return (java.lang.String) null;
  }
}
