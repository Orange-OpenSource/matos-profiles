package java.text;

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


public class DecimalFormat
  extends NumberFormat{
  // Constructors

  public DecimalFormat(){
    super();
  }
  public DecimalFormat(java.lang.String arg1){
    super();
  }
  public DecimalFormat(java.lang.String arg1, DecimalFormatSymbols arg2){
    super();
  }
  DecimalFormat(java.lang.String arg1, java.util.Locale arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.StringBuffer format(double arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.StringBuffer format(long arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public final java.lang.StringBuffer format(java.lang.Object arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.Number parse(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Number) null;
  }
  public DecimalFormatSymbols getDecimalFormatSymbols(){
    return (DecimalFormatSymbols) null;
  }
  public void setDecimalFormatSymbols(DecimalFormatSymbols arg1){
  }
  public void applyLocalizedPattern(java.lang.String arg1){
  }
  public void applyPattern(java.lang.String arg1){
  }
  public AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg1){
    return (AttributedCharacterIterator) null;
  }
  public java.lang.String toLocalizedPattern(){
    return (java.lang.String) null;
  }
  public java.lang.String toPattern(){
    return (java.lang.String) null;
  }
  public int getGroupingSize(){
    return 0;
  }
  public int getMultiplier(){
    return 0;
  }
  public java.lang.String getNegativePrefix(){
    return (java.lang.String) null;
  }
  public java.lang.String getNegativeSuffix(){
    return (java.lang.String) null;
  }
  public java.lang.String getPositivePrefix(){
    return (java.lang.String) null;
  }
  public java.lang.String getPositiveSuffix(){
    return (java.lang.String) null;
  }
  public boolean isDecimalSeparatorAlwaysShown(){
    return false;
  }
  public boolean isParseBigDecimal(){
    return false;
  }
  public boolean isParseIntegerOnly(){
    return false;
  }
  public boolean isGroupingUsed(){
    return false;
  }
  public void setDecimalSeparatorAlwaysShown(boolean arg1){
  }
  public void setCurrency(java.util.Currency arg1){
  }
  public void setGroupingSize(int arg1){
  }
  public void setGroupingUsed(boolean arg1){
  }
  public void setMaximumFractionDigits(int arg1){
  }
  public void setMaximumIntegerDigits(int arg1){
  }
  public void setMinimumFractionDigits(int arg1){
  }
  public void setMinimumIntegerDigits(int arg1){
  }
  public void setMultiplier(int arg1){
  }
  public void setNegativePrefix(java.lang.String arg1){
  }
  public void setNegativeSuffix(java.lang.String arg1){
  }
  public void setPositivePrefix(java.lang.String arg1){
  }
  public void setPositiveSuffix(java.lang.String arg1){
  }
  public void setParseBigDecimal(boolean arg1){
  }
  public void setParseIntegerOnly(boolean arg1){
  }
  public void setRoundingMode(java.math.RoundingMode arg1){
  }
  public java.util.Currency getCurrency(){
    return (java.util.Currency) null;
  }
  public java.math.RoundingMode getRoundingMode(){
    return (java.math.RoundingMode) null;
  }
}
