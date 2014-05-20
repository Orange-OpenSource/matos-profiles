package gov.nist.javax.sip.header;

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


public final class Contact
  extends AddressParametersHeader  implements javax.sip.header.ContactHeader
{
  // Fields

  public static final java.lang.String ACTION = "action";

  public static final java.lang.String PROXY = "proxy";

  public static final java.lang.String REDIRECT = "redirect";

  public static final java.lang.String EXPIRES = "expires";

  public static final java.lang.String Q = "q";

  protected boolean wildCardFlag;

  // Constructors

  public Contact(){
    super((java.lang.String) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("address")
  public javax.sip.address.Address getAddress(){
    return (javax.sip.address.Address) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  public void setAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("address") javax.sip.address.Address arg1){
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public void setExpires(int arg1){
  }
  public int getExpires(){
    return 0;
  }
  public float getQValue(){
    return 0.0f;
  }
  public void setQValue(float arg1) throws javax.sip.InvalidArgumentException{
  }
  public boolean isWildCard(){
    return false;
  }
  public void setWildCard(){
  }
  public void setWildCardFlag(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("contactList")
  public ContactList getContactList(){
    return (ContactList) null;
  }
  public boolean getWildCardFlag(){
    return false;
  }
  public gov.nist.core.NameValueList getContactParms(){
    return (gov.nist.core.NameValueList) null;
  }
  public void setContactList(@com.francetelecom.rd.stubs.annotation.FieldSet("contactList") ContactList arg1){
  }
  public void removeSipInstanceParam(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sipInstanceParam")
  public java.lang.String getSipInstanceParam(){
    return (java.lang.String) null;
  }
  public void setSipInstanceParam(@com.francetelecom.rd.stubs.annotation.FieldSet("sipInstanceParam") java.lang.String arg1){
  }
  public void removePubGruuParam(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("pubGruuParam")
  public java.lang.String getPubGruuParam(){
    return (java.lang.String) null;
  }
  public void setPubGruuParam(@com.francetelecom.rd.stubs.annotation.FieldSet("pubGruuParam") java.lang.String arg1){
  }
  public void removeTempGruuParam(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("tempGruuParam")
  public java.lang.String getTempGruuParam(){
    return (java.lang.String) null;
  }
  public void setTempGruuParam(@com.francetelecom.rd.stubs.annotation.FieldSet("tempGruuParam") java.lang.String arg1){
  }
}
