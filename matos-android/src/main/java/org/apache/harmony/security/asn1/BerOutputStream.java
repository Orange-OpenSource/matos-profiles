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
public class BerOutputStream
{
  // Fields

  public byte [] encoded;

  protected int offset;

  public int length;

  public java.lang.Object content;

  // Constructors

  public BerOutputStream(){
  }
  // Methods

  public void encodeSequence(ASN1Sequence arg1){
  }
  public void getSequenceLength(ASN1Sequence arg1){
  }
  public final void encodeTag(int arg1){
  }
  public void encodeOctetString(){
  }
  public void encodeString(){
  }
  public void encodeInteger(){
  }
  public void encodeSetOf(ASN1SetOf arg1){
  }
  public void getSetOfLength(ASN1SetOf arg1){
  }
  public void encodeANY(){
  }
  public void encodeBitString(){
  }
  public void encodeBoolean(){
  }
  public void encodeChoice(ASN1Choice arg1){
  }
  public void encodeExplicit(ASN1Explicit arg1){
  }
  public void encodeGeneralizedTime(){
  }
  public void encodeUTCTime(){
  }
  public void encodeOID(){
  }
  public void encodeSequenceOf(ASN1SequenceOf arg1){
  }
  public void encodeSet(ASN1Set arg1){
  }
  public void getChoiceLength(ASN1Choice arg1){
  }
  public void getExplicitLength(ASN1Explicit arg1){
  }
  public void getSequenceOfLength(ASN1SequenceOf arg1){
  }
  public void getSetLength(ASN1Set arg1){
  }
}
