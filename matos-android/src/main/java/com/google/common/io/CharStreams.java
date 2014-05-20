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


public final class CharStreams
{
  // Constructors

  private CharStreams(){
  }
  // Methods

  public static java.lang.String toString(java.lang.Readable arg1) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static <R extends java.lang.Readable & java.io.Closeable>java.lang.String toString(InputSupplier<R> arg1) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static <W extends java.lang.Appendable & java.io.Closeable>void write(java.lang.CharSequence arg1, OutputSupplier<W> arg2) throws java.io.IOException{
  }
  public static InputSupplier<java.io.Reader> join(java.lang.Iterable<? extends InputSupplier<? extends java.io.Reader>> arg1){
    return (InputSupplier) null;
  }
  public static InputSupplier<java.io.Reader> join(InputSupplier<? extends java.io.Reader> [] arg1){
    return (InputSupplier) null;
  }
  public static <R extends java.lang.Readable & java.io.Closeable, W extends java.lang.Appendable & java.io.Closeable>long copy(InputSupplier<R> arg1, OutputSupplier<W> arg2) throws java.io.IOException{
    return 0l;
  }
  public static <R extends java.lang.Readable & java.io.Closeable>long copy(InputSupplier<R> arg1, java.lang.Appendable arg2) throws java.io.IOException{
    return 0l;
  }
  public static long copy(java.lang.Readable arg1, java.lang.Appendable arg2) throws java.io.IOException{
    return 0l;
  }
  public static <R extends java.lang.Readable & java.io.Closeable>java.util.List<java.lang.String> readLines(InputSupplier<R> arg1) throws java.io.IOException{
    return (java.util.List) null;
  }
  public static java.util.List<java.lang.String> readLines(java.lang.Readable arg1) throws java.io.IOException{
    return (java.util.List) null;
  }
  public static <R extends java.lang.Readable & java.io.Closeable, T>T readLines(InputSupplier<R> arg1, LineProcessor<T> arg2) throws java.io.IOException{
    return null;
  }
  public static OutputSupplier<java.io.OutputStreamWriter> newWriterSupplier(OutputSupplier<? extends java.io.OutputStream> arg1, java.nio.charset.Charset arg2){
    return (OutputSupplier) null;
  }
  public static InputSupplier<java.io.StringReader> newReaderSupplier(java.lang.String arg1){
    return (InputSupplier) null;
  }
  public static InputSupplier<java.io.InputStreamReader> newReaderSupplier(InputSupplier<? extends java.io.InputStream> arg1, java.nio.charset.Charset arg2){
    return (InputSupplier) null;
  }
  public static <R extends java.lang.Readable & java.io.Closeable>java.lang.String readFirstLine(InputSupplier<R> arg1) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static void skipFully(java.io.Reader arg1, long arg2) throws java.io.IOException{
  }
  public static java.io.Writer asWriter(java.lang.Appendable arg1){
    return (java.io.Writer) null;
  }
}
