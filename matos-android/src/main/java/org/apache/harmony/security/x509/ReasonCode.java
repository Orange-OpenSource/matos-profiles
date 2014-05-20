package org.apache.harmony.security.x509;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class ReasonCode
  extends ExtensionValue{
  // Fields

  public static final byte UNSPECIFIED = 0;

  public static final byte KEY_COMPROMISE = 1;

  public static final byte CA_COMPROMISE = 2;

  public static final byte AFFILIATION_CHANGED = 3;

  public static final byte SUPERSEDED = 4;

  public static final byte CESSATION_OF_OPERATION = 5;

  public static final byte CERTIFICATE_HOLD = 6;

  public static final byte REMOVE_FROM_CRL = 8;

  public static final byte PRIVILEGE_WITHDRAWN = 9;

  public static final byte AA_COMPROMISE = 10;

  public static final org.apache.harmony.security.asn1.ASN1Type ASN1 = null;

  // Constructors

  public ReasonCode(byte [] arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void dumpValue(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
}
