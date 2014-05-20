package javax.net.ssl;

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


public interface SSLSession
{
  // Methods

  public java.lang.Object getValue(java.lang.String arg1);
  public byte [] getId();
  public java.lang.String getProtocol();
  public void putValue(java.lang.String arg1, java.lang.Object arg2);
  public boolean isValid();
  public int getPeerPort();
  public void invalidate();
  public java.lang.String getCipherSuite();
  public java.security.Principal getPeerPrincipal() throws SSLPeerUnverifiedException;
  public java.security.Principal getLocalPrincipal();
  public java.security.cert.Certificate [] getPeerCertificates() throws SSLPeerUnverifiedException;
  public java.security.cert.Certificate [] getLocalCertificates();
  public javax.security.cert.X509Certificate [] getPeerCertificateChain() throws SSLPeerUnverifiedException;
  public java.lang.String getPeerHost();
  public long getCreationTime();
  public long getLastAccessedTime();
  public int getApplicationBufferSize();
  public int getPacketBufferSize();
  public SSLSessionContext getSessionContext();
  public java.lang.String [] getValueNames();
  public void removeValue(java.lang.String arg1);
}
