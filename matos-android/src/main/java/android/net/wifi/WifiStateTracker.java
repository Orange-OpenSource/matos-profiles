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

import com.francetelecom.rd.stubs.annotation.UseRule;


public class WifiStateTracker
  implements android.net.NetworkStateTracker
{
  // Constructors

  public WifiStateTracker(int arg1, java.lang.String arg2){
  }
  // Methods
  @UseRule("WifiStateTracker.teardown")
  public boolean teardown(){
    return false;
  }
  @UseRule("WifiStateTracker.reconnect")
  public boolean reconnect(){
    return false;
  }
  public boolean isAvailable(){
    return false;
  }
  public android.net.LinkProperties getLinkProperties(){
    return (android.net.LinkProperties) null;
  }
  public android.net.LinkCapabilities getLinkCapabilities(){
    return (android.net.LinkCapabilities) null;
  }
  @UseRule("WifiStateTracker.startMonitoring")
  public void startMonitoring(android.content.Context arg1, android.os.Handler arg2){
  }
  public boolean setRadio(boolean arg1){
    return false;
  }
  public boolean isPrivateDnsRouteSet(){
    return false;
  }
  public void privateDnsRouteSet(boolean arg1){
  }
  public android.net.NetworkInfo getNetworkInfo(){
    return (android.net.NetworkInfo) null;
  }
  public boolean isDefaultRouteSet(){
    return false;
  }
  public void defaultRouteSet(boolean arg1){
  }
  public java.lang.String getTcpBufferSizesPropName(){
    return (java.lang.String) null;
  }
  public void setTeardownRequested(boolean arg1){
  }
  public boolean isTeardownRequested(){
    return false;
  }
  public void setUserDataEnable(boolean arg1){
  }
  public void setPolicyDataEnable(boolean arg1){
  }
  public void setDependencyMet(boolean arg1){
  }
}
