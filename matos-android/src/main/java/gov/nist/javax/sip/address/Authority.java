package gov.nist.javax.sip.address;

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


public class Authority
  extends NetObject{
  // Fields

  protected gov.nist.core.HostPort hostPort;

  protected UserInfo userInfo;

  // Constructors

  public Authority(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public gov.nist.core.Host getHost(){
    return (gov.nist.core.Host) null;
  }
  public int getPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("userInfo")
  public UserInfo getUserInfo(){
    return (UserInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("hostPort")
  public gov.nist.core.HostPort getHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") gov.nist.core.Host arg1){
  }
  public void setPassword(@com.francetelecom.rd.stubs.annotation.FieldSet("password") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("user")
  public java.lang.String getUser(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("password")
  public java.lang.String getPassword(){
    return (java.lang.String) null;
  }
  public void setPort(int arg1){
  }
  public void setUser(@com.francetelecom.rd.stubs.annotation.FieldSet("user") java.lang.String arg1){
  }
  public void removePort(){
  }
  public void setHostPort(@com.francetelecom.rd.stubs.annotation.FieldSet("this.hostPort") gov.nist.core.HostPort arg1){
  }
  public void setUserInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("this.userInfo") UserInfo arg1){
  }
  public void removeUserInfo(){
  }
}
