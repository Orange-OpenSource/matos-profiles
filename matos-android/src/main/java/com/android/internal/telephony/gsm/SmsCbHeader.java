package com.android.internal.telephony.gsm;

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


public class SmsCbHeader
  implements android.telephony.SmsCbConstants
{
  // Fields

  public static final int PDU_HEADER_LENGTH = 6;

  public static final int FORMAT_GSM = 1;

  public static final int FORMAT_UMTS = 2;

  public static final int FORMAT_ETWS_PRIMARY = 3;

  public static final int PDU_LENGTH_GSM = 88;

  public static final int PDU_LENGTH_ETWS = 56;

  public final int geographicalScope = 0;

  public final int messageCode = 0;

  public final int updateNumber = 0;

  public final int messageIdentifier = 0;

  public final int dataCodingScheme = 0;

  public final int pageIndex = 0;

  public final int nrOfPages = 0;

  public final int format = 0;

  public final boolean etwsEmergencyUserAlert = false;

  public final boolean etwsPopup = false;

  public final int etwsWarningType = 0;

  // Constructors

  public SmsCbHeader(byte [] arg1) throws java.lang.IllegalArgumentException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static boolean isEmergencyMessage(int arg1){
    return false;
  }
  public static boolean isEtwsMessage(int arg1){
    return false;
  }
  public static boolean isCmasMessage(int arg1){
    return false;
  }
  public static boolean isEtwsPopupAlert(int arg1){
    return false;
  }
  public static boolean isEtwsEmergencyUserAlert(int arg1){
    return false;
  }
}
