package android.nfc;

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


public final class NdefRecord
  implements android.os.Parcelable
{
  // Fields

  public static final short TNF_EMPTY = 0;

  public static final short TNF_WELL_KNOWN = 1;

  public static final short TNF_MIME_MEDIA = 2;

  public static final short TNF_ABSOLUTE_URI = 3;

  public static final short TNF_EXTERNAL_TYPE = 4;

  public static final short TNF_UNKNOWN = 5;

  public static final short TNF_UNCHANGED = 6;

  public static final short TNF_RESERVED = 7;

  public static final byte [] RTD_TEXT = null;

  public static final byte [] RTD_URI = null;

  public static final byte [] RTD_SMART_POSTER = null;

  public static final byte [] RTD_ALTERNATIVE_CARRIER = null;

  public static final byte [] RTD_HANDOVER_CARRIER = null;

  public static final byte [] RTD_HANDOVER_REQUEST = null;

  public static final byte [] RTD_HANDOVER_SELECT = null;

  public static final byte [] RTD_ANDROID_APP = null;

  public static final android.os.Parcelable.Creator<NdefRecord> CREATOR = null;

  // Constructors

  public NdefRecord(short arg1, byte [] arg2, byte [] arg3, byte [] arg4){
  }
  NdefRecord(short arg1, byte [] arg2, byte [] arg3, byte [] arg4, byte arg5){
  }
  public NdefRecord(byte [] arg1) throws FormatException{
  }
  // Methods

  public byte [] getId(){
    return (byte []) null;
  }
  public byte [] getType(){
    return (byte []) null;
  }
  public byte [] toByteArray(){
    return (byte []) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static NdefRecord createUri(android.net.Uri arg1){
    return (NdefRecord) null;
  }
  public static NdefRecord createUri(java.lang.String arg1){
    return (NdefRecord) null;
  }
  public short getTnf(){
    return (short) 0;
  }
  public byte [] getPayload(){
    return (byte []) null;
  }
  public static android.net.Uri parseWellKnownUriRecord(NdefRecord arg1) throws FormatException{
    return (android.net.Uri) null;
  }
  public static NdefRecord createApplicationRecord(java.lang.String arg1){
    return (NdefRecord) null;
  }
}
