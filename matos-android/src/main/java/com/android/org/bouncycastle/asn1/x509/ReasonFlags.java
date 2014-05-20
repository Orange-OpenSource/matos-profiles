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
public class ReasonFlags
  extends com.android.org.bouncycastle.asn1.DERBitString{
  // Fields

  public static final int UNUSED = 128;

  public static final int KEY_COMPROMISE = 64;

  public static final int CA_COMPROMISE = 32;

  public static final int AFFILIATION_CHANGED = 16;

  public static final int SUPERSEDED = 8;

  public static final int CESSATION_OF_OPERATION = 4;

  public static final int CERTIFICATE_HOLD = 2;

  public static final int PRIVILEGE_WITHDRAWN = 1;

  public static final int AA_COMPROMISE = 32768;

  public static final int unused = 128;

  public static final int keyCompromise = 64;

  public static final int cACompromise = 32;

  public static final int affiliationChanged = 16;

  public static final int superseded = 8;

  public static final int cessationOfOperation = 4;

  public static final int certificateHold = 2;

  public static final int privilegeWithdrawn = 1;

  public static final int aACompromise = 32768;

  // Constructors

  public ReasonFlags(int arg1){
    super((byte) 0, 0);
  }
  public ReasonFlags(com.android.org.bouncycastle.asn1.DERBitString arg1){
    super((byte) 0, 0);
  }
}
