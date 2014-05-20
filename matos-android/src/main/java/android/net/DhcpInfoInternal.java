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


public class DhcpInfoInternal
{
  // Fields

  public java.lang.String ipAddress;

  public int prefixLength;

  public java.lang.String dns1;

  public java.lang.String dns2;

  public java.lang.String serverAddress;

  public int leaseDuration;

  // Constructors

  public DhcpInfoInternal(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void addRoute(RouteInfo arg1){
  }
  public java.util.Collection<RouteInfo> getRoutes(){
    return (java.util.Collection) null;
  }
  public DhcpInfo makeDhcpInfo(){
    return (DhcpInfo) null;
  }
  public LinkAddress makeLinkAddress(){
    return (LinkAddress) null;
  }
  public LinkProperties makeLinkProperties(){
    return (LinkProperties) null;
  }
  public void updateFromDhcpRequest(DhcpInfoInternal arg1){
  }
}
