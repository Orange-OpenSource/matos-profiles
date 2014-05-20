package com.android.org.bouncycastle.asn1.x509;

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
public class CRLReason
  extends com.android.org.bouncycastle.asn1.DEREnumerated{
  // Fields

  public static final int UNSPECIFIED = 0;

  public static final int KEY_COMPROMISE = 1;

  public static final int CA_COMPROMISE = 2;

  public static final int AFFILIATION_CHANGED = 3;

  public static final int SUPERSEDED = 4;

  public static final int CESSATION_OF_OPERATION = 5;

  public static final int CERTIFICATE_HOLD = 6;

  public static final int REMOVE_FROM_CRL = 8;

  public static final int PRIVILEGE_WITHDRAWN = 9;

  public static final int AA_COMPROMISE = 10;

  public static final int unspecified = 0;

  public static final int keyCompromise = 1;

  public static final int cACompromise = 2;

  public static final int affiliationChanged = 3;

  public static final int superseded = 4;

  public static final int cessationOfOperation = 5;

  public static final int certificateHold = 6;

  public static final int removeFromCRL = 8;

  public static final int privilegeWithdrawn = 9;

  public static final int aACompromise = 10;

  // Constructors

  public CRLReason(int arg1){
    super(0);
  }
  public CRLReason(com.android.org.bouncycastle.asn1.DEREnumerated arg1){
    super(0);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
