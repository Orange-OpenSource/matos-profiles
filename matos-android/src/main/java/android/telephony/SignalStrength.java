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
public class SignalStrength
  implements android.os.Parcelable
{
  // Fields

  public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;

  public static final int SIGNAL_STRENGTH_POOR = 1;

  public static final int SIGNAL_STRENGTH_MODERATE = 2;

  public static final int SIGNAL_STRENGTH_GOOD = 3;

  public static final int SIGNAL_STRENGTH_GREAT = 4;

  public static final int NUM_SIGNAL_STRENGTH_BINS = 5;

  public static final java.lang.String [] SIGNAL_STRENGTH_NAMES = null;

  public static final android.os.Parcelable.Creator<SignalStrength> CREATOR = null;

  // Constructors

  public SignalStrength(){
  }
  public SignalStrength(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13){
  }
  public SignalStrength(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8){
  }
  public SignalStrength(SignalStrength arg1){
  }
  public SignalStrength(android.os.Parcel arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int getLevel(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  protected void copyFrom(SignalStrength arg1){
  }
  public boolean isGsm(){
    return false;
  }
  public static SignalStrength newFromBundle(android.os.Bundle arg1){
    return (SignalStrength) null;
  }
  public int getGsmSignalStrength(){
    return 0;
  }
  public int getGsmBitErrorRate(){
    return 0;
  }
  public int getCdmaDbm(){
    return 0;
  }
  public int getCdmaEcio(){
    return 0;
  }
  public int getEvdoDbm(){
    return 0;
  }
  public int getEvdoEcio(){
    return 0;
  }
  public int getEvdoSnr(){
    return 0;
  }
  public int getAsuLevel(){
    return 0;
  }
  public int getDbm(){
    return 0;
  }
  public int getGsmDbm(){
    return 0;
  }
  public int getGsmLevel(){
    return 0;
  }
  public int getGsmAsuLevel(){
    return 0;
  }
  public int getCdmaLevel(){
    return 0;
  }
  public int getCdmaAsuLevel(){
    return 0;
  }
  public int getEvdoLevel(){
    return 0;
  }
  public int getEvdoAsuLevel(){
    return 0;
  }
  public int getLteDbm(){
    return 0;
  }
  public int getLteLevel(){
    return 0;
  }
  public int getLteAsuLevel(){
    return 0;
  }
  public void fillInNotifierBundle(android.os.Bundle arg1){
  }
}
