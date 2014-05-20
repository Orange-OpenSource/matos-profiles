package gov.nist.core;

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


public class Host
  extends GenericObject{
  // Fields

  protected static final int HOSTNAME = 0;

  protected static final int IPV4ADDRESS = 0;

  protected static final int IPV6ADDRESS = 0;

  protected java.lang.String hostname;

  protected int addressType;

  // Constructors

  public Host(){
    super();
  }
  public Host(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    super();
  }
  public Host(java.lang.String arg1, int arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("address")
  public java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public java.net.InetAddress getInetAddress() throws java.net.UnknownHostException{
    return (java.net.InetAddress) null;
  }
  public void setAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("address") java.lang.String arg1){
  }
  public java.lang.String getIpAddress(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("hostname")
  public java.lang.String getHostname(){
    return (java.lang.String) null;
  }
  public void setHostname(@com.francetelecom.rd.stubs.annotation.FieldSet("this.hostname") java.lang.String arg1){
  }
  public void setHostAddress(java.lang.String arg1){
  }
  public boolean isHostname(){
    return false;
  }
  public boolean isIPAddress(){
    return false;
  }
  public static boolean isIPv6Reference(java.lang.String arg1){
    return false;
  }
}
