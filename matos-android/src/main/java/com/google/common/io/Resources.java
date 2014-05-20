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


public final class Resources
{
  // Constructors

  public Resources(){
  }
  // Methods

  public static java.lang.String toString(java.net.URL arg1, java.nio.charset.Charset arg2) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static java.net.URL getResource(java.lang.String arg1){
    return (java.net.URL) null;
  }
  public static java.net.URL getResource(java.lang.Class<?> arg1, java.lang.String arg2){
    return (java.net.URL) null;
  }
  public static void copy(java.net.URL arg1, java.io.OutputStream arg2) throws java.io.IOException{
  }
  public static byte [] toByteArray(java.net.URL arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public static <T>T readLines(java.net.URL arg1, java.nio.charset.Charset arg2, LineProcessor<T> arg3) throws java.io.IOException{
    return null;
  }
  public static java.util.List<java.lang.String> readLines(java.net.URL arg1, java.nio.charset.Charset arg2) throws java.io.IOException{
    return (java.util.List) null;
  }
  public static InputSupplier<java.io.InputStreamReader> newReaderSupplier(java.net.URL arg1, java.nio.charset.Charset arg2){
    return (InputSupplier) null;
  }
  public static InputSupplier<java.io.InputStream> newInputStreamSupplier(java.net.URL arg1){
    return (InputSupplier) null;
  }
}
