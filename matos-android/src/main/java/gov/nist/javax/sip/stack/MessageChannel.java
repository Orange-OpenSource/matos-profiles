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


public abstract class MessageChannel
{
  // Fields

  protected int useCount;

  protected MessageProcessor messageProcessor;

  // Constructors

  public MessageChannel(){
  }
  // Methods

  public abstract java.lang.String getKey();
  public static java.lang.String getKey(java.net.InetAddress arg1, int arg2, java.lang.String arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String getKey(gov.nist.core.HostPort arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public abstract void close();
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public abstract void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException;
  protected abstract void sendMessage(byte [] arg1, java.net.InetAddress arg2, int arg3, boolean arg4) throws java.io.IOException;
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1, javax.sip.address.Hop arg2) throws java.io.IOException{
  }
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.net.InetAddress arg2, int arg3) throws java.io.IOException{
  }
  public abstract SIPTransactionStack getSIPStack();
  public abstract boolean isReliable();
  public abstract java.lang.String getTransport();
  public abstract java.lang.String getPeerAddress();
  protected abstract java.net.InetAddress getPeerInetAddress();
  protected abstract java.lang.String getPeerProtocol();
  protected void uncache(){
  }
  public abstract java.lang.String getViaHost();
  public abstract int getViaPort();
  public abstract int getPeerPort();
  public abstract int getPeerPacketSourcePort();
  public abstract java.net.InetAddress getPeerPacketSourceAddress();
  public abstract boolean isSecure();
  protected void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.net.InetAddress arg2, int arg3, long arg4){
  }
  protected final java.lang.String createBadReqRes(java.lang.String arg1, java.text.ParseException arg2){
    return (java.lang.String) null;
  }
  public gov.nist.core.HostPort getPeerHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public MessageProcessor getMessageProcessor(){
    return (MessageProcessor) null;
  }
  public java.lang.String getRawIpSourceAddress(){
    return (java.lang.String) null;
  }
  public gov.nist.core.HostPort getHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public gov.nist.javax.sip.header.Via getViaHeader(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  public gov.nist.core.HostPort getViaHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public void logResponse(gov.nist.javax.sip.message.SIPResponse arg1, long arg2, java.lang.String arg3){
  }
}
