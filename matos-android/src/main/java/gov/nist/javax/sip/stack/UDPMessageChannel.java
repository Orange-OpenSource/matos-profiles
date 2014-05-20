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


public class UDPMessageChannel
  extends MessageChannel  implements gov.nist.javax.sip.parser.ParseExceptionListener, RawMessageChannel, java.lang.Runnable
{
  // Fields

  protected SIPTransactionStack sipStack;

  protected gov.nist.javax.sip.parser.StringMsgParser myParser;

  protected int myPort;

  // Constructors

  protected UDPMessageChannel(SIPTransactionStack arg1, UDPMessageProcessor arg2){
    super();
  }
  protected UDPMessageChannel(SIPTransactionStack arg1, UDPMessageProcessor arg2, java.net.DatagramPacket arg3){
    super();
  }
  protected UDPMessageChannel(java.net.InetAddress arg1, int arg2, SIPTransactionStack arg3, UDPMessageProcessor arg4){
    super();
  }
  // Methods

  public void run(){
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public void close(){
  }
  public void handleException(java.text.ParseException arg1, gov.nist.javax.sip.message.SIPMessage arg2, java.lang.Class arg3, java.lang.String arg4, java.lang.String arg5) throws java.text.ParseException{
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException{
  }
  protected void sendMessage(byte [] arg1, java.net.InetAddress arg2, int arg3, boolean arg4) throws java.io.IOException{
  }
  protected void sendMessage(byte [] arg1, java.net.InetAddress arg2, int arg3, java.lang.String arg4, boolean arg5) throws java.io.IOException{
  }
  public SIPTransactionStack getSIPStack(){
    return (SIPTransactionStack) null;
  }
  public boolean isReliable(){
    return false;
  }
  public void processMessage(gov.nist.javax.sip.message.SIPMessage arg1){
  }
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public java.lang.String getPeerAddress(){
    return (java.lang.String) null;
  }
  protected java.net.InetAddress getPeerInetAddress(){
    return (java.net.InetAddress) null;
  }
  public java.lang.String getPeerProtocol(){
    return (java.lang.String) null;
  }
  public java.lang.String getViaHost(){
    return (java.lang.String) null;
  }
  public int getViaPort(){
    return 0;
  }
  public int getPeerPort(){
    return 0;
  }
  public int getPeerPacketSourcePort(){
    return 0;
  }
  public java.net.InetAddress getPeerPacketSourceAddress(){
    return (java.net.InetAddress) null;
  }
  public boolean isSecure(){
    return false;
  }
  public java.lang.String getPeerName(){
    return (java.lang.String) null;
  }
}
