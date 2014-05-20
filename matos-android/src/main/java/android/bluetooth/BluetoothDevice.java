package android.bluetooth;

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
public final class BluetoothDevice
  implements android.os.Parcelable
{
  // Fields

  public static final int ERROR = -2147483648;

  public static final java.lang.String ACTION_FOUND = "android.bluetooth.device.action.FOUND";

  public static final java.lang.String ACTION_DISAPPEARED = "android.bluetooth.device.action.DISAPPEARED";

  public static final java.lang.String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";

  public static final java.lang.String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";

  public static final java.lang.String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";

  public static final java.lang.String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";

  public static final java.lang.String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";

  public static final java.lang.String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";

  public static final java.lang.String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";

  public static final java.lang.String EXTRA_NAME = "android.bluetooth.device.extra.NAME";

  public static final java.lang.String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";

  public static final java.lang.String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";

  public static final java.lang.String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";

  public static final java.lang.String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";

  public static final int BOND_NONE = 10;

  public static final int BOND_BONDING = 11;

  public static final int BOND_BONDED = 12;

  public static final java.lang.String EXTRA_REASON = "android.bluetooth.device.extra.REASON";

  public static final java.lang.String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";

  public static final java.lang.String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";

  public static final java.lang.String ACTION_UUID = "android.bleutooth.device.action.UUID";

  public static final java.lang.String ACTION_NAME_FAILED = "android.bluetooth.device.action.NAME_FAILED";

  public static final java.lang.String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";

  public static final java.lang.String ACTION_PAIRING_CANCEL = "android.bluetooth.device.action.PAIRING_CANCEL";

  public static final java.lang.String ACTION_CONNECTION_ACCESS_REQUEST = "android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST";

  public static final java.lang.String ACTION_CONNECTION_ACCESS_REPLY = "android.bluetooth.device.action.CONNECTION_ACCESS_REPLY";

  public static final java.lang.String ACTION_CONNECTION_ACCESS_CANCEL = "android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL";

  public static final java.lang.String EXTRA_ACCESS_REQUEST_TYPE = "android.bluetooth.device.extra.ACCESS_REQUEST_TYPE";

  public static final int REQUEST_TYPE_PROFILE_CONNECTION = 1;

  public static final int REQUEST_TYPE_PHONEBOOK_ACCESS = 2;

  public static final java.lang.String EXTRA_PACKAGE_NAME = "android.bluetooth.device.extra.PACKAGE_NAME";

  public static final java.lang.String EXTRA_CLASS_NAME = "android.bluetooth.device.extra.CLASS_NAME";

  public static final java.lang.String EXTRA_CONNECTION_ACCESS_RESULT = "android.bluetooth.device.extra.CONNECTION_ACCESS_RESULT";

  public static final int CONNECTION_ACCESS_YES = 1;

  public static final int CONNECTION_ACCESS_NO = 2;

  public static final java.lang.String EXTRA_ALWAYS_ALLOWED = "android.bluetooth.device.extra.ALWAYS_ALLOWED";

  public static final int BOND_SUCCESS = 0;

  public static final int UNBOND_REASON_AUTH_FAILED = 1;

  public static final int UNBOND_REASON_AUTH_REJECTED = 2;

  public static final int UNBOND_REASON_AUTH_CANCELED = 3;

  public static final int UNBOND_REASON_REMOTE_DEVICE_DOWN = 4;

  public static final int UNBOND_REASON_DISCOVERY_IN_PROGRESS = 5;

  public static final int UNBOND_REASON_AUTH_TIMEOUT = 6;

  public static final int UNBOND_REASON_REPEATED_ATTEMPTS = 7;

  public static final int UNBOND_REASON_REMOTE_AUTH_CANCELED = 8;

  public static final int UNBOND_REASON_REMOVED = 9;

  public static final int PAIRING_VARIANT_PIN = 0;

  public static final int PAIRING_VARIANT_PASSKEY = 1;

  public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;

  public static final int PAIRING_VARIANT_CONSENT = 3;

  public static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;

  public static final int PAIRING_VARIANT_DISPLAY_PIN = 5;

  public static final int PAIRING_VARIANT_OOB_CONSENT = 6;

  public static final java.lang.String EXTRA_UUID = "android.bluetooth.device.extra.UUID";

  public static final android.os.Parcelable.Creator<BluetoothDevice> CREATOR = null;

  // Constructors

  BluetoothDevice(java.lang.String arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean setPin(byte [] arg1){
    return false;
  }
  public android.os.ParcelUuid [] getUuids(){
    return (android.os.ParcelUuid []) null;
  }
  public boolean createBond(){
    return false;
  }
  public boolean createBondOutOfBand(byte [] arg1, byte [] arg2){
    return false;
  }
  public boolean cancelBondProcess(){
    return false;
  }
  public boolean removeBond(){
    return false;
  }
  public int getBondState(){
    return 0;
  }
  public boolean setDeviceOutOfBandData(byte [] arg1, byte [] arg2){
    return false;
  }
  public boolean setPasskey(int arg1){
    return false;
  }
  public boolean setPairingConfirmation(boolean arg1){
    return false;
  }
  public boolean setRemoteOutOfBandData(){
    return false;
  }
  public boolean cancelPairingUserInput(){
    return false;
  }
  public boolean setTrust(boolean arg1){
    return false;
  }
  public boolean getTrustState(){
    return false;
  }
  public boolean isBluetoothDock(){
    return false;
  }
  public java.lang.String getAlias(){
    return (java.lang.String) null;
  }
  public boolean setAlias(java.lang.String arg1){
    return false;
  }
  public java.lang.String getAliasName(){
    return (java.lang.String) null;
  }
  public BluetoothClass getBluetoothClass(){
    return (BluetoothClass) null;
  }
  public boolean fetchUuidsWithSdp(){
    return false;
  }
  public int getServiceChannel(android.os.ParcelUuid arg1){
    return 0;
  }
  public BluetoothSocket createRfcommSocket(int arg1) throws java.io.IOException{
    return (BluetoothSocket) null;
  }
  public BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID arg1) throws java.io.IOException{
    return (BluetoothSocket) null;
  }
  public BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID arg1) throws java.io.IOException{
    return (BluetoothSocket) null;
  }
  public BluetoothSocket createInsecureRfcommSocket(int arg1) throws java.io.IOException{
    return (BluetoothSocket) null;
  }
  public BluetoothSocket createScoSocket() throws java.io.IOException{
    return (BluetoothSocket) null;
  }
  public static byte [] convertPinToBytes(java.lang.String arg1){
    return (byte []) null;
  }
}
