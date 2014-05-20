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


public class X509CRLStoreSelector
  extends java.security.cert.X509CRLSelector  implements com.android.org.bouncycastle.util.Selector
{
  // Constructors

  public X509CRLStoreSelector(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public static X509CRLStoreSelector getInstance(java.security.cert.X509CRLSelector arg1){
    return (X509CRLStoreSelector) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public boolean match(java.security.cert.CRL arg1){
    return false;
  }
  public void setIssuingDistributionPoint(byte [] arg1){
  }
  public void setIssuingDistributionPointEnabled(boolean arg1){
  }
  public void setMaxBaseCRLNumber(java.math.BigInteger arg1){
  }
  public void setAttrCertificateChecking(X509AttributeCertificate arg1){
  }
  public void setCompleteCRLEnabled(boolean arg1){
  }
  public boolean isIssuingDistributionPointEnabled(){
    return false;
  }
  public X509AttributeCertificate getAttrCertificateChecking(){
    return (X509AttributeCertificate) null;
  }
  public boolean isDeltaCRLIndicatorEnabled(){
    return false;
  }
  public boolean isCompleteCRLEnabled(){
    return false;
  }
  public void setDeltaCRLIndicatorEnabled(boolean arg1){
  }
  public java.math.BigInteger getMaxBaseCRLNumber(){
    return (java.math.BigInteger) null;
  }
  public byte [] getIssuingDistributionPoint(){
    return (byte []) null;
  }
}
