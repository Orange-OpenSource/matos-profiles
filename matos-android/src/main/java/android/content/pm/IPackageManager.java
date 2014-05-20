package android.content.pm;

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
public interface IPackageManager
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IPackageManagerStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IPackageManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IPackageManager asInterface(android.os.IBinder arg1){
      return (IPackageManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int checkPermission(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public PackageInfo getPackageInfo(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public ApplicationInfo getApplicationInfo(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void deletePackage(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDeleteObserver") IPackageDeleteObserver arg2, int arg3) throws android.os.RemoteException;
  public ActivityInfo getActivityInfo(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  public void systemReady() throws android.os.RemoteException;
  public ProviderInfo getProviderInfo(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  public ServiceInfo getServiceInfo(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  public ActivityInfo getReceiverInfo(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  public boolean hasSystemFeature(java.lang.String arg1) throws android.os.RemoteException;
  public java.util.List<ResolveInfo> queryIntentActivities(android.content.Intent arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public void finishPackageInstall(int arg1) throws android.os.RemoteException;
  public void setInstallerPackageName(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public java.lang.String getInstallerPackageName(java.lang.String arg1) throws android.os.RemoteException;
  public ResolveInfo resolveIntent(android.content.Intent arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public java.util.List<ResolveInfo> queryIntentServices(android.content.Intent arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public java.lang.String [] getPackagesForUid(int arg1) throws android.os.RemoteException;
  public java.util.List<ResolveInfo> queryIntentActivityOptions(android.content.ComponentName arg1, android.content.Intent [] arg2, java.lang.String [] arg3, android.content.Intent arg4, java.lang.String arg5, int arg6) throws android.os.RemoteException;
  public void freeStorageAndNotify(long arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") IPackageDataObserver arg2) throws android.os.RemoteException;
  public int getUidForSharedUser(java.lang.String arg1) throws android.os.RemoteException;
  public PermissionInfo getPermissionInfo(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public PermissionGroupInfo getPermissionGroupInfo(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void updateExternalMediaStatus(boolean arg1, boolean arg2) throws android.os.RemoteException;
  public int getPackageUid(java.lang.String arg1) throws android.os.RemoteException;
  public void installPackage(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageInstallObserver") IPackageInstallObserver arg2, int arg3, java.lang.String arg4) throws android.os.RemoteException;
  public ParceledListSlice getInstalledPackages(int arg1, java.lang.String arg2) throws android.os.RemoteException;
  public int [] getPackageGids(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String [] currentToCanonicalPackageNames(java.lang.String [] arg1) throws android.os.RemoteException;
  public java.lang.String [] canonicalToCurrentPackageNames(java.lang.String [] arg1) throws android.os.RemoteException;
  public java.util.List<PermissionInfo> queryPermissionsByGroup(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public java.util.List<PermissionGroupInfo> getAllPermissionGroups(int arg1) throws android.os.RemoteException;
  public int checkUidPermission(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public boolean addPermission(PermissionInfo arg1) throws android.os.RemoteException;
  public void removePermission(java.lang.String arg1) throws android.os.RemoteException;
  public boolean isProtectedBroadcast(java.lang.String arg1) throws android.os.RemoteException;
  public int checkSignatures(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public int checkUidSignatures(int arg1, int arg2) throws android.os.RemoteException;
  public java.lang.String getNameForUid(int arg1) throws android.os.RemoteException;
  public java.util.List<ResolveInfo> queryIntentReceivers(android.content.Intent arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public ResolveInfo resolveService(android.content.Intent arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public ParceledListSlice getInstalledApplications(int arg1, java.lang.String arg2) throws android.os.RemoteException;
  public java.util.List<ApplicationInfo> getPersistentApplications(int arg1) throws android.os.RemoteException;
  public ProviderInfo resolveContentProvider(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void querySyncProviders(java.util.List<java.lang.String> arg1, java.util.List<ProviderInfo> arg2) throws android.os.RemoteException;
  public java.util.List<ProviderInfo> queryContentProviders(java.lang.String arg1, int arg2, int arg3) throws android.os.RemoteException;
  public InstrumentationInfo getInstrumentationInfo(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  public java.util.List<InstrumentationInfo> queryInstrumentation(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void addPackageToPreferred(java.lang.String arg1) throws android.os.RemoteException;
  public void removePackageFromPreferred(java.lang.String arg1) throws android.os.RemoteException;
  public java.util.List<PackageInfo> getPreferredPackages(int arg1) throws android.os.RemoteException;
  public void addPreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4) throws android.os.RemoteException;
  public void replacePreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4) throws android.os.RemoteException;
  public void clearPackagePreferredActivities(java.lang.String arg1) throws android.os.RemoteException;
  public int getPreferredActivities(java.util.List<android.content.IntentFilter> arg1, java.util.List<android.content.ComponentName> arg2, java.lang.String arg3) throws android.os.RemoteException;
  public void setComponentEnabledSetting(android.content.ComponentName arg1, int arg2, int arg3) throws android.os.RemoteException;
  public int getComponentEnabledSetting(android.content.ComponentName arg1) throws android.os.RemoteException;
  public void setApplicationEnabledSetting(java.lang.String arg1, int arg2, int arg3) throws android.os.RemoteException;
  public int getApplicationEnabledSetting(java.lang.String arg1) throws android.os.RemoteException;
  public void setPackageStoppedState(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public void freeStorage(long arg1, android.content.IntentSender arg2) throws android.os.RemoteException;
  public void deleteApplicationCacheFiles(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") IPackageDataObserver arg2) throws android.os.RemoteException;
  public void clearApplicationUserData(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") IPackageDataObserver arg2) throws android.os.RemoteException;
  public void getPackageSizeInfo(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageStatsObserver") IPackageStatsObserver arg2) throws android.os.RemoteException;
  public java.lang.String [] getSystemSharedLibraryNames() throws android.os.RemoteException;
  public FeatureInfo [] getSystemAvailableFeatures() throws android.os.RemoteException;
  public void enterSafeMode() throws android.os.RemoteException;
  public boolean isSafeMode() throws android.os.RemoteException;
  public boolean hasSystemUidErrors() throws android.os.RemoteException;
  public void performBootDexOpt() throws android.os.RemoteException;
  public boolean performDexOpt(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String nextPackageToClean(java.lang.String arg1) throws android.os.RemoteException;
  public void movePackage(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageMoveObserver") IPackageMoveObserver arg2, int arg3) throws android.os.RemoteException;
  public boolean addPermissionAsync(PermissionInfo arg1) throws android.os.RemoteException;
  public boolean setInstallLocation(int arg1) throws android.os.RemoteException;
  public int getInstallLocation() throws android.os.RemoteException;
  public UserInfo createUser(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public boolean removeUser(int arg1) throws android.os.RemoteException;
  public void installPackageWithVerification(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageInstallObserver") IPackageInstallObserver arg2, int arg3, java.lang.String arg4, android.net.Uri arg5, ManifestDigest arg6) throws android.os.RemoteException;
  public void verifyPendingInstall(int arg1, int arg2) throws android.os.RemoteException;
  public VerifierDeviceIdentity getVerifierDeviceIdentity() throws android.os.RemoteException;
  public boolean isFirstBoot() throws android.os.RemoteException;
}
