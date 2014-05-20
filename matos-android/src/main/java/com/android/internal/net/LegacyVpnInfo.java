package com.android.internal.net;

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


public class LegacyVpnInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int STATE_DISCONNECTED = 0;

  public static final int STATE_INITIALIZING = 1;

  public static final int STATE_CONNECTING = 2;

  public static final int STATE_CONNECTED = 3;

  public static final int STATE_TIMEOUT = 4;

  public static final int STATE_FAILED = 5;

  public java.lang.String key;

  public int state;

  public android.app.PendingIntent intent;

  public static final android.os.Parcelable.Creator<LegacyVpnInfo> CREATOR = null;

  // Constructors

  public LegacyVpnInfo(){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
