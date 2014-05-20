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


public final class NetworkInterface
{
  // Constructors

  private NetworkInterface(java.lang.String arg1, int arg2, java.util.List<InetAddress> arg3, java.util.List<InterfaceAddress> arg4){
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
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public NetworkInterface getParent(){
    return (NetworkInterface) null;
  }
  public java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  public static NetworkInterface getByName(java.lang.String arg1) throws SocketException{
    return (NetworkInterface) null;
  }
  public int getIndex(){
    return 0;
  }
  public java.util.Enumeration<InetAddress> getInetAddresses(){
    return (java.util.Enumeration) null;
  }
  public boolean isUp() throws SocketException{
    return false;
  }
  public static NetworkInterface getByInetAddress(InetAddress arg1) throws SocketException{
    return (NetworkInterface) null;
  }
  public static NetworkInterface getByIndex(int arg1) throws SocketException{
    return (NetworkInterface) null;
  }
  public static java.util.Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException{
    return (java.util.Enumeration) null;
  }
  public java.util.List<InterfaceAddress> getInterfaceAddresses(){
    return (java.util.List) null;
  }
  public java.util.Enumeration<NetworkInterface> getSubInterfaces(){
    return (java.util.Enumeration) null;
  }
  public boolean isLoopback() throws SocketException{
    return false;
  }
  public boolean isPointToPoint() throws SocketException{
    return false;
  }
  public boolean supportsMulticast() throws SocketException{
    return false;
  }
  public byte [] getHardwareAddress() throws SocketException{
    return (byte []) null;
  }
  public int getMTU() throws SocketException{
    return 0;
  }
  public boolean isVirtual(){
    return false;
  }
}
