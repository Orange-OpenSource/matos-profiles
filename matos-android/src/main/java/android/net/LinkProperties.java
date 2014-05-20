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


public class LinkProperties
  implements android.os.Parcelable
{
  // Classes

  public static class CompareResult<T>
  {
    // Fields

    public java.util.Collection<T> removed;

    public java.util.Collection<T> added;

    // Constructors

    public CompareResult(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<LinkProperties> CREATOR = null;

  // Constructors

  public LinkProperties(){
  }
  public LinkProperties(LinkProperties arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void clear(){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setHttpProxy(ProxyProperties arg1){
  }
  public void addRoute(RouteInfo arg1){
  }
  public java.util.Collection<RouteInfo> getRoutes(){
    return (java.util.Collection) null;
  }
  public ProxyProperties getHttpProxy(){
    return (ProxyProperties) null;
  }
  public void addLinkAddress(LinkAddress arg1){
  }
  public void addDns(java.net.InetAddress arg1){
  }
  public boolean isIdenticalInterfaceName(LinkProperties arg1){
    return false;
  }
  public boolean isIdenticalDnses(LinkProperties arg1){
    return false;
  }
  public boolean isIdenticalRoutes(LinkProperties arg1){
    return false;
  }
  public boolean isIdenticalHttpProxy(LinkProperties arg1){
    return false;
  }
  public boolean isIdenticalAddresses(LinkProperties arg1){
    return false;
  }
  public LinkProperties.CompareResult<LinkAddress> compareAddresses(LinkProperties arg1){
    return (LinkProperties.CompareResult) null;
  }
  public java.lang.String getInterfaceName(){
    return (java.lang.String) null;
  }
  public LinkProperties.CompareResult<RouteInfo> compareRoutes(LinkProperties arg1){
    return (LinkProperties.CompareResult) null;
  }
  public LinkProperties.CompareResult<java.net.InetAddress> compareDnses(LinkProperties arg1){
    return (LinkProperties.CompareResult) null;
  }
  public java.util.Collection<java.net.InetAddress> getDnses(){
    return (java.util.Collection) null;
  }
  public void setInterfaceName(java.lang.String arg1){
  }
  public java.util.Collection<java.net.InetAddress> getAddresses(){
    return (java.util.Collection) null;
  }
  public java.util.Collection<LinkAddress> getLinkAddresses(){
    return (java.util.Collection) null;
  }
}
