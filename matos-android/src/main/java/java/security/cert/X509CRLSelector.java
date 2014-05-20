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


public class X509CRLSelector
  implements CRLSelector
{
  // Constructors

  public X509CRLSelector(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public boolean match(CRL arg1){
    return false;
  }
  public void setIssuers(java.util.Collection<javax.security.auth.x500.X500Principal> arg1){
  }
  public void setIssuerNames(java.util.Collection<?> arg1) throws java.io.IOException{
  }
  public void addIssuer(javax.security.auth.x500.X500Principal arg1){
  }
  public void addIssuerName(java.lang.String arg1) throws java.io.IOException{
  }
  public void addIssuerName(byte [] arg1) throws java.io.IOException{
  }
  public void setMinCRLNumber(java.math.BigInteger arg1){
  }
  public void setMaxCRLNumber(java.math.BigInteger arg1){
  }
  public void setDateAndTime(java.util.Date arg1){
  }
  public void setCertificateChecking(X509Certificate arg1){
  }
  public java.util.Collection<javax.security.auth.x500.X500Principal> getIssuers(){
    return (java.util.Collection) null;
  }
  public java.util.Collection<java.lang.Object> getIssuerNames(){
    return (java.util.Collection) null;
  }
  public java.math.BigInteger getMinCRL(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getMaxCRL(){
    return (java.math.BigInteger) null;
  }
  public java.util.Date getDateAndTime(){
    return (java.util.Date) null;
  }
  public X509Certificate getCertificateChecking(){
    return (X509Certificate) null;
  }
}
