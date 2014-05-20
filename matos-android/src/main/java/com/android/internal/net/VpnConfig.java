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


public class VpnConfig
  implements android.os.Parcelable
{
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";

  public static final java.lang.String LEGACY_VPN = "[Legacy VPN]";

  public java.lang.String user;

  public java.lang.String interfaze;

  public java.lang.String session;

  public int mtu;

  public java.lang.String addresses;

  public java.lang.String routes;

  public java.util.List<java.lang.String> dnsServers;

  public java.util.List<java.lang.String> searchDomains;

  public android.app.PendingIntent configureIntent;

  public long startTime;

  public static final android.os.Parcelable.Creator<VpnConfig> CREATOR = null;

  // Constructors

  public VpnConfig(){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static android.app.PendingIntent getIntentForStatusPanel(android.content.Context arg1, VpnConfig arg2){
    return (android.app.PendingIntent) null;
  }
  public static android.content.Intent getIntentForConfirmation(){
    return (android.content.Intent) null;
  }
}
