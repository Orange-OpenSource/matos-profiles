package gov.nist.javax.sip;

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


public interface TransactionExt
  extends javax.sip.Transaction
{
  // Methods

  public java.lang.String getHost();
  public int getPort();
  public java.lang.String getTransport();
  public java.lang.String getPeerAddress();
  public int getPeerPort();
  public java.lang.String getCipherSuite() throws java.lang.UnsupportedOperationException;
  public javax.sip.SipProvider getSipProvider();
  public java.security.cert.Certificate [] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException;
  public java.security.cert.Certificate [] getLocalCertificates() throws java.lang.UnsupportedOperationException;
}
