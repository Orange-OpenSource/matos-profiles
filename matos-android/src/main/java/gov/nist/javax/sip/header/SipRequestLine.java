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


public interface SipRequestLine
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod();
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("method") java.lang.String arg1);
  public javax.sip.address.URI getUri();
  public void setSipVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("sipVersion") java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("sipVersion")
  public java.lang.String getSipVersion();
  public java.lang.String getVersionMajor();
  public java.lang.String getVersionMinor();
  public void setUri(javax.sip.address.URI arg1);
}