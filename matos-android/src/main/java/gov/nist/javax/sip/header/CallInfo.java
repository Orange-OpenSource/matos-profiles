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


public final class CallInfo
  extends ParametersHeader  implements javax.sip.header.CallInfoHeader
{
  // Fields

  protected gov.nist.javax.sip.address.GenericURI info;

  // Constructors

  public CallInfo(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("theinfo")
  public javax.sip.address.URI getInfo(){
    return (javax.sip.address.URI) null;
  }
  public void setInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("theinfo") javax.sip.address.URI arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("purpose")
  public java.lang.String getPurpose(){
    return (java.lang.String) null;
  }
  public void setPurpose(@com.francetelecom.rd.stubs.annotation.FieldSet("purpose") java.lang.String arg1){
  }
}
