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
public interface Spanned
  extends java.lang.CharSequence
{
  // Fields

  public static final int SPAN_POINT_MARK_MASK = 51;

  public static final int SPAN_MARK_MARK = 17;

  public static final int SPAN_MARK_POINT = 18;

  public static final int SPAN_POINT_MARK = 33;

  public static final int SPAN_POINT_POINT = 34;

  public static final int SPAN_PARAGRAPH = 51;

  public static final int SPAN_INCLUSIVE_EXCLUSIVE = 17;

  public static final int SPAN_INCLUSIVE_INCLUSIVE = 18;

  public static final int SPAN_EXCLUSIVE_EXCLUSIVE = 33;

  public static final int SPAN_EXCLUSIVE_INCLUSIVE = 34;

  public static final int SPAN_COMPOSING = 256;

  public static final int SPAN_INTERMEDIATE = 512;

  public static final int SPAN_USER_SHIFT = 24;

  public static final int SPAN_USER = -16777216;

  public static final int SPAN_PRIORITY_SHIFT = 16;

  public static final int SPAN_PRIORITY = 16711680;

  // Methods

  public int getSpanStart(java.lang.Object arg1);
  public int getSpanEnd(java.lang.Object arg1);
  public <T>T [] getSpans(int arg1, int arg2, java.lang.Class<T> arg3);
  public int getSpanFlags(java.lang.Object arg1);
  public int nextSpanTransition(int arg1, int arg2, java.lang.Class arg3);
}
