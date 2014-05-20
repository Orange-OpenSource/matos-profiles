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
public abstract class ASN1TaggedObject
  extends ASN1Object  implements ASN1TaggedObjectParser
{
  // Constructors

  public ASN1TaggedObject(int arg1, DEREncodable arg2){
    super();
  }
  public ASN1TaggedObject(boolean arg1, int arg2, DEREncodable arg3){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public DERObject getObject(){
    return (DERObject) null;
  }
  public boolean isEmpty(){
    return false;
  }
  public static ASN1TaggedObject getInstance(ASN1TaggedObject arg1, boolean arg2){
    return (ASN1TaggedObject) null;
  }
  public static ASN1TaggedObject getInstance(java.lang.Object arg1){
    return (ASN1TaggedObject) null;
  }
  public DERObject getLoadedObject(){
    return (DERObject) null;
  }
  public int getTagNo(){
    return 0;
  }
  public DEREncodable getObjectParser(int arg1, boolean arg2){
    return (DEREncodable) null;
  }
  public boolean isExplicit(){
    return false;
  }
}
