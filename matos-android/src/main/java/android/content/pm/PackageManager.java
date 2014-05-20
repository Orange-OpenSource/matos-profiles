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
public abstract class PackageManager
{
  // Classes

  public static class NameNotFoundException
    extends android.util.AndroidException  {
    // Constructors

    public NameNotFoundException(){
      super();
    }
    public NameNotFoundException(java.lang.String arg1){
      super();
    }
  }
  // Fields

  public static final int GET_ACTIVITIES = 1;

  public static final int GET_RECEIVERS = 2;

  public static final int GET_SERVICES = 4;

  public static final int GET_PROVIDERS = 8;

  public static final int GET_INSTRUMENTATION = 16;

  public static final int GET_INTENT_FILTERS = 32;

  public static final int GET_SIGNATURES = 64;

  public static final int GET_RESOLVED_FILTER = 64;

  public static final int GET_META_DATA = 128;

  public static final int GET_GIDS = 256;

  public static final int GET_DISABLED_COMPONENTS = 512;

  public static final int GET_SHARED_LIBRARY_FILES = 1024;

  public static final int GET_URI_PERMISSION_PATTERNS = 2048;

  public static final int GET_PERMISSIONS = 4096;

  public static final int GET_UNINSTALLED_PACKAGES = 8192;

  public static final int GET_CONFIGURATIONS = 16384;

  public static final int MATCH_DEFAULT_ONLY = 65536;

  public static final int PERMISSION_GRANTED = 0;

  public static final int PERMISSION_DENIED = -1;

  public static final int SIGNATURE_MATCH = 0;

  public static final int SIGNATURE_NEITHER_SIGNED = 1;

  public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;

  public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;

  public static final int SIGNATURE_NO_MATCH = -3;

  public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;

  public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;

  public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;

  public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;

  public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;

  public static final int INSTALL_FORWARD_LOCK = 1;

  public static final int INSTALL_REPLACE_EXISTING = 2;

  public static final int INSTALL_ALLOW_TEST = 4;

  public static final int INSTALL_EXTERNAL = 8;

  public static final int INSTALL_INTERNAL = 16;

  public static final int INSTALL_FROM_ADB = 32;

  public static final int DONT_KILL_APP = 1;

  public static final int INSTALL_SUCCEEDED = 1;

  public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;

  public static final int INSTALL_FAILED_INVALID_APK = -2;

  public static final int INSTALL_FAILED_INVALID_URI = -3;

  public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;

  public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;

  public static final int INSTALL_FAILED_NO_SHARED_USER = -6;

  public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;

  public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;

  public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;

  public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;

  public static final int INSTALL_FAILED_DEXOPT = -11;

  public static final int INSTALL_FAILED_OLDER_SDK = -12;

  public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;

  public static final int INSTALL_FAILED_NEWER_SDK = -14;

  public static final int INSTALL_FAILED_TEST_ONLY = -15;

  public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;

  public static final int INSTALL_FAILED_MISSING_FEATURE = -17;

  public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;

  public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;

  public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;

  public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;

  public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;

  public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;

  public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;

  public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;

  public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;

  public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;

  public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;

  public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;

  public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;

  public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;

  public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;

  public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;

  public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;

  public static final int DONT_DELETE_DATA = 1;

  public static final int DELETE_SUCCEEDED = 1;

  public static final int DELETE_FAILED_INTERNAL_ERROR = -1;

  public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -2;

  public static final int MOVE_SUCCEEDED = 1;

  public static final int MOVE_FAILED_INSUFFICIENT_STORAGE = -1;

  public static final int MOVE_FAILED_DOESNT_EXIST = -2;

  public static final int MOVE_FAILED_SYSTEM_PACKAGE = -3;

  public static final int MOVE_FAILED_FORWARD_LOCKED = -4;

  public static final int MOVE_FAILED_INVALID_LOCATION = -5;

  public static final int MOVE_FAILED_INTERNAL_ERROR = -6;

  public static final int MOVE_FAILED_OPERATION_PENDING = -7;

