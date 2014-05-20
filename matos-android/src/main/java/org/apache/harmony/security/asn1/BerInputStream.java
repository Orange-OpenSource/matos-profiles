package org.apache.harmony.security.asn1;

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
public class BerInputStream
{
  // Fields

  protected byte [] buffer;

  protected int offset;

  protected static final int INDEFINIT_LENGTH = 0;

  public int tag;

  protected int length;

  public java.lang.Object content;

  protected int tagOffset;

  protected int contentOffset;

  public int choiceIndex;

  public int [] times;

  public int oidElement;

  protected boolean isVerify;

  protected boolean isIndefinedLength;

  // Constructors

  public BerInputStream(byte [] arg1) throws java.io.IOException{
  }
  public BerInputStream(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public BerInputStream(java.io.InputStream arg1) throws java.io.IOException{
  }
  public BerInputStream(java.io.InputStream arg1, int arg2) throws java.io.IOException{
  }
  // Methods

  public java.lang.Object get(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  public void put(java.lang.Object arg1, java.lang.Object arg2){
  }
  public static int getLength(byte [] arg1){
    return 0;
  }
  public final int getLength(){
    return 0;
  }
  public int next() throws java.io.IOException{
    return 0;
  }
  public final void reset(byte [] arg1) throws java.io.IOException{
  }
  public final int getOffset(){
    return 0;
  }
  protected int read() throws java.io.IOException{
    return 0;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void readBoolean() throws java.io.IOException{
  }
  public final byte [] getBuffer(){
    return (byte []) null;
  }
  public void readString(ASN1StringType arg1) throws java.io.IOException{
  }
  public void readSequence(ASN1Sequence arg1) throws java.io.IOException{
  }
  public final void setVerify(){
  }
  public void readOctetString() throws java.io.IOException{
  }
  public void readEnumerated() throws java.io.IOException{
  }
  public void readSetOf(ASN1SetOf arg1) throws java.io.IOException{
  }
  public void readSequenceOf(ASN1SequenceOf arg1) throws java.io.IOException{
  }
  public void readBitString() throws java.io.IOException{
  }
  public void readGeneralizedTime() throws java.io.IOException{
  }
  public void readUTCTime() throws java.io.IOException{
  }
  public void readInteger() throws java.io.IOException{
  }
  public void readOID() throws java.io.IOException{
  }
  public void readSet(ASN1Set arg1) throws java.io.IOException{
  }
  public final int getEndOffset(){
    return 0;
  }
  public final int getTagOffset(){
    return 0;
  }
  public void readContent() throws java.io.IOException{
  }
  public void compactBuffer(){
  }
}
