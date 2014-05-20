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


public final class SessionExpires
  extends gov.nist.javax.sip.header.ParametersHeader  implements SessionExpiresHeader, javax.sip.header.ExtensionHeader
{
  // Fields

  public static final java.lang.String NAME = "Session-Expires";

  public int expires;

  public static final java.lang.String REFRESHER = "refresher";

  // Constructors

  public SessionExpires(){
    super();
  }
  // Methods

  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setExpires(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getExpires(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("refresher")
  public java.lang.String getRefresher(){
    return (java.lang.String) null;
  }
  public void setRefresher(@com.francetelecom.rd.stubs.annotation.FieldSet("refresher") java.lang.String arg1){
  }
}