  public static final int MOVE_INTERNAL = 1;

  public static final int MOVE_EXTERNAL_MEDIA = 2;

  public static final int VERIFICATION_ALLOW_WITHOUT_SUFFICIENT = 2;

  public static final int VERIFICATION_ALLOW = 1;

  public static final int VERIFICATION_REJECT = -1;

  public static final int PER_USER_RANGE = 100000;

  public static final java.lang.String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";

  public static final java.lang.String FEATURE_BLUETOOTH = "android.hardware.bluetooth";

  public static final java.lang.String FEATURE_CAMERA = "android.hardware.camera";

  public static final java.lang.String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";

  public static final java.lang.String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";

  public static final java.lang.String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";

  public static final java.lang.String FEATURE_LOCATION = "android.hardware.location";

  public static final java.lang.String FEATURE_LOCATION_GPS = "android.hardware.location.gps";

  public static final java.lang.String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";

  public static final java.lang.String FEATURE_MICROPHONE = "android.hardware.microphone";

  public static final java.lang.String FEATURE_NFC = "android.hardware.nfc";

  public static final java.lang.String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";

  public static final java.lang.String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";

  public static final java.lang.String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";

  public static final java.lang.String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";

  public static final java.lang.String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";

  public static final java.lang.String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";

  public static final java.lang.String FEATURE_TELEPHONY = "android.hardware.telephony";

  public static final java.lang.String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";

  public static final java.lang.String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";

  public static final java.lang.String FEATURE_USB_HOST = "android.hardware.usb.host";

  public static final java.lang.String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";

  public static final java.lang.String FEATURE_SIP = "android.software.sip";

  public static final java.lang.String FEATURE_SIP_VOIP = "android.software.sip.voip";

  public static final java.lang.String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";

  public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";

  public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";

  public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";

  public static final java.lang.String FEATURE_FAKETOUCH = "android.hardware.faketouch";

  public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";

  public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";

  public static final java.lang.String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";

  public static final java.lang.String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";

  public static final java.lang.String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";

  public static final java.lang.String FEATURE_WIFI = "android.hardware.wifi";

  public static final java.lang.String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";

  public static final java.lang.String ACTION_CLEAN_EXTERNAL_STORAGE = "android.content.pm.CLEAN_EXTERNAL_STORAGE";

  public static final java.lang.String EXTRA_VERIFICATION_URI = "android.content.pm.extra.VERIFICATION_URI";

  public static final java.lang.String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";

  public static final java.lang.String EXTRA_VERIFICATION_INSTALLER_PACKAGE = "android.content.pm.extra.VERIFICATION_INSTALLER_PACKAGE";

  public static final java.lang.String EXTRA_VERIFICATION_INSTALL_FLAGS = "android.content.pm.extra.VERIFICATION_INSTALL_FLAGS";

  // Constructors

  public PackageManager(){
  }
  // Methods

