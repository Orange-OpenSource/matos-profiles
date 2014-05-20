package org.apache.harmony.security.x509;

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
public final class GeneralName
{
  // Fields

  public static final int OTHER_NAME = 0;

  public static final int RFC822_NAME = 1;

  public static final int DNS_NAME = 2;

  public static final int X400_ADDR = 3;

  public static final int DIR_NAME = 4;

  public static final int EDIP_NAME = 5;

  public static final int UR_ID = 6;

  public static final int IP_ADDR = 7;

  public static final int REG_ID = 8;

  public static final org.apache.harmony.security.asn1.ASN1Choice ASN1 = null;

  // Constructors

  public GeneralName(int arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public GeneralName(OtherName arg1){
  }
  public GeneralName(ORAddress arg1){
  }
  public GeneralName(org.apache.harmony.security.x501.Name arg1){
  }
  public GeneralName(EDIPartyName arg1){
  }
  public GeneralName(byte [] arg1) throws java.lang.IllegalArgumentException{
  }
  public GeneralName(int arg1, byte [] arg2) throws java.io.IOException{
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
  public java.lang.Object getName(){
    return (java.lang.Object) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public int getTag(){
    return 0;
  }
  public boolean isAcceptable(GeneralName arg1){
    return false;
  }
  public java.util.List<java.lang.Object> getAsList(){
    return (java.util.List) null;
  }
  public static void checkURI(java.lang.String arg1) throws java.io.IOException{
  }
  public byte [] getEncodedName(){
    return (byte []) null;
  }
  public static void checkDNS(java.lang.String arg1) throws java.io.IOException{
  }
  public static int [] oidStrToInts(java.lang.String arg1) throws java.io.IOException{
    return (int []) null;
  }
  public static byte [] ipStrToBytes(java.lang.String arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public static java.lang.String ipBytesToStr(byte [] arg1){
    return (java.lang.String) null;
  }
}
