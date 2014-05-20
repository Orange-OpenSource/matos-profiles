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


public class ServerLog
  implements gov.nist.core.ServerLogger
{
  // Fields

  protected gov.nist.core.StackLogger stackLogger;

  protected int traceLevel;

  // Constructors

  public ServerLog(){
  }
  // Methods

  public void setLevel(int arg1){
  }
  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, long arg5){
  }
  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, long arg6){
  }
  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5){
  }
  public boolean needsLogging(){
    return false;
  }
  public void logException(java.lang.Exception arg1){
  }
  public void setStackProperties(java.util.Properties arg1){
  }
  public void setSipStack(javax.sip.SipStack arg1){
  }
  public synchronized void closeLogFile(){
  }
  public void setStackIpAddress(java.lang.String arg1){
  }
  public void checkLogFile(){
  }
  public void setLogFileName(@com.francetelecom.rd.stubs.annotation.FieldSet("logFileName") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("logFileName")
  public java.lang.String getLogFileName(){
    return (java.lang.String) null;
  }
  public void setTraceLevel(int arg1){
  }
  public int getTraceLevel(){
    return 0;
  }
  public void setAuxInfo(java.lang.String arg1){
  }
}
