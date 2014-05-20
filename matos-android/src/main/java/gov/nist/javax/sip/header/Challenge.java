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


public class Challenge
  extends SIPObject{
  // Fields

  protected java.lang.String scheme;

  protected gov.nist.core.NameValueList authParams;

  // Constructors

  public Challenge(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.String getSignature(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setParameter(gov.nist.core.NameValue arg1){
  }
  public boolean removeParameter(java.lang.String arg1){
    return false;
  }
  public java.lang.String getDomain(){
    return (java.lang.String) null;
  }
  public java.lang.String getRealm(){
    return (java.lang.String) null;
  }
  public java.lang.String getURI(){
    return (java.lang.String) null;
  }
  public java.lang.String getResponse(){
    return (java.lang.String) null;
  }
  public java.lang.String getOpaque(){
    return (java.lang.String) null;
  }
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("this.scheme") java.lang.String arg1){
  }
  public void removeParameters(){
  }
  public boolean hasParameter(java.lang.String arg1){
    return false;
  }
  public boolean hasParameters(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("authParams")
  public gov.nist.core.NameValueList getAuthParams(){
    return (gov.nist.core.NameValueList) null;
  }
  public java.lang.String getQOP(){
    return (java.lang.String) null;
  }
  public java.lang.String getStale(){
    return (java.lang.String) null;
  }
  public java.lang.String getSignedBy(){
    return (java.lang.String) null;
  }
  public void setAuthParams(@com.francetelecom.rd.stubs.annotation.FieldSet("this.authParams") gov.nist.core.NameValueList arg1){
  }
}
