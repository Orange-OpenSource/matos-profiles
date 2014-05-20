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


public class ContentType
  extends ParametersHeader  implements javax.sip.header.ContentTypeHeader
{
  // Fields

  protected MediaRange mediaRange;

  // Constructors

  public ContentType(){
    super();
  }
  public ContentType(java.lang.String arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("contentType")
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public void setContentType(java.lang.String arg1, java.lang.String arg2){
  }
  public void setContentType(@com.francetelecom.rd.stubs.annotation.FieldSet("contentType") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.String getMediaType(){
    return (java.lang.String) null;
  }
  public MediaRange getMediaRange(){
    return (MediaRange) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("contentSubType")
  public java.lang.String getContentSubType(){
    return (java.lang.String) null;
  }
  public void setContentSubType(@com.francetelecom.rd.stubs.annotation.FieldSet("contentSubType") java.lang.String arg1) throws java.text.ParseException{
  }
  public void setMediaRange(MediaRange arg1){
  }
  public java.lang.String getCharset(){
    return (java.lang.String) null;
  }
  public int compareMediaRange(java.lang.String arg1){
    return 0;
  }
  public java.lang.String getMediaSubType(){
    return (java.lang.String) null;
  }
}
