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
public abstract class SpannableStringInternal
{
  // Constructors

  SpannableStringInternal(java.lang.CharSequence arg1, int arg2, int arg3){
  }
  // Methods

  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final char charAt(int arg1){
    return '\u0000';
  }
  public final void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public final int length(){
    return 0;
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
}
