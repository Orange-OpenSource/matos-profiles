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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class NetworkStatsService
  extends android.net.INetworkStatsService.Stub{
  // Classes

  public static interface NetworkStatsSettings
  {
    // Methods

    public long getPollInterval();
    public long getPersistThreshold();
    public long getNetworkBucketDuration();
    public long getNetworkMaxHistory();
    public long getUidBucketDuration();
    public long getUidMaxHistory();
    public long getTagMaxHistory();
    public long getTimeCacheMaxAge();
  }
  // Fields

  public static final java.lang.String ACTION_NETWORK_STATS_POLL = "com.android.server.action.NETWORK_STATS_POLL";

  public static final java.lang.String ACTION_NETWORK_STATS_UPDATED = "com.android.server.action.NETWORK_STATS_UPDATED";

  // Constructors

  public NetworkStatsService(android.content.Context arg1, android.os.INetworkManagementService arg2, android.app.IAlarmManager arg3){
    super();
  }
  public NetworkStatsService(android.content.Context arg1, android.os.INetworkManagementService arg2, android.app.IAlarmManager arg3, android.util.TrustedTime arg4, java.io.File arg5, NetworkStatsService.NetworkStatsSettings arg6){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void systemReady(){
  }
  public void forceUpdate(){
  }
  public android.net.NetworkStatsHistory getHistoryForNetwork(android.net.NetworkTemplate arg1, int arg2){
    return (android.net.NetworkStatsHistory) null;
  }
  public android.net.NetworkStatsHistory getHistoryForUid(android.net.NetworkTemplate arg1, int arg2, int arg3, int arg4, int arg5){
    return (android.net.NetworkStatsHistory) null;
  }
  public android.net.NetworkStats getSummaryForNetwork(android.net.NetworkTemplate arg1, long arg2, long arg3){
    return (android.net.NetworkStats) null;
  }
  public android.net.NetworkStats getSummaryForAllUid(android.net.NetworkTemplate arg1, long arg2, long arg3, boolean arg4){
    return (android.net.NetworkStats) null;
  }
  public android.net.NetworkStats getDataLayerSnapshotForUid(int arg1) throws android.os.RemoteException{
    return (android.net.NetworkStats) null;
  }
  public void incrementOperationCount(int arg1, int arg2, int arg3){
  }
  public void setUidForeground(int arg1, boolean arg2){
  }
  public void bindConnectivityManager(android.net.IConnectivityManager arg1){
  }
}
