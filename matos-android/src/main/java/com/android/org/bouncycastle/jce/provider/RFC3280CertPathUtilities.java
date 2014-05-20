package com.android.org.bouncycastle.jce.provider;

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
public class RFC3280CertPathUtilities
{
  // Fields

  protected static final java.lang.String CERTIFICATE_POLICIES = (java.lang.String) null;

  protected static final java.lang.String POLICY_MAPPINGS = (java.lang.String) null;

  protected static final java.lang.String INHIBIT_ANY_POLICY = (java.lang.String) null;

  protected static final java.lang.String ISSUING_DISTRIBUTION_POINT = (java.lang.String) null;

  protected static final java.lang.String FRESHEST_CRL = (java.lang.String) null;

  protected static final java.lang.String DELTA_CRL_INDICATOR = (java.lang.String) null;

  protected static final java.lang.String POLICY_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String BASIC_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String CRL_DISTRIBUTION_POINTS = (java.lang.String) null;

  protected static final java.lang.String SUBJECT_ALTERNATIVE_NAME = (java.lang.String) null;

  protected static final java.lang.String NAME_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String AUTHORITY_KEY_IDENTIFIER = (java.lang.String) null;

  protected static final java.lang.String KEY_USAGE = (java.lang.String) null;

  protected static final java.lang.String CRL_NUMBER = (java.lang.String) null;

  protected static final java.lang.String ANY_POLICY = (java.lang.String) null;

  protected static final int KEY_CERT_SIGN = 0;

  protected static final int CRL_SIGN = 0;

  protected static final java.lang.String [] crlReasons = null;

  // Constructors

  public RFC3280CertPathUtilities(){
  }
  // Methods

  protected static void processCertA(java.security.cert.CertPath arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2, int arg3, java.security.PublicKey arg4, boolean arg5, javax.security.auth.x500.X500Principal arg6, java.security.cert.X509Certificate arg7) throws com.android.org.bouncycastle.jce.exception.ExtCertPathValidatorException{
  }
  protected static void processCertBC(java.security.cert.CertPath arg1, int arg2, PKIXNameConstraintValidator arg3) throws java.security.cert.CertPathValidatorException{
  }
  protected static PKIXPolicyNode processCertD(java.security.cert.CertPath arg1, int arg2, java.util.Set arg3, PKIXPolicyNode arg4, java.util.List [] arg5, int arg6) throws java.security.cert.CertPathValidatorException{
    return (PKIXPolicyNode) null;
  }
  protected static PKIXPolicyNode processCertE(java.security.cert.CertPath arg1, int arg2, PKIXPolicyNode arg3) throws java.security.cert.CertPathValidatorException{
    return (PKIXPolicyNode) null;
  }
  protected static void processCertF(java.security.cert.CertPath arg1, int arg2, PKIXPolicyNode arg3, int arg4) throws java.security.cert.CertPathValidatorException{
  }
  protected static void prepareNextCertA(java.security.cert.CertPath arg1, int arg2) throws java.security.cert.CertPathValidatorException{
  }
  protected static PKIXPolicyNode prepareCertB(java.security.cert.CertPath arg1, int arg2, java.util.List [] arg3, PKIXPolicyNode arg4, int arg5) throws java.security.cert.CertPathValidatorException{
    return (PKIXPolicyNode) null;
  }
  protected static void prepareNextCertG(java.security.cert.CertPath arg1, int arg2, PKIXNameConstraintValidator arg3) throws java.security.cert.CertPathValidatorException{
  }
  protected static int prepareNextCertH1(java.security.cert.CertPath arg1, int arg2, int arg3){
    return 0;
  }
  protected static int prepareNextCertH2(java.security.cert.CertPath arg1, int arg2, int arg3){
    return 0;
  }
  protected static int prepareNextCertH3(java.security.cert.CertPath arg1, int arg2, int arg3){
    return 0;
  }
  protected static int prepareNextCertI1(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static int prepareNextCertI2(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static int prepareNextCertJ(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static void prepareNextCertK(java.security.cert.CertPath arg1, int arg2) throws java.security.cert.CertPathValidatorException{
  }
  protected static int prepareNextCertL(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static int prepareNextCertM(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static void prepareNextCertN(java.security.cert.CertPath arg1, int arg2) throws java.security.cert.CertPathValidatorException{
  }
  protected static void prepareNextCertO(java.security.cert.CertPath arg1, int arg2, java.util.Set arg3, java.util.List arg4) throws java.security.cert.CertPathValidatorException{
  }
  protected static int wrapupCertA(int arg1, java.security.cert.X509Certificate arg2){
    return 0;
  }
  protected static int wrapupCertB(java.security.cert.CertPath arg1, int arg2, int arg3) throws java.security.cert.CertPathValidatorException{
    return 0;
  }
  protected static void wrapupCertF(java.security.cert.CertPath arg1, int arg2, java.util.List arg3, java.util.Set arg4) throws java.security.cert.CertPathValidatorException{
  }
  protected static PKIXPolicyNode wrapupCertG(java.security.cert.CertPath arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2, java.util.Set arg3, int arg4, java.util.List [] arg5, PKIXPolicyNode arg6, java.util.Set arg7) throws java.security.cert.CertPathValidatorException{
    return (PKIXPolicyNode) null;
  }
  protected static void processCRLB2(com.android.org.bouncycastle.asn1.x509.DistributionPoint arg1, java.lang.Object arg2, java.security.cert.X509CRL arg3) throws AnnotatedException{
  }
  protected static void processCRLB1(com.android.org.bouncycastle.asn1.x509.DistributionPoint arg1, java.lang.Object arg2, java.security.cert.X509CRL arg3) throws AnnotatedException{
  }
  protected static java.util.Set processCRLF(java.security.cert.X509CRL arg1, java.lang.Object arg2, java.security.cert.X509Certificate arg3, java.security.PublicKey arg4, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg5, java.util.List arg6) throws AnnotatedException{
    return (java.util.Set) null;
  }
  protected static java.security.PublicKey processCRLG(java.security.cert.X509CRL arg1, java.util.Set arg2) throws AnnotatedException{
    return (java.security.PublicKey) null;
  }
  protected static java.security.cert.X509CRL processCRLH(java.util.Set arg1, java.security.PublicKey arg2) throws AnnotatedException{
    return (java.security.cert.X509CRL) null;
  }
  protected static java.util.Set processCRLA1i(java.util.Date arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2, java.security.cert.X509Certificate arg3, java.security.cert.X509CRL arg4) throws AnnotatedException{
    return (java.util.Set) null;
  }
  protected static java.util.Set [] processCRLA1ii(java.util.Date arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2, java.security.cert.X509Certificate arg3, java.security.cert.X509CRL arg4) throws AnnotatedException{
    return (java.util.Set []) null;
  }
  protected static void processCRLC(java.security.cert.X509CRL arg1, java.security.cert.X509CRL arg2, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg3) throws AnnotatedException{
  }
  protected static void checkCRLs(com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg1, java.security.cert.X509Certificate arg2, java.util.Date arg3, java.security.cert.X509Certificate arg4, java.security.PublicKey arg5, java.util.List arg6) throws AnnotatedException{
  }
}
