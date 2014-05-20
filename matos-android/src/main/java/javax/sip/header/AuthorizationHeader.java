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


public interface AuthorizationHeader
  extends Header, Parameters
{
  // Fields

  public static final java.lang.String NAME = "Authorization";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme();
  @com.francetelecom.rd.stubs.annotation.FieldGet("algorithm")
  public java.lang.String getAlgorithm();
  public boolean isStale();
  @com.francetelecom.rd.stubs.annotation.FieldGet("realm")
  public java.lang.String getRealm();
  public void setAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("algorithm") java.lang.String arg1) throws java.text.ParseException;
  public javax.sip.address.URI getURI();
  public void setURI(javax.sip.address.URI arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("response")
  public java.lang.String getResponse();
  @com.francetelecom.rd.stubs.annotation.FieldGet("qop")
  public java.lang.String getQop();
  @com.francetelecom.rd.stubs.annotation.FieldGet("nonce")
  public java.lang.String getNonce();
  public void setUsername(@com.francetelecom.rd.stubs.annotation.FieldSet("username") java.lang.String arg1) throws java.text.ParseException;
  public void setRealm(@com.francetelecom.rd.stubs.annotation.FieldSet("realm") java.lang.String arg1) throws java.text.ParseException;
  public void setNonce(@com.francetelecom.rd.stubs.annotation.FieldSet("nonce") java.lang.String arg1) throws java.text.ParseException;
  public void setResponse(@com.francetelecom.rd.stubs.annotation.FieldSet("response") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("opaque")
  public java.lang.String getOpaque();
  public void setOpaque(@com.francetelecom.rd.stubs.annotation.FieldSet("opaque") java.lang.String arg1) throws java.text.ParseException;
  public void setQop(@com.francetelecom.rd.stubs.annotation.FieldSet("qop") java.lang.String arg1) throws java.text.ParseException;
  public void setCNonce(java.lang.String arg1) throws java.text.ParseException;
  public void setNonceCount(int arg1) throws java.text.ParseException;
  public java.lang.String getCNonce();
  public int getNonceCount();
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("scheme") java.lang.String arg1);
  public void setStale(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("username")
  public java.lang.String getUsername();
}
