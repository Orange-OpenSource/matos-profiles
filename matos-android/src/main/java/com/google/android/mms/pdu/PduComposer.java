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


public class PduComposer
{
  // Fields

  protected java.io.ByteArrayOutputStream mMessage;

  protected int mPosition;

  // Constructors

  public PduComposer(android.content.Context arg1, GenericPdu arg2){
  }
  // Methods

  protected void append(int arg1){
  }
  protected void arraycopy(byte [] arg1, int arg2, int arg3){
  }
  public byte [] make(){
    return (byte []) null;
  }
  protected void appendTextString(byte [] arg1){
  }
  protected void appendTextString(java.lang.String arg1){
  }
  protected void appendShortInteger(int arg1){
  }
  protected void appendOctet(int arg1){
  }
  protected void appendShortLength(int arg1){
  }
  protected void appendLongInteger(long arg1){
  }
  protected void appendEncodedString(EncodedStringValue arg1){
  }
  protected void appendUintvarInteger(long arg1){
  }
  protected void appendDateValue(long arg1){
  }
  protected void appendValueLength(long arg1){
  }
  protected void appendQuotedString(byte [] arg1){
  }
  protected void appendQuotedString(java.lang.String arg1){
  }
  protected static int checkAddressType(java.lang.String arg1){
    return 0;
  }
}
