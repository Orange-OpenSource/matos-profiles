package javax.sip.header;

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


public interface HeaderFactory
{
  // Methods

  public ContactHeader createContactHeader();
  public ContactHeader createContactHeader(javax.sip.address.Address arg1);
  public ViaHeader createViaHeader(java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public Header createHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException;
  public Header createHeader(java.lang.String arg1) throws java.text.ParseException;
  public ProxyAuthorizationHeader createProxyAuthorizationHeader(java.lang.String arg1) throws java.text.ParseException;
  public AuthorizationHeader createAuthorizationHeader(java.lang.String arg1) throws java.text.ParseException;
  public void setPrettyEncoding(boolean arg1);
  public AcceptEncodingHeader createAcceptEncodingHeader(java.lang.String arg1) throws java.text.ParseException;
  public AcceptHeader createAcceptHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException;
  public AcceptLanguageHeader createAcceptLanguageHeader(java.util.Locale arg1);
  public AlertInfoHeader createAlertInfoHeader(javax.sip.address.URI arg1);
  public AllowEventsHeader createAllowEventsHeader(java.lang.String arg1) throws java.text.ParseException;
  public AllowHeader createAllowHeader(java.lang.String arg1) throws java.text.ParseException;
  public AuthenticationInfoHeader createAuthenticationInfoHeader(java.lang.String arg1) throws java.text.ParseException;
  public CSeqHeader createCSeqHeader(int arg1, java.lang.String arg2) throws java.text.ParseException, javax.sip.InvalidArgumentException;
  public CSeqHeader createCSeqHeader(long arg1, java.lang.String arg2) throws java.text.ParseException, javax.sip.InvalidArgumentException;
  public CallIdHeader createCallIdHeader(java.lang.String arg1) throws java.text.ParseException;
  public CallInfoHeader createCallInfoHeader(javax.sip.address.URI arg1);
  public ContentDispositionHeader createContentDispositionHeader(java.lang.String arg1) throws java.text.ParseException;
  public ContentEncodingHeader createContentEncodingHeader(java.lang.String arg1) throws java.text.ParseException;
  public ContentLanguageHeader createContentLanguageHeader(java.util.Locale arg1);
  public ContentLengthHeader createContentLengthHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public ContentTypeHeader createContentTypeHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException;
  public DateHeader createDateHeader(java.util.Calendar arg1);
  public EventHeader createEventHeader(java.lang.String arg1) throws java.text.ParseException;
  public ExpiresHeader createExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public ExtensionHeader createExtensionHeader(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException;
  public FromHeader createFromHeader(javax.sip.address.Address arg1, java.lang.String arg2) throws java.text.ParseException;
  public InReplyToHeader createInReplyToHeader(java.lang.String arg1) throws java.text.ParseException;
  public MaxForwardsHeader createMaxForwardsHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public MimeVersionHeader createMimeVersionHeader(int arg1, int arg2) throws javax.sip.InvalidArgumentException;
  public MinExpiresHeader createMinExpiresHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public OrganizationHeader createOrganizationHeader(java.lang.String arg1) throws java.text.ParseException;
  public PriorityHeader createPriorityHeader(java.lang.String arg1) throws java.text.ParseException;
  public ProxyAuthenticateHeader createProxyAuthenticateHeader(java.lang.String arg1) throws java.text.ParseException;
  public ProxyRequireHeader createProxyRequireHeader(java.lang.String arg1) throws java.text.ParseException;
  public RAckHeader createRAckHeader(long arg1, long arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public RAckHeader createRAckHeader(int arg1, int arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public RSeqHeader createRSeqHeader(long arg1) throws javax.sip.InvalidArgumentException;
  public RSeqHeader createRSeqHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public ReasonHeader createReasonHeader(java.lang.String arg1, int arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public RecordRouteHeader createRecordRouteHeader(javax.sip.address.Address arg1);
  public ReplyToHeader createReplyToHeader(javax.sip.address.Address arg1);
  public RequireHeader createRequireHeader(java.lang.String arg1) throws java.text.ParseException;
  public RetryAfterHeader createRetryAfterHeader(int arg1) throws javax.sip.InvalidArgumentException;
  public RouteHeader createRouteHeader(javax.sip.address.Address arg1);
  public ServerHeader createServerHeader(java.util.List arg1) throws java.text.ParseException;
  public SubjectHeader createSubjectHeader(java.lang.String arg1) throws java.text.ParseException;
  public SubscriptionStateHeader createSubscriptionStateHeader(java.lang.String arg1) throws java.text.ParseException;
  public SupportedHeader createSupportedHeader(java.lang.String arg1) throws java.text.ParseException;
  public TimeStampHeader createTimeStampHeader(float arg1) throws javax.sip.InvalidArgumentException;
  public ToHeader createToHeader(javax.sip.address.Address arg1, java.lang.String arg2) throws java.text.ParseException;
  public UnsupportedHeader createUnsupportedHeader(java.lang.String arg1) throws java.text.ParseException;
  public UserAgentHeader createUserAgentHeader(java.util.List arg1) throws java.text.ParseException;
  public WWWAuthenticateHeader createWWWAuthenticateHeader(java.lang.String arg1) throws java.text.ParseException;
  public WarningHeader createWarningHeader(java.lang.String arg1, int arg2, java.lang.String arg3) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  public ErrorInfoHeader createErrorInfoHeader(javax.sip.address.URI arg1);
  public java.util.List createHeaders(java.lang.String arg1) throws java.text.ParseException;
  public ReferToHeader createReferToHeader(javax.sip.address.Address arg1);
  public SIPETagHeader createSIPETagHeader(java.lang.String arg1) throws java.text.ParseException;
  public SIPIfMatchHeader createSIPIfMatchHeader(java.lang.String arg1) throws java.text.ParseException;
}
