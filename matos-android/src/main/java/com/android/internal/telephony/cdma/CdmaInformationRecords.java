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
public final class CdmaInformationRecords
{
  // Classes

  public static class CdmaSignalInfoRec
  {
    // Fields

    public boolean isPresent;

    public int signalType;

    public int alertPitch;

    public int signal;

    // Constructors

    public CdmaSignalInfoRec(){
    }
    public CdmaSignalInfoRec(int arg1, int arg2, int arg3, int arg4){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaDisplayInfoRec
  {
    // Fields

    public int id;

    public java.lang.String alpha;

    // Constructors

    public CdmaDisplayInfoRec(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("alpha") java.lang.String arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaNumberInfoRec
  {
    // Fields

    public int id;

    public java.lang.String number;

    public byte numberType;

    public byte numberPlan;

    public byte pi;

    public byte si;

    // Constructors

    public CdmaNumberInfoRec(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("number") java.lang.String arg2, int arg3, int arg4, int arg5, int arg6){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaRedirectingNumberInfoRec
  {
    // Fields

    public static final int REASON_UNKNOWN = 0;

    public static final int REASON_CALL_FORWARDING_BUSY = 1;

    public static final int REASON_CALL_FORWARDING_NO_REPLY = 2;

    public static final int REASON_CALLED_DTE_OUT_OF_ORDER = 9;

    public static final int REASON_CALL_FORWARDING_BY_THE_CALLED_DTE = 10;

    public static final int REASON_CALL_FORWARDING_UNCONDITIONAL = 15;

    public CdmaInformationRecords.CdmaNumberInfoRec numberInfoRec;

    public int redirectingReason;

    // Constructors

    public CdmaRedirectingNumberInfoRec(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaLineControlInfoRec
  {
    // Fields

    public byte lineCtrlPolarityIncluded;

    public byte lineCtrlToggle;

    public byte lineCtrlReverse;

    public byte lineCtrlPowerDenial;

    // Constructors

    public CdmaLineControlInfoRec(int arg1, int arg2, int arg3, int arg4){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaT53ClirInfoRec
  {
    // Fields

    public byte cause;

    // Constructors

    public CdmaT53ClirInfoRec(int arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class CdmaT53AudioControlInfoRec
  {
    // Fields

    public byte uplink;

    public byte downlink;

    // Constructors

    public CdmaT53AudioControlInfoRec(int arg1, int arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public java.lang.Object record;

  public static final int RIL_CDMA_DISPLAY_INFO_REC = 0;

  public static final int RIL_CDMA_CALLED_PARTY_NUMBER_INFO_REC = 1;

  public static final int RIL_CDMA_CALLING_PARTY_NUMBER_INFO_REC = 2;

  public static final int RIL_CDMA_CONNECTED_NUMBER_INFO_REC = 3;

  public static final int RIL_CDMA_SIGNAL_INFO_REC = 4;

  public static final int RIL_CDMA_REDIRECTING_NUMBER_INFO_REC = 5;

  public static final int RIL_CDMA_LINE_CONTROL_INFO_REC = 6;

  public static final int RIL_CDMA_EXTENDED_DISPLAY_INFO_REC = 7;

  public static final int RIL_CDMA_T53_CLIR_INFO_REC = 8;

  public static final int RIL_CDMA_T53_RELEASE_INFO_REC = 9;

  public static final int RIL_CDMA_T53_AUDIO_CONTROL_INFO_REC = 10;

  // Constructors

  public CdmaInformationRecords(android.os.Parcel arg1){
  }
  // Methods

  public static java.lang.String idToString(int arg1){
    return (java.lang.String) null;
  }
}
