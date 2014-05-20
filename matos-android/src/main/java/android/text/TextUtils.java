package android.text;

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

import com.francetelecom.rd.stubs.annotation.Code;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class TextUtils
{
  // Classes

  public static interface StringSplitter
    extends java.lang.Iterable<java.lang.String>
  {
    // Methods

    public void setString(java.lang.String arg1);
  }
  public static class SimpleStringSplitter
    implements java.util.Iterator<java.lang.String>, TextUtils.StringSplitter
  {
    // Constructors

    public SimpleStringSplitter(char arg1){
    }
    // Methods

    public boolean hasNext(){
      return false;
    }
    public java.util.Iterator<java.lang.String> iterator(){
      return (java.util.Iterator) null;
    }
    public java.lang.String next(){
      return (java.lang.String) null;
    }
    public void remove(){
    }
    public void setString(java.lang.String arg1){
    }
  }
  public static enum TruncateAt
  {
    // Enum Constants

    START()
, MIDDLE()
, END()
, MARQUEE()
, END_SMALL()
;
    // Fields

    // Constructors

    private TruncateAt(){
    }
    // Methods

  }
  public static interface EllipsizeCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("ellipsized")
    public void ellipsized(int arg1, int arg2);
  }
  // Fields

  public static final int ALIGNMENT_SPAN = 1;

  public static final int FOREGROUND_COLOR_SPAN = 2;

  public static final int RELATIVE_SIZE_SPAN = 3;

  public static final int SCALE_X_SPAN = 4;

  public static final int STRIKETHROUGH_SPAN = 5;

  public static final int UNDERLINE_SPAN = 6;

  public static final int STYLE_SPAN = 7;

  public static final int BULLET_SPAN = 8;

  public static final int QUOTE_SPAN = 9;

  public static final int LEADING_MARGIN_SPAN = 10;

  public static final int URL_SPAN = 11;

  public static final int BACKGROUND_COLOR_SPAN = 12;

  public static final int TYPEFACE_SPAN = 13;

  public static final int SUPERSCRIPT_SPAN = 14;

  public static final int SUBSCRIPT_SPAN = 15;

  public static final int ABSOLUTE_SIZE_SPAN = 16;

  public static final int TEXT_APPEARANCE_SPAN = 17;

  public static final int ANNOTATION = 18;

  public static final int SUGGESTION_SPAN = 19;

  public static final int SPELL_CHECK_SPAN = 20;

  public static final int SUGGESTION_RANGE_SPAN = 21;

  public static final int EASY_EDIT_SPAN = 22;

  public static final android.os.Parcelable.Creator<java.lang.CharSequence> CHAR_SEQUENCE_CREATOR = null;

  public static final int CAP_MODE_CHARACTERS = 4096;

  public static final int CAP_MODE_WORDS = 8192;

  public static final int CAP_MODE_SENTENCES = 16384;

  // Constructors

  private TextUtils(){
  }
  // Methods

  public static boolean equals(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
    return false;
  }
  public static int indexOf(java.lang.CharSequence arg1, char arg2){
    return 0;
  }
  public static int indexOf(java.lang.CharSequence arg1, char arg2, int arg3){
    return 0;
  }
  public static int indexOf(java.lang.CharSequence arg1, char arg2, int arg3, int arg4){
    return 0;
  }
  public static int indexOf(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
    return 0;
  }
  public static int indexOf(java.lang.CharSequence arg1, java.lang.CharSequence arg2, int arg3){
    return 0;
  }
  public static int indexOf(java.lang.CharSequence arg1, java.lang.CharSequence arg2, int arg3, int arg4){
    return 0;
  }
  public static java.lang.CharSequence concat(java.lang.CharSequence [] arg1){
    return (java.lang.CharSequence) null;
  }
  public static void getChars(java.lang.CharSequence arg1, int arg2, int arg3, char [] arg4, int arg5){
  }
  public static boolean isEmpty(java.lang.CharSequence arg1){
    return false;
  }
  public static int lastIndexOf(java.lang.CharSequence arg1, char arg2){
    return 0;
  }
  public static int lastIndexOf(java.lang.CharSequence arg1, char arg2, int arg3){
    return 0;
  }
  public static int lastIndexOf(java.lang.CharSequence arg1, char arg2, int arg3, int arg4){
    return 0;
  }
  public static boolean regionMatches(java.lang.CharSequence arg1, int arg2, java.lang.CharSequence arg3, int arg4, int arg5){
    return false;
  }
  public static java.lang.CharSequence replace(java.lang.CharSequence arg1, java.lang.String [] arg2, java.lang.CharSequence [] arg3){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.String [] split(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] split(java.lang.String arg1, java.util.regex.Pattern arg2){
    return (java.lang.String []) null;
  }
  public static java.lang.String substring(java.lang.CharSequence arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public static java.lang.CharSequence join(java.lang.Iterable<java.lang.CharSequence> arg1){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.String join(java.lang.CharSequence arg1, java.lang.Object [] arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String join(java.lang.CharSequence arg1, java.lang.Iterable arg2){
    return (java.lang.String) null;
  }
  public static void writeToParcel(java.lang.CharSequence arg1, android.os.Parcel arg2, int arg3){
  }
  public static java.lang.CharSequence ellipsize(java.lang.CharSequence arg1, TextPaint arg2, float arg3, TextUtils.TruncateAt arg4){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence ellipsize(java.lang.CharSequence arg1, TextPaint arg2, float arg3, TextUtils.TruncateAt arg4, boolean arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.text.TextUtils.EllipsizeCallback.ellipsized") TextUtils.EllipsizeCallback arg6){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence ellipsize(java.lang.CharSequence arg1, TextPaint arg2, float arg3, TextUtils.TruncateAt arg4, boolean arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.text.TextUtils.EllipsizeCallback.ellipsized") TextUtils.EllipsizeCallback arg6, TextDirectionHeuristic arg7, java.lang.String arg8){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence stringOrSpannedString(java.lang.CharSequence arg1){
    return (java.lang.CharSequence) null;
  }
  public static void copySpansFrom(Spanned arg1, int arg2, int arg3, java.lang.Class arg4, Spannable arg5, int arg6){
  }
  public static int getCapsMode(java.lang.CharSequence arg1, int arg2, int arg3){
    return 0;
  }
  public static int getOffsetAfter(java.lang.CharSequence arg1, int arg2){
    return 0;
  }
  public static int getOffsetBefore(java.lang.CharSequence arg1, int arg2){
    return 0;
  }
  public static int getTrimmedLength(java.lang.CharSequence arg1){
    return 0;
  }
  @Code("return arg1;")
  public static <T>T [] removeEmptySpans(T [] arg1, Spanned arg2, java.lang.Class<T> arg3){
    return (T []) null;
  }
  public static boolean delimitedStringContains(java.lang.String arg1, char arg2, java.lang.String arg3){
    return false;
  }
  public static java.lang.String htmlEncode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.CharSequence getReverse(java.lang.CharSequence arg1, int arg2, int arg3){
    return (java.lang.CharSequence) null;
  }
  public static void dumpSpans(java.lang.CharSequence arg1, android.util.Printer arg2, java.lang.String arg3){
  }
  public static java.lang.CharSequence expandTemplate(java.lang.CharSequence arg1, java.lang.CharSequence [] arg2){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence commaEllipsize(java.lang.CharSequence arg1, TextPaint arg2, float arg3, java.lang.String arg4, java.lang.String arg5){
    return (java.lang.CharSequence) null;
  }
  public static java.lang.CharSequence commaEllipsize(java.lang.CharSequence arg1, TextPaint arg2, float arg3, java.lang.String arg4, java.lang.String arg5, TextDirectionHeuristic arg6){
    return (java.lang.CharSequence) null;
  }
  public static boolean isGraphic(java.lang.CharSequence arg1){
    return false;
  }
  public static boolean isGraphic(char arg1){
    return false;
  }
  public static boolean isDigitsOnly(java.lang.CharSequence arg1){
    return false;
  }
  public static boolean isPrintableAscii(char arg1){
    return false;
  }
  public static boolean isPrintableAsciiOnly(java.lang.CharSequence arg1){
    return false;
  }
}
