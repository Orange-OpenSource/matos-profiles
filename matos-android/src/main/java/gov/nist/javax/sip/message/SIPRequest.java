package gov.nist.javax.sip.message;

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


public final class SIPRequest
  extends SIPMessage  implements RequestExt, javax.sip.message.Request
{
  // Constructors

  public SIPRequest(){
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("method") java.lang.String arg1){
  }
  public java.lang.String debugDump(){
    return (java.lang.String) null;
  }
  public java.lang.String getViaHost(){
    return (java.lang.String) null;
  }
  public int getViaPort(){
    return 0;
  }
  public SIPResponse createResponse(int arg1){
    return (SIPResponse) null;
  }
  public SIPResponse createResponse(int arg1, java.lang.String arg2){
    return (SIPResponse) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("requestLine")
  public gov.nist.javax.sip.header.RequestLine getRequestLine(){
    return (gov.nist.javax.sip.header.RequestLine) null;
  }
  public java.lang.String getFirstLine(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("SIPVersion")
  public java.lang.String getSIPVersion(){
    return (java.lang.String) null;
  }
  public void setSIPVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("SIPVersion") java.lang.String arg1) throws java.text.ParseException{
  }
  protected void setDefaults(){
  }
  public byte [] encodeAsBytes(java.lang.String arg1){
    return (byte []) null;
  }
  public void checkHeaders() throws java.text.ParseException{
  }
  public java.lang.String getDialogId(boolean arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDialogId(boolean arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String encodeMessage(){
    return (java.lang.String) null;
  }
  public java.util.LinkedList getMessageAsEncodedStrings(){
    return (java.util.LinkedList) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("messageChannel")
  public java.lang.Object getMessageChannel(){
    return (java.lang.Object) null;
  }
  public void setTransaction(@com.francetelecom.rd.stubs.annotation.FieldSet("transaction") java.lang.Object arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("requestURI")
  public javax.sip.address.URI getRequestURI(){
    return (javax.sip.address.URI) null;
  }
  public static java.lang.String getCannonicalName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getMergeId(){
    return (java.lang.String) null;
  }
  public void setMessageChannel(@com.francetelecom.rd.stubs.annotation.FieldSet("messageChannel") java.lang.Object arg1){
  }
  public void setInviteTransaction(@com.francetelecom.rd.stubs.annotation.FieldSet("inviteTransaction") java.lang.Object arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("inviteTransaction")
  public java.lang.Object getInviteTransaction(){
    return (java.lang.Object) null;
  }
  public void setRequestURI(@com.francetelecom.rd.stubs.annotation.FieldSet("requestURI") javax.sip.address.URI arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("transaction")
  public java.lang.Object getTransaction(){
    return (java.lang.Object) null;
  }
  public final SIPRequest createErrorAck(gov.nist.javax.sip.header.To arg1) throws javax.sip.SipException, java.text.ParseException{
    return (SIPRequest) null;
  }
  public SIPRequest createCancelRequest() throws javax.sip.SipException{
    return (SIPRequest) null;
  }
  public SIPRequest createAckRequest(gov.nist.javax.sip.header.To arg1){
    return (SIPRequest) null;
  }
  public static boolean isTargetRefresh(java.lang.String arg1){
    return false;
  }
  public static boolean isDialogCreating(java.lang.String arg1){
    return false;
  }
  public void setRequestLine(@com.francetelecom.rd.stubs.annotation.FieldSet("requestLine") gov.nist.javax.sip.header.RequestLine arg1){
  }
  protected void setRequestLineDefaults(){
  }
  public SIPRequest createSIPRequest(gov.nist.javax.sip.header.RequestLine arg1, boolean arg2){
    return (SIPRequest) null;
  }
  public SIPRequest createBYERequest(boolean arg1){
    return (SIPRequest) null;
  }
  public SIPRequest createACKRequest(){
    return (SIPRequest) null;
  }
}
