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


public final class SIPResponse
  extends SIPMessage  implements ResponseExt, javax.sip.message.Response
{
  // Fields

  protected gov.nist.javax.sip.header.StatusLine statusLine;

  // Constructors

  public SIPResponse(){
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
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public java.lang.String debugDump(){
    return (java.lang.String) null;
  }
  public SIPRequest createRequest(gov.nist.javax.sip.address.SipUri arg1, gov.nist.javax.sip.header.Via arg2, gov.nist.javax.sip.header.CSeq arg3, gov.nist.javax.sip.header.From arg4, gov.nist.javax.sip.header.To arg5){
    return (SIPRequest) null;
  }
  public java.lang.String getFirstLine(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("SIPVersion")
  public java.lang.String getSIPVersion(){
    return (java.lang.String) null;
  }
  public void setSIPVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("SIPVersion") java.lang.String arg1){
  }
  public gov.nist.javax.sip.header.StatusLine getStatusLine(){
    return (gov.nist.javax.sip.header.StatusLine) null;
  }
  public void setStatusLine(gov.nist.javax.sip.header.StatusLine arg1){
  }
  public void setStatusCode(int arg1) throws java.text.ParseException{
  }
  public void setReasonPhrase(@com.francetelecom.rd.stubs.annotation.FieldSet("reasonPhrase") java.lang.String arg1){
  }
  public int getStatusCode(){
    return 0;
  }
  public static java.lang.String getReasonPhrase(int arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("reasonPhrase")
  public java.lang.String getReasonPhrase(){
    return (java.lang.String) null;
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
  public static boolean isFinalResponse(int arg1){
    return false;
  }
  public boolean isFinalResponse(){
    return false;
  }
  public java.lang.String encodeMessage(){
    return (java.lang.String) null;
  }
  public java.util.LinkedList getMessageAsEncodedStrings(){
    return (java.util.LinkedList) null;
  }
}
