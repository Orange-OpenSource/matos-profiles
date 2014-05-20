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


public abstract class NumberFormat
  extends Format{
  // Classes

  public static class Field
    extends Format.Field  {
    // Fields

    public static final NumberFormat.Field SIGN = null;

    public static final NumberFormat.Field INTEGER = null;

    public static final NumberFormat.Field FRACTION = null;

    public static final NumberFormat.Field EXPONENT = null;

    public static final NumberFormat.Field EXPONENT_SIGN = null;

    public static final NumberFormat.Field EXPONENT_SYMBOL = null;

    public static final NumberFormat.Field DECIMAL_SEPARATOR = null;

    public static final NumberFormat.Field GROUPING_SEPARATOR = null;

    public static final NumberFormat.Field PERCENT = null;

    public static final NumberFormat.Field PERMILLE = null;

    public static final NumberFormat.Field CURRENCY = null;

    // Constructors

    protected Field(java.lang.String arg1){
      super((java.lang.String) null);
    }
  }
  // Fields

  public static final int INTEGER_FIELD = 0;

  public static final int FRACTION_FIELD = 1;

  // Constructors

  protected NumberFormat(){
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
  public final java.lang.String format(double arg1){
    return (java.lang.String) null;
  }
  public abstract java.lang.StringBuffer format(double arg1, java.lang.StringBuffer arg2, FieldPosition arg3);
  public final java.lang.String format(long arg1){
    return (java.lang.String) null;
  }
  public abstract java.lang.StringBuffer format(long arg1, java.lang.StringBuffer arg2, FieldPosition arg3);
  public java.lang.StringBuffer format(java.lang.Object arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public static final NumberFormat getInstance(){
    return (NumberFormat) null;
  }
  public static NumberFormat getInstance(java.util.Locale arg1){
    return (NumberFormat) null;
  }
  public java.lang.Number parse(java.lang.String arg1) throws ParseException{
    return (java.lang.Number) null;
  }
  public abstract java.lang.Number parse(java.lang.String arg1, ParsePosition arg2);
  public static java.util.Locale [] getAvailableLocales(){
    return (java.util.Locale []) null;
  }
  public int getMaximumFractionDigits(){
    return 0;
  }
  public int getMaximumIntegerDigits(){
    return 0;
  }
  public int getMinimumFractionDigits(){
    return 0;
  }
  public int getMinimumIntegerDigits(){
    return 0;
  }
  public boolean isParseIntegerOnly(){
    return false;
  }
  public boolean isGroupingUsed(){
    return false;
  }
  public void setCurrency(java.util.Currency arg1){
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
  public void setParseIntegerOnly(boolean arg1){
  }
  public void setRoundingMode(java.math.RoundingMode arg1){
  }
  public final java.lang.Object parseObject(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Object) null;
  }
  public static final NumberFormat getIntegerInstance(){
    return (NumberFormat) null;
  }
  public static NumberFormat getIntegerInstance(java.util.Locale arg1){
    return (NumberFormat) null;
  }
  public java.util.Currency getCurrency(){
    return (java.util.Currency) null;
  }
  public static final NumberFormat getCurrencyInstance(){
    return (NumberFormat) null;
  }
  public static NumberFormat getCurrencyInstance(java.util.Locale arg1){
    return (NumberFormat) null;
  }
  public static final NumberFormat getNumberInstance(){
    return (NumberFormat) null;
  }
  public static NumberFormat getNumberInstance(java.util.Locale arg1){
    return (NumberFormat) null;
  }
  public static final NumberFormat getPercentInstance(){
    return (NumberFormat) null;
  }
  public static NumberFormat getPercentInstance(java.util.Locale arg1){
    return (NumberFormat) null;
  }
  public java.math.RoundingMode getRoundingMode(){
    return (java.math.RoundingMode) null;
  }
}
