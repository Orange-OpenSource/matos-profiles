package android.net.wifi;

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
public class WifiConfiguration
  implements android.os.Parcelable
{
  // Classes

  public class EnterpriseField
  {
    // Fields

    // Constructors

    private EnterpriseField(java.lang.String arg1){
    }
    // Methods

    public java.lang.String value(){
      return (java.lang.String) null;
    }
    public void setValue(java.lang.String arg1){
    }
    public java.lang.String varName(){
      return (java.lang.String) null;
    }
  }
  public static class KeyMgmt
  {
    // Fields

    public static final int NONE = 0;

    public static final int WPA_PSK = 1;

    public static final int WPA_EAP = 2;

    public static final int IEEE8021X = 3;

    public static final int WPA2_PSK = 4;

    public static final java.lang.String varName = "key_mgmt";

    public static final java.lang.String [] strings = null;

    // Constructors

    private KeyMgmt(){
    }
  }
  public static class Protocol
  {
    // Fields

    public static final int WPA = 0;

    public static final int RSN = 1;

    public static final java.lang.String varName = "proto";

    public static final java.lang.String [] strings = null;

    // Constructors

    private Protocol(){
    }
  }
  public static class AuthAlgorithm
  {
    // Fields

    public static final int OPEN = 0;

    public static final int SHARED = 1;

    public static final int LEAP = 2;

    public static final java.lang.String varName = "auth_alg";

    public static final java.lang.String [] strings = null;

    // Constructors

    private AuthAlgorithm(){
    }
  }
  public static class PairwiseCipher
  {
    // Fields

    public static final int NONE = 0;

    public static final int TKIP = 1;

    public static final int CCMP = 2;

    public static final java.lang.String varName = "pairwise";

    public static final java.lang.String [] strings = null;

    // Constructors

    private PairwiseCipher(){
    }
  }
  public static class GroupCipher
  {
    // Fields

    public static final int WEP40 = 0;

    public static final int WEP104 = 1;

    public static final int TKIP = 2;

    public static final int CCMP = 3;

    public static final java.lang.String varName = "group";

    public static final java.lang.String [] strings = null;

    // Constructors

    private GroupCipher(){
    }
  }
  public static class Status
  {
    // Fields

    public static final int CURRENT = 0;

    public static final int DISABLED = 1;

    public static final int ENABLED = 2;

    public static final java.lang.String [] strings = null;

    // Constructors

    private Status(){
    }
  }
  public static enum IpAssignment
  {
    // Enum Constants

    STATIC()
, DHCP()
, UNASSIGNED()
;
    // Fields

    // Constructors

    private IpAssignment(){
    }
    // Methods

  }
  public static enum ProxySettings
  {
    // Enum Constants

    NONE()
, STATIC()
, UNASSIGNED()
;
    // Fields

    // Constructors

    private ProxySettings(){
    }
    // Methods

  }
  // Fields

  public static final java.lang.String ssidVarName = "ssid";

  public static final java.lang.String bssidVarName = "bssid";

  public static final java.lang.String pskVarName = "psk";

  public static final java.lang.String [] wepKeyVarNames = null;

  public static final java.lang.String wepTxKeyIdxVarName = "wep_tx_keyidx";

  public static final java.lang.String priorityVarName = "priority";

  public static final java.lang.String hiddenSSIDVarName = "scan_ssid";

  public static final int INVALID_NETWORK_ID = -1;

  public WifiConfiguration.EnterpriseField eap;

  public WifiConfiguration.EnterpriseField phase2;

  public WifiConfiguration.EnterpriseField identity;

  public WifiConfiguration.EnterpriseField anonymous_identity;

  public WifiConfiguration.EnterpriseField password;

  public WifiConfiguration.EnterpriseField client_cert;

  public WifiConfiguration.EnterpriseField private_key;

  public WifiConfiguration.EnterpriseField ca_cert;

  public WifiConfiguration.EnterpriseField [] enterpriseFields;

  public static final int DISABLED_UNKNOWN_REASON = 0;

  public static final int DISABLED_DNS_FAILURE = 1;

  public static final int DISABLED_DHCP_FAILURE = 2;

  public static final int DISABLED_AUTH_FAILURE = 3;

  public int networkId;

  public int status;

  public int disableReason;

  public java.lang.String SSID;

  public java.lang.String BSSID;

  public java.lang.String preSharedKey;

  public java.lang.String [] wepKeys;

  public int wepTxKeyIndex;

  public int priority;

  public boolean hiddenSSID;

  public java.util.BitSet allowedKeyManagement;

  public java.util.BitSet allowedProtocols;

  public java.util.BitSet allowedAuthAlgorithms;

  public java.util.BitSet allowedPairwiseCiphers;

  public java.util.BitSet allowedGroupCiphers;

  public WifiConfiguration.IpAssignment ipAssignment;

  public WifiConfiguration.ProxySettings proxySettings;

  public android.net.LinkProperties linkProperties;

  public static final android.os.Parcelable.Creator<WifiConfiguration> CREATOR = null;

  // Constructors

  public WifiConfiguration(){
  }
  public WifiConfiguration(WifiConfiguration arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getAuthType(){
    return 0;
  }
}
