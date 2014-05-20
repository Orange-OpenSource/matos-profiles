package com.android.internal.communication;

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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class MsgHeader
  extends com.google.protobuf.micro.MessageMicro{
  // Fields

  public static final int CMD_FIELD_NUMBER = 1;

  public static final int LENGTH_DATA_FIELD_NUMBER = 2;

  public static final int STATUS_FIELD_NUMBER = 3;

  public static final int TOKEN_FIELD_NUMBER = 4;

  // Constructors

  public MsgHeader(){
    super();
  }
  // Methods

  public final MsgHeader clear(){
    return (MsgHeader) null;
  }
  public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
  }
  public final boolean isInitialized(){
    return false;
  }
  public int getCachedSize(){
    return 0;
  }
  public int getSerializedSize(){
    return 0;
  }
  public MsgHeader mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
    return (MsgHeader) null;
  }
  public static MsgHeader parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
    return (MsgHeader) null;
  }
  public static MsgHeader parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
    return (MsgHeader) null;
  }
  public int getStatus(){
    return 0;
  }
  public MsgHeader clearStatus(){
    return (MsgHeader) null;
  }
  public int getCmd(){
    return 0;
  }
  public MsgHeader setStatus(int arg1){
    return (MsgHeader) null;
  }
  public long getToken(){
    return 0l;
  }
  public boolean hasToken(){
    return false;
  }
  public MsgHeader setToken(long arg1){
    return (MsgHeader) null;
  }
  public MsgHeader setLengthData(int arg1){
    return (MsgHeader) null;
  }
  public MsgHeader setCmd(int arg1){
    return (MsgHeader) null;
  }
  public int getLengthData(){
    return 0;
  }
  public boolean hasCmd(){
    return false;
  }
  public boolean hasLengthData(){
    return false;
  }
  public boolean hasStatus(){
    return false;
  }
  public MsgHeader clearCmd(){
    return (MsgHeader) null;
  }
  public MsgHeader clearLengthData(){
    return (MsgHeader) null;
  }
  public MsgHeader clearToken(){
    return (MsgHeader) null;
  }
}
