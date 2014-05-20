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


public class References
  extends gov.nist.javax.sip.header.ParametersHeader  implements javax.sip.header.ExtensionHeader, ReferencesHeader
{
  // Constructors

  public References(){
    super();
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  public java.util.Iterator getParameterNames(){
    return (java.util.Iterator) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("callId")
  public java.lang.String getCallId(){
    return (java.lang.String) null;
  }
  public void setCallId(@com.francetelecom.rd.stubs.annotation.FieldSet("callId") java.lang.String arg1){
  }
  public void setRel(@com.francetelecom.rd.stubs.annotation.FieldSet("rel") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("rel")
  public java.lang.String getRel(){
    return (java.lang.String) null;
  }
}
