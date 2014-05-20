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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SpannableStringBuilder
  implements java.lang.Appendable, Spannable, java.lang.CharSequence, GraphicsOperations, Editable, GetChars
{
  // Constructors

  public SpannableStringBuilder(){
  }
  public SpannableStringBuilder(java.lang.CharSequence arg1){
  }
  public SpannableStringBuilder(java.lang.CharSequence arg1, int arg2, int arg3){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public SpannableStringBuilder append(java.lang.CharSequence arg1){
    return (SpannableStringBuilder) null;
  }
  public SpannableStringBuilder append(java.lang.CharSequence arg1, int arg2, int arg3){
    return (SpannableStringBuilder) null;
  }
  public SpannableStringBuilder append(char arg1){
    return (SpannableStringBuilder) null;
  }
  public static SpannableStringBuilder valueOf(java.lang.CharSequence arg1){
    return (SpannableStringBuilder) null;
  }
  public void clear(){
  }
  public char charAt(int arg1){
    return '\u0000';
  }
  public void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public int length(){
    return 0;
  }
  public SpannableStringBuilder replace(int arg1, int arg2, java.lang.CharSequence arg3){
    return (SpannableStringBuilder) null;
  }
  public SpannableStringBuilder replace(int arg1, int arg2, java.lang.CharSequence arg3, int arg4, int arg5){
    return (SpannableStringBuilder) null;
  }
  public java.lang.CharSequence subSequence(int arg1, int arg2){
    return (java.lang.CharSequence) null;
  }
  public SpannableStringBuilder delete(int arg1, int arg2){
    return (SpannableStringBuilder) null;
  }
  public SpannableStringBuilder insert(int arg1, java.lang.CharSequence arg2, int arg3, int arg4){
    return (SpannableStringBuilder) null;
  }
  public SpannableStringBuilder insert(int arg1, java.lang.CharSequence arg2){
    return (SpannableStringBuilder) null;
  }
  public void setFilters(InputFilter [] arg1){
  }
  public InputFilter [] getFilters(){
    return (InputFilter []) null;
  }
  public void clearSpans(){
  }
  public void removeSpan(java.lang.Object arg1){
  }
  public void setSpan(java.lang.Object arg1, int arg2, int arg3, int arg4){
  }
  public int getSpanStart(java.lang.Object arg1){
    return 0;
  }
  public int getSpanEnd(java.lang.Object arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (T[]) java.lang.reflect.Array.newInstance(arg3, 1);")
  public <T>T [] getSpans(int arg1, int arg2, java.lang.Class<T> arg3){
    return (T []) null;
  }
  public int getSpanFlags(java.lang.Object arg1){
    return 0;
  }
  public int nextSpanTransition(int arg1, int arg2, java.lang.Class arg3){
    return 0;
  }
  public float measureText(int arg1, int arg2, android.graphics.Paint arg3){
    return 0.0f;
  }
  public float getTextRunAdvances(int arg1, int arg2, int arg3, int arg4, int arg5, float [] arg6, int arg7, android.graphics.Paint arg8){
    return 0.0f;
  }
  public float getTextRunAdvances(int arg1, int arg2, int arg3, int arg4, int arg5, float [] arg6, int arg7, android.graphics.Paint arg8, int arg9){
    return 0.0f;
  }
  public int getTextWidths(int arg1, int arg2, float [] arg3, android.graphics.Paint arg4){
    return 0;
  }
  @java.lang.Deprecated
  public int getTextRunCursor(int arg1, int arg2, int arg3, int arg4, int arg5, android.graphics.Paint arg6){
    return 0;
  }
  public void drawText(android.graphics.Canvas arg1, int arg2, int arg3, float arg4, float arg5, android.graphics.Paint arg6){
  }
  public void drawTextRun(android.graphics.Canvas arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, android.graphics.Paint arg9){
  }
}
