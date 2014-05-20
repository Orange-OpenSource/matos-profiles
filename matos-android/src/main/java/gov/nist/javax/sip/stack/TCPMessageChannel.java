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


public class TCPMessageChannel
  extends MessageChannel  implements gov.nist.javax.sip.parser.SIPMessageListener, RawMessageChannel, java.lang.Runnable
{
  // Fields

  protected java.io.InputStream myClientInputStream;

  protected java.io.OutputStream myClientOutputStream;

  protected java.lang.String key;

  protected boolean isCached;

  protected boolean isRunning;

  protected SIPTransactionStack sipStack;

  protected java.lang.String myAddress;

  protected int myPort;

  protected java.net.InetAddress peerAddress;

  protected int peerPort;

  protected java.lang.String peerProtocol;

  // Constructors

  protected TCPMessageChannel(SIPTransactionStack arg1){
    super();
  }
  protected TCPMessageChannel(java.net.Socket arg1, SIPTransactionStack arg2, TCPMessageProcessor arg3) throws java.io.IOException{
    super();
  }
  protected TCPMessageChannel(java.net.InetAddress arg1, int arg2, SIPTransactionStack arg3, TCPMessageProcessor arg4) throws java.io.IOException{
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
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException{
  }
  public void sendMessage(byte [] arg1, java.net.InetAddress arg2, int arg3, boolean arg4) throws java.io.IOException{
  }
  public SIPTransactionStack getSIPStack(){
    return (SIPTransactionStack) null;
  }
  public boolean isReliable(){
    return false;
  }
  public void processMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.lang.Exception{
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
  protected void uncache(){
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
}
