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


public class RouteInfo
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<RouteInfo> CREATOR = null;

  // Constructors

  public RouteInfo(LinkAddress arg1, java.net.InetAddress arg2){
  }
  public RouteInfo(java.net.InetAddress arg1){
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
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isDefaultRoute(){
    return false;
  }
  public java.net.InetAddress getGateway(){
    return (java.net.InetAddress) null;
  }
  public static RouteInfo selectBestRoute(java.util.Collection<RouteInfo> arg1, java.net.InetAddress arg2){
    return (RouteInfo) null;
  }
  public static RouteInfo makeHostRoute(java.net.InetAddress arg1){
    return (RouteInfo) null;
  }
  public static RouteInfo makeHostRoute(java.net.InetAddress arg1, java.net.InetAddress arg2){
    return (RouteInfo) null;
  }
  public boolean isHostRoute(){
    return false;
  }
  public LinkAddress getDestination(){
    return (LinkAddress) null;
  }
}
