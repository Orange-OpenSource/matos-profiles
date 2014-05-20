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


public class RetrieveConf
  extends MultimediaMessagePdu{
  // Constructors

  public RetrieveConf() throws com.google.android.mms.InvalidHeaderValueException{
    super();
  }
  RetrieveConf(PduHeaders arg1){
    super();
  }
  RetrieveConf(PduHeaders arg1, PduBody arg2){
    super();
  }
  // Methods

  public byte [] getContentType(){
    return (byte []) null;
  }
  public void setContentType(byte [] arg1){
  }
  public byte [] getMessageClass(){
    return (byte []) null;
  }
  public EncodedStringValue getFrom(){
    return (EncodedStringValue) null;
  }
  public void setFrom(EncodedStringValue arg1){
  }
  public byte [] getMessageId(){
    return (byte []) null;
  }
  public void setMessageId(byte [] arg1){
  }
  public byte [] getTransactionId(){
    return (byte []) null;
  }
  public int getDeliveryReport(){
    return 0;
  }
  public int getReadReport(){
    return 0;
  }
  public EncodedStringValue [] getCc(){
    return (EncodedStringValue []) null;
  }
  public void addCc(EncodedStringValue arg1){
  }
  public void setDeliveryReport(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
  public void setMessageClass(byte [] arg1){
  }
  public void setReadReport(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
  public void setTransactionId(byte [] arg1){
  }
  public int getRetrieveStatus(){
    return 0;
  }
  public void setRetrieveStatus(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
  public EncodedStringValue getRetrieveText(){
    return (EncodedStringValue) null;
  }
  public void setRetrieveText(EncodedStringValue arg1){
  }
}
