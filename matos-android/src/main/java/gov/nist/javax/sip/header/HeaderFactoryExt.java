package gov.nist.javax.sip.header;

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


public interface HeaderFactoryExt
  extends javax.sip.header.HeaderFactory
{
  // Methods

  public SipRequestLine createRequestLine(java.lang.String arg1) throws java.text.ParseException;
  public SipStatusLine createStatusLine(java.lang.String arg1) throws java.text.ParseException;
  public javax.sip.header.Header createHeader(java.lang.String arg1) throws java.text.ParseException;
  public gov.nist.javax.sip.header.extensions.ReferredByHeader createReferredByHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.extensions.ReplacesHeader createReplacesHeader(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.text.ParseException;
  public gov.nist.javax.sip.header.extensions.JoinHeader createJoinHeader(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.text.ParseException;
  public gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader createPAccessNetworkInfoHeader();
  public gov.nist.javax.sip.header.ims.PAssertedIdentityHeader createPAssertedIdentityHeader(javax.sip.address.Address arg1) throws java.lang.NullPointerException, java.text.ParseException;
  public gov.nist.javax.sip.header.ims.PAssociatedURIHeader createPAssociatedURIHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PCalledPartyIDHeader createPCalledPartyIDHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader();
  public gov.nist.javax.sip.header.ims.PChargingVectorHeader createChargingVectorHeader(java.lang.String arg1) throws java.text.ParseException;
  public gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader createPMediaAuthorizationHeader(java.lang.String arg1) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public gov.nist.javax.sip.header.ims.PPreferredIdentityHeader createPPreferredIdentityHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader createPVisitedNetworkIDHeader();
  public gov.nist.javax.sip.header.ims.PathHeader createPathHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PrivacyHeader createPrivacyHeader(java.lang.String arg1);
  public gov.nist.javax.sip.header.ims.ServiceRouteHeader createServiceRouteHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.SecurityServerHeader createSecurityServerHeader();
  public gov.nist.javax.sip.header.ims.SecurityClientHeader createSecurityClientHeader();
  public gov.nist.javax.sip.header.ims.SecurityVerifyHeader createSecurityVerifyHeader();
  public gov.nist.javax.sip.header.ims.PUserDatabaseHeader createPUserDatabaseHeader(java.lang.String arg1);
  public gov.nist.javax.sip.header.ims.PProfileKeyHeader createPProfileKeyHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PServedUserHeader createPServedUserHeader(javax.sip.address.Address arg1);
  public gov.nist.javax.sip.header.ims.PPreferredServiceHeader createPPreferredServiceHeader();
  public gov.nist.javax.sip.header.ims.PAssertedServiceHeader createPAssertedServiceHeader();
  public gov.nist.javax.sip.header.extensions.SessionExpiresHeader createSessionExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException;
}
