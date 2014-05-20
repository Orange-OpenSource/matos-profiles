package gov.nist.javax.sip.header.ims;

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


public interface PPreferredServiceHeader
  extends javax.sip.header.Header
{
  // Fields

  public static final java.lang.String NAME = "P-Preferred-Service";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("applicationIdentifiers")
  public java.lang.String getApplicationIdentifiers();
  @com.francetelecom.rd.stubs.annotation.FieldGet("subserviceIdentifiers")
  public java.lang.String getSubserviceIdentifiers();
  public void setApplicationIdentifiers(@com.francetelecom.rd.stubs.annotation.FieldSet("applicationIdentifiers") java.lang.String arg1);
  public void setSubserviceIdentifiers(@com.francetelecom.rd.stubs.annotation.FieldSet("subserviceIdentifiers") java.lang.String arg1);
}
