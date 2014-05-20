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


public interface ViaHeader
  extends Header, Parameters
{
  // Fields

  public static final java.lang.String NAME = "Via";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost();
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocol")
  public java.lang.String getProtocol();
  public int getPort();
  @com.francetelecom.rd.stubs.annotation.FieldGet("transport")
  public java.lang.String getTransport();
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") java.lang.String arg1) throws java.text.ParseException;
  public void setPort(int arg1) throws javax.sip.InvalidArgumentException;
  public void setProtocol(@com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg1) throws java.text.ParseException;
  public int getTTL();
  public void setTTL(int arg1) throws javax.sip.InvalidArgumentException;
  public void setTransport(@com.francetelecom.rd.stubs.annotation.FieldSet("transport") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("branch")
  public java.lang.String getBranch();
  public void setBranch(@com.francetelecom.rd.stubs.annotation.FieldSet("branch") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("received")
  public java.lang.String getReceived();
  public int getRPort();
  public void setRPort() throws javax.sip.InvalidArgumentException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAddr")
  public java.lang.String getMAddr();
  public void setMAddr(@com.francetelecom.rd.stubs.annotation.FieldSet("mAddr") java.lang.String arg1) throws java.text.ParseException;
  public void setReceived(@com.francetelecom.rd.stubs.annotation.FieldSet("received") java.lang.String arg1) throws java.text.ParseException;
  public java.lang.String getSentByField();
  public java.lang.String getSentProtocolField();
}
