package gov.nist.javax.sip.header.ims;

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


public abstract class SecurityAgree
  extends gov.nist.javax.sip.header.ParametersHeader{
  // Constructors

  public SecurityAgree(java.lang.String arg1){
    super();
  }
  public SecurityAgree(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocol")
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("algorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  public void setAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("algorithm") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mode")
  public java.lang.String getMode(){
    return (java.lang.String) null;
  }
  public void setPreference(float arg1) throws javax.sip.InvalidArgumentException{
  }
  public float getPreference(){
    return 0.0f;
  }
  public void setMode(@com.francetelecom.rd.stubs.annotation.FieldSet("mode") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setProtocol(@com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setSecurityMechanism(@com.francetelecom.rd.stubs.annotation.FieldSet("securityMechanism") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setEncryptionAlgorithm(@com.francetelecom.rd.stubs.annotation.FieldSet("encryptionAlgorithm") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setSPIClient(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setSPIServer(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setPortClient(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setPortServer(int arg1) throws javax.sip.InvalidArgumentException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("securityMechanism")
  public java.lang.String getSecurityMechanism(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("encryptionAlgorithm")
  public java.lang.String getEncryptionAlgorithm(){
    return (java.lang.String) null;
  }
  public int getSPIClient(){
    return 0;
  }
  public int getSPIServer(){
    return 0;
  }
  public int getPortClient(){
    return 0;
  }
  public int getPortServer(){
    return 0;
  }
}
