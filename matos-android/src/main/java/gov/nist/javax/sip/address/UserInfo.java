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


public final class UserInfo
  extends NetObject{
  // Fields

  protected java.lang.String user;

  protected java.lang.String password;

  protected int userType;

  public static final int TELEPHONE_SUBSCRIBER = 1;

  public static final int USER = 2;

  // Constructors

  public UserInfo(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public void setPassword(@com.francetelecom.rd.stubs.annotation.FieldSet("this.password") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("user")
  public java.lang.String getUser(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("password")
  public java.lang.String getPassword(){
    return (java.lang.String) null;
  }
  public void setUser(@com.francetelecom.rd.stubs.annotation.FieldSet("this.user") java.lang.String arg1){
  }
  public void clearPassword(){
  }
  public int getUserType(){
    return 0;
  }
  public void setUserType(int arg1) throws java.lang.IllegalArgumentException{
  }
}
