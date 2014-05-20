package android.net.wifi;

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
public enum SupplicantState
  implements android.os.Parcelable
{
  // Enum Constants

  DISCONNECTED()
, INTERFACE_DISABLED()
, INACTIVE()
, SCANNING()
, AUTHENTICATING()
, ASSOCIATING()
, ASSOCIATED()
, FOUR_WAY_HANDSHAKE()
, GROUP_HANDSHAKE()
, COMPLETED()
, DORMANT()
, UNINITIALIZED()
, INVALID()
;
  // Fields

  public static final android.os.Parcelable.Creator<SupplicantState> CREATOR = null;

  // Constructors

  private SupplicantState(){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static boolean isValidState(SupplicantState arg1){
    return false;
  }
}
