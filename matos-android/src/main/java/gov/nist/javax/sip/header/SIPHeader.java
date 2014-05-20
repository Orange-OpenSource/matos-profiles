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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SIPHeaderImplem", superClass = "")
public abstract class SIPHeader
  extends SIPObject  implements javax.sip.header.Header, SIPHeaderNames, HeaderExt
{
  // Fields

  protected java.lang.String headerName;

  // Constructors

  protected SIPHeader(java.lang.String arg1){
    super();
  }
  public SIPHeader(){
    super();
  }
  // Methods

  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public boolean isHeaderList(){
    return false;
  }
  protected abstract java.lang.String encodeBody();
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public void setHeaderName(@com.francetelecom.rd.stubs.annotation.FieldSet("this.headerName") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("headerName")
  public java.lang.String getHeaderName(){
    return (java.lang.String) null;
  }
  public java.lang.String getHeaderValue(){
    return (java.lang.String) null;
  }
}
