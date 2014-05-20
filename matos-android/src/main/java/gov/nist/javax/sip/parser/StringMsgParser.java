package gov.nist.javax.sip.parser;

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


public class StringMsgParser
{
  // Fields

  protected boolean readBody;

  // Constructors

  public StringMsgParser(){
  }
  public StringMsgParser(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleException") ParseExceptionListener arg1){
  }
  // Methods

  public static void main(java.lang.String [] arg1) throws java.text.ParseException{
  }
  public gov.nist.javax.sip.address.TelephoneNumber parseTelephoneNumber(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.TelephoneNumber) null;
  }
  public void setStrict(boolean arg1){
  }
  public gov.nist.javax.sip.address.GenericURI parseUrl(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.GenericURI) null;
  }
  public gov.nist.core.Host parseHost(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.core.Host) null;
  }
  public static void setComputeContentLengthFromMessage(boolean arg1){
  }
  public gov.nist.javax.sip.address.SipUri parseSIPUrl(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.SipUri) null;
  }
  public gov.nist.javax.sip.address.AddressImpl parseAddress(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.AddressImpl) null;
  }
  public gov.nist.javax.sip.message.SIPMessage parseSIPMessage(byte [] arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.message.SIPMessage) null;
  }
  public gov.nist.javax.sip.message.SIPMessage parseSIPMessage(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.message.SIPMessage) null;
  }
  public gov.nist.javax.sip.header.SIPHeader parseSIPHeader(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.SIPHeader) null;
  }
  public void setParseExceptionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleException") ParseExceptionListener arg1){
  }
  public gov.nist.javax.sip.header.RequestLine parseSIPRequestLine(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.RequestLine) null;
  }
  public gov.nist.javax.sip.header.StatusLine parseSIPStatusLine(java.lang.String arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.header.StatusLine) null;
  }
}
