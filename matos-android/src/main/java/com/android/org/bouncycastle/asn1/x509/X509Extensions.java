package com.android.org.bouncycastle.asn1.x509;

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


public class X509Extensions
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Fields

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectDirectoryAttributes = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectKeyIdentifier = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier KeyUsage = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier PrivateKeyUsagePeriod = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectAlternativeName = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier IssuerAlternativeName = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier BasicConstraints = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier CRLNumber = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier ReasonCode = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier InstructionCode = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier InvalidityDate = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier DeltaCRLIndicator = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier IssuingDistributionPoint = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier CertificateIssuer = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier NameConstraints = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier CRLDistributionPoints = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier CertificatePolicies = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier PolicyMappings = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier AuthorityKeyIdentifier = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier PolicyConstraints = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier ExtendedKeyUsage = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier FreshestCRL = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier InhibitAnyPolicy = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier AuthorityInfoAccess = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectInfoAccess = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier LogoType = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier BiometricInfo = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier QCStatements = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier AuditIdentity = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier NoRevAvail = null;

  public static final com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier TargetInformation = null;

  // Constructors

  public X509Extensions(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  public X509Extensions(java.util.Hashtable arg1){
    super();
  }
  public X509Extensions(java.util.Vector arg1, java.util.Hashtable arg2){
    super();
  }
  public X509Extensions(java.util.Vector arg1, java.util.Vector arg2){
    super();
  }
  // Methods

  public static X509Extensions getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (X509Extensions) null;
  }
  public static X509Extensions getInstance(java.lang.Object arg1){
    return (X509Extensions) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier [] getCriticalExtensionOIDs(){
    return (com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier []) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier [] getNonCriticalExtensionOIDs(){
    return (com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier []) null;
  }
  public X509Extension getExtension(com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier arg1){
    return (X509Extension) null;
  }
  public X509Extension getExtension(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1){
    return (X509Extension) null;
  }
  public com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier [] getExtensionOIDs(){
    return (com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier []) null;
  }
  public java.util.Enumeration oids(){
    return (java.util.Enumeration) null;
  }
  public boolean equivalent(X509Extensions arg1){
    return false;
  }
}
