package javax.sip.message;

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


public interface MessageFactory
{
  // Methods

  public void setDefaultUserAgentHeader(@com.francetelecom.rd.stubs.annotation.CallBackRegister("userAgentHeader") javax.sip.header.UserAgentHeader arg1);
  public void setDefaultServerHeader(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serverHeader") javax.sip.header.ServerHeader arg1);
  public void setDefaultContentEncodingCharset(java.lang.String arg1) throws java.lang.NullPointerException, java.lang.IllegalArgumentException;
  public Response createResponse(int arg1, javax.sip.header.CallIdHeader arg2, javax.sip.header.CSeqHeader arg3, javax.sip.header.FromHeader arg4, javax.sip.header.ToHeader arg5, java.util.List arg6, javax.sip.header.MaxForwardsHeader arg7, javax.sip.header.ContentTypeHeader arg8, java.lang.Object arg9) throws java.text.ParseException;
  public Response createResponse(int arg1, javax.sip.header.CallIdHeader arg2, javax.sip.header.CSeqHeader arg3, javax.sip.header.FromHeader arg4, javax.sip.header.ToHeader arg5, java.util.List arg6, javax.sip.header.MaxForwardsHeader arg7, javax.sip.header.ContentTypeHeader arg8, byte [] arg9) throws java.text.ParseException;
  public Response createResponse(int arg1, javax.sip.header.CallIdHeader arg2, javax.sip.header.CSeqHeader arg3, javax.sip.header.FromHeader arg4, javax.sip.header.ToHeader arg5, java.util.List arg6, javax.sip.header.MaxForwardsHeader arg7) throws java.text.ParseException;
  public Response createResponse(int arg1, Request arg2, javax.sip.header.ContentTypeHeader arg3, java.lang.Object arg4) throws java.text.ParseException;
  public Response createResponse(int arg1, Request arg2, javax.sip.header.ContentTypeHeader arg3, byte [] arg4) throws java.text.ParseException;
  public Response createResponse(int arg1, Request arg2) throws java.text.ParseException;
  public Response createResponse(java.lang.String arg1) throws java.text.ParseException;
  public Request createRequest(javax.sip.address.URI arg1, java.lang.String arg2, javax.sip.header.CallIdHeader arg3, javax.sip.header.CSeqHeader arg4, javax.sip.header.FromHeader arg5, javax.sip.header.ToHeader arg6, java.util.List arg7, javax.sip.header.MaxForwardsHeader arg8, javax.sip.header.ContentTypeHeader arg9, java.lang.Object arg10) throws java.text.ParseException;
  public Request createRequest(javax.sip.address.URI arg1, java.lang.String arg2, javax.sip.header.CallIdHeader arg3, javax.sip.header.CSeqHeader arg4, javax.sip.header.FromHeader arg5, javax.sip.header.ToHeader arg6, java.util.List arg7, javax.sip.header.MaxForwardsHeader arg8, javax.sip.header.ContentTypeHeader arg9, byte [] arg10) throws java.text.ParseException;
  public Request createRequest(javax.sip.address.URI arg1, java.lang.String arg2, javax.sip.header.CallIdHeader arg3, javax.sip.header.CSeqHeader arg4, javax.sip.header.FromHeader arg5, javax.sip.header.ToHeader arg6, java.util.List arg7, javax.sip.header.MaxForwardsHeader arg8) throws java.text.ParseException;
  public Request createRequest(java.lang.String arg1) throws java.text.ParseException;
}
