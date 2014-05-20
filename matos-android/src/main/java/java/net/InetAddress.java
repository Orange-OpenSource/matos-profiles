package java.net;

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


public class InetAddress
  implements java.io.Serializable
{
  // Fields

  public static final InetAddress UNSPECIFIED = null;

  // Constructors

  InetAddress(int arg1, byte [] arg2, java.lang.String arg3){
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
  public byte [] getAddress(){
    return (byte []) null;
  }
  public java.lang.String getHostAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getHostName(){
    return (java.lang.String) null;
  }
  public static InetAddress getByName(java.lang.String arg1) throws UnknownHostException{
    return (InetAddress) null;
  }
  public static boolean isNumeric(java.lang.String arg1){
    return false;
  }
  public static InetAddress [] getAllByName(java.lang.String arg1) throws UnknownHostException{
    return (InetAddress []) null;
  }
  public java.lang.String getCanonicalHostName(){
    return (java.lang.String) null;
  }
  public static InetAddress getLocalHost() throws UnknownHostException{
    return (InetAddress) null;
  }
  public static void clearDnsCache(){
  }
  public static InetAddress parseNumericAddress(java.lang.String arg1){
    return (InetAddress) null;
  }
  public static InetAddress getLoopbackAddress(){
    return (InetAddress) null;
  }
  public boolean isAnyLocalAddress(){
    return false;
  }
  public boolean isLinkLocalAddress(){
    return false;
  }
  public boolean isLoopbackAddress(){
    return false;
  }
  public boolean isMCGlobal(){
    return false;
  }
  public boolean isMCLinkLocal(){
    return false;
  }
  public boolean isMCNodeLocal(){
    return false;
  }
  public boolean isMCOrgLocal(){
    return false;
  }
  public boolean isMCSiteLocal(){
    return false;
  }
  public boolean isMulticastAddress(){
    return false;
  }
  public boolean isSiteLocalAddress(){
    return false;
  }
  public boolean isReachable(int arg1) throws java.io.IOException{
    return false;
  }
  public boolean isReachable(NetworkInterface arg1, int arg2, int arg3) throws java.io.IOException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "InetAddress.getByAddress-1", pos = {-1, 1}, report = "-")
  public static InetAddress getByAddress(byte [] arg1) throws UnknownHostException{
    return (InetAddress) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "InetAddress.getByAddress-2", pos = {-1, 1, 2}, report = "-")
  public static InetAddress getByAddress(java.lang.String arg1, byte [] arg2) throws UnknownHostException{
    return (InetAddress) null;
  }
}
