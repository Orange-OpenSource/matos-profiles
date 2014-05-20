package gov.nist.javax.sip.clientauthutils;

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


public interface AuthenticationHelper
{
  // Methods

  public javax.sip.ClientTransaction handleChallenge(javax.sip.message.Response arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("clientTrasaction") javax.sip.ClientTransaction arg2, javax.sip.SipProvider arg3, int arg4) throws javax.sip.SipException, java.lang.NullPointerException;
  public void setAuthenticationHeaders(javax.sip.message.Request arg1);
  public void removeCachedAuthenticationHeaders(java.lang.String arg1);
}
