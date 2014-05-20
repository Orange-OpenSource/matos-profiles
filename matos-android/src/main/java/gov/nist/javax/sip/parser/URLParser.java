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


public class URLParser
  extends Parser{
  // Constructors

  public URLParser(java.lang.String arg1){
    super();
  }
  public URLParser(Lexer arg1){
    super();
  }
  // Methods

  public static void main(java.lang.String [] arg1) throws java.text.ParseException{
  }
  protected java.lang.String mark() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public gov.nist.javax.sip.address.GenericURI parse() throws java.text.ParseException{
    return (gov.nist.javax.sip.address.GenericURI) null;
  }
  protected boolean isEscaped(){
    return false;
  }
  protected java.lang.String password() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected java.lang.String user() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected java.lang.String escaped() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected java.lang.String urlString() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected java.lang.String reserved() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public java.lang.String peekScheme() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public gov.nist.javax.sip.address.SipUri sipURL(boolean arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.SipUri) null;
  }
  public gov.nist.javax.sip.address.TelURLImpl telURL(boolean arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.TelURLImpl) null;
  }
  protected static boolean isMark(char arg1){
    return false;
  }
  protected static boolean isUnreserved(char arg1){
    return false;
  }
  protected static boolean isReservedNoSlash(char arg1){
    return false;
  }
  protected static boolean isUserUnreserved(char arg1){
    return false;
  }
  protected java.lang.String unreserved() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected java.lang.String paramNameOrValue() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected static boolean isReserved(char arg1){
    return false;
  }
  protected java.lang.String uric(){
    return (java.lang.String) null;
  }
  protected java.lang.String uricNoSlash(){
    return (java.lang.String) null;
  }
  protected java.lang.String uricString() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public gov.nist.javax.sip.address.GenericURI uriReference(boolean arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.GenericURI) null;
  }
  public final gov.nist.javax.sip.address.TelephoneNumber parseTelephoneNumber(boolean arg1) throws java.text.ParseException{
    return (gov.nist.javax.sip.address.TelephoneNumber) null;
  }
  protected gov.nist.core.NameValue qheader() throws java.text.ParseException{
    return (gov.nist.core.NameValue) null;
  }
  protected java.lang.String hvalue() throws java.text.ParseException{
    return (java.lang.String) null;
  }
}
