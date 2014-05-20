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


public interface ReferencesHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters
{
  // Fields

  public static final java.lang.String NAME = "References";

  public static final java.lang.String CHAIN = "chain";

  public static final java.lang.String INQUIRY = "inquiry";

  public static final java.lang.String REFER = "refer";

  public static final java.lang.String SEQUEL = "sequel";

  public static final java.lang.String XFER = "xfer";

  public static final java.lang.String REL = "rel";

  public static final java.lang.String SERVICE = "service";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("callId")
  public java.lang.String getCallId();
  public void setCallId(@com.francetelecom.rd.stubs.annotation.FieldSet("callId") java.lang.String arg1) throws java.text.ParseException;
  public void setRel(@com.francetelecom.rd.stubs.annotation.FieldSet("rel") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("rel")
  public java.lang.String getRel();
}
