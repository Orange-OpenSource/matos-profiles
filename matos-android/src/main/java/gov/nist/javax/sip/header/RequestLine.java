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


public class RequestLine
  extends SIPObject  implements SipRequestLine
{
  // Fields

  protected gov.nist.javax.sip.address.GenericURI uri;

  protected java.lang.String method;

  protected java.lang.String sipVersion;

  // Constructors

  public RequestLine(){
    super();
  }
  public RequestLine(gov.nist.javax.sip.address.GenericURI arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
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
  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public void setMethod(java.lang.String arg1){
  }
  public gov.nist.javax.sip.address.GenericURI getUri(){
    return (gov.nist.javax.sip.address.GenericURI) null;
  }
  public void setSipVersion(java.lang.String arg1){
  }
  public java.lang.String getSipVersion(){
    return (java.lang.String) null;
  }
  public java.lang.String getVersionMajor(){
    return (java.lang.String) null;
  }
  public java.lang.String getVersionMinor(){
    return (java.lang.String) null;
  }
  public void setUri(javax.sip.address.URI arg1){
  }
}
