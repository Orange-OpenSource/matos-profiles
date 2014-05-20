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


public final class CallIdentifier
  extends SIPObject{
  // Fields

  protected java.lang.String localId;

  protected java.lang.String host;

  // Constructors

  public CallIdentifier(){
    super();
  }
  public CallIdentifier(java.lang.String arg1, java.lang.String arg2){
    super();
  }
  public CallIdentifier(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("this.host") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("localId")
  public java.lang.String getLocalId(){
    return (java.lang.String) null;
  }
  public void setLocalId(@com.francetelecom.rd.stubs.annotation.FieldSet("this.localId") java.lang.String arg1){
  }
  public void setCallID(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
}
