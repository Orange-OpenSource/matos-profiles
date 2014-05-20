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
public class PackageParser
{
  // Classes

  public static class NewPermissionInfo
  {
    // Fields

    public final java.lang.String name = (java.lang.String) null;

    public final int sdkVersion = 0;

    public final int fileVersion = 0;

    // Constructors

    public NewPermissionInfo(java.lang.String arg1, int arg2, int arg3){
    }
  }
  public static class PackageLite
  {
    // Fields

    public final java.lang.String packageName = (java.lang.String) null;

    public final int installLocation = 0;

    public final VerifierInfo [] verifiers = (VerifierInfo []) null;

    // Constructors

    public PackageLite(java.lang.String arg1, int arg2, java.util.List<VerifierInfo> arg3){
    }
  }
  public static final class Package
  {
    // Fields

    public java.lang.String packageName;

    public final ApplicationInfo applicationInfo = (ApplicationInfo) null;

    public final java.util.ArrayList<PackageParser.Permission> permissions = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.PermissionGroup> permissionGroups = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.Activity> activities = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.Activity> receivers = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.Provider> providers = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.Service> services = (java.util.ArrayList) null;

    public final java.util.ArrayList<PackageParser.Instrumentation> instrumentation = (java.util.ArrayList) null;

    public final java.util.ArrayList<java.lang.String> requestedPermissions = (java.util.ArrayList) null;

    public java.util.ArrayList<java.lang.String> protectedBroadcasts;

    public java.util.ArrayList<java.lang.String> usesLibraries;

    public java.util.ArrayList<java.lang.String> usesOptionalLibraries;

    public java.lang.String [] usesLibraryFiles;

    public java.util.ArrayList<java.lang.String> mOriginalPackages;

    public java.lang.String mRealPackage;

    public java.util.ArrayList<java.lang.String> mAdoptPermissions;

    public android.os.Bundle mAppMetaData;

    public java.lang.String mPath;

    public int mVersionCode;

    public java.lang.String mVersionName;

    public java.lang.String mSharedUserId;

    public int mSharedUserLabel;

    public Signature [] mSignatures;

    public int mPreferredOrder;

    public java.lang.String mScanPath;

    public boolean mDidDexOpt;

    public int mSetEnabled;

    public boolean mSetStopped;

    public java.lang.Object mExtras;

    public boolean mOperationPending;

    public final java.util.ArrayList<ConfigurationInfo> configPreferences = (java.util.ArrayList) null;

    public java.util.ArrayList<FeatureInfo> reqFeatures;

    public int installLocation;

    public ManifestDigest manifestDigest;

    // Constructors

