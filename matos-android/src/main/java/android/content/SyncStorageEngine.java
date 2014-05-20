package android.content;

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


public class SyncStorageEngine
  extends android.os.Handler{
  // Classes

  public static class PendingOperation
  {
    // Constructors

    PendingOperation(android.accounts.Account arg1, int arg2, java.lang.String arg3, android.os.Bundle arg4, boolean arg5){
    }
    PendingOperation(SyncStorageEngine.PendingOperation arg1){
    }
  }
  public static class AuthorityInfo
  {
    // Constructors

    AuthorityInfo(android.accounts.Account arg1, java.lang.String arg2, int arg3){
    }
  }
  public static class SyncHistoryItem
  {
    // Constructors

    public SyncHistoryItem(){
    }
  }
  public static class DayStats
  {
    // Fields

    public final int day = 0;

    public int successCount;

    public long successTime;

    public int failureCount;

    public long failureTime;

    // Constructors

    public DayStats(int arg1){
    }
  }
  // Fields

  public static final int EVENT_START = 0;

  public static final int EVENT_STOP = 1;

  public static final java.lang.String [] EVENTS = null;

  public static final int SOURCE_SERVER = 0;

  public static final int SOURCE_LOCAL = 1;

  public static final int SOURCE_POLL = 2;

  public static final int SOURCE_USER = 3;

  public static final int SOURCE_PERIODIC = 4;

  public static final long NOT_IN_BACKOFF_MODE = -1l;

  public static final Intent SYNC_CONNECTION_SETTING_CHANGED_INTENT = null;

  public static final java.lang.String [] SOURCES = null;

  public static final java.lang.String MESG_SUCCESS = "success";

  public static final java.lang.String MESG_CANCELED = "canceled";

  public static final int MAX_HISTORY = 100;

  public static final int STATUS_FILE_END = 0;

  public static final int STATUS_FILE_ITEM = 100;

  public static final int PENDING_OPERATION_VERSION = 2;

  public static final int STATISTICS_FILE_END = 0;

  public static final int STATISTICS_FILE_ITEM_OLD = 100;

  public static final int STATISTICS_FILE_ITEM = 101;

  // Constructors

  private SyncStorageEngine(Context arg1, java.io.File arg2){
    super();
  }
  // Methods

  public static boolean equals(android.os.Bundle arg1, android.os.Bundle arg2){
    return false;
  }
  public static void init(Context arg1){
  }
  public SyncStorageEngine.AuthorityInfo getAuthority(int arg1){
    return (SyncStorageEngine.AuthorityInfo) null;
  }
  public void handleMessage(android.os.Message arg1){
  }
  public static SyncStorageEngine getSingleton(){
    return (SyncStorageEngine) null;
  }
  public boolean getSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public void setSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2, boolean arg3){
  }
  public java.util.List<PeriodicSync> getPeriodicSyncs(android.accounts.Account arg1, java.lang.String arg2){
    return (java.util.List) null;
  }
  public void addPeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3, long arg4){
  }
  public void removePeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public int getIsSyncable(android.accounts.Account arg1, java.lang.String arg2){
    return 0;
  }
  public void setIsSyncable(android.accounts.Account arg1, java.lang.String arg2, int arg3){
  }
  public void setMasterSyncAutomatically(boolean arg1){
  }
  public boolean getMasterSyncAutomatically(){
    return false;
  }
  public boolean isSyncActive(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public java.util.List<SyncInfo> getCurrentSyncs(){
    return (java.util.List) null;
  }
  public java.util.ArrayList<SyncStatusInfo> getSyncStatus(){
    return (java.util.ArrayList) null;
  }
  public boolean isSyncPending(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public void addStatusChangeListener(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onStatusChanged") ISyncStatusObserver arg2){
  }
  public void removeStatusChangeListener(ISyncStatusObserver arg1){
  }
  public void clearAllBackoffs(SyncQueue arg1){
  }
  public void writeAllState(){
  }
  public void setDelayUntilTime(android.accounts.Account arg1, java.lang.String arg2, long arg3){
  }
  public void doDatabaseCleanup(android.accounts.Account [] arg1){
  }
  public void removeAuthority(android.accounts.Account arg1, java.lang.String arg2){
  }
  public android.util.Pair<java.lang.Long, java.lang.Long> getBackoff(android.accounts.Account arg1, java.lang.String arg2){
    return (android.util.Pair) null;
  }
  public long getDelayUntilTime(android.accounts.Account arg1, java.lang.String arg2){
    return 0l;
  }
  public void setBackoff(android.accounts.Account arg1, java.lang.String arg2, long arg3, long arg4){
  }
  public SyncStorageEngine.AuthorityInfo getOrCreateAuthority(android.accounts.Account arg1, java.lang.String arg2){
    return (SyncStorageEngine.AuthorityInfo) null;
  }
  public SyncStatusInfo getOrCreateSyncStatus(SyncStorageEngine.AuthorityInfo arg1){
    return (SyncStatusInfo) null;
  }
  public java.util.ArrayList<SyncStorageEngine.SyncHistoryItem> getSyncHistory(){
    return (java.util.ArrayList) null;
  }
  public SyncStorageEngine.DayStats [] getDayStatistics(){
    return (SyncStorageEngine.DayStats []) null;
  }
  public static SyncStorageEngine newTestInstance(Context arg1){
    return (SyncStorageEngine) null;
  }
  public SyncStorageEngine.PendingOperation insertIntoPending(SyncStorageEngine.PendingOperation arg1){
    return (SyncStorageEngine.PendingOperation) null;
  }
  public boolean deleteFromPending(SyncStorageEngine.PendingOperation arg1){
    return false;
  }
  public int clearPending(){
    return 0;
  }
  public java.util.ArrayList<SyncStorageEngine.PendingOperation> getPendingOperations(){
    return (java.util.ArrayList) null;
  }
  public int getPendingOperationCount(){
    return 0;
  }
  public void removeActiveSync(SyncInfo arg1){
  }
  public void reportActiveChange(){
  }
  public long insertStartSyncEvent(android.accounts.Account arg1, java.lang.String arg2, long arg3, int arg4){
    return 0l;
  }
  public void stopSyncEvent(long arg1, long arg2, java.lang.String arg3, long arg4, long arg5){
  }
  public java.util.ArrayList<SyncStorageEngine.AuthorityInfo> getAuthorities(){
    return (java.util.ArrayList) null;
  }
  public SyncStatusInfo getStatusByAccountAndAuthority(android.accounts.Account arg1, java.lang.String arg2){
    return (SyncStatusInfo) null;
  }
  public long getInitialSyncFailureTime(){
    return 0l;
  }
  public void clearAndReadState(){
  }
}
