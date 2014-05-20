package android.net.wifi.p2p;

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

import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.UseRule;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class WifiP2pManager
{
  // Classes

  public static interface ChannelListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("ChannelListener")
    public void onChannelDisconnected();
  }
  public static interface ActionListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("ActionListener")
    public void onSuccess();
	@com.francetelecom.rd.stubs.annotation.CallBack("ActionListener")
    public void onFailure(int arg1);
  }
  public static interface PeerListListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("PeerListListener")
    public void onPeersAvailable(WifiP2pDeviceList arg1);
  }
  public static interface ConnectionInfoListener
  {
    // Methods

	  @com.francetelecom.rd.stubs.annotation.CallBack("ConnectionInfoListener")
    public void onConnectionInfoAvailable(WifiP2pInfo arg1);
  }
  public static interface GroupInfoListener
  {
    // Methods
	 @CallBack("GroupInfoListener")
    public void onGroupInfoAvailable(WifiP2pGroup arg1);
  }
  public static class Channel
  {
    // Constructors

    Channel(android.os.Looper arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ChannelListener") WifiP2pManager.ChannelListener arg2){
    }
  }
  // Fields

  public static final java.lang.String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";

  public static final java.lang.String EXTRA_WIFI_STATE = "wifi_p2p_state";

  public static final int WIFI_P2P_STATE_DISABLED = 1;

  public static final int WIFI_P2P_STATE_ENABLED = 2;

  public static final java.lang.String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";

  public static final java.lang.String EXTRA_WIFI_P2P_INFO = "wifiP2pInfo";

  public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";

  public static final java.lang.String EXTRA_LINK_PROPERTIES = "linkProperties";

  public static final java.lang.String EXTRA_LINK_CAPABILITIES = "linkCapabilities";

  public static final java.lang.String WIFI_P2P_PEERS_CHANGED_ACTION = "android.net.wifi.p2p.PEERS_CHANGED";

  public static final java.lang.String WIFI_P2P_THIS_DEVICE_CHANGED_ACTION = "android.net.wifi.p2p.THIS_DEVICE_CHANGED";

  public static final java.lang.String EXTRA_WIFI_P2P_DEVICE = "wifiP2pDevice";

  public static final int ENABLE_P2P = 139265;

  public static final int ENABLE_P2P_FAILED = 139266;

  public static final int ENABLE_P2P_SUCCEEDED = 139267;

  public static final int DISABLE_P2P = 139268;

  public static final int DISABLE_P2P_FAILED = 139269;

  public static final int DISABLE_P2P_SUCCEEDED = 139270;

  public static final int DISCOVER_PEERS = 139271;

  public static final int DISCOVER_PEERS_FAILED = 139272;

  public static final int DISCOVER_PEERS_SUCCEEDED = 139273;

  public static final int CONNECT = 139274;

  public static final int CONNECT_FAILED = 139275;

  public static final int CONNECT_SUCCEEDED = 139276;

  public static final int CANCEL_CONNECT = 139277;

  public static final int CANCEL_CONNECT_FAILED = 139278;

  public static final int CANCEL_CONNECT_SUCCEEDED = 139279;

  public static final int CREATE_GROUP = 139280;

  public static final int CREATE_GROUP_FAILED = 139281;

  public static final int CREATE_GROUP_SUCCEEDED = 139282;

  public static final int REMOVE_GROUP = 139283;

  public static final int REMOVE_GROUP_FAILED = 139284;

  public static final int REMOVE_GROUP_SUCCEEDED = 139285;

  public static final int REQUEST_PEERS = 139286;

  public static final int RESPONSE_PEERS = 139287;

  public static final int REQUEST_CONNECTION_INFO = 139288;

  public static final int RESPONSE_CONNECTION_INFO = 139289;

  public static final int REQUEST_GROUP_INFO = 139290;

  public static final int RESPONSE_GROUP_INFO = 139291;

  public static final int ERROR = 0;

  public static final int P2P_UNSUPPORTED = 1;

  public static final int BUSY = 2;

  // Constructors

  public WifiP2pManager(IWifiP2pManager arg1){
  }
  // Methods

  public WifiP2pManager.Channel initialize(android.content.Context arg1, android.os.Looper arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ChannelListener") WifiP2pManager.ChannelListener arg3){
    return (WifiP2pManager.Channel) null;
  }
  @UseRule("WifiP2pManager.connect")
  public void connect(WifiP2pManager.Channel arg1, WifiP2pConfig arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ActionListener") WifiP2pManager.ActionListener arg3){
  }
  public void createGroup(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ActionListener") WifiP2pManager.ActionListener arg2){
  }
  public void removeGroup(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ActionListener") WifiP2pManager.ActionListener arg2){
  }
  public android.os.Messenger getMessenger(){
    return (android.os.Messenger) null;
  }
  @UseRule("WifiP2pManager.enableP2P")
  public void enableP2p(WifiP2pManager.Channel arg1){
  }
  public void disableP2p(WifiP2pManager.Channel arg1){
  }
  @UseRule("WifiP2pManager.discoverPeers")
  public void discoverPeers(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ActionListener") WifiP2pManager.ActionListener arg2){
  }
  public void cancelConnect(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ActionListener") WifiP2pManager.ActionListener arg2){
  }
  public void requestPeers(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("PeerListListener") WifiP2pManager.PeerListListener arg2){
  }
  public void requestConnectionInfo(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ConnectionInfoListener") WifiP2pManager.ConnectionInfoListener arg2){
  }
  public void requestGroupInfo(WifiP2pManager.Channel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("GroupInfoListener") WifiP2pManager.GroupInfoListener arg2){
  }
}
