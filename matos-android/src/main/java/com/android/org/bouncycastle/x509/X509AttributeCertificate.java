package com.android.org.bouncycastle.x509;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface X509AttributeCertificate
  extends java.security.cert.X509Extension
{
  // Methods

  public byte [] getSignature();
  public X509Attribute [] getAttributes();
  public X509Attribute [] getAttributes(java.lang.String arg1);
  public byte [] getEncoded() throws java.io.IOException;
  public void verify(java.security.PublicKey arg1, java.lang.String arg2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
  public int getVersion();
  public java.math.BigInteger getSerialNumber();
  public AttributeCertificateIssuer getIssuer();
  public AttributeCertificateHolder getHolder();
  public java.util.Date getNotBefore();
  public java.util.Date getNotAfter();
  public boolean [] getIssuerUniqueID();
  public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
  public void checkValidity(java.util.Date arg1) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
}
