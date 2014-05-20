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
public class NetworkUtils
{
  // Fields

  public static final int RESET_IPV4_ADDRESSES = 1;

  public static final int RESET_IPV6_ADDRESSES = 2;

  public static final int RESET_ALL_ADDRESSES = 3;

  // Constructors

  public NetworkUtils(){
  }
  // Methods

  public static java.net.InetAddress numericToInetAddress(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.net.InetAddress) null;
  }
  public static int inetAddressToInt(java.net.InetAddress arg1) throws java.lang.IllegalArgumentException{
    return 0;
  }
  public static int prefixLengthToNetmaskInt(int arg1) throws java.lang.IllegalArgumentException{
    return 0;
  }
  public static boolean stopDhcp(java.lang.String arg1){
    return false;
  }
  public static boolean addressTypeMatches(java.net.InetAddress arg1, java.net.InetAddress arg2){
    return false;
  }
  public static int enableInterface(java.lang.String arg1){
    return 0;
  }
  public static int disableInterface(java.lang.String arg1){
    return 0;
  }
  public static int resetConnections(java.lang.String arg1, int arg2){
    return 0;
  }
  public static boolean runDhcp(java.lang.String arg1, DhcpInfoInternal arg2){
    return false;
  }
  public static boolean runDhcpRenew(java.lang.String arg1, DhcpInfoInternal arg2){
    return false;
  }
  public static boolean releaseDhcpLease(java.lang.String arg1){
    return false;
  }
  public static java.lang.String getDhcpError(){
    return (java.lang.String) null;
  }
  public static java.net.InetAddress intToInetAddress(int arg1){
    return (java.net.InetAddress) null;
  }
  public static int netmaskIntToPrefixLength(int arg1){
    return 0;
  }
  public static java.net.InetAddress getNetworkPart(java.net.InetAddress arg1, int arg2){
    return (java.net.InetAddress) null;
  }
  public static java.net.InetAddress hexToInet6Address(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.net.InetAddress) null;
  }
  public static java.lang.String [] makeStrings(java.util.Collection<java.net.InetAddress> arg1){
    return (java.lang.String []) null;
  }
}
