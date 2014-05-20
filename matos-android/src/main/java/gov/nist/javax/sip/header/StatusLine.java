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


public final class StatusLine
  extends SIPObject  implements SipStatusLine
{
  // Fields

  protected boolean matchStatusClass;

  protected java.lang.String sipVersion;

  protected int statusCode;

  protected java.lang.String reasonPhrase;

  // Constructors

  public StatusLine(){
    super();
  }
  // Methods

  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public void setStatusCode(int arg1){
  }
  public void setReasonPhrase(@com.francetelecom.rd.stubs.annotation.FieldSet("this.reasonPhrase") java.lang.String arg1){
  }
  public int getStatusCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("reasonPhrase")
  public java.lang.String getReasonPhrase(){
    return (java.lang.String) null;
  }
  public void setSipVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("this.sipVersion") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sipVersion")
  public java.lang.String getSipVersion(){
    return (java.lang.String) null;
  }
  public java.lang.String getVersionMajor(){
    return (java.lang.String) null;
  }
  public java.lang.String getVersionMinor(){
    return (java.lang.String) null;
  }
  public void setMatchStatusClass(boolean arg1){
  }
}
