package com.android.org.bouncycastle.asn1;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ASN1EncodableImpl", superClass = "")
public abstract class ASN1Encodable
  implements DEREncodable
{
  // Fields

  public static final java.lang.String DER = "DER";

  public static final java.lang.String BER = "BER";

  // Constructors

  public ASN1Encodable(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public byte [] getEncoded() throws java.io.IOException{
    return (byte []) null;
  }
  public byte [] getEncoded(java.lang.String arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public abstract DERObject toASN1Object();
  public byte [] getDEREncoded(){
    return (byte []) null;
  }
  public DERObject getDERObject(){
    return (DERObject) null;
  }
}
