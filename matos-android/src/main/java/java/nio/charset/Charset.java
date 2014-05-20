package java.nio.charset;

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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.CharsetImpl")
public abstract class Charset
  implements java.lang.Comparable<Charset>
{
  // Constructors

  protected Charset(java.lang.String arg1, java.lang.String [] arg2){
  }
  // Methods

  public final java.lang.String name(){
    return (java.lang.String) null;
  }
  public static Charset forName(java.lang.String arg1){
    return (Charset) null;
  }
  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int hashCode(){
    return 0;
  }
  public final int compareTo(Charset arg1){
    return 0;
  }
  public abstract boolean contains(Charset arg1);
  public final java.nio.CharBuffer decode(java.nio.ByteBuffer arg1){
    return (java.nio.CharBuffer) null;
  }
  public final java.nio.ByteBuffer encode(java.nio.CharBuffer arg1){
    return (java.nio.ByteBuffer) null;
  }
  public final java.nio.ByteBuffer encode(java.lang.String arg1){
    return (java.nio.ByteBuffer) null;
  }
  public final java.util.Set<java.lang.String> aliases(){
    return (java.util.Set) null;
  }
  public static java.util.SortedMap<java.lang.String, Charset> availableCharsets(){
    return (java.util.SortedMap) null;
  }
  public boolean canEncode(){
    return false;
  }
  public static Charset defaultCharset(){
    return (Charset) null;
  }
  public java.lang.String displayName(){
    return (java.lang.String) null;
  }
  public java.lang.String displayName(java.util.Locale arg1){
    return (java.lang.String) null;
  }
  public final boolean isRegistered(){
    return false;
  }
  public static boolean isSupported(java.lang.String arg1){
    return false;
  }
  public abstract CharsetDecoder newDecoder();
  public abstract CharsetEncoder newEncoder();
  public static Charset forNameUEE(java.lang.String arg1) throws java.io.UnsupportedEncodingException{
    return (Charset) null;
  }
}
