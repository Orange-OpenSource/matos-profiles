package android.test.mock;

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
public class MockPackageManager
  extends android.content.pm.PackageManager{
  // Constructors

  public MockPackageManager(){
    super();
  }
  // Methods

  public int checkPermission(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public android.content.pm.PackageInfo getPackageInfo(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.PackageInfo) null;
  }
  public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.ApplicationInfo) null;
  }
  public java.lang.CharSequence getText(java.lang.String arg1, int arg2, android.content.pm.ApplicationInfo arg3){
    return (java.lang.CharSequence) null;
  }
  public void deletePackage(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDeleteObserver") android.content.pm.IPackageDeleteObserver arg2, int arg3){
  }
  public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.ActivityInfo) null;
  }
  public android.graphics.drawable.Drawable getDrawable(java.lang.String arg1, int arg2, android.content.pm.ApplicationInfo arg3){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.ProviderInfo) null;
  }
  public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.ServiceInfo) null;
  }
  public android.content.res.XmlResourceParser getXml(java.lang.String arg1, int arg2, android.content.pm.ApplicationInfo arg3){
    return (android.content.res.XmlResourceParser) null;
  }
  public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.ActivityInfo) null;
  }
  public boolean hasSystemFeature(java.lang.String arg1){
    return false;
  }
  public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent arg1, int arg2){
    return (java.util.List) null;
  }
  public void setInstallerPackageName(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getInstallerPackageName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent arg1, int arg2){
    return (java.util.List) null;
  }
  public java.lang.String [] getPackagesForUid(int arg1){
    return (java.lang.String []) null;
  }
  public java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName arg1, android.content.Intent [] arg2, android.content.Intent arg3, int arg4){
    return (java.util.List) null;
  }
  public void freeStorageAndNotify(long arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") android.content.pm.IPackageDataObserver arg2){
  }
  public int getUidForSharedUser(java.lang.String arg1){
    return 0;
  }
  public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.PermissionInfo) null;
  }
  public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.PermissionGroupInfo) null;
  }
  public void installPackage(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageInstallObserver") android.content.pm.IPackageInstallObserver arg2, int arg3, java.lang.String arg4){
  }
  public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int arg1){
    return (java.util.List) null;
  }
  public int [] getPackageGids(java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (int []) null;
  }
  public java.lang.String [] currentToCanonicalPackageNames(java.lang.String [] arg1){
    return (java.lang.String []) null;
  }
  public java.lang.String [] canonicalToCurrentPackageNames(java.lang.String [] arg1){
    return (java.lang.String []) null;
  }
  public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (java.util.List) null;
  }
  public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int arg1){
    return (java.util.List) null;
  }
  public boolean addPermission(android.content.pm.PermissionInfo arg1){
    return false;
  }
  public void removePermission(java.lang.String arg1){
  }
  public int checkSignatures(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public int checkSignatures(int arg1, int arg2){
    return 0;
  }
  public java.lang.String getNameForUid(int arg1){
    return (java.lang.String) null;
  }
  public android.content.pm.ResolveInfo resolveService(android.content.Intent arg1, int arg2){
    return (android.content.pm.ResolveInfo) null;
  }
  public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int arg1){
    return (java.util.List) null;
  }
  public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String arg1, int arg2){
    return (android.content.pm.ProviderInfo) null;
  }
  public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String arg1, int arg2, int arg3){
    return (java.util.List) null;
  }
  public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName arg1, int arg2) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.pm.InstrumentationInfo) null;
  }
  public java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String arg1, int arg2){
    return (java.util.List) null;
  }
  public void addPackageToPreferred(java.lang.String arg1){
  }
  public void removePackageFromPreferred(java.lang.String arg1){
  }
  public java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int arg1){
    return (java.util.List) null;
  }
  public void addPreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4){
  }
  public void replacePreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4){
  }
  public void clearPackagePreferredActivities(java.lang.String arg1){
  }
  public int getPreferredActivities(java.util.List<android.content.IntentFilter> arg1, java.util.List<android.content.ComponentName> arg2, java.lang.String arg3){
    return 0;
  }
  public void setComponentEnabledSetting(android.content.ComponentName arg1, int arg2, int arg3){
  }
  public int getComponentEnabledSetting(android.content.ComponentName arg1){
    return 0;
  }
  public void setApplicationEnabledSetting(java.lang.String arg1, int arg2, int arg3){
  }
  public int getApplicationEnabledSetting(java.lang.String arg1){
    return 0;
  }
  public void freeStorage(long arg1, android.content.IntentSender arg2){
  }
  public void deleteApplicationCacheFiles(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") android.content.pm.IPackageDataObserver arg2){
  }
  public void clearApplicationUserData(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") android.content.pm.IPackageDataObserver arg2){
  }
  public void getPackageSizeInfo(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageStatsObserver") android.content.pm.IPackageStatsObserver arg2){
  }
  public java.lang.String [] getSystemSharedLibraryNames(){
    return (java.lang.String []) null;
  }
  public android.content.pm.FeatureInfo [] getSystemAvailableFeatures(){
    return (android.content.pm.FeatureInfo []) null;
  }
  public boolean isSafeMode(){
    return false;
  }
  public void movePackage(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageMoveObserver") android.content.pm.IPackageMoveObserver arg2, int arg3){
  }
  public boolean addPermissionAsync(android.content.pm.PermissionInfo arg1){
    return false;
  }
  public android.content.pm.UserInfo createUser(java.lang.String arg1, int arg2){
    return (android.content.pm.UserInfo) null;
  }
  public boolean removeUser(int arg1){
    return false;
  }
  public void installPackageWithVerification(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageInstallObserver") android.content.pm.IPackageInstallObserver arg2, int arg3, java.lang.String arg4, android.net.Uri arg5, android.content.pm.ManifestDigest arg6){
  }
  public void verifyPendingInstall(int arg1, int arg2){
  }
  public android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity(){
    return (android.content.pm.VerifierDeviceIdentity) null;
  }
  public java.util.List<android.content.pm.UserInfo> getUsers(){
    return (java.util.List) null;
  }
  public android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo arg1){
    return (android.content.res.Resources) null;
  }
  public android.content.res.Resources getResourcesForApplication(java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.res.Resources) null;
  }
  public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent arg1, int arg2){
    return (java.util.List) null;
  }
  public java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo arg1){
    return (java.lang.CharSequence) null;
  }
  public android.content.pm.ResolveInfo resolveActivity(android.content.Intent arg1, int arg2){
    return (android.content.pm.ResolveInfo) null;
  }
  public android.graphics.drawable.Drawable getDefaultActivityIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.content.Intent getLaunchIntentForPackage(java.lang.String arg1){
    return (android.content.Intent) null;
  }
  public android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getActivityIcon(android.content.Intent arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getApplicationIcon(java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getActivityLogo(android.content.Intent arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getApplicationLogo(android.content.pm.ApplicationInfo arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable getApplicationLogo(java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.content.res.Resources getResourcesForActivity(android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException{
    return (android.content.res.Resources) null;
  }
  public void updateUserName(int arg1, java.lang.String arg2){
  }
  public void updateUserFlags(int arg1, int arg2){
  }
  public android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String arg1, int arg2){
    return (android.content.pm.PackageInfo) null;
  }
}
