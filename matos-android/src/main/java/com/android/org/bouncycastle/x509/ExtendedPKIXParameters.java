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


public class ExtendedPKIXParameters
  extends java.security.cert.PKIXParameters{
  // Fields

  public static final int PKIX_VALIDITY_MODEL = 0;

  public static final int CHAIN_VALIDITY_MODEL = 1;

  // Constructors

  public ExtendedPKIXParameters(java.util.Set arg1) throws java.security.InvalidAlgorithmParameterException{
    super((java.util.Set) null);
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public static ExtendedPKIXParameters getInstance(java.security.cert.PKIXParameters arg1){
    return (ExtendedPKIXParameters) null;
  }
  protected void setParams(java.security.cert.PKIXParameters arg1){
  }
  public void setCertStores(java.util.List arg1){
  }
  public void setTargetCertConstraints(java.security.cert.CertSelector arg1){
  }
  public com.android.org.bouncycastle.util.Selector getTargetConstraints(){
    return (com.android.org.bouncycastle.util.Selector) null;
  }
  public boolean isAdditionalLocationsEnabled(){
    return false;
  }
  public int getValidityModel(){
    return 0;
  }
  public java.util.List getStores(){
    return (java.util.List) null;
  }
  public java.util.List getAdditionalStores(){
    return (java.util.List) null;
  }
  public boolean isUseDeltasEnabled(){
    return false;
  }
  public void setUseDeltasEnabled(boolean arg1){
  }
  public void setStores(java.util.List arg1){
  }
  public void addStore(com.android.org.bouncycastle.util.Store arg1){
  }
  public void addAdditionalStore(com.android.org.bouncycastle.util.Store arg1){
  }
  public void addAddionalStore(com.android.org.bouncycastle.util.Store arg1){
  }
  public void setValidityModel(int arg1){
  }
  public void setAdditionalLocationsEnabled(boolean arg1){
  }
  public void setTargetConstraints(com.android.org.bouncycastle.util.Selector arg1){
  }
  public java.util.Set getTrustedACIssuers(){
    return (java.util.Set) null;
  }
  public void setTrustedACIssuers(java.util.Set arg1){
  }
  public java.util.Set getNecessaryACAttributes(){
    return (java.util.Set) null;
  }
  public void setNecessaryACAttributes(java.util.Set arg1){
  }
  public java.util.Set getProhibitedACAttributes(){
    return (java.util.Set) null;
  }
  public void setProhibitedACAttributes(java.util.Set arg1){
  }
  public java.util.Set getAttrCertCheckers(){
    return (java.util.Set) null;
  }
  public void setAttrCertCheckers(java.util.Set arg1){
  }
}
