package com.android.internal.telephony.cat;

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
public class TextAttribute
{
  // Fields

  public int start;

  public int length;

  public TextAlignment align;

  public FontSize size;

  public boolean bold;

  public boolean italic;

  public boolean underlined;

  public boolean strikeThrough;

  public TextColor color;

  // Constructors

  public TextAttribute(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("align") TextAlignment arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("size") FontSize arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, @com.francetelecom.rd.stubs.annotation.FieldSet("color") TextColor arg9){
  }
}
