package com.android.server.net;

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


public class NetworkPolicyManagerService
  extends android.net.INetworkPolicyManager.Stub{
  // Classes

  public static class XmlUtils
  {
    // Constructors

    public XmlUtils(){
    }
    // Methods

    public static int readIntAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2) throws java.io.IOException{
      return 0;
    }
    public static void writeIntAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1, java.lang.String arg2, int arg3) throws java.io.IOException{
    }
    public static long readLongAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2) throws java.io.IOException{
      return 0l;
    }
    public static void writeLongAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1, java.lang.String arg2, long arg3) throws java.io.IOException{
    }
    public static boolean readBooleanAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2){
      return false;
    }
    public static void writeBooleanAttribute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1, java.lang.String arg2, boolean arg3) throws java.io.IOException{
    }
  }
  // Fields

  public static final int TYPE_WARNING = 1;

  public static final int TYPE_LIMIT = 2;

  public static final int TYPE_LIMIT_SNOOZED = 3;

  public static final java.lang.String ACTION_ALLOW_BACKGROUND = "com.android.server.action.ACTION_ALLOW_BACKGROUND";

  // Constructors

  public NetworkPolicyManagerService(android.content.Context arg1, android.app.IActivityManager arg2, android.os.IPowerManager arg3, android.net.INetworkStatsService arg4, android.os.INetworkManagementService arg5){
    super();
  }
  public NetworkPolicyManagerService(android.content.Context arg1, android.app.IActivityManager arg2, android.os.IPowerManager arg3, android.net.INetworkStatsService arg4, android.os.INetworkManagementService arg5, android.util.TrustedTime arg6, java.io.File arg7, boolean arg8){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("INetworkPolicyListener") android.net.INetworkPolicyListener arg1){
  }
  public void unregisterListener(android.net.INetworkPolicyListener arg1){
  }
  public void systemReady(){
  }
  public void setUidPolicy(int arg1, int arg2){
  }
  public int getUidPolicy(int arg1){
    return 0;
  }
  public boolean isUidForeground(int arg1){
    return false;
  }
  public void setNetworkPolicies(android.net.NetworkPolicy [] arg1){
  }
  public android.net.NetworkPolicy [] getNetworkPolicies(){
    return (android.net.NetworkPolicy []) null;
  }
  public void snoozePolicy(android.net.NetworkTemplate arg1){
  }
  public void setRestrictBackground(boolean arg1){
  }
  public boolean getRestrictBackground(){
    return false;
  }
  public android.net.NetworkQuotaInfo getNetworkQuotaInfo(android.net.NetworkState arg1){
    return (android.net.NetworkQuotaInfo) null;
  }
  public void bindConnectivityManager(android.net.IConnectivityManager arg1){
  }
  public void bindNotificationManager(android.app.INotificationManager arg1){
  }
}
