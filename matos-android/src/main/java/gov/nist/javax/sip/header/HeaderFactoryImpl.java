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


public class HeaderFactoryImpl
  implements javax.sip.header.HeaderFactory, HeaderFactoryExt
{
  // Constructors

  public HeaderFactoryImpl(){
  }
  // Methods

  public SipRequestLine createRequestLine(java.lang.String arg1) throws java.text.ParseException{
    return (SipRequestLine) null;
  }
  public SipStatusLine createStatusLine(java.lang.String arg1) throws java.text.ParseException{
    return (SipStatusLine) null;
  }
  public javax.sip.header.ContactHeader createContactHeader(javax.sip.address.Address arg1){
    return (javax.sip.header.ContactHeader) null;
  }
  public javax.sip.header.ContactHeader createContactHeader(){
    return (javax.sip.header.ContactHeader) null;
  }
  public javax.sip.header.ViaHeader createViaHeader(java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws java.text.ParseException, javax.sip.InvalidArgumentException{
    return (javax.sip.header.ViaHeader) null;
  }
  public javax.sip.header.Header createHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.Header) null;
  }
  public javax.sip.header.Header createHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.Header) null;
  }
  public javax.sip.header.ProxyAuthorizationHeader createProxyAuthorizationHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.ProxyAuthorizationHeader) null;
  }
  public javax.sip.header.AuthorizationHeader createAuthorizationHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.AuthorizationHeader) null;
  }
  public void setPrettyEncoding(boolean arg1){
  }
  public javax.sip.header.AcceptEncodingHeader createAcceptEncodingHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.AcceptEncodingHeader) null;
  }
  public javax.sip.header.AcceptHeader createAcceptHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.AcceptHeader) null;
  }
  public javax.sip.header.AcceptLanguageHeader createAcceptLanguageHeader(java.util.Locale arg1){
    return (javax.sip.header.AcceptLanguageHeader) null;
  }
  public javax.sip.header.AlertInfoHeader createAlertInfoHeader(javax.sip.address.URI arg1){
    return (javax.sip.header.AlertInfoHeader) null;
  }
  public javax.sip.header.AllowEventsHeader createAllowEventsHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.AllowEventsHeader) null;
  }
  public javax.sip.header.AllowHeader createAllowHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.AllowHeader) null;
  }
  public javax.sip.header.AuthenticationInfoHeader createAuthenticationInfoHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.AuthenticationInfoHeader) null;
  }
  public javax.sip.header.CSeqHeader createCSeqHeader(long arg1, java.lang.String arg2) throws java.text.ParseException, javax.sip.InvalidArgumentException{
    return (javax.sip.header.CSeqHeader) null;
  }
  public javax.sip.header.CSeqHeader createCSeqHeader(int arg1, java.lang.String arg2) throws java.text.ParseException, javax.sip.InvalidArgumentException{
    return (javax.sip.header.CSeqHeader) null;
  }
  public javax.sip.header.CallIdHeader createCallIdHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.CallIdHeader) null;
  }
  public javax.sip.header.CallInfoHeader createCallInfoHeader(javax.sip.address.URI arg1){
    return (javax.sip.header.CallInfoHeader) null;
  }
  public javax.sip.header.ContentDispositionHeader createContentDispositionHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.ContentDispositionHeader) null;
  }
  public javax.sip.header.ContentEncodingHeader createContentEncodingHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.ContentEncodingHeader) null;
  }
  public javax.sip.header.ContentLanguageHeader createContentLanguageHeader(java.util.Locale arg1){
    return (javax.sip.header.ContentLanguageHeader) null;
  }
  public javax.sip.header.ContentLengthHeader createContentLengthHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.ContentLengthHeader) null;
  }
  public javax.sip.header.ContentTypeHeader createContentTypeHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.ContentTypeHeader) null;
  }
  public javax.sip.header.DateHeader createDateHeader(java.util.Calendar arg1){
    return (javax.sip.header.DateHeader) null;
  }
  public javax.sip.header.EventHeader createEventHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.EventHeader) null;
  }
  public javax.sip.header.ExpiresHeader createExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.ExpiresHeader) null;
  }
  public javax.sip.header.ExtensionHeader createExtensionHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.ExtensionHeader) null;
  }
  public javax.sip.header.FromHeader createFromHeader(javax.sip.address.Address arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.FromHeader) null;
  }
  public javax.sip.header.InReplyToHeader createInReplyToHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.InReplyToHeader) null;
  }
  public javax.sip.header.MaxForwardsHeader createMaxForwardsHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.MaxForwardsHeader) null;
  }
  public javax.sip.header.MimeVersionHeader createMimeVersionHeader(int arg1, int arg2) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.MimeVersionHeader) null;
  }
  public javax.sip.header.MinExpiresHeader createMinExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.MinExpiresHeader) null;
  }
  public javax.sip.header.ExtensionHeader createMinSEHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.ExtensionHeader) null;
  }
  public javax.sip.header.OrganizationHeader createOrganizationHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.OrganizationHeader) null;
  }
  public javax.sip.header.PriorityHeader createPriorityHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.PriorityHeader) null;
  }
  public javax.sip.header.ProxyAuthenticateHeader createProxyAuthenticateHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.ProxyAuthenticateHeader) null;
  }
  public javax.sip.header.ProxyRequireHeader createProxyRequireHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.ProxyRequireHeader) null;
  }
  public javax.sip.header.RAckHeader createRAckHeader(long arg1, long arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException{
    return (javax.sip.header.RAckHeader) null;
  }
  public javax.sip.header.RAckHeader createRAckHeader(int arg1, int arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException{
    return (javax.sip.header.RAckHeader) null;
  }
  public javax.sip.header.RSeqHeader createRSeqHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.RSeqHeader) null;
  }
  public javax.sip.header.RSeqHeader createRSeqHeader(long arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.RSeqHeader) null;
  }
  public javax.sip.header.ReasonHeader createReasonHeader(java.lang.String arg1, int arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException{
    return (javax.sip.header.ReasonHeader) null;
  }
  public javax.sip.header.RecordRouteHeader createRecordRouteHeader(javax.sip.address.Address arg1){
    return (javax.sip.header.RecordRouteHeader) null;
  }
  public javax.sip.header.ReplyToHeader createReplyToHeader(javax.sip.address.Address arg1){
    return (javax.sip.header.ReplyToHeader) null;
  }
  public javax.sip.header.RequireHeader createRequireHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.RequireHeader) null;
  }
  public javax.sip.header.RetryAfterHeader createRetryAfterHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.RetryAfterHeader) null;
  }
  public javax.sip.header.RouteHeader createRouteHeader(javax.sip.address.Address arg1){
    return (javax.sip.header.RouteHeader) null;
  }
  public javax.sip.header.ServerHeader createServerHeader(java.util.List arg1) throws java.text.ParseException{
    return (javax.sip.header.ServerHeader) null;
  }
  public javax.sip.header.SubjectHeader createSubjectHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.SubjectHeader) null;
  }
  public javax.sip.header.SubscriptionStateHeader createSubscriptionStateHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.SubscriptionStateHeader) null;
  }
  public javax.sip.header.SupportedHeader createSupportedHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.SupportedHeader) null;
  }
  public javax.sip.header.TimeStampHeader createTimeStampHeader(float arg1) throws javax.sip.InvalidArgumentException{
    return (javax.sip.header.TimeStampHeader) null;
  }
  public javax.sip.header.ToHeader createToHeader(javax.sip.address.Address arg1, java.lang.String arg2) throws java.text.ParseException{
    return (javax.sip.header.ToHeader) null;
  }
  public javax.sip.header.UnsupportedHeader createUnsupportedHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.UnsupportedHeader) null;
  }
  public javax.sip.header.UserAgentHeader createUserAgentHeader(java.util.List arg1) throws java.text.ParseException{
    return (javax.sip.header.UserAgentHeader) null;
  }
  public javax.sip.header.WWWAuthenticateHeader createWWWAuthenticateHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.WWWAuthenticateHeader) null;
  }
  public javax.sip.header.WarningHeader createWarningHeader(java.lang.String arg1, int arg2, java.lang.String arg3) throws java.text.ParseException, javax.sip.InvalidArgumentException{
    return (javax.sip.header.WarningHeader) null;
  }
  public javax.sip.header.ErrorInfoHeader createErrorInfoHeader(javax.sip.address.URI arg1){
    return (javax.sip.header.ErrorInfoHeader) null;
  }
  public java.util.List createHeaders(java.lang.String arg1) throws java.text.ParseException{
    return (java.util.List) null;
  }
  public javax.sip.header.ReferToHeader createReferToHeader(javax.sip.address.Address arg1){
    return (javax.sip.header.ReferToHeader) null;
  }
  public gov.nist.javax.sip.header.extensions.ReferredByHeader createReferredByHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.extensions.ReferredByHeader) null;
  }
  public gov.nist.javax.sip.header.extensions.ReplacesHeader createReplacesHeader(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.extensions.ReplacesHeader) null;
  }
  public gov.nist.javax.sip.header.extensions.JoinHeader createJoinHeader(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.extensions.JoinHeader) null;
  }
  public javax.sip.header.SIPETagHeader createSIPETagHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.SIPETagHeader) null;
  }
  public javax.sip.header.SIPIfMatchHeader createSIPIfMatchHeader(java.lang.String arg1) throws java.text.ParseException{
    return (javax.sip.header.SIPIfMatchHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader createPAccessNetworkInfoHeader(){
    return (gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PAssertedIdentityHeader createPAssertedIdentityHeader(javax.sip.address.Address arg1) throws java.lang.NullPointerException, java.text.ParseException{
    return (gov.nist.javax.sip.header.ims.PAssertedIdentityHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PAssociatedURIHeader createPAssociatedURIHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PAssociatedURIHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PCalledPartyIDHeader createPCalledPartyIDHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PCalledPartyIDHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader(){
    return (gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PChargingVectorHeader createChargingVectorHeader(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.ims.PChargingVectorHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader createPMediaAuthorizationHeader(java.lang.String arg1) throws javax.sip.InvalidArgumentException, java.text.ParseException{
    return (gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PPreferredIdentityHeader createPPreferredIdentityHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PPreferredIdentityHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader createPVisitedNetworkIDHeader(){
    return (gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PathHeader createPathHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PathHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PrivacyHeader createPrivacyHeader(java.lang.String arg1){
    return (gov.nist.javax.sip.header.ims.PrivacyHeader) null;
  }
  public gov.nist.javax.sip.header.ims.ServiceRouteHeader createServiceRouteHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.ServiceRouteHeader) null;
  }
  public gov.nist.javax.sip.header.ims.SecurityServerHeader createSecurityServerHeader(){
    return (gov.nist.javax.sip.header.ims.SecurityServerHeader) null;
  }
  public gov.nist.javax.sip.header.ims.SecurityClientHeader createSecurityClientHeader(){
    return (gov.nist.javax.sip.header.ims.SecurityClientHeader) null;
  }
  public gov.nist.javax.sip.header.ims.SecurityVerifyHeader createSecurityVerifyHeader(){
    return (gov.nist.javax.sip.header.ims.SecurityVerifyHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PUserDatabaseHeader createPUserDatabaseHeader(java.lang.String arg1){
    return (gov.nist.javax.sip.header.ims.PUserDatabaseHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PProfileKeyHeader createPProfileKeyHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PProfileKeyHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PServedUserHeader createPServedUserHeader(javax.sip.address.Address arg1){
    return (gov.nist.javax.sip.header.ims.PServedUserHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PPreferredServiceHeader createPPreferredServiceHeader(){
    return (gov.nist.javax.sip.header.ims.PPreferredServiceHeader) null;
  }
  public gov.nist.javax.sip.header.ims.PAssertedServiceHeader createPAssertedServiceHeader(){
    return (gov.nist.javax.sip.header.ims.PAssertedServiceHeader) null;
  }
  public gov.nist.javax.sip.header.extensions.SessionExpiresHeader createSessionExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException{
    return (gov.nist.javax.sip.header.extensions.SessionExpiresHeader) null;
  }
  public gov.nist.javax.sip.header.extensions.ReferencesHeader createReferencesHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.extensions.ReferencesHeader) null;
  }
}
