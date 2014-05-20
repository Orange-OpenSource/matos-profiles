package com.android.i18n.phonenumbers;

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
public class PhoneNumberUtil
{
  // Classes

  public static enum PhoneNumberFormat
  {
    // Enum Constants

    E164()
, INTERNATIONAL()
, NATIONAL()
, RFC3966()
;
    // Fields

    // Constructors

    private PhoneNumberFormat(){
    }
    // Methods

  }
  public static enum PhoneNumberType
  {
    // Enum Constants

    FIXED_LINE()
, MOBILE()
, FIXED_LINE_OR_MOBILE()
, TOLL_FREE()
, PREMIUM_RATE()
, SHARED_COST()
, VOIP()
, PERSONAL_NUMBER()
, PAGER()
, UAN()
, UNKNOWN()
;
    // Fields

    // Constructors

    private PhoneNumberType(){
    }
    // Methods

  }
  public static enum MatchType
  {
    // Enum Constants

    NOT_A_NUMBER()
, NO_MATCH()
, SHORT_NSN_MATCH()
, NSN_MATCH()
, EXACT_MATCH()
;
    // Fields

    // Constructors

    private MatchType(){
    }
    // Methods

  }
  public static enum ValidationResult
  {
    // Enum Constants

    IS_POSSIBLE()
, INVALID_COUNTRY_CODE()
, TOO_SHORT()
, TOO_LONG()
;
    // Fields

    // Constructors

    private ValidationResult(){
    }
    // Methods

  }
  public static enum Leniency
  {
    // Enum Constants

    POSSIBLE()
, VALID()
, STRICT_GROUPING()
, EXACT_GROUPING()
;
    // Fields

    // Constructors

    private Leniency(){
    }
    // Methods

  }
  // Constructors

  private PhoneNumberUtil(){
  }
  // Methods

  public java.lang.String format(Phonenumber.PhoneNumber arg1, PhoneNumberUtil.PhoneNumberFormat arg2){
    return (java.lang.String) null;
  }
  public void format(Phonenumber.PhoneNumber arg1, PhoneNumberUtil.PhoneNumberFormat arg2, java.lang.StringBuilder arg3){
  }
  public static synchronized PhoneNumberUtil getInstance(){
    return (PhoneNumberUtil) null;
  }
  public Phonenumber.PhoneNumber parse(java.lang.String arg1, java.lang.String arg2) throws NumberParseException{
    return (Phonenumber.PhoneNumber) null;
  }
  public void parse(java.lang.String arg1, java.lang.String arg2, Phonenumber.PhoneNumber arg3) throws NumberParseException{
  }
  public static java.lang.String normalizeDigitsOnly(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String convertAlphaCharactersInNumber(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public int getLengthOfGeographicalAreaCode(Phonenumber.PhoneNumber arg1){
    return 0;
  }
  public int getLengthOfNationalDestinationCode(Phonenumber.PhoneNumber arg1){
    return 0;
  }
  public java.util.Set<java.lang.String> getSupportedRegions(){
    return (java.util.Set) null;
  }
  public java.lang.String formatByPattern(Phonenumber.PhoneNumber arg1, PhoneNumberUtil.PhoneNumberFormat arg2, java.util.List<Phonemetadata.NumberFormat> arg3){
    return (java.lang.String) null;
  }
  public java.lang.String formatNationalNumberWithCarrierCode(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String formatNationalNumberWithPreferredCarrierCode(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String formatOutOfCountryCallingNumber(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String formatInOriginalFormat(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String formatOutOfCountryKeepingAlphaChars(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getNationalSignificantNumber(Phonenumber.PhoneNumber arg1){
    return (java.lang.String) null;
  }
  public Phonenumber.PhoneNumber getExampleNumber(java.lang.String arg1){
    return (Phonenumber.PhoneNumber) null;
  }
  public Phonenumber.PhoneNumber getExampleNumberForType(java.lang.String arg1, PhoneNumberUtil.PhoneNumberType arg2){
    return (Phonenumber.PhoneNumber) null;
  }
  public PhoneNumberUtil.PhoneNumberType getNumberType(Phonenumber.PhoneNumber arg1){
    return (PhoneNumberUtil.PhoneNumberType) null;
  }
  public boolean isValidNumber(Phonenumber.PhoneNumber arg1){
    return false;
  }
  public boolean isValidNumberForRegion(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return false;
  }
  public java.lang.String getRegionCodeForNumber(Phonenumber.PhoneNumber arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getRegionCodeForCountryCode(int arg1){
    return (java.lang.String) null;
  }
  public int getCountryCodeForRegion(java.lang.String arg1){
    return 0;
  }
  public java.lang.String getNddPrefixForRegion(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public boolean isNANPACountry(java.lang.String arg1){
    return false;
  }
  public boolean isAlphaNumber(java.lang.String arg1){
    return false;
  }
  public boolean isPossibleNumber(Phonenumber.PhoneNumber arg1){
    return false;
  }
  public boolean isPossibleNumber(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public PhoneNumberUtil.ValidationResult isPossibleNumberWithReason(Phonenumber.PhoneNumber arg1){
    return (PhoneNumberUtil.ValidationResult) null;
  }
  public boolean truncateTooLongNumber(Phonenumber.PhoneNumber arg1){
    return false;
  }
  public AsYouTypeFormatter getAsYouTypeFormatter(java.lang.String arg1){
    return (AsYouTypeFormatter) null;
  }
  public Phonenumber.PhoneNumber parseAndKeepRawInput(java.lang.String arg1, java.lang.String arg2) throws NumberParseException{
    return (Phonenumber.PhoneNumber) null;
  }
  public void parseAndKeepRawInput(java.lang.String arg1, java.lang.String arg2, Phonenumber.PhoneNumber arg3) throws NumberParseException{
  }
  public java.lang.Iterable<PhoneNumberMatch> findNumbers(java.lang.CharSequence arg1, java.lang.String arg2){
    return (java.lang.Iterable) null;
  }
  public java.lang.Iterable<PhoneNumberMatch> findNumbers(java.lang.CharSequence arg1, java.lang.String arg2, PhoneNumberUtil.Leniency arg3, long arg4){
    return (java.lang.Iterable) null;
  }
  public PhoneNumberUtil.MatchType isNumberMatch(Phonenumber.PhoneNumber arg1, Phonenumber.PhoneNumber arg2){
    return (PhoneNumberUtil.MatchType) null;
  }
  public PhoneNumberUtil.MatchType isNumberMatch(java.lang.String arg1, java.lang.String arg2){
    return (PhoneNumberUtil.MatchType) null;
  }
  public PhoneNumberUtil.MatchType isNumberMatch(Phonenumber.PhoneNumber arg1, java.lang.String arg2){
    return (PhoneNumberUtil.MatchType) null;
  }
}
