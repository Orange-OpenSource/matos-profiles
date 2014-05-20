package android.telephony;

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
public class PhoneNumberUtils
{
  // Fields

  public static final char PAUSE = ',';

  public static final char WAIT = ';';

  public static final char WILD = 'N';

  public static final int TOA_International = 145;

  public static final int TOA_Unknown = 129;

  public static final int FORMAT_UNKNOWN = 0;

  public static final int FORMAT_NANP = 1;

  public static final int FORMAT_JAPAN = 2;

  // Constructors

  public PhoneNumberUtils(){
  }
  // Methods

  public static boolean compare(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static boolean compare(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
    return false;
  }
  public static boolean compare(java.lang.String arg1, java.lang.String arg2, boolean arg3){
    return false;
  }
  public static boolean isVoiceMailNumber(java.lang.String arg1){
    return false;
  }
  public static boolean isEmergencyNumber(java.lang.String arg1){
    return false;
  }
  public static boolean isEmergencyNumber(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static java.lang.String calledPartyBCDToString(byte [] arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public static byte [] networkPortionToCalledPartyBCDWithLength(java.lang.String arg1){
    return (byte []) null;
  }
  public static byte [] networkPortionToCalledPartyBCD(java.lang.String arg1){
    return (byte []) null;
  }
  public static int toaFromString(java.lang.String arg1){
    return 0;
  }
  public static java.lang.String stringFromStringAndTOA(java.lang.String arg1, int arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String extractPostDialPortion(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String extractNetworkPortionAlt(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static final boolean is12Key(char arg1){
    return false;
  }
  public static java.lang.String cdmaCheckAndProcessPlusCode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean isUriNumber(java.lang.String arg1){
    return false;
  }
  public static boolean isLocalEmergencyNumber(java.lang.String arg1, android.content.Context arg2){
    return false;
  }
  public static boolean isGlobalPhoneNumber(java.lang.String arg1){
    return false;
  }
  public static java.lang.String formatNumber(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String formatNumber(java.lang.String arg1, int arg2){
    return (java.lang.String) null;
  }
  public static void formatNumber(android.text.Editable arg1, int arg2){
  }
  public static java.lang.String formatNumber(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String formatNumber(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String stripSeparators(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static final boolean isNonSeparator(char arg1){
    return false;
  }
  public static byte [] numberToCalledPartyBCD(java.lang.String arg1){
    return (byte []) null;
  }
  public static java.lang.String calledPartyBCDFragmentToString(byte [] arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String extractNetworkPortion(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean isISODigit(char arg1){
    return false;
  }
  public static final boolean isDialable(char arg1){
    return false;
  }
  public static final boolean isReallyDialable(char arg1){
    return false;
  }
  public static final boolean isStartsPostDial(char arg1){
    return false;
  }
  public static java.lang.String getNumberFromIntent(android.content.Intent arg1, android.content.Context arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String convertPreDial(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean compareLoosely(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static boolean compareStrictly(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static boolean compareStrictly(java.lang.String arg1, java.lang.String arg2, boolean arg3){
    return false;
  }
  public static java.lang.String toCallerIDMinMatch(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getStrippedReversed(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean isWellFormedSmsAddress(java.lang.String arg1){
    return false;
  }
  public static int getFormatTypeForLocale(java.util.Locale arg1){
    return 0;
  }
  public static void formatNanpNumber(android.text.Editable arg1){
  }
  public static void formatJapaneseNumber(android.text.Editable arg1){
  }
  public static java.lang.String formatNumberToE164(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String normalizeNumber(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String convertKeypadLettersToDigits(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String cdmaCheckAndProcessPlusCodeByNumberFormat(java.lang.String arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
}
