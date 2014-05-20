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
public enum Tone
  implements android.os.Parcelable
{
  // Enum Constants

  DIAL(0)
, BUSY(0)
, CONGESTION(0)
, RADIO_PATH_ACK(0)
, RADIO_PATH_NOT_AVAILABLE(0)
, ERROR_SPECIAL_INFO(0)
, CALL_WAITING(0)
, RINGING(0)
, GENERAL_BEEP(0)
, POSITIVE_ACK(0)
, NEGATIVE_ACK(0)
, INCOMING_SPEECH_CALL(0)
, INCOMING_SMS(0)
, CRITICAL_ALERT(0)
, VIBRATE_ONLY(0)
, HAPPY(0)
, SAD(0)
, URGENT(0)
, QUESTION(0)
, MESSAGE_RECEIVED(0)
, MELODY_1(0)
, MELODY_2(0)
, MELODY_3(0)
, MELODY_4(0)
, MELODY_5(0)
, MELODY_6(0)
, MELODY_7(0)
, MELODY_8(0)
;
  // Fields

  public static final android.os.Parcelable.Creator<Tone> CREATOR = null;

  // Constructors

  private Tone(int arg1){
  }
  private Tone(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static Tone fromInt(int arg1){
    return (Tone) null;
  }
}
