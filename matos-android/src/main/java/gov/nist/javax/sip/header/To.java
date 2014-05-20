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


public final class To
  extends AddressParametersHeader  implements javax.sip.header.ToHeader
{
  // Constructors

  public To(){
    super((java.lang.String) null);
  }
  public To(From arg1){
    super((java.lang.String) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("tag")
  public java.lang.String getTag(){
    return (java.lang.String) null;
  }
  public gov.nist.core.HostPort getHostPort(){
    return (gov.nist.core.HostPort) null;
  }
  public void setTag(@com.francetelecom.rd.stubs.annotation.FieldSet("tag") java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.String getUserAtHostPort(){
    return (java.lang.String) null;
  }
  public boolean hasTag(){
    return false;
  }
  public void removeTag(){
  }
}
