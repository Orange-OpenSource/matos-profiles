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


public final class ErrorInfo
  extends ParametersHeader  implements javax.sip.header.ErrorInfoHeader
{
  // Fields

  protected gov.nist.javax.sip.address.GenericURI errorInfo;

  // Constructors

  public ErrorInfo(){
    super();
  }
  public ErrorInfo(gov.nist.javax.sip.address.GenericURI arg1){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setErrorInfo(javax.sip.address.URI arg1){
  }
  public javax.sip.address.URI getErrorInfo(){
    return (javax.sip.address.URI) null;
  }
  public void setErrorMessage(@com.francetelecom.rd.stubs.annotation.FieldSet("errorMessage") java.lang.String arg1) throws java.text.ParseException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("errorMessage")
  public java.lang.String getErrorMessage(){
    return (java.lang.String) null;
  }
}
