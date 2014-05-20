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


public final class ContentDisposition
  extends ParametersHeader  implements javax.sip.header.ContentDispositionHeader
{
  // Fields

  protected java.lang.String dispositionType;

  // Constructors

  public ContentDisposition(){
    super();
  }
  // Methods

  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getContentDisposition(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("dispositionType")
  public java.lang.String getDispositionType(){
    return (java.lang.String) null;
  }
  public void setDispositionType(@com.francetelecom.rd.stubs.annotation.FieldSet("this.dispositionType") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("handling")
  public java.lang.String getHandling(){
    return (java.lang.String) null;
  }
  public void setHandling(@com.francetelecom.rd.stubs.annotation.FieldSet("handling") java.lang.String arg1) throws java.text.ParseException{
  }
}
