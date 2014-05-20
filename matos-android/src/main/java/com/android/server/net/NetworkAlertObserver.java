package com.android.server.net;

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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.NetworkAlertObserverImpl")
public abstract class NetworkAlertObserver
  extends android.net.INetworkManagementEventObserver.Stub{
  // Constructors

  public NetworkAlertObserver(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("NetworkAlertObserver")
  public void interfaceStatusChanged(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("NetworkAlertObserver")
  public void interfaceLinkStateChanged(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("NetworkAlertObserver")
  public void interfaceAdded(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("NetworkAlertObserver")
  public void interfaceRemoved(java.lang.String arg1){
  }
}
