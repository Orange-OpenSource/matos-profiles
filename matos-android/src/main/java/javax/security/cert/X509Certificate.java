package javax.security.cert;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.X509CertificateImpl", superClass = "")
public abstract class X509Certificate
  extends Certificate{
  // Constructors

  public X509Certificate(){
    super();
  }
  // Methods

  public static final X509Certificate getInstance(java.io.InputStream arg1) throws CertificateException{
    return (X509Certificate) null;
  }
  public static final X509Certificate getInstance(byte [] arg1) throws CertificateException{
    return (X509Certificate) null;
  }
  public abstract java.security.Principal getIssuerDN();
  public abstract java.security.Principal getSubjectDN();
  public abstract int getVersion();
  public abstract java.math.BigInteger getSerialNumber();
  public abstract java.lang.String getSigAlgName();
  public abstract java.lang.String getSigAlgOID();
  public abstract byte [] getSigAlgParams();
  public abstract java.util.Date getNotBefore();
  public abstract java.util.Date getNotAfter();
  public abstract void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;
  public abstract void checkValidity(java.util.Date arg1) throws CertificateExpiredException, CertificateNotYetValidException;
}
