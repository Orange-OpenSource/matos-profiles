package org.apache.harmony.security.x509;

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
public final class Extensions
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Type ASN1 = null;

  // Constructors

  public Extensions(){
  }
  public Extensions(java.util.List<Extension> arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int size(){
    return 0;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void dumpValue(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
  public boolean [] valueOfKeyUsage(){
    return (boolean []) null;
  }
  public java.util.List<java.lang.String> valueOfExtendedKeyUsage() throws java.io.IOException{
    return (java.util.List) null;
  }
  public int valueOfBasicConstrains(){
    return 0;
  }
  public java.util.Collection<java.util.List<?>> valueOfSubjectAlternativeName() throws java.io.IOException{
    return (java.util.Collection) null;
  }
  public java.util.Collection<java.util.List<?>> valueOfIssuerAlternativeName() throws java.io.IOException{
    return (java.util.Collection) null;
  }
  public java.util.Set<java.lang.String> getNonCriticalExtensions(){
    return (java.util.Set) null;
  }
  public java.util.Set<java.lang.String> getCriticalExtensions(){
    return (java.util.Set) null;
  }
  public Extension getExtensionByOID(java.lang.String arg1){
    return (Extension) null;
  }
  public boolean hasUnsupportedCritical(){
    return false;
  }
  public javax.security.auth.x500.X500Principal valueOfCertificateIssuerExtension() throws java.io.IOException{
    return (javax.security.auth.x500.X500Principal) null;
  }
}
