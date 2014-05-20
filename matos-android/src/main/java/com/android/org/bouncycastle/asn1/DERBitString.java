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
public class DERBitString
  extends ASN1Object  implements DERString
{
  // Fields

  protected byte [] data;

  protected int padBits;

  // Constructors

  protected DERBitString(byte arg1, int arg2){
    super();
  }
  public DERBitString(byte [] arg1, int arg2){
    super();
  }
  public DERBitString(byte [] arg1){
    super();
  }
  public DERBitString(DEREncodable arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int intValue(){
    return 0;
  }
  protected static byte [] getBytes(int arg1){
    return (byte []) null;
  }
  public byte [] getBytes(){
    return (byte []) null;
  }
  public static DERBitString getInstance(java.lang.Object arg1){
    return (DERBitString) null;
  }
  public static DERBitString getInstance(ASN1TaggedObject arg1, boolean arg2){
    return (DERBitString) null;
  }
  public java.lang.String getString(){
    return (java.lang.String) null;
  }
  protected static int getPadBits(int arg1){
    return 0;
  }
  public int getPadBits(){
    return 0;
  }
  protected boolean asn1Equals(DERObject arg1){
    return false;
  }
}
