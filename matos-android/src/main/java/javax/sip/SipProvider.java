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


public interface SipProvider
{
  // Methods

  public ListeningPoint [] getListeningPoints();
  public boolean isAutomaticDialogSupportEnabled();
  public void sendRequest(javax.sip.message.Request arg1) throws SipException;
  public void sendResponse(javax.sip.message.Response arg1) throws SipException;
  public ClientTransaction getNewClientTransaction(javax.sip.message.Request arg1) throws TransactionUnavailableException;
  public void setListeningPoint(ListeningPoint arg1) throws ObjectInUseException;
  public void removeListeningPoints();
  public ListeningPoint getListeningPoint();
  public ListeningPoint getListeningPoint(java.lang.String arg1);
  public void addSipListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("sipListener") SipListener arg1) throws java.util.TooManyListenersException;
  public javax.sip.header.CallIdHeader getNewCallId();
  public ServerTransaction getNewServerTransaction(javax.sip.message.Request arg1) throws TransactionAlreadyExistsException, TransactionUnavailableException;
  public SipStack getSipStack();
  public void removeSipListener(SipListener arg1);
  public Dialog getNewDialog(Transaction arg1) throws SipException;
  public void addListeningPoint(@com.francetelecom.rd.stubs.annotation.CallBackRegister("listeningPoing") ListeningPoint arg1) throws ObjectInUseException;
  public void removeListeningPoint(ListeningPoint arg1) throws ObjectInUseException;
  public void setAutomaticDialogSupportEnabled(boolean arg1);
}
