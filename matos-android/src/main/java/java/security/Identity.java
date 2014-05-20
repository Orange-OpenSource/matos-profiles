package java.security;

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
public abstract class Identity
  implements Principal, java.io.Serializable
{
  // Constructors

  protected Identity(){
  }
  public Identity(java.lang.String arg1){
  }
  public Identity(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mScope") IdentityScope arg2) throws KeyManagementException{
  }
  // Methods

  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(boolean arg1){
    return (java.lang.String) null;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public final java.lang.String getName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPublicKey")
  public PublicKey getPublicKey(){
    return (PublicKey) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mInfo")
  public java.lang.String getInfo(){
    return (java.lang.String) null;
  }
  public void setPublicKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mPublicKey") PublicKey arg1) throws KeyManagementException{
  }
  public Certificate [] certificates(){
    return (Certificate []) null;
  }
  public void addCertificate(Certificate arg1) throws KeyManagementException{
  }
  public void removeCertificate(Certificate arg1) throws KeyManagementException{
  }
  protected boolean identityEquals(Identity arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mScope")
  public final IdentityScope getScope(){
    return (IdentityScope) null;
  }
  public void setInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("mInfo") java.lang.String arg1){
  }
}
