package com.google.protobuf.micro;

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


public abstract class MessageMicro
{
  // Constructors

  public MessageMicro(){
  }
  // Methods

  public byte [] toByteArray(){
    return (byte []) null;
  }
  public void toByteArray(byte [] arg1, int arg2, int arg3){
  }
  public abstract void writeTo(CodedOutputStreamMicro arg1) throws java.io.IOException;
  public abstract int getCachedSize();
  public abstract int getSerializedSize();
  public abstract MessageMicro mergeFrom(CodedInputStreamMicro arg1) throws java.io.IOException;
  public MessageMicro mergeFrom(byte [] arg1) throws InvalidProtocolBufferMicroException{
    return (MessageMicro) null;
  }
  public MessageMicro mergeFrom(byte [] arg1, int arg2, int arg3) throws InvalidProtocolBufferMicroException{
    return (MessageMicro) null;
  }
  protected boolean parseUnknownField(CodedInputStreamMicro arg1, int arg2) throws java.io.IOException{
    return false;
  }
}
