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


public final class CodedInputStreamMicro
{
  // Constructors

  private CodedInputStreamMicro(byte [] arg1, int arg2, int arg3){
  }
  private CodedInputStreamMicro(java.io.InputStream arg1){
  }
  // Methods

  public static CodedInputStreamMicro newInstance(java.io.InputStream arg1){
    return (CodedInputStreamMicro) null;
  }
  public static CodedInputStreamMicro newInstance(byte [] arg1){
    return (CodedInputStreamMicro) null;
  }
  public static CodedInputStreamMicro newInstance(byte [] arg1, int arg2, int arg3){
    return (CodedInputStreamMicro) null;
  }
  public ByteStringMicro readBytes() throws java.io.IOException{
    return (ByteStringMicro) null;
  }
  public float readFloat() throws java.io.IOException{
    return 0.0f;
  }
  public double readDouble() throws java.io.IOException{
    return 0.0d;
  }
  public java.lang.String readString() throws java.io.IOException{
    return (java.lang.String) null;
  }
  public int readTag() throws java.io.IOException{
    return 0;
  }
  public void checkLastTagWas(int arg1) throws InvalidProtocolBufferMicroException{
  }
  public boolean skipField(int arg1) throws java.io.IOException{
    return false;
  }
  public int readInt32() throws java.io.IOException{
    return 0;
  }
  public void readMessage(MessageMicro arg1) throws java.io.IOException{
  }
  public void readGroup(MessageMicro arg1, int arg2) throws java.io.IOException{
  }
  public int readEnum() throws java.io.IOException{
    return 0;
  }
  public boolean readBool() throws java.io.IOException{
    return false;
  }
  public int readUInt32() throws java.io.IOException{
    return 0;
  }
  public long readUInt64() throws java.io.IOException{
    return 0l;
  }
  public void skipMessage() throws java.io.IOException{
  }
  public long readInt64() throws java.io.IOException{
    return 0l;
  }
  public long readFixed64() throws java.io.IOException{
    return 0l;
  }
  public int readFixed32() throws java.io.IOException{
    return 0;
  }
  public int readSFixed32() throws java.io.IOException{
    return 0;
  }
  public long readSFixed64() throws java.io.IOException{
    return 0l;
  }
  public int readSInt32() throws java.io.IOException{
    return 0;
  }
  public long readSInt64() throws java.io.IOException{
    return 0l;
  }
  public int readRawVarint32() throws java.io.IOException{
    return 0;
  }
  public long readRawVarint64() throws java.io.IOException{
    return 0l;
  }
  public int readRawLittleEndian32() throws java.io.IOException{
    return 0;
  }
  public long readRawLittleEndian64() throws java.io.IOException{
    return 0l;
  }
  public static int decodeZigZag32(int arg1){
    return 0;
  }
  public static long decodeZigZag64(long arg1){
    return 0l;
  }
  public int setRecursionLimit(int arg1){
    return 0;
  }
  public int setSizeLimit(int arg1){
    return 0;
  }
  public void resetSizeCounter(){
  }
  public int pushLimit(int arg1) throws InvalidProtocolBufferMicroException{
    return 0;
  }
  public void popLimit(int arg1){
  }
  public int getBytesUntilLimit(){
    return 0;
  }
  public boolean isAtEnd() throws java.io.IOException{
    return false;
  }
  public byte readRawByte() throws java.io.IOException{
    return (byte) 0;
  }
  public byte [] readRawBytes(int arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public void skipRawBytes(int arg1) throws java.io.IOException{
  }
}
