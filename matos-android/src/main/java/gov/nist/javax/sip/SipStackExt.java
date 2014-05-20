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


public interface SipStackExt
  extends javax.sip.SipStack
{
  // Methods

  public void setEnabledCipherSuites(java.lang.String [] arg1);
  public gov.nist.javax.sip.clientauthutils.AuthenticationHelper getAuthenticationHelper(gov.nist.javax.sip.clientauthutils.AccountManager arg1, javax.sip.header.HeaderFactory arg2);
  public gov.nist.javax.sip.clientauthutils.AuthenticationHelper getSecureAuthenticationHelper(gov.nist.javax.sip.clientauthutils.SecureAccountManager arg1, javax.sip.header.HeaderFactory arg2);
  public java.util.Collection<javax.sip.Dialog> getDialogs();
  public javax.sip.Dialog getReplacesDialog(gov.nist.javax.sip.header.extensions.ReplacesHeader arg1);
  public void setAddressResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveAddress") gov.nist.core.net.AddressResolver arg1);
  public javax.sip.Dialog getJoinDialog(gov.nist.javax.sip.header.extensions.JoinHeader arg1);
  public java.net.SocketAddress obtainLocalAddress(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException;
}
