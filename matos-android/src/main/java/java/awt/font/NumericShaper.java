package java.awt.font;

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


public final class NumericShaper
  implements java.io.Serializable
{
  // Fields

  public static final int EUROPEAN = 1;

  public static final int ARABIC = 2;

  public static final int EASTERN_ARABIC = 4;

  public static final int DEVANAGARI = 8;

  public static final int BENGALI = 16;

  public static final int GURMUKHI = 32;

  public static final int GUJARATI = 64;

  public static final int ORIYA = 128;

  public static final int TAMIL = 256;

  public static final int TELUGU = 512;

  public static final int KANNADA = 1024;

  public static final int MALAYALAM = 2048;

  public static final int THAI = 4096;

  public static final int LAO = 8192;

  public static final int TIBETAN = 16384;

  public static final int MYANMAR = 32768;

  public static final int ETHIOPIC = 65536;

  public static final int KHMER = 131072;

  public static final int MONGOLIAN = 262144;

  public static final int ALL_RANGES = 524287;

  // Constructors

  private NumericShaper(int arg1, int arg2, boolean arg3){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void shape(char [] arg1, int arg2, int arg3, int arg4){
  }
  public void shape(char [] arg1, int arg2, int arg3){
  }
  public boolean isContextual(){
    return false;
  }
  public static NumericShaper getContextualShaper(int arg1, int arg2){
    return (NumericShaper) null;
  }
  public static NumericShaper getContextualShaper(int arg1){
    return (NumericShaper) null;
  }
  public int getRanges(){
    return 0;
  }
  public static NumericShaper getShaper(int arg1){
    return (NumericShaper) null;
  }
}
