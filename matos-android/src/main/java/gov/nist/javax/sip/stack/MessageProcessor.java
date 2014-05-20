package gov.nist.javax.sip.stack;

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


public abstract class MessageProcessor
  implements java.lang.Runnable
{
  // Fields

  protected static final java.lang.String IN_ADDR_ANY = (java.lang.String) null;

  protected static final java.lang.String IN6_ADDR_ANY = (java.lang.String) null;

  protected java.lang.String transport;

  protected SIPTransactionStack sipStack;

  // Constructors

  protected MessageProcessor(java.lang.String arg1){
  }
  protected MessageProcessor(java.net.InetAddress arg1, int arg2, java.lang.String arg3, SIPTransactionStack arg4){
  }
  // Methods

  public abstract void run();
  public abstract void start() throws java.io.IOException;
  public abstract void stop();
  public final void initialize(java.net.InetAddress arg1, int arg2, SIPTransactionStack arg3){
  }
  public static int getDefaultPort(java.lang.String arg1){
    return 0;
  }
  public int getPort(){
    return 0;
  }
  public abstract SIPTransactionStack getSIPStack();
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public abstract boolean isSecure();
  public gov.nist.javax.sip.header.Via getViaHeader(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  public void setSentBy(@com.francetelecom.rd.stubs.annotation.FieldSet("sentBy") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sentBy")
  public java.lang.String getSentBy(){
    return (java.lang.String) null;
  }
  public boolean isSentBySet(){
    return false;
  }
  public java.net.InetAddress getIpAddress(){
    return (java.net.InetAddress) null;
  }
  public abstract MessageChannel createMessageChannel(gov.nist.core.HostPort arg1) throws java.io.IOException;
  public abstract MessageChannel createMessageChannel(java.net.InetAddress arg1, int arg2) throws java.io.IOException;
  public void setListeningPoint(gov.nist.javax.sip.ListeningPointImpl arg1){
  }
  public gov.nist.javax.sip.ListeningPointImpl getListeningPoint(){
    return (gov.nist.javax.sip.ListeningPointImpl) null;
  }
  public abstract boolean inUse();
  public abstract int getMaximumMessageSize();
  public abstract int getDefaultTargetPort();
  public java.lang.String getSavedIpAddress(){
    return (java.lang.String) null;
  }
  protected void setIpAddress(java.net.InetAddress arg1){
  }
}
