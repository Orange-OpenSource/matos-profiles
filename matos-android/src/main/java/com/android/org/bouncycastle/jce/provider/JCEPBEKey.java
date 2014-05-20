package com.android.org.bouncycastle.jce.provider;

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


public class JCEPBEKey
  implements javax.crypto.interfaces.PBEKey
{
  // Constructors

  public JCEPBEKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mOID") com.android.org.bouncycastle.asn1.DERObjectIdentifier arg2, int arg3, int arg4, int arg5, int arg6, javax.crypto.spec.PBEKeySpec arg7, com.android.org.bouncycastle.crypto.CipherParameters arg8){
  }
  // Methods

  public byte [] getEncoded(){
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public char [] getPassword(){
    return (char []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mOID")
  public com.android.org.bouncycastle.asn1.DERObjectIdentifier getOID(){
    return (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null;
  }
  public byte [] getSalt(){
    return (byte []) null;
  }
  public int getIterationCount(){
    return 0;
  }
}
