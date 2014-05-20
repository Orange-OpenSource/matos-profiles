package android.icu.text;

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


public class ArabicShaping
{
  // Fields

  public static final ArabicShaping SHAPER = null;

  public static final int SEEN_TWOCELL_NEAR = 2097152;

  public static final int SEEN_MASK = 7340032;

  public static final int YEHHAMZA_TWOCELL_NEAR = 16777216;

  public static final int YEHHAMZA_MASK = 58720256;

  public static final int TASHKEEL_BEGIN = 262144;

  public static final int TASHKEEL_END = 393216;

  public static final int TASHKEEL_RESIZE = 524288;

  public static final int TASHKEEL_REPLACE_BY_TATWEEL = 786432;

  public static final int TASHKEEL_MASK = 917504;

  public static final int SPACES_RELATIVE_TO_TEXT_BEGIN_END = 67108864;

  public static final int SPACES_RELATIVE_TO_TEXT_MASK = 67108864;

  public static final int SHAPE_TAIL_NEW_UNICODE = 134217728;

  public static final int SHAPE_TAIL_TYPE_MASK = 134217728;

  public static final int LENGTH_GROW_SHRINK = 0;

  public static final int LAMALEF_RESIZE = 0;

  public static final int LENGTH_FIXED_SPACES_NEAR = 1;

  public static final int LAMALEF_NEAR = 1;

  public static final int LENGTH_FIXED_SPACES_AT_END = 2;

  public static final int LAMALEF_END = 2;

  public static final int LENGTH_FIXED_SPACES_AT_BEGINNING = 3;

  public static final int LAMALEF_BEGIN = 3;

  public static final int LAMALEF_AUTO = 65536;

  public static final int LENGTH_MASK = 65539;

  public static final int LAMALEF_MASK = 65539;

  public static final int TEXT_DIRECTION_LOGICAL = 0;

  public static final int TEXT_DIRECTION_VISUAL_RTL = 0;

  public static final int TEXT_DIRECTION_VISUAL_LTR = 4;

  public static final int TEXT_DIRECTION_MASK = 4;

  public static final int LETTERS_NOOP = 0;

  public static final int LETTERS_SHAPE = 8;

  public static final int LETTERS_UNSHAPE = 16;

  public static final int LETTERS_SHAPE_TASHKEEL_ISOLATED = 24;

  public static final int LETTERS_MASK = 24;

  public static final int DIGITS_NOOP = 0;

  public static final int DIGITS_EN2AN = 32;

  public static final int DIGITS_AN2EN = 64;

  public static final int DIGITS_EN2AN_INIT_LR = 96;

  public static final int DIGITS_EN2AN_INIT_AL = 128;

  public static final int DIGITS_MASK = 224;

  public static final int DIGIT_TYPE_AN = 0;

  public static final int DIGIT_TYPE_AN_EXTENDED = 256;

  public static final int DIGIT_TYPE_MASK = 256;

  // Constructors

  public ArabicShaping(int arg1){
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
  public int shape(char [] arg1, int arg2, int arg3, char [] arg4, int arg5, int arg6) throws java.lang.RuntimeException{
    return 0;
  }
  public void shape(char [] arg1, int arg2, int arg3) throws java.lang.RuntimeException{
  }
  public java.lang.String shape(java.lang.String arg1) throws java.lang.RuntimeException{
    return (java.lang.String) null;
  }
  public static int countSpaceSub(char [] arg1, int arg2, char arg3){
    return 0;
  }
  public static void shiftArray(char [] arg1, int arg2, int arg3, char arg4){
  }
  public static int flipArray(char [] arg1, int arg2, int arg3, int arg4){
    return 0;
  }
}
