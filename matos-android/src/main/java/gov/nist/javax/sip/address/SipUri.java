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


public class SipUri
  extends GenericURI  implements SipURIExt, javax.sip.address.SipURI
{
  // Fields

  protected Authority authority;

  protected gov.nist.core.NameValueList uriParms;

  protected gov.nist.core.NameValueList qheaders;

  protected TelephoneNumber telephoneSubscriber;

  // Constructors

  public SipUri(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("authority")
  public Authority getAuthority(){
    return (Authority) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("method") java.lang.String arg1){
  }
  public gov.nist.core.NameValueList getParameters(){
    return (gov.nist.core.NameValueList) null;
  }
  public boolean isSipURI(){
    return false;
  }
  public void setIsdnSubAddress(java.lang.String arg1){
  }
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  public java.util.Iterator<java.lang.String> getParameterNames(){
    return (java.util.Iterator) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  public void setSecure(boolean arg1){
  }
  public boolean isSecure(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("hostPort")
  public gov.nist.core.HostPort getHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("scheme") java.lang.String arg1){
  }
  public void removeParameters(){
  }
  public boolean hasParameter(java.lang.String arg1){
    return false;
  }
  public void setHeader(java.lang.String arg1, java.lang.String arg2){
  }
  public void removeHeader(java.lang.String arg1){
  }
  public void removeHeaders(){
  }
  public void setHost(gov.nist.core.Host arg1){
  }
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String getHeader(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.util.Iterator<java.lang.String> getHeaderNames(){
    return (java.util.Iterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("user")
  public java.lang.String getUser(){
    return (java.lang.String) null;
  }
  public void setPort(int arg1){
  }
  public void setUser(@com.francetelecom.rd.stubs.annotation.FieldSet("user") java.lang.String arg1){
  }
  public void clearPassword(){
  }
  public java.lang.String getUserType(){
    return (java.lang.String) null;
  }
  public void removeUser(){
  }
  public java.lang.String getUserAtHostPort(){
    return (java.lang.String) null;
  }
  public void removePort(){
  }
  public void setHostPort(@com.francetelecom.rd.stubs.annotation.FieldSet("hostPort") gov.nist.core.HostPort arg1){
  }
  public boolean hasGrParam(){
    return false;
  }
  public void setGrParam(@com.francetelecom.rd.stubs.annotation.FieldSet("grParam") java.lang.String arg1){
  }
  public void setMAddrParam(@com.francetelecom.rd.stubs.annotation.FieldSet("mAddrParam") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setTransportParam(@com.francetelecom.rd.stubs.annotation.FieldSet("transportParam") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setUserPassword(@com.francetelecom.rd.stubs.annotation.FieldSet("userPassword") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("userPassword")
  public java.lang.String getUserPassword(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("transportParam")
  public java.lang.String getTransportParam(){
    return (java.lang.String) null;
  }
  public boolean hasLrParam(){
    return false;
  }
  public void setUserParam(@com.francetelecom.rd.stubs.annotation.FieldSet("userParam") java.lang.String arg1){
  }
  public java.lang.String getLrParam(){
    return (java.lang.String) null;
  }
  public void setLrParam(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAddrParam")
  public java.lang.String getMAddrParam(){
    return (java.lang.String) null;
  }
  public int getTTLParam(){
    return 0;
  }
  public void setTTLParam(int arg1){
  }
  public boolean hasTransport(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("userParam")
  public java.lang.String getUserParam(){
    return (java.lang.String) null;
  }
  public void removeUserType(){
  }
  public java.lang.String getUserAtHost(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("methodParam")
  public java.lang.String getMethodParam(){
    return (java.lang.String) null;
  }
  public void setMethodParam(@com.francetelecom.rd.stubs.annotation.FieldSet("methodParam") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setMAddr(java.lang.String arg1){
  }
  public void setUriParameter(gov.nist.core.NameValue arg1){
  }
  public void setQHeader(gov.nist.core.NameValue arg1){
  }
  public void clearUriParms(){
  }
  public void clearQheaders(){
  }
  public java.lang.Object getParm(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("qheaders")
  public gov.nist.core.NameValueList getQheaders(){
    return (gov.nist.core.NameValueList) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("telephoneSubscriber")
  public TelephoneNumber getTelephoneSubscriber(){
    return (TelephoneNumber) null;
  }
  public boolean isUserTelephoneSubscriber(){
    return false;
  }
  public void removeTTL(){
  }
  public void removeMAddr(){
  }
  public void removeTransport(){
  }
  public void removeMethod(){
  }
  public void setDefaultParm(java.lang.String arg1, java.lang.Object arg2){
  }
  public void setAuthority(@com.francetelecom.rd.stubs.annotation.FieldSet("this.authority") Authority arg1){
  }
  public void setUriParms(gov.nist.core.NameValueList arg1){
  }
  public void setUriParm(java.lang.String arg1, java.lang.Object arg2){
  }
  public void setQheaders(@com.francetelecom.rd.stubs.annotation.FieldSet("this.qheaders") gov.nist.core.NameValueList arg1){
  }
  public void setTelephoneSubscriber(@com.francetelecom.rd.stubs.annotation.FieldSet("this.telephoneSubscriber") TelephoneNumber arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("grParam")
  public java.lang.String getGrParam(){
    return (java.lang.String) null;
  }
}
