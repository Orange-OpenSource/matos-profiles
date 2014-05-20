package com.android.server.sip;

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


public final class SipService
  extends android.net.sip.ISipService.Stub{
  // Constructors

  private SipService(android.content.Context arg1){
    super();
  }
  // Methods

  public static void start(android.content.Context arg1){
  }
  public synchronized void close(java.lang.String arg1){
  }
  public synchronized boolean isRegistered(java.lang.String arg1){
    return false;
  }
  public synchronized void open(android.net.sip.SipProfile arg1){
  }
  public synchronized android.net.sip.ISipSession createSession(android.net.sip.SipProfile arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") android.net.sip.ISipSessionListener arg2){
    return (android.net.sip.ISipSession) null;
  }
  public synchronized void open3(android.net.sip.SipProfile arg1, android.app.PendingIntent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") android.net.sip.ISipSessionListener arg3){
  }
  public synchronized boolean isOpened(java.lang.String arg1){
    return false;
  }
  public synchronized void setRegistrationListener(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") android.net.sip.ISipSessionListener arg2){
  }
  public synchronized android.net.sip.ISipSession getPendingSession(java.lang.String arg1){
    return (android.net.sip.ISipSession) null;
  }
  public synchronized android.net.sip.SipProfile [] getListOfProfiles(){
    return (android.net.sip.SipProfile []) null;
  }
}
