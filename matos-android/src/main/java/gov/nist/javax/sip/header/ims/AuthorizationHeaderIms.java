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


public interface AuthorizationHeaderIms
  extends javax.sip.header.AuthorizationHeader
{
  // Fields

  public static final java.lang.String YES = "yes";

  public static final java.lang.String NO = "no";

  // Methods

  public void setIntegrityProtected(@com.francetelecom.rd.stubs.annotation.FieldSet("integrityProtected") java.lang.String arg1) throws javax.sip.InvalidArgumentException, java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("integrityProtected")
  public java.lang.String getIntegrityProtected();
}
