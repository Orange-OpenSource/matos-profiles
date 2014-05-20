package com.android.org.bouncycastle.asn1.x500;

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
public class X500Name
  extends com.android.org.bouncycastle.asn1.ASN1Encodable  implements com.android.org.bouncycastle.asn1.ASN1Choice
{
  // Constructors

  public X500Name(X500NameStyle arg1, X500Name arg2){
    super();
  }
  private X500Name(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  private X500Name(X500NameStyle arg1, com.android.org.bouncycastle.asn1.ASN1Sequence arg2){
    super();
  }
  public X500Name(RDN [] arg1){
    super();
  }
  public X500Name(X500NameStyle arg1, RDN [] arg2){
    super();
  }
  public X500Name(java.lang.String arg1){
    super();
  }
  public X500Name(X500NameStyle arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public static X500Name getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (X500Name) null;
  }
  public static X500Name getInstance(java.lang.Object arg1){
    return (X500Name) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public RDN [] getRDNs(){
    return (RDN []) null;
  }
  public RDN [] getRDNs(com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier arg1){
    return (RDN []) null;
  }
  public static void setDefaultStyle(X500NameStyle arg1){
  }
  public static X500NameStyle getDefaultStyle(){
    return (X500NameStyle) null;
  }
}
