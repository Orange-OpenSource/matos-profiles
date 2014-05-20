package javax.sip.address;

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


public interface SipURI
  extends javax.sip.header.Parameters, URI
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost();
  public int getPort();
  public void setSecure(boolean arg1);
  public boolean isSecure();
  public void setHeader(java.lang.String arg1, java.lang.String arg2);
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") java.lang.String arg1) throws java.text.ParseException;
  public java.lang.String getHeader(java.lang.String arg1);
  public java.util.Iterator getHeaderNames();
  @com.francetelecom.rd.stubs.annotation.FieldGet("user")
  public java.lang.String getUser();
  public void setPort(int arg1) throws javax.sip.InvalidArgumentException;
  public void setUser(@com.francetelecom.rd.stubs.annotation.FieldSet("user") java.lang.String arg1);
  public java.lang.String getUserType();
  public java.lang.String getUserAtHostPort();
  public void setMAddrParam(@com.francetelecom.rd.stubs.annotation.FieldSet("mAddrParam") java.lang.String arg1) throws java.text.ParseException;
  public void setTransportParam(@com.francetelecom.rd.stubs.annotation.FieldSet("transportParam") java.lang.String arg1) throws java.text.ParseException;
  public void setUserPassword(@com.francetelecom.rd.stubs.annotation.FieldSet("userPassword") java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("userPassword")
  public java.lang.String getUserPassword();
  @com.francetelecom.rd.stubs.annotation.FieldGet("transportParam")
  public java.lang.String getTransportParam();
  public boolean hasLrParam();
  public void setUserParam(@com.francetelecom.rd.stubs.annotation.FieldSet("userParam") java.lang.String arg1);
  public java.lang.String getLrParam();
  public void setLrParam();
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAddrParam")
  public java.lang.String getMAddrParam();
  public int getTTLParam();
  public void setTTLParam(int arg1);
  public boolean hasTransport();
  @com.francetelecom.rd.stubs.annotation.FieldGet("userParam")
  public java.lang.String getUserParam();
  public void removeUserType();
  public java.lang.String getUserAtHost();
  @com.francetelecom.rd.stubs.annotation.FieldGet("methodParam")
  public java.lang.String getMethodParam();
  public void setMethodParam(@com.francetelecom.rd.stubs.annotation.FieldSet("methodParam") java.lang.String arg1) throws java.text.ParseException;
}
