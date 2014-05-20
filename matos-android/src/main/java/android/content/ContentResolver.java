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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class ContentResolver
{
  // Classes

  public class OpenResourceIdResult
  {
    // Fields

    public android.content.res.Resources r;

    public int id;

    // Constructors

    public OpenResourceIdResult(){
    }
  }
  // Fields

  public static final java.lang.String SYNC_EXTRAS_ACCOUNT = "account";

  public static final java.lang.String SYNC_EXTRAS_EXPEDITED = "expedited";

  public static final java.lang.String SYNC_EXTRAS_FORCE = "force";

  public static final java.lang.String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";

  public static final java.lang.String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";

  public static final java.lang.String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";

  public static final java.lang.String SYNC_EXTRAS_MANUAL = "force";

  public static final java.lang.String SYNC_EXTRAS_UPLOAD = "upload";

  public static final java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";

  public static final java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";

  public static final java.lang.String SYNC_EXTRAS_INITIALIZE = "initialize";

  public static final java.lang.String SCHEME_CONTENT = "content";

  public static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";

  public static final java.lang.String SCHEME_FILE = "file";

  public static final java.lang.String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";

  public static final java.lang.String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";

  public static final int SYNC_ERROR_SYNC_ALREADY_IN_PROGRESS = 1;

  public static final int SYNC_ERROR_AUTHENTICATION = 2;

  public static final int SYNC_ERROR_IO = 3;

  public static final int SYNC_ERROR_PARSE = 4;

  public static final int SYNC_ERROR_CONFLICT = 5;

  public static final int SYNC_ERROR_TOO_MANY_DELETIONS = 6;

  public static final int SYNC_ERROR_TOO_MANY_RETRIES = 7;

  public static final int SYNC_ERROR_INTERNAL = 8;

  public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;

  public static final int SYNC_OBSERVER_TYPE_PENDING = 2;

  public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;

  public static final int SYNC_OBSERVER_TYPE_STATUS = 8;

  public static final int SYNC_OBSERVER_TYPE_ALL = 2147483647;

  public static final java.lang.String CONTENT_SERVICE_NAME = "content";

  // Constructors

  public ContentResolver(Context arg1){
  }
  // Methods

  public final java.lang.String getType(android.net.Uri arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.delete", pos = {1, 2, 3}, report = "-")
  public final int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.insert", pos = {1, 2}, report = "-")
  public final android.net.Uri insert(android.net.Uri arg1, ContentValues arg2){
    return (android.net.Uri) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.query", pos = {1, 2, 3, 4, 5}, report = "-")
  public final android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5){
    return (android.database.Cursor) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.update", pos = {1, 2, 3, 4}, report = "-")
  public final int update(android.net.Uri arg1, ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.openInputStream", pos = {-1, 1}, report = "-")
  public final java.io.InputStream openInputStream(android.net.Uri arg1) throws java.io.FileNotFoundException{
    return (java.io.InputStream) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.openOutputStream", pos = {-1, 1}, report = "-")
  public final java.io.OutputStream openOutputStream(android.net.Uri arg1) throws java.io.FileNotFoundException{
    return (java.io.OutputStream) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.openOutputStream-2", pos = {-1, 1, 2}, report = "-")
  public final java.io.OutputStream openOutputStream(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (java.io.OutputStream) null;
  }
  public final android.os.Bundle call(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, android.os.Bundle arg4){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.bulkInsert", pos = {1, 2}, report = "-")
  public final int bulkInsert(android.net.Uri arg1, ContentValues [] arg2){
    return 0;
  }
  public ContentProviderResult [] applyBatch(java.lang.String arg1, java.util.ArrayList<ContentProviderOperation> arg2) throws android.os.RemoteException, OperationApplicationException{
    return (ContentProviderResult []) null;
  }
  public java.lang.String [] getStreamTypes(android.net.Uri arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentResolver.registerContentObserver", pos = 1, report = "-")
  public final void registerContentObserver(android.net.Uri arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.ContentObserver arg3){
  }
  public final void unregisterContentObserver(android.database.ContentObserver arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.notifyChange-1", pos = 1, report = "-")
  public void notifyChange(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.ContentObserver arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.notifyChange-2", pos = 1, report = "-")
  public void notifyChange(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.ContentObserver arg2, boolean arg3){
  }
  public ContentResolver.OpenResourceIdResult getResourceId(android.net.Uri arg1) throws java.io.FileNotFoundException{
    return (ContentResolver.OpenResourceIdResult) null;
  }
  public static void requestSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public void cancelSync(android.net.Uri arg1){
  }
  public static void cancelSync(android.accounts.Account arg1, java.lang.String arg2){
  }
  public static boolean getSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public static void setSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2, boolean arg3){
  }
  public static java.util.List<PeriodicSync> getPeriodicSyncs(android.accounts.Account arg1, java.lang.String arg2){
    return (java.util.List) null;
  }
  public static void addPeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3, long arg4){
  }
  public static void removePeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public static int getIsSyncable(android.accounts.Account arg1, java.lang.String arg2){
    return 0;
  }
  public static void setIsSyncable(android.accounts.Account arg1, java.lang.String arg2, int arg3){
  }
  public static void setMasterSyncAutomatically(boolean arg1){
  }
  public static boolean getMasterSyncAutomatically(){
    return false;
  }
  public static boolean isSyncActive(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public static java.util.List<SyncInfo> getCurrentSyncs(){
    return (java.util.List) null;
  }
  public static SyncAdapterType [] getSyncAdapterTypes(){
    return (SyncAdapterType []) null;
  }
  public static SyncStatusInfo getSyncStatus(android.accounts.Account arg1, java.lang.String arg2){
    return (SyncStatusInfo) null;
  }
  public static boolean isSyncPending(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public static java.lang.Object addStatusChangeListener(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onStatusChanged") SyncStatusObserver arg2){
    return (java.lang.Object) null;
  }
  public static void removeStatusChangeListener(java.lang.Object arg1){
  }
  public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3) throws java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public void startSync(android.net.Uri arg1, android.os.Bundle arg2){
  }
  public abstract boolean releaseProvider(IContentProvider arg1);
  public final android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.acquireContentProviderClient-1", pos = {-1, 1}, report = "-")
  public final ContentProviderClient acquireContentProviderClient(android.net.Uri arg1){
    return (ContentProviderClient) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.acquireContentProviderClient-2", pos = {-1, 1}, report = "-")
  public final ContentProviderClient acquireContentProviderClient(java.lang.String arg1){
    return (ContentProviderClient) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.acquireProvider-1", pos = {-1, 1, 2}, report = "-")
  protected abstract IContentProvider acquireProvider(Context arg1, java.lang.String arg2);
  public final IContentProvider acquireProvider(android.net.Uri arg1){
    return (IContentProvider) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProvider.acquireProvider-2", pos = {-1, 1}, report = "-")
  public final IContentProvider acquireProvider(java.lang.String arg1){
    return (IContentProvider) null;
  }
  public static int modeToMode(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return 0;
  }
  public final android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  protected IContentProvider acquireExistingProvider(Context arg1, java.lang.String arg2){
    return (IContentProvider) null;
  }
  public final IContentProvider acquireExistingProvider(android.net.Uri arg1){
    return (IContentProvider) null;
  }
  public static void validateSyncExtrasBundle(android.os.Bundle arg1){
  }
  public static SyncInfo getCurrentSync(){
    return (SyncInfo) null;
  }
  public static IContentService getContentService(){
    return (IContentService) null;
  }
}
