package com.google.android.mms.pdu;

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


public class NotificationInd
  extends GenericPdu{
  // Constructors

  public NotificationInd() throws com.google.android.mms.InvalidHeaderValueException{
    super();
  }
  NotificationInd(PduHeaders arg1){
    super();
  }
  // Methods

  public void setSubject(EncodedStringValue arg1){
  }
  public byte [] getMessageClass(){
    return (byte []) null;
  }
  public EncodedStringValue getFrom(){
    return (EncodedStringValue) null;
  }
  public void setFrom(EncodedStringValue arg1){
  }
  public byte [] getTransactionId(){
    return (byte []) null;
  }
  public EncodedStringValue getSubject(){
    return (EncodedStringValue) null;
  }
  public int getDeliveryReport(){
    return 0;
  }
  public long getExpiry(){
    return 0l;
  }
  public long getMessageSize(){
    return 0l;
  }
  public void setDeliveryReport(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
  public void setExpiry(long arg1){
  }
  public void setMessageSize(long arg1){
  }
  public void setMessageClass(byte [] arg1){
  }
  public void setTransactionId(byte [] arg1){
  }
  public byte [] getContentLocation(){
    return (byte []) null;
  }
  public void setContentLocation(byte [] arg1){
  }
  public int getContentClass(){
    return 0;
  }
  public void setContentClass(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
}
