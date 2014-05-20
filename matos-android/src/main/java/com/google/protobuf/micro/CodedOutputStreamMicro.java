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


public final class CodedOutputStreamMicro
{
  // Classes

  public static class OutOfSpaceException
    extends java.io.IOException  {
    // Constructors

    OutOfSpaceException(){
      super();
    }
  }
  // Fields

  public static final int DEFAULT_BUFFER_SIZE = 4096;

  public static final int LITTLE_ENDIAN_32_SIZE = 4;

  public static final int LITTLE_ENDIAN_64_SIZE = 8;

  // Constructors

  private CodedOutputStreamMicro(byte [] arg1, int arg2, int arg3){
  }
  private CodedOutputStreamMicro(java.io.OutputStream arg1, byte [] arg2){
  }
  // Methods

  public static CodedOutputStreamMicro newInstance(java.io.OutputStream arg1){
    return (CodedOutputStreamMicro) null;
  }
  public static CodedOutputStreamMicro newInstance(java.io.OutputStream arg1, int arg2){
    return (CodedOutputStreamMicro) null;
  }
  public static CodedOutputStreamMicro newInstance(byte [] arg1){
    return (CodedOutputStreamMicro) null;
  }
  public static CodedOutputStreamMicro newInstance(byte [] arg1, int arg2, int arg3){
    return (CodedOutputStreamMicro) null;
  }
  public void flush() throws java.io.IOException{
  }
  public void writeBytes(int arg1, ByteStringMicro arg2) throws java.io.IOException{
  }
  public void writeFloat(int arg1, float arg2) throws java.io.IOException{
  }
  public void writeDouble(int arg1, double arg2) throws java.io.IOException{
  }
  public void writeString(int arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void writeByteArray(int arg1, byte [] arg2) throws java.io.IOException{
  }
  public static int computeStringSize(int arg1, java.lang.String arg2){
    return 0;
  }
  public void checkNoSpaceLeft(){
  }
  public void writeInt32(int arg1, int arg2) throws java.io.IOException{
  }
  public static int computeInt32Size(int arg1, int arg2){
    return 0;
  }
  public static int computeStringSizeNoTag(java.lang.String arg1){
    return 0;
  }
  public void writeTag(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeMessage(int arg1, MessageMicro arg2) throws java.io.IOException{
  }
  public static int computeMessageSize(int arg1, MessageMicro arg2){
    return 0;
  }
  public static int computeInt32SizeNoTag(int arg1){
    return 0;
  }
  public void writeUInt64(int arg1, long arg2) throws java.io.IOException{
  }
  public void writeInt64(int arg1, long arg2) throws java.io.IOException{
  }
  public void writeFixed64(int arg1, long arg2) throws java.io.IOException{
  }
  public void writeFixed32(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeBool(int arg1, boolean arg2) throws java.io.IOException{
  }
  public void writeGroup(int arg1, MessageMicro arg2) throws java.io.IOException{
  }
  public void writeUInt32(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeEnum(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeSFixed32(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeSFixed64(int arg1, long arg2) throws java.io.IOException{
  }
  public void writeSInt32(int arg1, int arg2) throws java.io.IOException{
  }
  public void writeSInt64(int arg1, long arg2) throws java.io.IOException{
  }
  public void writeDoubleNoTag(double arg1) throws java.io.IOException{
  }
  public void writeFloatNoTag(float arg1) throws java.io.IOException{
  }
  public void writeUInt64NoTag(long arg1) throws java.io.IOException{
  }
  public void writeInt64NoTag(long arg1) throws java.io.IOException{
  }
  public void writeInt32NoTag(int arg1) throws java.io.IOException{
  }
  public void writeFixed64NoTag(long arg1) throws java.io.IOException{
  }
  public void writeFixed32NoTag(int arg1) throws java.io.IOException{
  }
  public void writeBoolNoTag(boolean arg1) throws java.io.IOException{
  }
  public void writeStringNoTag(java.lang.String arg1) throws java.io.IOException{
  }
  public void writeGroupNoTag(MessageMicro arg1) throws java.io.IOException{
  }
  public void writeMessageNoTag(MessageMicro arg1) throws java.io.IOException{
  }
  public void writeBytesNoTag(ByteStringMicro arg1) throws java.io.IOException{
  }
  public void writeByteArrayNoTag(byte [] arg1) throws java.io.IOException{
  }
  public void writeUInt32NoTag(int arg1) throws java.io.IOException{
  }
  public void writeEnumNoTag(int arg1) throws java.io.IOException{
  }
  public void writeSFixed32NoTag(int arg1) throws java.io.IOException{
  }
  public void writeSFixed64NoTag(long arg1) throws java.io.IOException{
  }
  public void writeSInt32NoTag(int arg1) throws java.io.IOException{
  }
  public void writeSInt64NoTag(long arg1) throws java.io.IOException{
  }
  public static int computeDoubleSize(int arg1, double arg2){
    return 0;
  }
  public static int computeFloatSize(int arg1, float arg2){
    return 0;
  }
  public static int computeUInt64Size(int arg1, long arg2){
    return 0;
  }
  public static int computeInt64Size(int arg1, long arg2){
    return 0;
  }
  public static int computeFixed64Size(int arg1, long arg2){
    return 0;
  }
  public static int computeFixed32Size(int arg1, int arg2){
    return 0;
  }
  public static int computeBoolSize(int arg1, boolean arg2){
    return 0;
  }
  public static int computeGroupSize(int arg1, MessageMicro arg2){
    return 0;
  }
  public static int computeBytesSize(int arg1, ByteStringMicro arg2){
    return 0;
  }
  public static int computeByteArraySize(int arg1, byte [] arg2){
    return 0;
  }
  public static int computeUInt32Size(int arg1, int arg2){
    return 0;
  }
  public static int computeEnumSize(int arg1, int arg2){
    return 0;
  }
  public static int computeSFixed32Size(int arg1, int arg2){
    return 0;
  }
  public static int computeSFixed64Size(int arg1, long arg2){
    return 0;
  }
  public static int computeSInt32Size(int arg1, int arg2){
    return 0;
  }
  public static int computeSInt64Size(int arg1, long arg2){
    return 0;
  }
  public static int computeDoubleSizeNoTag(double arg1){
    return 0;
  }
  public static int computeFloatSizeNoTag(float arg1){
    return 0;
  }
  public static int computeUInt64SizeNoTag(long arg1){
    return 0;
  }
  public static int computeInt64SizeNoTag(long arg1){
    return 0;
  }
  public static int computeFixed64SizeNoTag(long arg1){
    return 0;
  }
  public static int computeFixed32SizeNoTag(int arg1){
    return 0;
  }
  public static int computeBoolSizeNoTag(boolean arg1){
    return 0;
  }
  public static int computeGroupSizeNoTag(MessageMicro arg1){
    return 0;
  }
  public static int computeMessageSizeNoTag(MessageMicro arg1){
    return 0;
  }
  public static int computeBytesSizeNoTag(ByteStringMicro arg1){
    return 0;
  }
  public static int computeByteArraySizeNoTag(byte [] arg1){
    return 0;
  }
  public static int computeUInt32SizeNoTag(int arg1){
    return 0;
  }
  public static int computeEnumSizeNoTag(int arg1){
    return 0;
  }
  public static int computeSFixed32SizeNoTag(int arg1){
    return 0;
  }
  public static int computeSFixed64SizeNoTag(long arg1){
    return 0;
  }
  public static int computeSInt32SizeNoTag(int arg1){
    return 0;
  }
  public static int computeSInt64SizeNoTag(long arg1){
    return 0;
  }
  public int spaceLeft(){
    return 0;
  }
  public void writeRawByte(byte arg1) throws java.io.IOException{
  }
  public void writeRawByte(int arg1) throws java.io.IOException{
  }
  public void writeRawBytes(byte [] arg1) throws java.io.IOException{
  }
  public void writeRawBytes(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public static int computeTagSize(int arg1){
    return 0;
  }
  public void writeRawVarint32(int arg1) throws java.io.IOException{
  }
  public static int computeRawVarint32Size(int arg1){
    return 0;
  }
  public void writeRawVarint64(long arg1) throws java.io.IOException{
  }
  public static int computeRawVarint64Size(long arg1){
    return 0;
  }
  public void writeRawLittleEndian32(int arg1) throws java.io.IOException{
  }
  public void writeRawLittleEndian64(long arg1) throws java.io.IOException{
  }
  public static int encodeZigZag32(int arg1){
    return 0;
  }
  public static long encodeZigZag64(long arg1){
    return 0l;
  }
}
