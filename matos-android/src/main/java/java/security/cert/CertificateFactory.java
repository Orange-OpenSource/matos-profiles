package java.security.cert;

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


public class CertificateFactory
{
  // Constructors

  protected CertificateFactory(CertificateFactorySpi arg1, java.security.Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static final CertificateFactory getInstance(java.lang.String arg1) throws CertificateException{
    return (CertificateFactory) null;
  }
  public static final CertificateFactory getInstance(java.lang.String arg1, java.lang.String arg2) throws CertificateException, java.security.NoSuchProviderException{
    return (CertificateFactory) null;
  }
  public static final CertificateFactory getInstance(java.lang.String arg1, java.security.Provider arg2) throws CertificateException{
    return (CertificateFactory) null;
  }
  public final java.lang.String getType(){
    return (java.lang.String) null;
  }
  public final CertPath generateCertPath(java.io.InputStream arg1) throws CertificateException{
    return (CertPath) null;
  }
  public final CertPath generateCertPath(java.io.InputStream arg1, java.lang.String arg2) throws CertificateException{
    return (CertPath) null;
  }
  public final CertPath generateCertPath(java.util.List<? extends Certificate> arg1) throws CertificateException{
    return (CertPath) null;
  }
  public final Certificate generateCertificate(java.io.InputStream arg1) throws CertificateException{
    return (Certificate) null;
  }
  public final java.security.Provider getProvider(){
    return (java.security.Provider) null;
  }
  public final CRL generateCRL(java.io.InputStream arg1) throws CRLException{
    return (CRL) null;
  }
  public final java.util.Iterator<java.lang.String> getCertPathEncodings(){
    return (java.util.Iterator) null;
  }
  public final java.util.Collection<? extends Certificate> generateCertificates(java.io.InputStream arg1) throws CertificateException{
    return (java.util.Collection) null;
  }
  public final java.util.Collection<? extends CRL> generateCRLs(java.io.InputStream arg1) throws CRLException{
    return (java.util.Collection) null;
  }
}
