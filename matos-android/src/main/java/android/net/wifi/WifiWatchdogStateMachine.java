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


public class WifiWatchdogStateMachine
  extends com.android.internal.util.StateMachine{
  // Fields

  public boolean mDisableAPNextFailure;

  public boolean mHasConnectedWifiManager;

  // Constructors

  private WifiWatchdogStateMachine(android.content.Context arg1){
    super((java.lang.String) null);
  }
  // Methods

  public void dump(java.io.PrintWriter arg1){
  }
  public static WifiWatchdogStateMachine makeWifiWatchdogStateMachine(android.content.Context arg1){
    return (WifiWatchdogStateMachine) null;
  }
  public void cancelNetworkNotification(){
  }
}
