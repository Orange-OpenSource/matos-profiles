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


public class DeliveryInd
  extends GenericPdu{
  // Constructors

  public DeliveryInd() throws com.google.android.mms.InvalidHeaderValueException{
    super();
  }
  DeliveryInd(PduHeaders arg1){
    super();
  }
  // Methods

  public long getDate(){
    return 0l;
  }
  public int getStatus(){
    return 0;
  }
  public void setDate(long arg1){
  }
  public void setTo(@com.francetelecom.rd.stubs.annotation.FieldSet("encodedStringValue") EncodedStringValue [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("encodedStringValue")
  public EncodedStringValue [] getTo(){
    return (EncodedStringValue []) null;
  }
  public byte [] getMessageId(){
    return (byte []) null;
  }
  public void setMessageId(byte [] arg1){
  }
  public void setStatus(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
}
