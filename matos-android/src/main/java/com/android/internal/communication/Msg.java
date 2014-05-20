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
public class Msg
{
  // Constructors

  private Msg(){
  }
  // Methods

  public void read(com.android.internal.telephony.RilChannel arg1) throws java.io.IOException{
  }
  public void release(){
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, MsgHeader arg2, java.nio.ByteBuffer arg3) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2, long arg3, int arg4, com.google.protobuf.micro.MessageMicro arg5) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2, long arg3, com.google.protobuf.micro.MessageMicro arg4) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2, com.google.protobuf.micro.MessageMicro arg3) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2, long arg3, int arg4) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2, long arg3) throws java.io.IOException{
  }
  public static final void send(com.android.internal.telephony.RilChannel arg1, int arg2) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mData")
  public java.nio.ByteBuffer getData(){
    return (java.nio.ByteBuffer) null;
  }
  public byte getData(int arg1){
    return (byte) 0;
  }
  public void setData(@com.francetelecom.rd.stubs.annotation.FieldSet("mData") java.nio.ByteBuffer arg1){
  }
  public int getStatus(){
    return 0;
  }
  public void setHeader(MsgHeader arg1){
  }
  public static Msg obtain(){
    return (Msg) null;
  }
  public int getCmd(){
    return 0;
  }
  public long getToken(){
    return 0l;
  }
  public void printHeader(java.lang.String arg1){
  }
  public static final Msg recv(com.android.internal.telephony.RilChannel arg1) throws java.io.IOException{
    return (Msg) null;
  }
  public static final <T extends com.google.protobuf.micro.MessageMicro>T getAs(java.lang.Class<T> arg1, byte [] arg2){
    return null;
  }
  public <T extends com.google.protobuf.micro.MessageMicro>T getDataAs(java.lang.Class<T> arg1){
    return null;
  }
}
