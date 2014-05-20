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


public final class Files
{
  // Constructors

  private Files(){
  }
  // Methods

  public static java.lang.String toString(java.io.File arg1, java.nio.charset.Charset arg2) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static void append(java.lang.CharSequence arg1, java.io.File arg2, java.nio.charset.Charset arg3) throws java.io.IOException{
  }
  public static void write(byte [] arg1, java.io.File arg2) throws java.io.IOException{
  }
  public static void write(java.lang.CharSequence arg1, java.io.File arg2, java.nio.charset.Charset arg3) throws java.io.IOException{
  }
  public static void copy(InputSupplier<? extends java.io.InputStream> arg1, java.io.File arg2) throws java.io.IOException{
  }
  public static void copy(java.io.File arg1, OutputSupplier<? extends java.io.OutputStream> arg2) throws java.io.IOException{
  }
  public static void copy(java.io.File arg1, java.io.OutputStream arg2) throws java.io.IOException{
  }
  public static void copy(java.io.File arg1, java.io.File arg2) throws java.io.IOException{
  }
  public static <R extends java.lang.Readable & java.io.Closeable>void copy(InputSupplier<R> arg1, java.io.File arg2, java.nio.charset.Charset arg3) throws java.io.IOException{
  }
  public static <W extends java.lang.Appendable & java.io.Closeable>void copy(java.io.File arg1, java.nio.charset.Charset arg2, OutputSupplier<W> arg3) throws java.io.IOException{
  }
  public static void copy(java.io.File arg1, java.nio.charset.Charset arg2, java.lang.Appendable arg3) throws java.io.IOException{
  }
  public static java.nio.MappedByteBuffer map(java.io.File arg1) throws java.io.IOException{
    return (java.nio.MappedByteBuffer) null;
  }
  public static java.nio.MappedByteBuffer map(java.io.File arg1, java.nio.channels.FileChannel.MapMode arg2) throws java.io.IOException{
    return (java.nio.MappedByteBuffer) null;
  }
  public static java.nio.MappedByteBuffer map(java.io.File arg1, java.nio.channels.FileChannel.MapMode arg2, long arg3) throws java.io.FileNotFoundException, java.io.IOException{
    return (java.nio.MappedByteBuffer) null;
  }
  public static byte [] toByteArray(java.io.File arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public static <T>T readBytes(java.io.File arg1, ByteProcessor<T> arg2) throws java.io.IOException{
    return null;
  }
  public static byte [] getDigest(java.io.File arg1, java.security.MessageDigest arg2) throws java.io.IOException{
    return (byte []) null;
  }
  public static void move(java.io.File arg1, java.io.File arg2) throws java.io.IOException{
  }
  public static long getChecksum(java.io.File arg1, java.util.zip.Checksum arg2) throws java.io.IOException{
    return 0l;
  }
  public static java.util.List<java.lang.String> readLines(java.io.File arg1, java.nio.charset.Charset arg2) throws java.io.IOException{
    return (java.util.List) null;
  }
  public static <T>T readLines(java.io.File arg1, java.nio.charset.Charset arg2, LineProcessor<T> arg3) throws java.io.IOException{
    return null;
  }
  public static OutputSupplier<java.io.OutputStreamWriter> newWriterSupplier(java.io.File arg1, java.nio.charset.Charset arg2){
    return (OutputSupplier) null;
  }
  public static OutputSupplier<java.io.OutputStreamWriter> newWriterSupplier(java.io.File arg1, java.nio.charset.Charset arg2, boolean arg3){
    return (OutputSupplier) null;
  }
  public static InputSupplier<java.io.InputStreamReader> newReaderSupplier(java.io.File arg1, java.nio.charset.Charset arg2){
    return (InputSupplier) null;
  }
  public static java.lang.String readFirstLine(java.io.File arg1, java.nio.charset.Charset arg2) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static java.io.BufferedReader newReader(java.io.File arg1, java.nio.charset.Charset arg2) throws java.io.FileNotFoundException{
    return (java.io.BufferedReader) null;
  }
  public static java.io.BufferedWriter newWriter(java.io.File arg1, java.nio.charset.Charset arg2) throws java.io.FileNotFoundException{
    return (java.io.BufferedWriter) null;
  }
  public static boolean equal(java.io.File arg1, java.io.File arg2) throws java.io.IOException{
    return false;
  }
  public static InputSupplier<java.io.FileInputStream> newInputStreamSupplier(java.io.File arg1){
    return (InputSupplier) null;
  }
  public static OutputSupplier<java.io.FileOutputStream> newOutputStreamSupplier(java.io.File arg1){
    return (OutputSupplier) null;
  }
  public static OutputSupplier<java.io.FileOutputStream> newOutputStreamSupplier(java.io.File arg1, boolean arg2){
    return (OutputSupplier) null;
  }
  public static void touch(java.io.File arg1) throws java.io.IOException{
  }
  public static java.io.File createTempDir(){
    return (java.io.File) null;
  }
  public static void deleteDirectoryContents(java.io.File arg1) throws java.io.IOException{
  }
  public static void deleteRecursively(java.io.File arg1) throws java.io.IOException{
  }
}
