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


public class MediaRange
  extends SIPObject{
  // Fields

  protected java.lang.String type;

  protected java.lang.String subtype;

  // Constructors

  public MediaRange(){
    super();
  }
  // Methods

  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("type")
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public void setType(@com.francetelecom.rd.stubs.annotation.FieldSet("this.type") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("subtype")
  public java.lang.String getSubtype(){
    return (java.lang.String) null;
  }
  public void setSubtype(@com.francetelecom.rd.stubs.annotation.FieldSet("this.subtype") java.lang.String arg1){
  }
}
