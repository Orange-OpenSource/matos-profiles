package gov.nist.javax.sip;

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


public class ListeningPointImpl
  implements ListeningPointExt, javax.sip.ListeningPoint
{
  // Fields

  protected java.lang.String transport;

  protected gov.nist.javax.sip.stack.MessageProcessor messageProcessor;

  protected SipProviderImpl sipProvider;

  protected SipStackImpl sipStack;

  // Constructors

  protected ListeningPointImpl(javax.sip.SipStack arg1, int arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.transport") java.lang.String arg3){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  protected java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sipProvider")
  public SipProviderImpl getProvider(){
    return (SipProviderImpl) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("transport")
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("messageProcessor")
  public gov.nist.javax.sip.stack.MessageProcessor getMessageProcessor(){
    return (gov.nist.javax.sip.stack.MessageProcessor) null;
  }
  public gov.nist.javax.sip.header.Via getViaHeader(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  public static java.lang.String makeKey(java.lang.String arg1, int arg2, java.lang.String arg3){
    return (java.lang.String) null;
  }
  public void setSentBy(@com.francetelecom.rd.stubs.annotation.FieldSet("sentBy") java.lang.String arg1) throws java.text.ParseException{
  }
  protected void setSipProvider(@com.francetelecom.rd.stubs.annotation.FieldSet("this.sipProvider") SipProviderImpl arg1){
  }
  protected void removeSipProvider(){
  }
  public java.lang.String getIPAddress(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sentBy")
  public java.lang.String getSentBy(){
    return (java.lang.String) null;
  }
  public boolean isSentBySet(){
    return false;
  }
  public javax.sip.header.ContactHeader createContactHeader(){
    return (javax.sip.header.ContactHeader) null;
  }
  public void sendHeartbeat(java.lang.String arg1, int arg2) throws java.io.IOException{
  }
  public javax.sip.header.ViaHeader createViaHeader(){
    return (javax.sip.header.ViaHeader) null;
  }
}
