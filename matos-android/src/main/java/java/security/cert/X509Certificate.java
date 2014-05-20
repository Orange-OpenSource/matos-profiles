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


public abstract class X509Certificate
  extends Certificate  implements X509Extension
{
  // Constructors

  protected X509Certificate(){
    super((java.lang.String) null);
  }
  // Methods

  public abstract byte [] getSignature();
  public abstract int getBasicConstraints();
  public abstract java.security.Principal getIssuerDN();
  public abstract java.security.Principal getSubjectDN();
  public javax.security.auth.x500.X500Principal getSubjectX500Principal(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public abstract int getVersion();
  public abstract java.math.BigInteger getSerialNumber();
  public javax.security.auth.x500.X500Principal getIssuerX500Principal(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public abstract java.lang.String getSigAlgName();
  public abstract java.lang.String getSigAlgOID();
  public abstract byte [] getSigAlgParams();
  public java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws CertificateParsingException{
    return (java.util.Collection) null;
  }
  public java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws CertificateParsingException{
    return (java.util.Collection) null;
  }
  public abstract java.util.Date getNotBefore();
  public abstract java.util.Date getNotAfter();
  public abstract boolean [] getIssuerUniqueID();
  public abstract void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;
  public abstract void checkValidity(java.util.Date arg1) throws CertificateExpiredException, CertificateNotYetValidException;
  public abstract boolean [] getKeyUsage();
  public abstract byte [] getTBSCertificate() throws CertificateEncodingException;
  public abstract boolean [] getSubjectUniqueID();
  public java.util.List<java.lang.String> getExtendedKeyUsage() throws CertificateParsingException{
    return (java.util.List) null;
  }
}
