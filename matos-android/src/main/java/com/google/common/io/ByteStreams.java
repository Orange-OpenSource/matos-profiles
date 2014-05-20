package com.google.common.io;

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


public final class ByteStreams
{
  // Constructors

  private ByteStreams(){
  }
  // Methods

  public static long length(InputSupplier<? extends java.io.InputStream> arg1) throws java.io.IOException{
    return 0l;
  }
  public static void write(byte [] arg1, OutputSupplier<? extends java.io.OutputStream> arg2) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (InputSupplier<java.io.InputStream>) arg1.iterator().next();")
  public static InputSupplier<java.io.InputStream> join(java.lang.Iterable<? extends InputSupplier<? extends java.io.InputStream>> arg1){
    return (InputSupplier) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (InputSupplier<java.io.InputStream>) arg1[0];")
  public static InputSupplier<java.io.InputStream> join(InputSupplier<? extends java.io.InputStream> [] arg1){
    return (InputSupplier) null;
  }
  public static long copy(InputSupplier<? extends java.io.InputStream> arg1, OutputSupplier<? extends java.io.OutputStream> arg2) throws java.io.IOException{
    return 0l;
  }
  public static long copy(InputSupplier<? extends java.io.InputStream> arg1, java.io.OutputStream arg2) throws java.io.IOException{
    return 0l;
  }
  public static long copy(java.io.InputStream arg1, java.io.OutputStream arg2) throws java.io.IOException{
    return 0l;
  }
  public static long copy(java.nio.channels.ReadableByteChannel arg1, java.nio.channels.WritableByteChannel arg2) throws java.io.IOException{
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (InputSupplier<java.io.InputStream>) arg1;")
  public static InputSupplier<java.io.InputStream> slice(InputSupplier<? extends java.io.InputStream> arg1, long arg2, long arg3){
    return (InputSupplier) null;
  }
  public static int read(java.io.InputStream arg1, byte [] arg2, int arg3, int arg4) throws java.io.IOException{
    return 0;
  }
  public static byte [] toByteArray(java.io.InputStream arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public static byte [] toByteArray(InputSupplier<? extends java.io.InputStream> arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public static <T>T readBytes(InputSupplier<? extends java.io.InputStream> arg1, ByteProcessor<T> arg2) throws java.io.IOException{
    return null;
  }
  public static void readFully(java.io.InputStream arg1, byte [] arg2) throws java.io.IOException{
  }
  public static void readFully(java.io.InputStream arg1, byte [] arg2, int arg3, int arg4) throws java.io.IOException{
  }
  public static byte [] getDigest(InputSupplier<? extends java.io.InputStream> arg1, java.security.MessageDigest arg2) throws java.io.IOException{
    return (byte []) null;
  }
  public static long getChecksum(InputSupplier<? extends java.io.InputStream> arg1, java.util.zip.Checksum arg2) throws java.io.IOException{
    return 0l;
  }
  public static void skipFully(java.io.InputStream arg1, long arg2) throws java.io.IOException{
  }
  public static boolean equal(InputSupplier<? extends java.io.InputStream> arg1, InputSupplier<? extends java.io.InputStream> arg2) throws java.io.IOException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"final byte [] a = arg1;", "return new InputSupplier<java.io.ByteArrayInputStream>() { public java.io.ByteArrayInputStream getInput() throws java.io.IOException { return new java.io.ByteArrayInputStream(a);}};"})
  public static InputSupplier<java.io.ByteArrayInputStream> newInputStreamSupplier(byte [] arg1){
    return (InputSupplier) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"final byte [] a = arg1;", "return new InputSupplier<java.io.ByteArrayInputStream>() { public java.io.ByteArrayInputStream getInput() throws java.io.IOException { return new java.io.ByteArrayInputStream(a);}};"})
  public static InputSupplier<java.io.ByteArrayInputStream> newInputStreamSupplier(byte [] arg1, int arg2, int arg3){
    return (InputSupplier) null;
  }
  public static ByteArrayDataInput newDataInput(byte [] arg1){
    return (ByteArrayDataInput) null;
  }
  public static ByteArrayDataInput newDataInput(byte [] arg1, int arg2){
    return (ByteArrayDataInput) null;
  }
  public static ByteArrayDataOutput newDataOutput(){
    return (ByteArrayDataOutput) null;
  }
  public static ByteArrayDataOutput newDataOutput(int arg1){
    return (ByteArrayDataOutput) null;
  }
}
