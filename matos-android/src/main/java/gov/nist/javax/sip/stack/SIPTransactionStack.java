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


public abstract class SIPTransactionStack
  implements SIPDialogEventListener, SIPTransactionEventListener
{
  // Fields

  public static final int BASE_TIMER_INTERVAL = 500;

  public static final int CONNECTION_LINGER_TIME = 8;

  protected java.util.concurrent.ConcurrentHashMap<java.lang.String, SIPServerTransaction> retransmissionAlertTransactions;

  protected java.util.concurrent.ConcurrentHashMap<java.lang.String, SIPDialog> earlyDialogTable;

  protected java.util.concurrent.ConcurrentHashMap<java.lang.String, SIPDialog> dialogTable;

  protected static final java.util.Set<java.lang.String> dialogCreatingMethods = null;

  protected boolean unlimitedServerTransactionTableSize;

  protected boolean unlimitedClientTransactionTableSize;

  protected int serverTransactionTableHighwaterMark;

  protected int serverTransactionTableLowaterMark;

  protected int clientTransactionTableHiwaterMark;

  protected int clientTransactionTableLowaterMark;

  protected gov.nist.core.ServerLogger serverLogger;

  protected DefaultRouter defaultRouter;

  protected boolean needsLogging;

  protected boolean toExit;

  protected java.lang.String stackName;

  protected java.lang.String stackAddress;

  protected java.net.InetAddress stackInetAddress;

  protected StackMessageFactory sipMessageFactory;

  protected javax.sip.address.Router router;

  protected int threadPoolSize;

  protected int maxConnections;

  protected boolean cacheServerConnections;

  protected boolean cacheClientConnections;

  protected boolean useRouterForAll;

  protected int maxContentLength;

  protected int maxMessageSize;

  protected int readTimeout;

  protected gov.nist.core.net.NetworkLayer networkLayer;

  protected java.lang.String outboundProxy;

  protected java.lang.String routerPath;

  protected boolean isAutomaticDialogSupportEnabled;

  protected java.util.HashSet<java.lang.String> forkedEvents;

  protected boolean generateTimeStampHeader;

  protected gov.nist.core.net.AddressResolver addressResolver;

  protected int maxListenerResponseTime;

  protected boolean rfc2543Supported;

  protected gov.nist.core.ThreadAuditor threadAuditor;

  protected gov.nist.javax.sip.LogRecordFactory logRecordFactory;

  protected boolean cancelClientTransactionChecked;

  protected boolean remoteTagReassignmentAllowed;

  protected boolean logStackTraceOnMessageSend;

  protected int receiveUdpBufferSize;

  protected int sendUdpBufferSize;

  protected boolean stackDoesCongestionControl;

  protected boolean isBackToBackUserAgent;

  protected boolean checkBranchId;

  protected boolean isAutomaticDialogErrorHandlingEnabled;

  protected boolean isDialogTerminatedEventDeliveredForNullDialog;

  protected int maxForkTime;

  // Constructors

  protected SIPTransactionStack(){
  }
  protected SIPTransactionStack(StackMessageFactory arg1){
  }
  // Methods

  public boolean isAlive(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("hostAddress")
  public java.lang.String getHostAddress(){
    return (java.lang.String) null;
  }
  public void removeDialog(SIPDialog arg1){
  }
  public void removeDialog(java.lang.String arg1){
  }
  public synchronized void dialogErrorEvent(SIPDialogErrorEvent arg1){
  }
  public ServerRequestInterface newSIPServerRequest(gov.nist.javax.sip.message.SIPRequest arg1, MessageChannel arg2){
    return (ServerRequestInterface) null;
  }
  public ServerResponseInterface newSIPServerResponse(gov.nist.javax.sip.message.SIPResponse arg1, MessageChannel arg2){
    return (ServerResponseInterface) null;
  }
  public SIPDialog getDialog(java.lang.String arg1){
    return (SIPDialog) null;
  }
  protected void setHostAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("hostAddress") java.lang.String arg1) throws java.net.UnknownHostException{
  }
  public javax.sip.address.Router getRouter(gov.nist.javax.sip.message.SIPRequest arg1){
    return (javax.sip.address.Router) null;
  }
  public javax.sip.address.Router getRouter(){
    return (javax.sip.address.Router) null;
  }
  public java.util.Collection<javax.sip.Dialog> getDialogs(){
    return (java.util.Collection) null;
  }
  public java.util.Collection<javax.sip.Dialog> getDialogs(javax.sip.DialogState arg1){
    return (java.util.Collection) null;
  }
  public javax.sip.Dialog getReplacesDialog(gov.nist.javax.sip.header.extensions.ReplacesHeader arg1){
    return (javax.sip.Dialog) null;
  }
  public void setAddressResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveAddress") gov.nist.core.net.AddressResolver arg1){
  }
  public javax.sip.Dialog getJoinDialog(gov.nist.javax.sip.header.extensions.JoinHeader arg1){
    return (javax.sip.Dialog) null;
  }
  public java.net.SocketAddress obtainLocalAddress(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException{
    return (java.net.SocketAddress) null;
  }
  public boolean checkBranchId(){
    return false;
  }
  public boolean isLoggingEnabled(){
    return false;
  }
  public gov.nist.core.StackLogger getStackLogger(){
    return (gov.nist.core.StackLogger) null;
  }
  public void removeTransaction(SIPTransaction arg1){
  }
  public SIPDialog createDialog(SIPTransaction arg1){
    return (SIPDialog) null;
  }
  public SIPDialog createDialog(SIPClientTransaction arg1, gov.nist.javax.sip.message.SIPResponse arg2){
    return (SIPDialog) null;
  }
  public SIPDialog createDialog(gov.nist.javax.sip.SipProviderImpl arg1, gov.nist.javax.sip.message.SIPResponse arg2){
    return (SIPDialog) null;
  }
  public java.util.Timer getTimer(){
    return (java.util.Timer) null;
  }
  public int getMaxMessageSize(){
    return 0;
  }
  protected MessageProcessor [] getMessageProcessors(){
    return (MessageProcessor []) null;
  }
  public MessageChannel createMessageChannel(gov.nist.javax.sip.message.SIPRequest arg1, MessageProcessor arg2, javax.sip.address.Hop arg3) throws java.io.IOException{
    return (MessageChannel) null;
  }
  public SIPTransaction findTransaction(gov.nist.javax.sip.message.SIPMessage arg1, boolean arg2){
    return (SIPTransaction) null;
  }
  public boolean isNon2XXAckPassedToListener(){
    return false;
  }
  public SIPServerTransaction findPendingTransaction(gov.nist.javax.sip.message.SIPRequest arg1){
    return (SIPServerTransaction) null;
  }
  public void putPendingTransaction(SIPServerTransaction arg1){
  }
  public void removePendingTransaction(SIPServerTransaction arg1){
  }
  public gov.nist.core.ThreadAuditor getThreadAuditor(){
    return (gov.nist.core.ThreadAuditor) null;
  }
  public javax.sip.address.Hop getNextHop(gov.nist.javax.sip.message.SIPRequest arg1) throws javax.sip.SipException{
    return (javax.sip.address.Hop) null;
  }
  protected void setMessageFactory(StackMessageFactory arg1){
  }
  protected void reInit(){
  }
  public void setStackName(java.lang.String arg1){
  }
  public void setStackLogger(gov.nist.core.StackLogger arg1){
  }
  protected void setRouter(javax.sip.address.Router arg1){
  }
  public void addExtensionMethod(java.lang.String arg1){
  }
  public void setNon2XXAckPassedToListener(boolean arg1){
  }
  public void setReceiveUdpBufferSize(int arg1){
  }
  public void setSendUdpBufferSize(int arg1){
  }
  protected MessageProcessor createMessageProcessor(java.net.InetAddress arg1, int arg2, java.lang.String arg3) throws java.io.IOException{
    return (MessageProcessor) null;
  }
  protected void removeMessageProcessor(MessageProcessor arg1){
  }
  public void stopStack(){
  }
  public void disableLogging(){
  }
  public void enableLogging(){
  }
  public void printDialogTable(){
  }
  public SIPServerTransaction getRetransmissionAlertTransaction(java.lang.String arg1){
    return (SIPServerTransaction) null;
  }
  public static boolean isDialogCreated(java.lang.String arg1){
    return false;
  }
  public void putDialog(SIPDialog arg1){
  }
  public SIPClientTransaction findSubscribeTransaction(gov.nist.javax.sip.message.SIPRequest arg1, gov.nist.javax.sip.ListeningPointImpl arg2){
    return (SIPClientTransaction) null;
  }
  public void addTransactionPendingAck(SIPServerTransaction arg1){
  }
  public SIPServerTransaction findTransactionPendingAck(gov.nist.javax.sip.message.SIPRequest arg1){
    return (SIPServerTransaction) null;
  }
  public boolean removeTransactionPendingAck(SIPServerTransaction arg1){
    return false;
  }
  public boolean isTransactionPendingAck(SIPServerTransaction arg1){
    return false;
  }
  public SIPTransaction findCancelTransaction(gov.nist.javax.sip.message.SIPRequest arg1, boolean arg2){
    return (SIPTransaction) null;
  }
  public SIPServerTransaction findMergedTransaction(gov.nist.javax.sip.message.SIPRequest arg1){
    return (SIPServerTransaction) null;
  }
  public void removeFromMergeTable(SIPServerTransaction arg1){
  }
  public void putInMergeTable(SIPServerTransaction arg1, gov.nist.javax.sip.message.SIPRequest arg2){
  }
  public void mapTransaction(SIPServerTransaction arg1){
  }
  public SIPClientTransaction createClientTransaction(gov.nist.javax.sip.message.SIPRequest arg1, MessageChannel arg2){
    return (SIPClientTransaction) null;
  }
  public SIPServerTransaction createServerTransaction(MessageChannel arg1){
    return (SIPServerTransaction) null;
  }
  public int getClientTransactionTableSize(){
    return 0;
  }
  public int getServerTransactionTableSize(){
    return 0;
  }
  public void addTransaction(SIPClientTransaction arg1){
  }
  public void addTransaction(SIPServerTransaction arg1) throws java.io.IOException{
  }
  protected void decrementActiveClientTransactionCount(){
  }
  protected void removeTransactionHash(SIPTransaction arg1){
  }
  public synchronized void transactionErrorEvent(SIPTransactionErrorEvent arg1){
  }
  public gov.nist.core.net.NetworkLayer getNetworkLayer(){
    return (gov.nist.core.net.NetworkLayer) null;
  }
  public gov.nist.core.ServerLogger getServerLogger(){
    return (gov.nist.core.ServerLogger) null;
  }
  public void setSingleThreaded(){
  }
  public void setThreadPoolSize(int arg1){
  }
  public void setMaxConnections(int arg1){
  }
  protected void addMessageProcessor(MessageProcessor arg1) throws java.io.IOException{
  }
  public MessageChannel createRawMessageChannel(java.lang.String arg1, int arg2, javax.sip.address.Hop arg3) throws java.net.UnknownHostException{
    return (MessageChannel) null;
  }
  public boolean isEventForked(java.lang.String arg1){
    return false;
  }
  public gov.nist.core.net.AddressResolver getAddressResolver(){
    return (gov.nist.core.net.AddressResolver) null;
  }
  public void setLogRecordFactory(gov.nist.javax.sip.LogRecordFactory arg1){
  }
  public java.lang.String auditStack(java.util.Set arg1, long arg2, long arg3){
    return (java.lang.String) null;
  }
  public int getActiveClientTransactionCount(){
    return 0;
  }
  public boolean isRfc2543Supported(){
    return false;
  }
  public boolean isCancelClientTransactionChecked(){
    return false;
  }
  public boolean isRemoteTagReassignmentAllowed(){
    return false;
  }
  public void setTimer(java.util.Timer arg1){
  }
  public int getReceiveUdpBufferSize(){
    return 0;
  }
  public int getSendUdpBufferSize(){
    return 0;
  }
  public void setLogStackTraceOnMessageSend(boolean arg1){
  }
  public boolean isLogStackTraceOnMessageSend(){
    return false;
  }
  public void setDeliverDialogTerminatedEventForNullDialog(){
  }
  public void addForkedClientTransaction(SIPClientTransaction arg1){
  }
  public SIPClientTransaction getForkedTransaction(java.lang.String arg1){
    return (SIPClientTransaction) null;
  }
}
