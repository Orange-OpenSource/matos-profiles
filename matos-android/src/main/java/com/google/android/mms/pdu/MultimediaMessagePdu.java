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


public class MultimediaMessagePdu
  extends GenericPdu{
  // Constructors

  public MultimediaMessagePdu(){
    super();
  }
  public MultimediaMessagePdu(PduHeaders arg1, PduBody arg2){
    super();
  }
  MultimediaMessagePdu(PduHeaders arg1){
    super();
  }
  // Methods

  public void setPriority(int arg1) throws com.google.android.mms.InvalidHeaderValueException{
  }
  public int getPriority(){
    return 0;
  }
  public long getDate(){
    return 0l;
  }
  public void setSubject(EncodedStringValue arg1){
  }
  public void setDate(long arg1){
  }
  public EncodedStringValue [] getTo(){
    return (EncodedStringValue []) null;
  }
  public PduBody getBody(){
    return (PduBody) null;
  }
  public EncodedStringValue getSubject(){
    return (EncodedStringValue) null;
  }
  public void setBody(PduBody arg1){
  }
  public void addTo(EncodedStringValue arg1){
  }
}
