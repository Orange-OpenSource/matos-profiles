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


public interface Dialog
  extends java.io.Serializable
{
  // Methods

  public DialogState getState();
  public void delete();
  public boolean isSecure();
  public javax.sip.message.Request createRequest(java.lang.String arg1) throws SipException;
  public void setApplicationData(java.lang.Object arg1);
  public java.lang.Object getApplicationData();
  public java.lang.String getDialogId();
  public javax.sip.header.CallIdHeader getCallId();
  public SipProvider getSipProvider();
  public void sendRequest(@com.francetelecom.rd.stubs.annotation.CallBackRegister("clientTrasaction") ClientTransaction arg1) throws TransactionDoesNotExistException, SipException;
  public javax.sip.message.Request createAck(long arg1) throws InvalidArgumentException, SipException;
  public void sendReliableProvisionalResponse(javax.sip.message.Response arg1) throws SipException;
  public boolean isServer();
  public Transaction getFirstTransaction();
  public long getRemoteSeqNumber();
  public void sendAck(javax.sip.message.Request arg1) throws SipException;
  public java.lang.String getRemoteTag();
  public java.lang.String getLocalTag();
  public void terminateOnBye(boolean arg1) throws SipException;
  public java.util.Iterator getRouteSet();
  public void incrementLocalSequenceNumber();
  public int getRemoteSequenceNumber();
  public int getLocalSequenceNumber();
  public long getLocalSeqNumber();
  public javax.sip.address.Address getLocalParty();
  public javax.sip.address.Address getRemoteParty();
  public javax.sip.address.Address getRemoteTarget();
  public javax.sip.message.Request createPrack(javax.sip.message.Response arg1) throws DialogDoesNotExistException, SipException;
  public javax.sip.message.Response createReliableProvisionalResponse(int arg1) throws InvalidArgumentException, SipException;
  public void setBackToBackUserAgent();
}
