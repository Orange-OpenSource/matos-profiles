package org.apache.harmony.security.provider.cert;

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
public class X509CertPathImpl
  extends java.security.cert.CertPath{
  // Fields

  public static final int PKI_PATH = 0;

  public static final int PKCS7 = 1;

  public static final org.apache.harmony.security.asn1.ASN1SequenceOf ASN1 = null;

  // Constructors

  public X509CertPathImpl(java.util.List arg1) throws java.security.cert.CertificateException{
    super((java.lang.String) null);
  }
  private X509CertPathImpl(java.util.List arg1, int arg2, byte [] arg3){
    super((java.lang.String) null);
  }
  // Methods

  public static X509CertPathImpl getInstance(java.io.InputStream arg1) throws java.security.cert.CertificateException{
    return (X509CertPathImpl) null;
  }
  public static X509CertPathImpl getInstance(java.io.InputStream arg1, java.lang.String arg2) throws java.security.cert.CertificateException{
    return (X509CertPathImpl) null;
  }
  public static X509CertPathImpl getInstance(byte [] arg1) throws java.security.cert.CertificateException{
    return (X509CertPathImpl) null;
  }
  public static X509CertPathImpl getInstance(byte [] arg1, java.lang.String arg2) throws java.security.cert.CertificateException{
    return (X509CertPathImpl) null;
  }
  public java.util.List getCertificates(){
    return (java.util.List) null;
  }
  public byte [] getEncoded() throws java.security.cert.CertificateEncodingException{
    return (byte []) null;
  }
  public byte [] getEncoded(java.lang.String arg1) throws java.security.cert.CertificateEncodingException{
    return (byte []) null;
  }
  public java.util.Iterator getEncodings(){
    return (java.util.Iterator) null;
  }
}
