package gov.nist.javax.sip.header.extensions;

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


public class Replaces
  extends gov.nist.javax.sip.header.ParametersHeader  implements ReplacesHeader, javax.sip.header.ExtensionHeader
{
  // Fields

  public static final java.lang.String NAME = "Replaces";

  public gov.nist.javax.sip.header.CallIdentifier callIdentifier;

  public java.lang.String callId;

  // Constructors

  public Replaces(){
    super();
  }
  public Replaces(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    super();
  }
  // Methods

  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("callId")
  public java.lang.String getCallId(){
    return (java.lang.String) null;
  }
  public void setCallId(@com.francetelecom.rd.stubs.annotation.FieldSet("this.callId") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("toTag")
  public java.lang.String getToTag(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("fromTag")
  public java.lang.String getFromTag(){
    return (java.lang.String) null;
  }
  public boolean hasFromTag(){
    return false;
  }
  public boolean hasToTag(){
    return false;
  }
  public void setFromTag(@com.francetelecom.rd.stubs.annotation.FieldSet("fromTag") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setToTag(@com.francetelecom.rd.stubs.annotation.FieldSet("toTag") java.lang.String arg1) throws java.text.ParseException{
  }
  public gov.nist.javax.sip.header.CallIdentifier getCallIdentifer(){
    return (gov.nist.javax.sip.header.CallIdentifier) null;
  }
  public void setCallIdentifier(gov.nist.javax.sip.header.CallIdentifier arg1){
  }
  public void removeToTag(){
  }
  public void removeFromTag(){
  }
}
