package gov.nist.javax.sip.header;

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


public abstract class AuthenticationHeader
  extends ParametersHeader{
  // Fields

  public static final java.lang.String DOMAIN = "domain";

  public static final java.lang.String REALM = "realm";

  public static final java.lang.String OPAQUE = "opaque";

  public static final java.lang.String ALGORITHM = "algorithm";

  public static final java.lang.String QOP = "qop";

  public static final java.lang.String STALE = "stale";

  public static final java.lang.String SIGNATURE = "signature";

  public static final java.lang.String RESPONSE = "response";

  public static final java.lang.String SIGNED_BY = "signed-by";

  public static final java.lang.String NC = "nc";

  public static final java.lang.String URI = "uri";

  public static final java.lang.String USERNAME = "username";

  public static final java.lang.String CNONCE = "cnonce";

  public static final java.lang.String NONCE = "nonce";

  public static final java.lang.String IK = "ik";

  public static final java.lang.String CK = "ck";

  public static final java.lang.String INTEGRITY_PROTECTED = "integrity-protected";

  protected java.lang.String scheme;

  // Constructors

  public AuthenticationHeader(java.lang.String arg1){
    super();
  }
  public AuthenticationHeader(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("algorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  public boolean isStale(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("domain")
  public java.lang.String getDomain(){
    return (java.lang.String) null;
  }
  public void setDomain(@com.francetelecom.rd.stubs.annotation.FieldSet("domain") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("realm")
  public java.lang.String getRealm(){
    return (java.lang.String) null;
  }
  public void setAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("algorithm") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public javax.sip.address.URI getURI(){
    return (javax.sip.address.URI) null;
  }
  public void setURI(javax.sip.address.URI arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("response")
  public java.lang.String getResponse(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("qop")
  public java.lang.String getQop(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("noncev")
  public java.lang.String getNonce(){
    return (java.lang.String) null;
  }
  public void setUsername(@com.francetelecom.rd.stubs.annotation.FieldSet("username") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setRealm(@com.francetelecom.rd.stubs.annotation.FieldSet("realm") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setNonce(@com.francetelecom.rd.stubs.annotation.FieldSet("noncev") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setResponse(@com.francetelecom.rd.stubs.annotation.FieldSet("response") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("opaque")
  public java.lang.String getOpaque(){
    return (java.lang.String) null;
  }
  public void setOpaque(@com.francetelecom.rd.stubs.annotation.FieldSet("opaque") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setQop(@com.francetelecom.rd.stubs.annotation.FieldSet("qop") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setCNonce(@com.francetelecom.rd.stubs.annotation.FieldSet("cNonce") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setNonceCount(int arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("cNonce")
  public java.lang.String getCNonce(){
    return (java.lang.String) null;
  }
  public int getNonceCount(){
    return 0;
  }
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("this.scheme") java.lang.String arg1){
  }
  public void setStale(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("username")
  public java.lang.String getUsername(){
    return (java.lang.String) null;
  }
  public void setIK(@com.francetelecom.rd.stubs.annotation.FieldSet("IKv") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("IKv")
  public java.lang.String getIK(){
    return (java.lang.String) null;
  }
  public void setCK(@com.francetelecom.rd.stubs.annotation.FieldSet("CKv") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("CKv")
  public java.lang.String getCK(){
    return (java.lang.String) null;
  }
  public void setChallenge(Challenge arg1){
  }
  public void setIntegrityProtected(@com.francetelecom.rd.stubs.annotation.FieldSet("integrityProtected") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("integrityProtected")
  public java.lang.String getIntegrityProtected(){
    return (java.lang.String) null;
  }
}