  public abstract int checkPermission(java.lang.String arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getPackageInfo", pos = 1, report = "-")
  public abstract PackageInfo getPackageInfo(java.lang.String arg1, int arg2) throws PackageManager.NameNotFoundException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getApplicationInfo", pos = 1, report = "-")
  public abstract ApplicationInfo getApplicationInfo(java.lang.String arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract java.lang.CharSequence getText(java.lang.String arg1, int arg2, ApplicationInfo arg3);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.deletePackage", pos = 1, report = "-")
  public abstract void deletePackage(java.lang.String arg1, IPackageDeleteObserver arg2, int arg3);
  public static int getUid(int arg1, int arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getActivityInfo", pos = 1, report = "-")
  public abstract ActivityInfo getActivityInfo(android.content.ComponentName arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getDrawable(java.lang.String arg1, int arg2, ApplicationInfo arg3);
  public abstract ProviderInfo getProviderInfo(android.content.ComponentName arg1, int arg2) throws PackageManager.NameNotFoundException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getServiceInfo", pos = 1, report = "-")
  public abstract ServiceInfo getServiceInfo(android.content.ComponentName arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract android.content.res.XmlResourceParser getXml(java.lang.String arg1, int arg2, ApplicationInfo arg3);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getReceiverInfo", pos = 1, report = "-")
  public abstract ActivityInfo getReceiverInfo(android.content.ComponentName arg1, int arg2) throws PackageManager.NameNotFoundException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.hasSystemFeature", pos = 1, report = "-")
  public abstract boolean hasSystemFeature(java.lang.String arg1);
  public abstract java.util.List<ResolveInfo> queryIntentActivities(android.content.Intent arg1, int arg2);
  public abstract void setInstallerPackageName(java.lang.String arg1, java.lang.String arg2);
  public abstract java.lang.String getInstallerPackageName(java.lang.String arg1);
  public abstract java.util.List<ResolveInfo> queryIntentServices(android.content.Intent arg1, int arg2);
  public abstract java.lang.String [] getPackagesForUid(int arg1);
  public abstract java.util.List<ResolveInfo> queryIntentActivityOptions(android.content.ComponentName arg1, android.content.Intent [] arg2, android.content.Intent arg3, int arg4);
  public abstract void freeStorageAndNotify(long arg1, IPackageDataObserver arg2);
  public abstract int getUidForSharedUser(java.lang.String arg1) throws PackageManager.NameNotFoundException;
  public abstract PermissionInfo getPermissionInfo(java.lang.String arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract PermissionGroupInfo getPermissionGroupInfo(java.lang.String arg1, int arg2) throws PackageManager.NameNotFoundException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.installPackage", pos = 1, report = "-")
  public abstract void installPackage(android.net.Uri arg1, IPackageInstallObserver arg2, int arg3, java.lang.String arg4);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getInstalledPackages", pos = 1, report = "-")
  public abstract java.util.List<PackageInfo> getInstalledPackages(int arg1);
  public abstract int [] getPackageGids(java.lang.String arg1) throws PackageManager.NameNotFoundException;
  public abstract java.lang.String [] currentToCanonicalPackageNames(java.lang.String [] arg1);
  public abstract java.lang.String [] canonicalToCurrentPackageNames(java.lang.String [] arg1);
  public abstract java.util.List<PermissionInfo> queryPermissionsByGroup(java.lang.String arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract java.util.List<PermissionGroupInfo> getAllPermissionGroups(int arg1);
  public abstract boolean addPermission(PermissionInfo arg1);
  public abstract void removePermission(java.lang.String arg1);
  public abstract int checkSignatures(java.lang.String arg1, java.lang.String arg2);
  public abstract int checkSignatures(int arg1, int arg2);
  public abstract java.lang.String getNameForUid(int arg1);
  public abstract ResolveInfo resolveService(android.content.Intent arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getInstalledApplications", pos = 1, report = "-")
  public abstract java.util.List<ApplicationInfo> getInstalledApplications(int arg1);
  public abstract ProviderInfo resolveContentProvider(java.lang.String arg1, int arg2);
  public abstract java.util.List<ProviderInfo> queryContentProviders(java.lang.String arg1, int arg2, int arg3);
  public abstract InstrumentationInfo getInstrumentationInfo(android.content.ComponentName arg1, int arg2) throws PackageManager.NameNotFoundException;
  public abstract java.util.List<InstrumentationInfo> queryInstrumentation(java.lang.String arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.addPackageToPreferred", pos = 1, report = "-")
  public abstract void addPackageToPreferred(java.lang.String arg1);
  public abstract void removePackageFromPreferred(java.lang.String arg1);
  public abstract java.util.List<PackageInfo> getPreferredPackages(int arg1);
  public abstract void addPreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4);
  public abstract void replacePreferredActivity(android.content.IntentFilter arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4);
  public abstract void clearPackagePreferredActivities(java.lang.String arg1);
  public abstract int getPreferredActivities(java.util.List<android.content.IntentFilter> arg1, java.util.List<android.content.ComponentName> arg2, java.lang.String arg3);
  public abstract void setComponentEnabledSetting(android.content.ComponentName arg1, int arg2, int arg3);
  public abstract int getComponentEnabledSetting(android.content.ComponentName arg1);
  public abstract void setApplicationEnabledSetting(java.lang.String arg1, int arg2, int arg3);
  public abstract int getApplicationEnabledSetting(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.freeStorage", pos = 1, report = "-")
  public abstract void freeStorage(long arg1, android.content.IntentSender arg2);
  public abstract void deleteApplicationCacheFiles(java.lang.String arg1, IPackageDataObserver arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.clearApplicationUserData", pos = 1, report = "-")
  public abstract void clearApplicationUserData(java.lang.String arg1, IPackageDataObserver arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.getPackageSizeInfo", pos = 1, report = "-")
  public abstract void getPackageSizeInfo(java.lang.String arg1, IPackageStatsObserver arg2);
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "PackageManager.getSystemSharedLibraryNames", report = "-")
  public abstract java.lang.String [] getSystemSharedLibraryNames();
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "PackageManager.getSystemAvailableFeatures", report = "-")
  public abstract FeatureInfo [] getSystemAvailableFeatures();
  public abstract boolean isSafeMode();
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PackageManager.movePackage", pos = 1, report = "-")
  public abstract void movePackage(java.lang.String arg1, IPackageMoveObserver arg2, int arg3);
  public abstract boolean addPermissionAsync(PermissionInfo arg1);
  public abstract UserInfo createUser(java.lang.String arg1, int arg2);
  public abstract boolean removeUser(int arg1);
  public abstract void installPackageWithVerification(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageInstallObserver") IPackageInstallObserver arg2, int arg3, java.lang.String arg4, android.net.Uri arg5, ManifestDigest arg6);
  public abstract void verifyPendingInstall(int arg1, int arg2);
  public abstract VerifierDeviceIdentity getVerifierDeviceIdentity();
  public abstract java.util.List<UserInfo> getUsers();
  public abstract android.content.res.Resources getResourcesForApplication(ApplicationInfo arg1) throws PackageManager.NameNotFoundException;
  public abstract android.content.res.Resources getResourcesForApplication(java.lang.String arg1) throws PackageManager.NameNotFoundException;
  public abstract java.util.List<ResolveInfo> queryBroadcastReceivers(android.content.Intent arg1, int arg2);
  public abstract java.lang.CharSequence getApplicationLabel(ApplicationInfo arg1);
  public abstract ResolveInfo resolveActivity(android.content.Intent arg1, int arg2);
  public abstract android.graphics.drawable.Drawable getDefaultActivityIcon();
  public abstract android.content.Intent getLaunchIntentForPackage(java.lang.String arg1);
  public abstract android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName arg1) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getActivityIcon(android.content.Intent arg1) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getApplicationIcon(ApplicationInfo arg1);
  public abstract android.graphics.drawable.Drawable getApplicationIcon(java.lang.String arg1) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName arg1) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getActivityLogo(android.content.Intent arg1) throws PackageManager.NameNotFoundException;
  public abstract android.graphics.drawable.Drawable getApplicationLogo(ApplicationInfo arg1);
  public abstract android.graphics.drawable.Drawable getApplicationLogo(java.lang.String arg1) throws PackageManager.NameNotFoundException;
  public abstract android.content.res.Resources getResourcesForActivity(android.content.ComponentName arg1) throws PackageManager.NameNotFoundException;
  public abstract void updateUserName(int arg1, java.lang.String arg2);
  public abstract void updateUserFlags(int arg1, int arg2);
  public PackageInfo getPackageArchiveInfo(java.lang.String arg1, int arg2){
    return (PackageInfo) null;
  }
  public static boolean isSameUser(int arg1, int arg2){
    return false;
  }
  public static int getUserId(int arg1){
    return 0;
  }
  public static int getAppId(int arg1){
    return 0;
  }
}
