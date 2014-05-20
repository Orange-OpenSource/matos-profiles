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


public final class AddressImpl
  extends NetObject  implements javax.sip.address.Address
{
  // Fields

  public static final int NAME_ADDR = 1;

  public static final int ADDRESS_SPEC = 2;

  public static final int WILD_CARD = 3;

  protected int addressType;

  protected java.lang.String displayName;

  protected GenericURI address;

  // Constructors

  public AddressImpl(){
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
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("displayName")
  public java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  public gov.nist.core.HostPort getHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public javax.sip.address.URI getURI(){
    return (javax.sip.address.URI) null;
  }
  public void setURI(javax.sip.address.URI arg1){
  }
  public void setWildCardFlag(){
  }
  public void setDisplayName(@com.francetelecom.rd.stubs.annotation.FieldSet("this.displayName") java.lang.String arg1){
  }
  public void setUser(java.lang.String arg1){
  }
  public int getAddressType(){
    return 0;
  }
  public void setAddressType(int arg1){
  }
  public boolean isWildcard(){
    return false;
  }
  public java.lang.String getUserAtHostPort(){
    return (java.lang.String) null;
  }
  public void setAddess(javax.sip.address.URI arg1){
  }
  public boolean hasDisplayName(){
    return false;
  }
  public void removeDisplayName(){
  }
  public boolean isSIPAddress(){
    return false;
  }
}
