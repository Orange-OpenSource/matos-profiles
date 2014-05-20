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


public abstract class CertificateFactorySpi
{
  // Constructors

  public CertificateFactorySpi(){
  }
  // Methods

  public abstract Certificate engineGenerateCertificate(java.io.InputStream arg1) throws CertificateException;
  public abstract java.util.Collection<? extends Certificate> engineGenerateCertificates(java.io.InputStream arg1) throws CertificateException;
  public abstract CRL engineGenerateCRL(java.io.InputStream arg1) throws CRLException;
  public abstract java.util.Collection<? extends CRL> engineGenerateCRLs(java.io.InputStream arg1) throws CRLException;
  public java.util.Iterator<java.lang.String> engineGetCertPathEncodings(){
    return (java.util.Iterator) null;
  }
  public CertPath engineGenerateCertPath(java.io.InputStream arg1) throws CertificateException{
    return (CertPath) null;
  }
  public CertPath engineGenerateCertPath(java.io.InputStream arg1, java.lang.String arg2) throws CertificateException{
    return (CertPath) null;
  }
  public CertPath engineGenerateCertPath(java.util.List<? extends Certificate> arg1) throws CertificateException{
    return (CertPath) null;
  }
}