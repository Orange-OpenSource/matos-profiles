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


public class TelephoneNumber
  extends NetObject{
  // Fields

  public static final java.lang.String POSTDIAL = "postdial";

  public static final java.lang.String PHONE_CONTEXT_TAG = "context-tag";

  public static final java.lang.String ISUB = "isub";

  public static final java.lang.String PROVIDER_TAG = "provider-tag";

  protected boolean isglobal;

  protected java.lang.String phoneNumber;

  protected gov.nist.core.NameValueList parameters;

  // Constructors

  public TelephoneNumber(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public gov.nist.core.NameValueList getParameters(){
    return (gov.nist.core.NameValueList) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("postDial")
  public java.lang.String getPostDial(){
    return (java.lang.String) null;
  }
  public boolean isGlobal(){
    return false;
  }
  public void setGlobal(boolean arg1){
  }
  public void setPostDial(@com.francetelecom.rd.stubs.annotation.FieldSet("postDial") java.lang.String arg1){
  }
  public void setPhoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("this.phoneNumber") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("phoneNumber")
  public java.lang.String getPhoneNumber(){
    return (java.lang.String) null;
  }
  
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2){
  }
  public java.util.Iterator<java.lang.String> getParameterNames(){
    return (java.util.Iterator) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  public void setParameters(@com.francetelecom.rd.stubs.annotation.FieldSet("this.parameters") gov.nist.core.NameValueList arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("isdnSubaddress")
  public java.lang.String getIsdnSubaddress(){
    return (java.lang.String) null;
  }
  public void setIsdnSubaddress(@com.francetelecom.rd.stubs.annotation.FieldSet("isdnSubaddress") java.lang.String arg1){
  }
  public void deleteParm(java.lang.String arg1){
  }
  public boolean hasPostDial(){
    return false;
  }
  public boolean hasParm(java.lang.String arg1){
    return false;
  }
  public boolean hasIsdnSubaddress(){
    return false;
  }
  public void removePostDial(){
  }
  public void removeIsdnSubaddress(){
  }
  
  public void setParm(java.lang.String arg1, java.lang.Object arg2){
  }
}
