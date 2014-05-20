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


public class SIPIfMatch
  extends SIPHeader  implements javax.sip.header.ExtensionHeader, javax.sip.header.SIPIfMatchHeader
{
  // Fields

  protected java.lang.String entityTag;

  // Constructors

  public SIPIfMatch(){
    super((java.lang.String) null);
  }
  public SIPIfMatch(java.lang.String arg1) throws java.text.ParseException{
    super((java.lang.String) null);
  }
  // Methods

  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("eTag")
  public java.lang.String getETag(){
    return (java.lang.String) null;
  }
  public void setETag(@com.francetelecom.rd.stubs.annotation.FieldSet("eTag") java.lang.String arg1) throws java.text.ParseException{
  }
}
