package com.android.org.bouncycastle.crypto.params;

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
public class ECPrivateKeyParameters
  extends ECKeyParameters{
  // Constructors

  public ECPrivateKeyParameters(@com.francetelecom.rd.stubs.annotation.FieldSet("d") java.math.BigInteger arg1, ECDomainParameters arg2){
    super(false, (ECDomainParameters) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("d")
  public java.math.BigInteger getD(){
    return (java.math.BigInteger) null;
  }
}
