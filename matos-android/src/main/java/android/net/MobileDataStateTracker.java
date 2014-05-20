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
public class MobileDataStateTracker
  implements NetworkStateTracker
{
  // Fields

  protected boolean mUserDataEnabled;

  protected boolean mPolicyDataEnabled;

  // Constructors

  public MobileDataStateTracker(int arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean teardown(){
    return false;
  }
  public boolean reconnect(){
    return false;
  }
  public boolean isAvailable(){
    return false;
  }
  public LinkProperties getLinkProperties(){
    return (LinkProperties) null;
  }
  public LinkCapabilities getLinkCapabilities(){
    return (LinkCapabilities) null;
  }
  public void startMonitoring(android.content.Context arg1, android.os.Handler arg2){
  }
  public void releaseWakeLock(){
  }
  public boolean setRadio(boolean arg1){
    return false;
  }
  public boolean isPrivateDnsRouteSet(){
    return false;
  }
  public void privateDnsRouteSet(boolean arg1){
  }
  public NetworkInfo getNetworkInfo(){
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
  public static java.lang.String networkTypeToApnType(int arg1){
    return (java.lang.String) null;
  }
}
