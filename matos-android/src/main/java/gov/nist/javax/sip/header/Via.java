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


public class Via
  extends ParametersHeader  implements javax.sip.header.ViaHeader, ViaHeaderExt
{
  // Fields

  public static final java.lang.String BRANCH = "branch";

  public static final java.lang.String RECEIVED = "received";

  public static final java.lang.String MADDR = "maddr";

  public static final java.lang.String TTL = "ttl";

  public static final java.lang.String RPORT = "rport";

  protected Protocol sentProtocol;

  protected gov.nist.core.HostPort sentBy;

  protected java.lang.String comment;

  // Constructors

  public Via(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocol")
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocolVersion")
  public java.lang.String getProtocolVersion(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("comment")
  public java.lang.String getComment(){
    return (java.lang.String) null;
  }
  public void setComment(@com.francetelecom.rd.stubs.annotation.FieldSet("this.comment") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("transport")
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public void setHost(gov.nist.core.Host arg1){
  }
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setSentBy(gov.nist.core.HostPort arg1){
  }
  public gov.nist.core.HostPort getSentBy(){
    return (gov.nist.core.HostPort) null;
  }
  public void setPort(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setProtocol(@com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg1) throws java.text.ParseException{
  }
  public int getTTL(){
    return 0;
  }
  public void setTTL(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setProtocolVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("protocolVersion") java.lang.String arg1){
  }
  public boolean hasPort(){
    return false;
  }
  public void removePort(){
  }
  public void setTransport(@com.francetelecom.rd.stubs.annotation.FieldSet("transport") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("branch")
  public java.lang.String getBranch(){
    return (java.lang.String) null;
  }
  public void setBranch(@com.francetelecom.rd.stubs.annotation.FieldSet("branch") java.lang.String arg1) throws java.text.ParseException{
  }
  public boolean hasComment(){
    return false;
  }
  public void removeComment(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("received")
  public java.lang.String getReceived(){
    return (java.lang.String) null;
  }
  public int getRPort(){
    return 0;
  }
  public void setRPort(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAddr")
  public java.lang.String getMAddr(){
    return (java.lang.String) null;
  }
  public void setMAddr(@com.francetelecom.rd.stubs.annotation.FieldSet("mAddr") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setReceived(@com.francetelecom.rd.stubs.annotation.FieldSet("received") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String getSentByField(){
    return (java.lang.String) null;
  }
  public java.lang.String getSentProtocolField(){
    return (java.lang.String) null;
  }
  public javax.sip.address.Hop getHop(){
    return (javax.sip.address.Hop) null;
  }
  public void setSentProtocol(Protocol arg1){
  }
  public Protocol getSentProtocol(){
    return (Protocol) null;
  }
  public gov.nist.core.NameValueList getViaParms(){
    return (gov.nist.core.NameValueList) null;
  }
}