    public Package(java.lang.String arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static class Component<II extends PackageParser.IntentInfo>
  {
    // Fields

    public final PackageParser.Package owner = (PackageParser.Package) null;

    public final java.util.ArrayList<II> intents = (java.util.ArrayList) null;

    public final java.lang.String className = (java.lang.String) null;

    public android.os.Bundle metaData;

    // Constructors

    public Component(PackageParser.Package arg1){
    }
    public Component(PackageParser.ParsePackageItemArgs arg1, PackageItemInfo arg2){
    }
    public Component(PackageParser.Component<II> arg1){
    }
    // Methods

    public android.content.ComponentName getComponentName(){
      return (android.content.ComponentName) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
    public java.lang.String getComponentShortName(){
      return (java.lang.String) null;
    }
  }
  public static final class Permission
    extends PackageParser.Component<PackageParser.IntentInfo>  {
    // Fields

    public final PermissionInfo info = (PermissionInfo) null;

    public boolean tree;

    public PackageParser.PermissionGroup group;

    // Constructors

    public Permission(PackageParser.Package arg1){
      super((PackageParser.Package) null);
    }
    public Permission(PackageParser.Package arg1, PermissionInfo arg2){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static final class PermissionGroup
    extends PackageParser.Component<PackageParser.IntentInfo>  {
    // Fields

    public final PermissionGroupInfo info = (PermissionGroupInfo) null;

    // Constructors

    public PermissionGroup(PackageParser.Package arg1){
      super((PackageParser.Package) null);
    }
    public PermissionGroup(PackageParser.Package arg1, PermissionGroupInfo arg2){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static final class Activity
    extends PackageParser.Component<PackageParser.ActivityIntentInfo>  {
    // Fields

    public final ActivityInfo info = (ActivityInfo) null;

    // Constructors

    public Activity(PackageParser.ParseComponentArgs arg1, ActivityInfo arg2){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static final class Service
    extends PackageParser.Component<PackageParser.ServiceIntentInfo>  {
    // Fields

    public final ServiceInfo info = (ServiceInfo) null;

    // Constructors

    public Service(PackageParser.ParseComponentArgs arg1, ServiceInfo arg2){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static final class Provider
    extends PackageParser.Component  {
    // Fields

    public final ProviderInfo info = (ProviderInfo) null;

    public boolean syncable;

    // Constructors

    public Provider(PackageParser.Provider arg1){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static final class Instrumentation
    extends PackageParser.Component  {
    // Fields

    public final InstrumentationInfo info = (InstrumentationInfo) null;

    // Constructors

    public Instrumentation(PackageParser.ParsePackageItemArgs arg1, InstrumentationInfo arg2){
      super((PackageParser.Package) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void setPackageName(java.lang.String arg1){
    }
  }
  public static class IntentInfo
    extends android.content.IntentFilter  {
    // Fields

    public boolean hasDefault;

    public int labelRes;

    public java.lang.CharSequence nonLocalizedLabel;

    public int icon;

    public int logo;

    // Constructors

    public IntentInfo(){
      super();
    }
  }
  public static final class ActivityIntentInfo
    extends PackageParser.IntentInfo  {
    // Fields

    public final PackageParser.Activity activity = (PackageParser.Activity) null;

    // Constructors

    public ActivityIntentInfo(PackageParser.Activity arg1){
      super();
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static final class ServiceIntentInfo
    extends PackageParser.IntentInfo  {
    // Fields

    public final PackageParser.Service service = (PackageParser.Service) null;

    // Constructors

    public ServiceIntentInfo(PackageParser.Service arg1){
      super();
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class ParseComponentArgs
    extends PackageParser.ParsePackageItemArgs  {
    // Constructors

    ParseComponentArgs(PackageParser.Package arg1, java.lang.String [] arg2, int arg3, int arg4, int arg5, int arg6, java.lang.String [] arg7, int arg8, int arg9, int arg10){
      super((PackageParser.Package) null, (java.lang.String []) null, 0, 0, 0, 0);
    }
  }
  public static class ParsePackageItemArgs
  {
    // Constructors

    ParsePackageItemArgs(PackageParser.Package arg1, java.lang.String [] arg2, int arg3, int arg4, int arg5, int arg6){
    }
  }
  // Fields

  public static final PackageParser.NewPermissionInfo [] NEW_PERMISSIONS = null;

  public static final int PARSE_IS_SYSTEM = 1;

  public static final int PARSE_CHATTY = 2;

  public static final int PARSE_MUST_BE_APK = 4;

  public static final int PARSE_IGNORE_PROCESSES = 8;

  public static final int PARSE_FORWARD_LOCK = 16;

  public static final int PARSE_ON_SDCARD = 32;

  public static final int PARSE_IS_SYSTEM_DIR = 64;

  // Constructors

  public PackageParser(java.lang.String arg1){
  }
  // Methods

  public int getParseError(){
    return 0;
  }
  public static final ActivityInfo generateActivityInfo(PackageParser.Activity arg1, int arg2){
    return (ActivityInfo) null;
  }
  public static final ServiceInfo generateServiceInfo(PackageParser.Service arg1, int arg2){
    return (ServiceInfo) null;
  }
  public static PackageInfo generatePackageInfo(PackageParser.Package arg1, int [] arg2, int arg3, long arg4, long arg5){
    return (PackageInfo) null;
  }
  public static final PermissionInfo generatePermissionInfo(PackageParser.Permission arg1, int arg2){
    return (PermissionInfo) null;
  }
  public static final PermissionGroupInfo generatePermissionGroupInfo(PackageParser.PermissionGroup arg1, int arg2){
    return (PermissionGroupInfo) null;
  }
  public static ApplicationInfo generateApplicationInfo(PackageParser.Package arg1, int arg2){
    return (ApplicationInfo) null;
  }
  public static final ProviderInfo generateProviderInfo(PackageParser.Provider arg1, int arg2){
    return (ProviderInfo) null;
  }
  public static final InstrumentationInfo generateInstrumentationInfo(PackageParser.Instrumentation arg1, int arg2){
    return (InstrumentationInfo) null;
  }
  public boolean collectCertificates(PackageParser.Package arg1, int arg2){
    return false;
  }
  public void setSeparateProcesses(java.lang.String [] arg1){
  }
  public void setOnlyCoreApps(boolean arg1){
  }
  public PackageParser.Package parsePackage(java.io.File arg1, java.lang.String arg2, android.util.DisplayMetrics arg3, int arg4){
    return (PackageParser.Package) null;
  }
  public static void setCompatibilityModeEnabled(boolean arg1){
  }
  public static PackageParser.PackageLite parsePackageLite(java.lang.String arg1, int arg2){
    return (PackageParser.PackageLite) null;
  }
  public static Signature stringToSignature(java.lang.String arg1){
    return (Signature) null;
  }
}
