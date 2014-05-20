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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;


public class TelURLImpl
  extends GenericURI  implements javax.sip.address.TelURL
{
  // Fields

  protected TelephoneNumber telephoneNumber;

  // Constructors

  public TelURLImpl(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
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
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  
  public gov.nist.core.NameValueList getParameters(){
    return (gov.nist.core.NameValueList) null;
  }
  public void setTelephoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("this.telephoneNumber") TelephoneNumber arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("isdnSubAddress")
  public java.lang.String getIsdnSubAddress(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("postDial")
  public java.lang.String getPostDial(){
    return (java.lang.String) null;
  }
  public boolean isGlobal(){
    return false;
  }
  public boolean isSipURI(){
    return false;
  }
  public void setGlobal(boolean arg1){
  }
  public void setIsdnSubAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("isdnSubAddress") java.lang.String arg1){
  }
  public void setPostDial(@com.francetelecom.rd.stubs.annotation.FieldSet("postDial") java.lang.String arg1){
  }
  public void setPhoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneNumber") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("phoneNumber")
  public java.lang.String getPhoneNumber(){
    return (java.lang.String) null;
  }
  
  @FieldGet("parameter") 
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  
  public void setParameter(java.lang.String arg1, @FieldSet("parameter") java.lang.String arg2){
  }
  public java.util.Iterator<java.lang.String> getParameterNames(){
    return (java.util.Iterator) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  public void setPhoneContext(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneContext") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("phoneContext")
  public java.lang.String getPhoneContext(){
    return (java.lang.String) null;
  }
}
