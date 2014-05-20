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
public class WifiMonitor
{
  // Fields

  public static final int SUP_CONNECTION_EVENT = 147457;

  public static final int SUP_DISCONNECTION_EVENT = 147458;

  public static final int NETWORK_CONNECTION_EVENT = 147459;

  public static final int NETWORK_DISCONNECTION_EVENT = 147460;

  public static final int SCAN_RESULTS_EVENT = 147461;

  public static final int SUPPLICANT_STATE_CHANGE_EVENT = 147462;

  public static final int AUTHENTICATION_FAILURE_EVENT = 147463;

  public static final int WPS_OVERLAP_EVENT = 147464;

  public static final int DRIVER_HUNG_EVENT = 147465;

  public static final int P2P_DEVICE_FOUND_EVENT = 147477;

  public static final int P2P_DEVICE_LOST_EVENT = 147478;

  public static final int P2P_GO_NEGOTIATION_REQUEST_EVENT = 147479;

  public static final int P2P_GO_NEGOTIATION_SUCCESS_EVENT = 147481;

  public static final int P2P_GO_NEGOTIATION_FAILURE_EVENT = 147482;

  public static final int P2P_GROUP_FORMATION_SUCCESS_EVENT = 147483;

  public static final int P2P_GROUP_FORMATION_FAILURE_EVENT = 147484;

  public static final int P2P_GROUP_STARTED_EVENT = 147485;

  public static final int P2P_GROUP_REMOVED_EVENT = 147486;

  public static final int P2P_INVITATION_RECEIVED_EVENT = 147487;

  public static final int P2P_INVITATION_RESULT_EVENT = 147488;

  public static final int P2P_PROV_DISC_PBC_REQ_EVENT = 147489;

  public static final int P2P_PROV_DISC_ENTER_PIN_EVENT = 147490;

  public static final int P2P_PROV_DISC_SHOW_PIN_EVENT = 147491;

  public static final int AP_STA_DISCONNECTED_EVENT = 147497;

  public static final int AP_STA_CONNECTED_EVENT = 147498;

  // Constructors

  public WifiMonitor(com.android.internal.util.StateMachine arg1){
  }
  // Methods

  public void startMonitoring(){
  }
}
