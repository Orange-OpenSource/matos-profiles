package java.nio;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CharBufferImpl", superClass = "")
public abstract class CharBuffer
  extends Buffer  implements java.lang.Readable, java.lang.Comparable<CharBuffer>, java.lang.Appendable, java.lang.CharSequence
{
  // Constructors

  public CharBuffer(){
    super();
  }
  // Methods

  public abstract char get();
  public CharBuffer get(char [] arg1){
    return (CharBuffer) null;
  }
  public CharBuffer get(char [] arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public abstract char get(int arg1);
  public abstract CharBuffer put(char arg1);
  public final CharBuffer put(char [] arg1){
    return (CharBuffer) null;
  }
  public CharBuffer put(char [] arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public CharBuffer put(CharBuffer arg1){
    return (CharBuffer) null;
  }
  public abstract CharBuffer put(int arg1, char arg2);
  public final CharBuffer put(java.lang.String arg1){
    return (CharBuffer) null;
  }
  public CharBuffer put(java.lang.String arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public CharBuffer append(char arg1){
    return (CharBuffer) null;
  }
  public CharBuffer append(java.lang.CharSequence arg1){
    return (CharBuffer) null;
  }
  public CharBuffer append(java.lang.CharSequence arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(CharBuffer arg1){
    return 0;
  }
  public final char charAt(int arg1){
    return '\u0000';
  }
  public final int length(){
    return 0;
  }
  public abstract java.lang.CharSequence subSequence(int arg1, int arg2);
  public final char [] array(){
    return (char []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static CharBuffer wrap(char [] arg1){
    return (CharBuffer) null;
  }
  public static CharBuffer wrap(char [] arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public static CharBuffer wrap(java.lang.CharSequence arg1){
    return (CharBuffer) null;
  }
  public static CharBuffer wrap(java.lang.CharSequence arg1, int arg2, int arg3){
    return (CharBuffer) null;
  }
  public static CharBuffer allocate(int arg1){
    return (CharBuffer) null;
  }
  public abstract CharBuffer asReadOnlyBuffer();
  public abstract CharBuffer compact();
  public abstract CharBuffer duplicate();
  public abstract ByteOrder order();
  public abstract CharBuffer slice();
  public int read(CharBuffer arg1) throws java.io.IOException{
    return 0;
  }
}
