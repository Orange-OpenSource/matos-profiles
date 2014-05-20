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


public class EthernetDataTracker
  implements NetworkStateTracker
{
  // Constructors

  private EthernetDataTracker(){
  }
  // Methods

  public static synchronized EthernetDataTracker getInstance(){
    return (EthernetDataTracker) null;
  }
  public boolean teardown(){
    return false;
  }
  public boolean reconnect(){
    return false;
  }
  public synchronized boolean isAvailable(){
    return false;
  }
  public synchronized LinkProperties getLinkProperties(){
    return (LinkProperties) null;
  }
  public LinkCapabilities getLinkCapabilities(){
    return (LinkCapabilities) null;
  }
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
  public synchronized NetworkInfo getNetworkInfo(){
    return (NetworkInfo) null;
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
  public java.lang.Object Clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int startUsingNetworkFeature(java.lang.String arg1, int arg2, int arg3){
    return 0;
  }
  public int stopUsingNetworkFeature(java.lang.String arg1, int arg2, int arg3){
    return 0;
  }
  public int getDefaultGatewayAddr(){
    return 0;
  }
}
