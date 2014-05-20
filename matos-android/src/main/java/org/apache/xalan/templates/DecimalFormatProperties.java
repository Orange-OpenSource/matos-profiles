package org.apache.xalan.templates;

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


public class DecimalFormatProperties
  extends ElemTemplateElement{
  // Constructors

  public DecimalFormatProperties(int arg1){
    super();
  }
  // Methods

  public org.apache.xml.utils.QName getName(){
    return (org.apache.xml.utils.QName) null;
  }
  public void setName(org.apache.xml.utils.QName arg1){
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public void recompose(StylesheetRoot arg1){
  }
  public java.text.DecimalFormatSymbols getDecimalFormatSymbols(){
    return (java.text.DecimalFormatSymbols) null;
  }
  public void setDecimalSeparator(char arg1){
  }
  public char getDecimalSeparator(){
    return '\u0000';
  }
  public void setGroupingSeparator(char arg1){
  }
  public char getGroupingSeparator(){
    return '\u0000';
  }
  public void setInfinity(@com.francetelecom.rd.stubs.annotation.FieldSet("infinity") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("infinity")
  public java.lang.String getInfinity(){
    return (java.lang.String) null;
  }
  public void setMinusSign(char arg1){
  }
  public char getMinusSign(){
    return '\u0000';
  }
  public void setNaN(java.lang.String arg1){
  }
  public java.lang.String getNaN(){
    return (java.lang.String) null;
  }
  public void setPercent(char arg1){
  }
  public char getPercent(){
    return '\u0000';
  }
  public void setPerMille(char arg1){
  }
  public char getPerMille(){
    return '\u0000';
  }
  public void setZeroDigit(char arg1){
  }
  public char getZeroDigit(){
    return '\u0000';
  }
  public void setDigit(char arg1){
  }
  public char getDigit(){
    return '\u0000';
  }
  public void setPatternSeparator(char arg1){
  }
  public char getPatternSeparator(){
    return '\u0000';
  }
}
