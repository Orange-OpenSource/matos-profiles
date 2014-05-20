package gov.nist.javax.sip.header.ims;

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


public class PAccessNetworkInfo
  extends gov.nist.javax.sip.header.ParametersHeader  implements javax.sip.header.ExtensionHeader, PAccessNetworkInfoHeader
{
  // Constructors

  public PAccessNetworkInfo(){
    super();
  }
  public PAccessNetworkInfo(java.lang.String arg1){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  public void setParameter(java.lang.String arg1, java.lang.Object arg2){
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setAccessType(@com.francetelecom.rd.stubs.annotation.FieldSet("accessType") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("accessType")
  public java.lang.String getAccessType(){
    return (java.lang.String) null;
  }
  public void setCGI3GPP(@com.francetelecom.rd.stubs.annotation.FieldSet("cgi3GPP") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("cgi3GPP")
  public java.lang.String getCGI3GPP(){
    return (java.lang.String) null;
  }
  public void setUtranCellID3GPP(@com.francetelecom.rd.stubs.annotation.FieldSet("utranCellId3GPP") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("utranCellId3GPP")
  public java.lang.String getUtranCellID3GPP(){
    return (java.lang.String) null;
  }
  public void setDSLLocation(@com.francetelecom.rd.stubs.annotation.FieldSet("DSLLocation") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("DSLLocation")
  public java.lang.String getDSLLocation(){
    return (java.lang.String) null;
  }
  public void setCI3GPP2(@com.francetelecom.rd.stubs.annotation.FieldSet("CI3GPP2") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("CI3GPP2")
  public java.lang.String getCI3GPP2(){
    return (java.lang.String) null;
  }
  public void setExtensionAccessInfo(java.lang.Object arg1) throws java.text.ParseException{
  }
  public java.lang.Object getExtensionAccessInfo(){
    return (java.lang.Object) null;
  }
}
