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


public class X509CertSelector
  implements CertSelector
{
  // Constructors

  public X509CertSelector(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int getBasicConstraints(){
    return 0;
  }
  public boolean match(Certificate arg1){
    return false;
  }
  public X509Certificate getCertificate(){
    return (X509Certificate) null;
  }
  public java.util.Set<java.lang.String> getPolicy(){
    return (java.util.Set) null;
  }
  public void setPolicy(java.util.Set<java.lang.String> arg1) throws java.io.IOException{
  }
  public void setSerialNumber(java.math.BigInteger arg1){
  }
  public void setIssuer(javax.security.auth.x500.X500Principal arg1){
  }
  public void setIssuer(java.lang.String arg1) throws java.io.IOException{
  }
  public void setIssuer(byte [] arg1) throws java.io.IOException{
  }
  public void setSubject(javax.security.auth.x500.X500Principal arg1){
  }
  public void setSubject(java.lang.String arg1) throws java.io.IOException{
  }
  public void setSubject(byte [] arg1) throws java.io.IOException{
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public javax.security.auth.x500.X500Principal getIssuer(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public void setCertificate(X509Certificate arg1){
  }
  public byte [] getNameConstraints(){
    return (byte []) null;
  }
  public java.util.Collection<java.util.List<?>> getSubjectAlternativeNames(){
    return (java.util.Collection) null;
  }
  public javax.security.auth.x500.X500Principal getSubject(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public java.security.PublicKey getSubjectPublicKey(){
    return (java.security.PublicKey) null;
  }
  public boolean [] getKeyUsage(){
    return (boolean []) null;
  }
  public java.util.Set<java.lang.String> getExtendedKeyUsage(){
    return (java.util.Set) null;
  }
  public java.lang.String getIssuerAsString(){
    return (java.lang.String) null;
  }
  public byte [] getIssuerAsBytes() throws java.io.IOException{
    return (byte []) null;
  }
  public java.lang.String getSubjectAsString(){
    return (java.lang.String) null;
  }
  public byte [] getSubjectAsBytes() throws java.io.IOException{
    return (byte []) null;
  }
  public void setSubjectKeyIdentifier(byte [] arg1){
  }
  public byte [] getSubjectKeyIdentifier(){
    return (byte []) null;
  }
  public void setAuthorityKeyIdentifier(byte [] arg1){
  }
  public byte [] getAuthorityKeyIdentifier(){
    return (byte []) null;
  }
  public void setCertificateValid(java.util.Date arg1){
  }
  public java.util.Date getCertificateValid(){
    return (java.util.Date) null;
  }
  public void setPrivateKeyValid(java.util.Date arg1){
  }
  public java.util.Date getPrivateKeyValid(){
    return (java.util.Date) null;
  }
  public void setSubjectPublicKeyAlgID(java.lang.String arg1) throws java.io.IOException{
  }
  public java.lang.String getSubjectPublicKeyAlgID(){
    return (java.lang.String) null;
  }
  public void setSubjectPublicKey(java.security.PublicKey arg1){
  }
  public void setSubjectPublicKey(byte [] arg1) throws java.io.IOException{
  }
  public void setKeyUsage(boolean [] arg1){
  }
  public void setExtendedKeyUsage(java.util.Set<java.lang.String> arg1) throws java.io.IOException{
  }
  public void setMatchAllSubjectAltNames(boolean arg1){
  }
  public boolean getMatchAllSubjectAltNames(){
    return false;
  }
  public void setSubjectAlternativeNames(java.util.Collection<java.util.List<?>> arg1) throws java.io.IOException{
  }
  public void addSubjectAlternativeName(int arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void addSubjectAlternativeName(int arg1, byte [] arg2) throws java.io.IOException{
  }
  public void setNameConstraints(byte [] arg1) throws java.io.IOException{
  }
  public void setBasicConstraints(int arg1){
  }
  public void addPathToName(int arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void addPathToName(int arg1, byte [] arg2) throws java.io.IOException{
  }
  public void setPathToNames(java.util.Collection<java.util.List<?>> arg1) throws java.io.IOException{
  }
  public java.util.Collection<java.util.List<?>> getPathToNames(){
    return (java.util.Collection) null;
  }
}
