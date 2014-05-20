package android.net;

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
public interface NetworkStateTracker
{
  // Fields

  public static final int MIN_NETWORK_STATE_TRACKER_EVENT = 1;

  public static final int MAX_NETWORK_STATE_TRACKER_EVENT = 100;

  public static final int EVENT_STATE_CHANGED = 1;

  public static final int EVENT_CONFIGURATION_CHANGED = 3;

  public static final int EVENT_RESTORE_DEFAULT_NETWORK = 6;

  // Methods

  public boolean teardown();
  public boolean reconnect();
  public boolean isAvailable();
  public LinkProperties getLinkProperties();
  public LinkCapabilities getLinkCapabilities();
  public void startMonitoring(android.content.Context arg1, android.os.Handler arg2);
  public boolean setRadio(boolean arg1);
  public boolean isPrivateDnsRouteSet();
  public void privateDnsRouteSet(boolean arg1);
  public NetworkInfo getNetworkInfo();
  public boolean isDefaultRouteSet();
  public void defaultRouteSet(boolean arg1);
  public java.lang.String getTcpBufferSizesPropName();
  public void setTeardownRequested(boolean arg1);
  public boolean isTeardownRequested();
  public void setUserDataEnable(boolean arg1);
  public void setPolicyDataEnable(boolean arg1);
  public void setDependencyMet(boolean arg1);
}
