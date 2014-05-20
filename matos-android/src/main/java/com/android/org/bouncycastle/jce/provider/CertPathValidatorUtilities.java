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
public class CertPathValidatorUtilities
{
  // Fields

  protected static final PKIXCRLUtil CRL_UTIL = null;

  protected static final java.lang.String CERTIFICATE_POLICIES = (java.lang.String) null;

  protected static final java.lang.String BASIC_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String POLICY_MAPPINGS = (java.lang.String) null;

  protected static final java.lang.String SUBJECT_ALTERNATIVE_NAME = (java.lang.String) null;

  protected static final java.lang.String NAME_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String KEY_USAGE = (java.lang.String) null;

  protected static final java.lang.String INHIBIT_ANY_POLICY = (java.lang.String) null;

  protected static final java.lang.String ISSUING_DISTRIBUTION_POINT = (java.lang.String) null;

  protected static final java.lang.String DELTA_CRL_INDICATOR = (java.lang.String) null;

  protected static final java.lang.String POLICY_CONSTRAINTS = (java.lang.String) null;

  protected static final java.lang.String FRESHEST_CRL = (java.lang.String) null;

  protected static final java.lang.String CRL_DISTRIBUTION_POINTS = (java.lang.String) null;

  protected static final java.lang.String AUTHORITY_KEY_IDENTIFIER = (java.lang.String) null;

  protected static final java.lang.String ANY_POLICY = (java.lang.String) null;

  protected static final java.lang.String CRL_NUMBER = (java.lang.String) null;

  protected static final int KEY_CERT_SIGN = 0;

  protected static final int CRL_SIGN = 0;

  protected static final java.lang.String [] crlReasons = null;

  // Constructors

  public CertPathValidatorUtilities(){
  }
  // Methods

  protected static com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(java.security.PublicKey arg1) throws java.security.cert.CertPathValidatorException{
    return (com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier) null;
  }
  protected static com.android.org.bouncycastle.asn1.DERObject getExtensionValue(java.security.cert.X509Extension arg1, java.lang.String arg2) throws AnnotatedException{
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  protected static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate arg1, java.util.Set arg2) throws AnnotatedException{
    return (java.security.cert.TrustAnchor) null;
  }
  protected static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate arg1, java.util.Set arg2, java.lang.String arg3) throws AnnotatedException{
    return (java.security.cert.TrustAnchor) null;
  }
  protected static javax.security.auth.x500.X500Principal getSubjectPrincipal(java.security.cert.X509Certificate arg1){
    return (javax.security.auth.x500.X500Principal) null;
  }
  protected static java.security.PublicKey getNextWorkingKey(java.util.List arg1, int arg2) throws java.security.cert.CertPathValidatorException{
    return (java.security.PublicKey) null;
  }
  protected static javax.security.auth.x500.X500Principal getEncodedIssuerPrincipal(java.lang.Object arg1){
    return (javax.security.auth.x500.X500Principal) null;
  }
  protected static void verifyX509Certificate(java.security.cert.X509Certificate arg1, java.security.PublicKey arg2, java.lang.String arg3) throws java.security.GeneralSecurityException{
  }
  protected static void addAdditionalStoresFromAltNames(java.security.cert.X509Certificate arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2) throws java.security.cert.CertificateParsingException{
  }
  protected static void addAdditionalStoreFromLocation(java.lang.String arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2){
  }
  protected static java.util.Date getValidDate(java.security.cert.PKIXParameters arg1){
    return (java.util.Date) null;
  }
  protected static boolean isSelfIssued(java.security.cert.X509Certificate arg1){
    return false;
  }
  protected static javax.security.auth.x500.X500Principal getIssuerPrincipal(java.security.cert.X509CRL arg1){
    return (javax.security.auth.x500.X500Principal) null;
  }
  protected static final java.util.Set getQualifierSet(com.android.org.bouncycastle.asn1.ASN1Sequence arg1) throws java.security.cert.CertPathValidatorException{
    return (java.util.Set) null;
  }
  protected static PKIXPolicyNode removePolicyNode(PKIXPolicyNode arg1, java.util.List [] arg2, PKIXPolicyNode arg3){
    return (PKIXPolicyNode) null;
  }
  protected static boolean processCertD1i(int arg1, java.util.List [] arg2, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg3, java.util.Set arg4){
    return false;
  }
  protected static void processCertD1ii(int arg1, java.util.List [] arg2, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg3, java.util.Set arg4){
  }
  protected static void prepareNextCertB1(int arg1, java.util.List [] arg2, java.lang.String arg3, java.util.Map arg4, java.security.cert.X509Certificate arg5) throws AnnotatedException, java.security.cert.CertPathValidatorException{
  }
  protected static PKIXPolicyNode prepareNextCertB2(int arg1, java.util.List [] arg2, java.lang.String arg3, PKIXPolicyNode arg4){
    return (PKIXPolicyNode) null;
  }
  protected static boolean isAnyPolicy(java.util.Set arg1){
    return false;
  }
  protected static java.util.Collection findCertificates(com.android.org.bouncycastle.x509.X509CertStoreSelector arg1, java.util.List arg2) throws AnnotatedException{
    return (java.util.Collection) null;
  }
  protected static void addAdditionalStoresFromCRLDistributionPoint(com.android.org.bouncycastle.asn1.x509.CRLDistPoint arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2) throws AnnotatedException{
  }
  protected static void getCRLIssuersFromDistributionPoint(com.android.org.bouncycastle.asn1.x509.DistributionPoint arg1, java.util.Collection arg2, java.security.cert.X509CRLSelector arg3, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg4) throws AnnotatedException{
  }
  protected static java.util.Set getDeltaCRLs(java.util.Date arg1, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg2, java.security.cert.X509CRL arg3) throws AnnotatedException{
    return (java.util.Set) null;
  }
  protected static java.util.Set getCompleteCRLs(com.android.org.bouncycastle.asn1.x509.DistributionPoint arg1, java.lang.Object arg2, java.util.Date arg3, com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg4) throws AnnotatedException{
    return (java.util.Set) null;
  }
  protected static java.util.Date getValidCertDateFromValidityModel(com.android.org.bouncycastle.x509.ExtendedPKIXParameters arg1, java.security.cert.CertPath arg2, int arg3) throws AnnotatedException{
    return (java.util.Date) null;
  }
  protected static java.util.Collection findIssuerCerts(java.security.cert.X509Certificate arg1, com.android.org.bouncycastle.x509.ExtendedPKIXBuilderParameters arg2) throws AnnotatedException{
    return (java.util.Collection) null;
  }
}
