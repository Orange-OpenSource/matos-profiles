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


public final class Inet6Address
  extends InetAddress{
  // Fields

  public static final InetAddress ANY = null;

  public static final InetAddress LOOPBACK = null;

  // Constructors

  Inet6Address(byte [] arg1, java.lang.String arg2, int arg3){
    super(0, (byte []) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
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
  public static Inet6Address getByAddress(java.lang.String arg1, byte [] arg2, int arg3) throws UnknownHostException{
    return (Inet6Address) null;
  }
  public static Inet6Address getByAddress(java.lang.String arg1, byte [] arg2, NetworkInterface arg3) throws UnknownHostException{
    return (Inet6Address) null;
  }
  public int getScopeId(){
    return 0;
  }
  public boolean isIPv4CompatibleAddress(){
    return false;
  }
  public NetworkInterface getScopedInterface(){
    return (NetworkInterface) null;
  }
}
