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
public class GeneralName
  extends com.android.org.bouncycastle.asn1.ASN1Encodable  implements com.android.org.bouncycastle.asn1.ASN1Choice
{
  // Fields

  public static final int otherName = 0;

  public static final int rfc822Name = 1;

  public static final int dNSName = 2;

  public static final int x400Address = 3;

  public static final int directoryName = 4;

  public static final int ediPartyName = 5;

  public static final int uniformResourceIdentifier = 6;

  public static final int iPAddress = 7;

  public static final int registeredID = 8;

  // Constructors

  public GeneralName(X509Name arg1){
    super();
  }
  public GeneralName(com.android.org.bouncycastle.asn1.x500.X500Name arg1){
    super();
  }
  public GeneralName(com.android.org.bouncycastle.asn1.DERObject arg1, int arg2){
    super();
  }
  public GeneralName(int arg1, com.android.org.bouncycastle.asn1.ASN1Encodable arg2){
    super();
  }
  public GeneralName(int arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public com.android.org.bouncycastle.asn1.DEREncodable getName(){
    return (com.android.org.bouncycastle.asn1.DEREncodable) null;
  }
  public static GeneralName getInstance(java.lang.Object arg1){
    return (GeneralName) null;
  }
  public static GeneralName getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (GeneralName) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public int getTagNo(){
    return 0;
  }
}
