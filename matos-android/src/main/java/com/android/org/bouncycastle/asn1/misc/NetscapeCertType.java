package com.android.org.bouncycastle.asn1.misc;

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
public class NetscapeCertType
  extends com.android.org.bouncycastle.asn1.DERBitString{
  // Fields

  public static final int sslClient = 128;

  public static final int sslServer = 64;

  public static final int smime = 32;

  public static final int objectSigning = 16;

  public static final int reserved = 8;

  public static final int sslCA = 4;

  public static final int smimeCA = 2;

  public static final int objectSigningCA = 1;

  // Constructors

  public NetscapeCertType(int arg1){
    super((byte) 0, 0);
  }
  public NetscapeCertType(com.android.org.bouncycastle.asn1.DERBitString arg1){
    super((byte) 0, 0);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
