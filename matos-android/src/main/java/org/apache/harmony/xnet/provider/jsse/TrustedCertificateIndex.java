package org.apache.harmony.xnet.provider.jsse;

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
public final class TrustedCertificateIndex
{
  // Constructors

  public TrustedCertificateIndex(){
  }
  public TrustedCertificateIndex(@com.francetelecom.rd.stubs.annotation.FieldSet("mTrustAnchors") java.util.Set<java.security.cert.TrustAnchor> arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code({"return mTrustAnchors.iterator().next();"})
    public java.security.cert.TrustAnchor index(java.security.cert.X509Certificate arg1){
    return (java.security.cert.TrustAnchor) null;
  }
  public void index(java.security.cert.TrustAnchor arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"return mTrustAnchors.iterator().next();"})
  public java.security.cert.TrustAnchor findBySubjectAndPublicKey(java.security.cert.X509Certificate arg1){
    return (java.security.cert.TrustAnchor) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"return mTrustAnchors.iterator().next();"})
  public java.security.cert.TrustAnchor findByIssuerAndSignature(java.security.cert.X509Certificate arg1){
    return (java.security.cert.TrustAnchor) null;
  }
}
