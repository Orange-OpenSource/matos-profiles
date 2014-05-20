package javax.sip;

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


public interface ListeningPoint
  extends java.lang.Cloneable
{
  // Fields

  public static final java.lang.String TCP = "TCP";

  public static final java.lang.String UDP = "UDP";

  public static final java.lang.String SCTP = "SCTP";

  public static final java.lang.String TLS = "TLS";

  public static final int PORT_5060 = 5060;

  public static final int PORT_5061 = 5061;

  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public int getPort();
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public java.lang.String getTransport();
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public void setSentBy(java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public java.lang.String getIPAddress();
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public java.lang.String getSentBy();
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public javax.sip.header.ContactHeader createContactHeader();
  @com.francetelecom.rd.stubs.annotation.CallBack("listeningPoing")
  public void sendHeartbeat(java.lang.String arg1, int arg2) throws java.io.IOException;
}
