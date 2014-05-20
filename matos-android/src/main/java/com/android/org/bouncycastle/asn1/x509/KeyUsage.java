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
public class KeyUsage
  extends com.android.org.bouncycastle.asn1.DERBitString{
  // Fields

  public static final int digitalSignature = 128;

  public static final int nonRepudiation = 64;

  public static final int keyEncipherment = 32;

  public static final int dataEncipherment = 16;

  public static final int keyAgreement = 8;

  public static final int keyCertSign = 4;

  public static final int cRLSign = 2;

  public static final int encipherOnly = 1;

  public static final int decipherOnly = 32768;

  // Constructors

  public KeyUsage(int arg1){
    super((byte) 0, 0);
  }
  public KeyUsage(com.android.org.bouncycastle.asn1.DERBitString arg1){
    super((byte) 0, 0);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static com.android.org.bouncycastle.asn1.DERBitString getInstance(java.lang.Object arg1){
    return (com.android.org.bouncycastle.asn1.DERBitString) null;
  }
}
