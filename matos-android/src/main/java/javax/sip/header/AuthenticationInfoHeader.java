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


public interface AuthenticationInfoHeader
  extends Header, Parameters
{
  // Fields

  public static final java.lang.String NAME = "Authentication-Info";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("response")
  public java.lang.String getResponse();
  @com.francetelecom.rd.stubs.annotation.FieldGet("qop")
  public java.lang.String getQop();
  public void setResponse(@com.francetelecom.rd.stubs.annotation.FieldSet("response") java.lang.String arg1) throws java.text.ParseException;
  public void setQop(@com.francetelecom.rd.stubs.annotation.FieldSet("qop") java.lang.String arg1) throws java.text.ParseException;
  public void setCNonce(@com.francetelecom.rd.stubs.annotation.FieldSet("cNonce") java.lang.String arg1) throws java.text.ParseException;
  public void setNonceCount(int arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("cNonce")
  public java.lang.String getCNonce();
  public int getNonceCount();
  @com.francetelecom.rd.stubs.annotation.FieldGet("nextNonce")
  public java.lang.String getNextNonce();
  public void setNextNonce(@com.francetelecom.rd.stubs.annotation.FieldSet("nextNonce") java.lang.String arg1) throws java.text.ParseException;
}
