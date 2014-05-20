package com.google.android.mms.pdu;

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


public class CharacterSets
{
  // Fields

  public static final int ANY_CHARSET = 0;

  public static final int US_ASCII = 3;

  public static final int ISO_8859_1 = 4;

  public static final int ISO_8859_2 = 5;

  public static final int ISO_8859_3 = 6;

  public static final int ISO_8859_4 = 7;

  public static final int ISO_8859_5 = 8;

  public static final int ISO_8859_6 = 9;

  public static final int ISO_8859_7 = 10;

  public static final int ISO_8859_8 = 11;

  public static final int ISO_8859_9 = 12;

  public static final int SHIFT_JIS = 17;

  public static final int UTF_8 = 106;

  public static final int BIG5 = 2026;

  public static final int UCS2 = 1000;

  public static final int UTF_16 = 1015;

  public static final int DEFAULT_CHARSET = 106;

  public static final java.lang.String MIMENAME_ANY_CHARSET = "*";

  public static final java.lang.String MIMENAME_US_ASCII = "us-ascii";

  public static final java.lang.String MIMENAME_ISO_8859_1 = "iso-8859-1";

  public static final java.lang.String MIMENAME_ISO_8859_2 = "iso-8859-2";

  public static final java.lang.String MIMENAME_ISO_8859_3 = "iso-8859-3";

  public static final java.lang.String MIMENAME_ISO_8859_4 = "iso-8859-4";

  public static final java.lang.String MIMENAME_ISO_8859_5 = "iso-8859-5";

  public static final java.lang.String MIMENAME_ISO_8859_6 = "iso-8859-6";

  public static final java.lang.String MIMENAME_ISO_8859_7 = "iso-8859-7";

  public static final java.lang.String MIMENAME_ISO_8859_8 = "iso-8859-8";

  public static final java.lang.String MIMENAME_ISO_8859_9 = "iso-8859-9";

  public static final java.lang.String MIMENAME_SHIFT_JIS = "shift_JIS";

  public static final java.lang.String MIMENAME_UTF_8 = "utf-8";

  public static final java.lang.String MIMENAME_BIG5 = "big5";

  public static final java.lang.String MIMENAME_UCS2 = "iso-10646-ucs-2";

  public static final java.lang.String MIMENAME_UTF_16 = "utf-16";

  public static final java.lang.String DEFAULT_CHARSET_NAME = "utf-8";

  // Constructors

  private CharacterSets(){
  }
  // Methods

  public static int getMibEnumValue(java.lang.String arg1) throws java.io.UnsupportedEncodingException{
    return 0;
  }
  public static java.lang.String getMimeName(int arg1) throws java.io.UnsupportedEncodingException{
    return (java.lang.String) null;
  }
}
