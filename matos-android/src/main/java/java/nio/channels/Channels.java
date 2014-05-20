package java.nio.channels;

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


public final class Channels
{
  // Constructors

  private Channels(){
  }
  // Methods

  public static java.io.OutputStream newOutputStream(WritableByteChannel arg1){
    return (java.io.OutputStream) null;
  }
  public static ReadableByteChannel newChannel(java.io.InputStream arg1){
    return (ReadableByteChannel) null;
  }
  public static WritableByteChannel newChannel(java.io.OutputStream arg1){
    return (WritableByteChannel) null;
  }
  public static java.io.InputStream newInputStream(ReadableByteChannel arg1){
    return (java.io.InputStream) null;
  }
  public static java.io.Reader newReader(ReadableByteChannel arg1, java.nio.charset.CharsetDecoder arg2, int arg3){
    return (java.io.Reader) null;
  }
  public static java.io.Reader newReader(ReadableByteChannel arg1, java.lang.String arg2){
    return (java.io.Reader) null;
  }
  public static java.io.Writer newWriter(WritableByteChannel arg1, java.nio.charset.CharsetEncoder arg2, int arg3){
    return (java.io.Writer) null;
  }
  public static java.io.Writer newWriter(WritableByteChannel arg1, java.lang.String arg2){
    return (java.io.Writer) null;
  }
}
