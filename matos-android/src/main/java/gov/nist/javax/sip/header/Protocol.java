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


public class Protocol
  extends SIPObject{
  // Fields

  protected java.lang.String protocolName;

  protected java.lang.String protocolVersion;

  protected java.lang.String transport;

  // Constructors

  public Protocol(){
    super();
  }
  // Methods

  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocol")
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocolVersion")
  public java.lang.String getProtocolVersion(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("transport")
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public void setProtocol(@com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setProtocolVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("this.protocolVersion") java.lang.String arg1){
  }
  public void setTransport(@com.francetelecom.rd.stubs.annotation.FieldSet("this.transport") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocolName")
  public java.lang.String getProtocolName(){
    return (java.lang.String) null;
  }
  public void setProtocolName(@com.francetelecom.rd.stubs.annotation.FieldSet("this.protocolName") java.lang.String arg1){
  }
}
