package javax.sip;

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


public class SipFactory
{
  // Constructors

  private SipFactory(){
  }
  // Methods

  public static synchronized SipFactory getInstance(){
    return (SipFactory) null;
  }
  public synchronized void resetFactory(){
  }
  public synchronized SipStack createSipStack(java.util.Properties arg1) throws PeerUnavailableException{
    return (SipStack) null;
  }
  public javax.sip.address.AddressFactory createAddressFactory() throws PeerUnavailableException{
    return (javax.sip.address.AddressFactory) null;
  }
  public javax.sip.header.HeaderFactory createHeaderFactory() throws PeerUnavailableException{
    return (javax.sip.header.HeaderFactory) null;
  }
  public javax.sip.message.MessageFactory createMessageFactory() throws PeerUnavailableException{
    return (javax.sip.message.MessageFactory) null;
  }
}
