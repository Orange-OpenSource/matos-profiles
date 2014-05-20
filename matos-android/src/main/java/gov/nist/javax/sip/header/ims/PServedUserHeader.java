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


public interface PServedUserHeader
{
  // Fields

  public static final java.lang.String NAME = "P-Served-User";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("registrationState")
  public java.lang.String getRegistrationState();
  @com.francetelecom.rd.stubs.annotation.FieldGet("sessionCase")
  public java.lang.String getSessionCase();
  public void setRegistrationState(@com.francetelecom.rd.stubs.annotation.FieldSet("registrationState") java.lang.String arg1);
  public void setSessionCase(@com.francetelecom.rd.stubs.annotation.FieldSet("sessionCase") java.lang.String arg1);
}
