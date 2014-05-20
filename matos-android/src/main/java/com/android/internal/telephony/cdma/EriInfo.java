package com.android.internal.telephony.cdma;

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
public final class EriInfo
{
  // Fields

  public static final int ROAMING_INDICATOR_ON = 0;

  public static final int ROAMING_INDICATOR_OFF = 1;

  public static final int ROAMING_INDICATOR_FLASH = 2;

  public static final int ROAMING_ICON_MODE_NORMAL = 0;

  public static final int ROAMING_ICON_MODE_FLASH = 1;

  public int mRoamingIndicator;

  public int mIconIndex;

  public int mIconMode;

  public java.lang.String mEriText;

  public int mCallPromptId;

  public int mAlertId;

  // Constructors

  public EriInfo(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mEriText") java.lang.String arg4, int arg5, int arg6){
  }
}