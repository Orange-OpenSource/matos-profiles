package libcore.icu;

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
public final class NativeConverter
{
  // Constructors

  public NativeConverter(){
  }
  // Methods

  public static boolean contains(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static int decode(long arg1, byte [] arg2, int arg3, char [] arg4, int arg5, int [] arg6, boolean arg7){
    return 0;
  }
  public static int encode(long arg1, char [] arg2, int arg3, byte [] arg4, int arg5, int [] arg6, boolean arg7){
    return 0;
  }
  public static boolean canEncode(long arg1, int arg2){
    return false;
  }
  public static java.nio.charset.Charset charsetForName(java.lang.String arg1){
    return (java.nio.charset.Charset) null;
  }
  public static long openConverter(java.lang.String arg1){
    return 0l;
  }
  public static float getAveCharsPerByte(long arg1){
    return 0.0f;
  }
  public static void closeConverter(long arg1){
  }
  public static int setCallbackDecode(long arg1, java.nio.charset.CharsetDecoder arg2){
    return 0;
  }
  public static void resetByteToChar(long arg1){
  }
  public static java.lang.String [] getAvailableCharsetNames(){
    return (java.lang.String []) null;
  }
  public static void resetCharToByte(long arg1){
  }
  public static byte [] getSubstitutionBytes(long arg1){
    return (byte []) null;
  }
  public static int getMaxBytesPerChar(long arg1){
    return 0;
  }
  public static int getMinBytesPerChar(long arg1){
    return 0;
  }
  public static float getAveBytesPerChar(long arg1){
    return 0.0f;
  }
  public static int setCallbackEncode(long arg1, java.nio.charset.CharsetEncoder arg2){
    return 0;
  }
}
