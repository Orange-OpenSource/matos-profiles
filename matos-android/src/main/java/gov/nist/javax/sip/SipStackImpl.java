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


public class SipStackImpl
  extends gov.nist.javax.sip.stack.SIPTransactionStack  implements SipStackExt, javax.sip.SipStack
{
  // Fields

  public static final java.lang.Integer MAX_DATAGRAM_SIZE = null;

  // Constructors

  protected SipStackImpl(){
    super();
  }
  public SipStackImpl(java.util.Properties arg1) throws javax.sip.PeerUnavailableException{
    super();
  }
  // Methods

  protected void finalize(){
  }
  public void start() throws javax.sip.ProviderDoesNotExistException, javax.sip.SipException{
  }
  public void stop(){
  }
  public java.lang.String getIPAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getEnabledCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledProtocols(){
    return (java.lang.String []) null;
  }
  public void setEnabledCipherSuites(java.lang.String [] arg1){
  }
  public void setEnabledProtocols(java.lang.String [] arg1){
  }
  public void releaseSem(){
  }
  public javax.sip.SipListener getSipListener(){
    return (javax.sip.SipListener) null;
  }
  public synchronized javax.sip.ListeningPoint createListeningPoint(java.lang.String arg1, int arg2, java.lang.String arg3) throws javax.sip.TransportNotSupportedException, javax.sip.InvalidArgumentException{
    return (javax.sip.ListeningPoint) null;
  }
  public javax.sip.ListeningPoint createListeningPoint(int arg1, java.lang.String arg2) throws javax.sip.TransportNotSupportedException, javax.sip.InvalidArgumentException{
    return (javax.sip.ListeningPoint) null;
  }
  public javax.sip.SipProvider createSipProvider(@com.francetelecom.rd.stubs.annotation.CallBackRegister("listeningPoing") javax.sip.ListeningPoint arg1) throws javax.sip.ObjectInUseException{
    return (javax.sip.SipProvider) null;
  }
  public void deleteListeningPoint(javax.sip.ListeningPoint arg1) throws javax.sip.ObjectInUseException{
  }
  public void deleteSipProvider(javax.sip.SipProvider arg1) throws javax.sip.ObjectInUseException{
  }
  public java.util.Iterator getListeningPoints(){
    return (java.util.Iterator) null;
  }
  public boolean isRetransmissionFilterActive(){
    return false;
  }
  public java.util.Iterator<SipProviderImpl> getSipProviders(){
    return (java.util.Iterator) null;
  }
  public java.lang.String getStackName(){
    return (java.lang.String) null;
  }
  public LogRecordFactory getLogRecordFactory(){
    return (LogRecordFactory) null;
  }
  public gov.nist.javax.sip.clientauthutils.AuthenticationHelper getAuthenticationHelper(gov.nist.javax.sip.clientauthutils.AccountManager arg1, javax.sip.header.HeaderFactory arg2){
    return (gov.nist.javax.sip.clientauthutils.AuthenticationHelper) null;
  }
  public gov.nist.javax.sip.clientauthutils.AuthenticationHelper getSecureAuthenticationHelper(gov.nist.javax.sip.clientauthutils.SecureAccountManager arg1, javax.sip.header.HeaderFactory arg2){
    return (gov.nist.javax.sip.clientauthutils.AuthenticationHelper) null;
  }
  public void setIsBackToBackUserAgent(boolean arg1){
  }
  public boolean isBackToBackUserAgent(){
    return false;
  }
  public boolean isAutomaticDialogErrorHandlingEnabled(){
    return false;
  }
  public boolean acquireSem(){
    return false;
  }
}
