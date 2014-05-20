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


public class TCPMessageProcessor
  extends MessageProcessor{
  // Fields

  protected int nConnections;

  protected int useCount;

  // Constructors

  protected TCPMessageProcessor(java.net.InetAddress arg1, SIPTransactionStack arg2, int arg3){
    super((java.lang.String) null);
  }
  // Methods

  public void run(){
  }
  protected synchronized void remove(TCPMessageChannel arg1){
  }
  public void start() throws java.io.IOException{
  }
  public synchronized void stop(){
  }
  public SIPTransactionStack getSIPStack(){
    return (SIPTransactionStack) null;
  }
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public boolean isSecure(){
    return false;
  }
  public synchronized MessageChannel createMessageChannel(gov.nist.core.HostPort arg1) throws java.io.IOException{
    return (MessageChannel) null;
  }
  public synchronized MessageChannel createMessageChannel(java.net.InetAddress arg1, int arg2) throws java.io.IOException{
    return (MessageChannel) null;
  }
  protected synchronized void cacheMessageChannel(TCPMessageChannel arg1){
  }
  public boolean inUse(){
    return false;
  }
  public int getMaximumMessageSize(){
    return 0;
  }
  public int getDefaultTargetPort(){
    return 0;
  }
}
