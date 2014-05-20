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


public class Credentials
  extends SIPObject{
  // Fields

  protected java.lang.String scheme;

  protected gov.nist.core.NameValueList parameters;

  // Constructors

  public Credentials(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("this.scheme") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("parameters")
  public gov.nist.core.NameValueList getCredentials(){
    return (gov.nist.core.NameValueList) null;
  }
  public void setCredentials(@com.francetelecom.rd.stubs.annotation.FieldSet("this.parameters") gov.nist.core.NameValueList arg1){
  }
}
