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


public class PKIXParameters
  implements CertPathParameters
{
  // Constructors

  public PKIXParameters(java.util.Set<TrustAnchor> arg1) throws java.security.InvalidAlgorithmParameterException{
  }
  public PKIXParameters(java.security.KeyStore arg1) throws java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.util.Date getDate(){
    return (java.util.Date) null;
  }
  public void setDate(java.util.Date arg1){
  }
  public java.util.Set<TrustAnchor> getTrustAnchors(){
    return (java.util.Set) null;
  }
  public java.util.Set<java.lang.String> getInitialPolicies(){
    return (java.util.Set) null;
  }
  public java.lang.String getSigProvider(){
    return (java.lang.String) null;
  }
  public boolean isExplicitPolicyRequired(){
    return false;
  }
  public boolean isAnyPolicyInhibited(){
    return false;
  }
  public boolean isPolicyMappingInhibited(){
    return false;
  }
  public java.util.List<PKIXCertPathChecker> getCertPathCheckers(){
    return (java.util.List) null;
  }
  public void setTrustAnchors(java.util.Set<TrustAnchor> arg1) throws java.security.InvalidAlgorithmParameterException{
  }
  public void setAnyPolicyInhibited(boolean arg1){
  }
  public void setCertPathCheckers(java.util.List<PKIXCertPathChecker> arg1){
  }
  public void addCertPathChecker(PKIXCertPathChecker arg1){
  }
  public java.util.List<CertStore> getCertStores(){
    return (java.util.List) null;
  }
  public void setCertStores(java.util.List<CertStore> arg1){
  }
  public void addCertStore(CertStore arg1){
  }
  public void setExplicitPolicyRequired(boolean arg1){
  }
  public void setInitialPolicies(java.util.Set<java.lang.String> arg1){
  }
  public void setPolicyMappingInhibited(boolean arg1){
  }
  public boolean getPolicyQualifiersRejected(){
    return false;
  }
  public void setPolicyQualifiersRejected(boolean arg1){
  }
  public boolean isRevocationEnabled(){
    return false;
  }
  public void setRevocationEnabled(boolean arg1){
  }
  public void setSigProvider(java.lang.String arg1){
  }
  public CertSelector getTargetCertConstraints(){
    return (CertSelector) null;
  }
  public void setTargetCertConstraints(CertSelector arg1){
  }
}
