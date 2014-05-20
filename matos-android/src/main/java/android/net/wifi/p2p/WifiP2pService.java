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


public class WifiP2pService
  extends IWifiP2pManager.Stub{
  // Fields

  public static final int P2P_ENABLE_PENDING = 143361;

  public static final int WIFI_ENABLE_PROCEED = 143362;

  public static final int GROUP_NEGOTIATION_TIMED_OUT = 143363;

  // Constructors

  public WifiP2pService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public android.os.Messenger getMessenger(){
    return (android.os.Messenger) null;
  }
  public void connectivityServiceReady(){
  }
}
