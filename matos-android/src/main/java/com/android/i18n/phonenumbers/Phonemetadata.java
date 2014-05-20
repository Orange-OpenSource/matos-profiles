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

import com.francetelecom.rd.stubs.annotation.FieldSet;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class Phonemetadata
{
  // Classes

  public static class NumberFormat
    implements java.io.Externalizable
  {
    // Classes

    public static final class Builder
      extends Phonemetadata.NumberFormat    {
      // Constructors

      public Builder(){
        super();
      }
      // Methods

      public Phonemetadata.NumberFormat build(){
        return (Phonemetadata.NumberFormat) null;
      }
    }
    // Constructors

    public NumberFormat(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.FieldGet("mFormat")
    public java.lang.String getFormat(){
      return (java.lang.String) null;
    }
    public Phonemetadata.NumberFormat mergeFrom(@FieldSet("mNumberFormat") Phonemetadata.NumberFormat arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public void readExternal(java.io.ObjectInput arg1) throws java.io.IOException{
    }
    public void writeExternal(java.io.ObjectOutput arg1) throws java.io.IOException{
    }
    public Phonemetadata.NumberFormat setFormat(@com.francetelecom.rd.stubs.annotation.FieldSet("mFormat") java.lang.String arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public Phonemetadata.NumberFormat setPattern(@com.francetelecom.rd.stubs.annotation.FieldSet("mPattern") java.lang.String arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPattern")
    public java.lang.String getPattern(){
      return (java.lang.String) null;
    }
    public static Phonemetadata.NumberFormat.Builder newBuilder(){
      return (Phonemetadata.NumberFormat.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNationalPrefixFormattingRule")
    public java.lang.String getNationalPrefixFormattingRule(){
      return (java.lang.String) null;
    }
    public Phonemetadata.NumberFormat setNationalPrefixFormattingRule(@com.francetelecom.rd.stubs.annotation.FieldSet("mNationalPrefixFormattingRule") java.lang.String arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public Phonemetadata.NumberFormat clearNationalPrefixFormattingRule(){
      return (Phonemetadata.NumberFormat) null;
    }
    public int leadingDigitsPatternSize(){
      return 0;
    }
    
    public java.lang.String getLeadingDigitsPattern(int arg1){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mDomesticCarrierCodeFormattingRule")
    public java.lang.String getDomesticCarrierCodeFormattingRule(){
      return (java.lang.String) null;
    }
    public boolean hasPattern(){
      return false;
    }
    public boolean hasFormat(){
      return false;
    }
    public boolean hasNationalPrefixFormattingRule(){
      return false;
    }
    public boolean hasDomesticCarrierCodeFormattingRule(){
      return false;
    }
    public java.util.List<java.lang.String> leadingDigitPatterns(){
      return (java.util.List) null;
    }
    public Phonemetadata.NumberFormat addLeadingDigitsPattern(java.lang.String arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public Phonemetadata.NumberFormat setDomesticCarrierCodeFormattingRule(@com.francetelecom.rd.stubs.annotation.FieldSet("mDomesticCarrierCodeFormattingRule") java.lang.String arg1){
      return (Phonemetadata.NumberFormat) null;
    }
  }
  public static class PhoneNumberDesc
    implements java.io.Externalizable
  {
    // Classes

    public static final class Builder
      extends Phonemetadata.PhoneNumberDesc    {
      // Constructors

      public Builder(){
        super();
      }
      // Methods

      public Phonemetadata.PhoneNumberDesc build(){
        return (Phonemetadata.PhoneNumberDesc) null;
      }
    }
    // Constructors

    public PhoneNumberDesc(){
    }
    // Methods

    public Phonemetadata.PhoneNumberDesc mergeFrom(Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    public void readExternal(java.io.ObjectInput arg1) throws java.io.IOException{
    }
    public void writeExternal(java.io.ObjectOutput arg1) throws java.io.IOException{
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mExampleNumber")
    public java.lang.String getExampleNumber(){
      return (java.lang.String) null;
    }
    public static Phonemetadata.PhoneNumberDesc.Builder newBuilder(){
      return (Phonemetadata.PhoneNumberDesc.Builder) null;
    }
    public boolean exactlySameAs(Phonemetadata.PhoneNumberDesc arg1){
      return false;
    }
    public boolean hasExampleNumber(){
      return false;
    }
    public boolean hasNationalNumberPattern(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPossibleNumberPattern")
    public java.lang.String getPossibleNumberPattern(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNationalNumberPattern")
    public java.lang.String getNationalNumberPattern(){
      return (java.lang.String) null;
    }
    public boolean hasPossibleNumberPattern(){
      return false;
    }
    public Phonemetadata.PhoneNumberDesc setNationalNumberPattern(@com.francetelecom.rd.stubs.annotation.FieldSet("mNationalNumberPattern") java.lang.String arg1){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    public Phonemetadata.PhoneNumberDesc setPossibleNumberPattern(@com.francetelecom.rd.stubs.annotation.FieldSet("mPossibleNumberPattern") java.lang.String arg1){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    public Phonemetadata.PhoneNumberDesc setExampleNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("mExampleNumber") java.lang.String arg1){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
  }
  public static class PhoneMetadata
    implements java.io.Externalizable
  {
    // Classes

    public static final class Builder
      extends Phonemetadata.PhoneMetadata    {
      // Constructors

      public Builder(){
        super();
      }
      // Methods

      public Phonemetadata.PhoneMetadata build(){
        return (Phonemetadata.PhoneMetadata) null;
      }
    }
    // Constructors

    public PhoneMetadata(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.FieldGet("mId")
    public java.lang.String getId(){
      return (java.lang.String) null;
    }
    public Phonemetadata.PhoneMetadata setId(@com.francetelecom.rd.stubs.annotation.FieldSet("mId") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public void readExternal(java.io.ObjectInput arg1) throws java.io.IOException{
    }
    public void writeExternal(java.io.ObjectOutput arg1) throws java.io.IOException{
    }
    public Phonemetadata.PhoneMetadata setCountryCode(int arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public java.util.List<Phonemetadata.NumberFormat> intlNumberFormats(){
      return (java.util.List) null;
    }
    public boolean isLeadingZeroPossible(){
      return false;
    }
    public boolean hasNationalPrefix(){
      return false;
    }
    public int getCountryCode(){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNationalPrefix")
    public java.lang.String getNationalPrefix(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mInternationalPrefix")
    public java.lang.String getInternationalPrefix(){
      return (java.lang.String) null;
    }
    public boolean hasPreferredInternationalPrefix(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPreferredInternationalPrefix")
    public java.lang.String getPreferredInternationalPrefix(){
      return (java.lang.String) null;
    }
    public int numberFormatSize(){
      return 0;
    }
    public java.util.List<Phonemetadata.NumberFormat> numberFormats(){
      return (java.util.List) null;
    }
    public boolean hasPreferredExtnPrefix(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPreferredExtnPrefix")
    public java.lang.String getPreferredExtnPrefix(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPremiumRate")
    public Phonemetadata.PhoneNumberDesc getPremiumRate(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mTollFree")
    public Phonemetadata.PhoneNumberDesc getTollFree(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mMobile")
    public Phonemetadata.PhoneNumberDesc getMobile(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mFixedLine")
    public Phonemetadata.PhoneNumberDesc getFixedLine(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mSharedCost")
    public Phonemetadata.PhoneNumberDesc getSharedCost(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mVoip")
    public Phonemetadata.PhoneNumberDesc getVoip(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPersonalNumber")
    public Phonemetadata.PhoneNumberDesc getPersonalNumber(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPager")
    public Phonemetadata.PhoneNumberDesc getPager(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mUan")
    public Phonemetadata.PhoneNumberDesc getUan(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mGeneralDesc")
    public Phonemetadata.PhoneNumberDesc getGeneralDesc(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    public boolean isSameMobileAndFixedLinePattern(){
      return false;
    }
    public boolean hasLeadingDigits(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mLeadingDigits")
    public java.lang.String getLeadingDigits(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNationalPrefixForParsing")
    public java.lang.String getNationalPrefixForParsing(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNationalPrefixTransformRule")
    public java.lang.String getNationalPrefixTransformRule(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNoInternationalDialling")
    public Phonemetadata.PhoneNumberDesc getNoInternationalDialling(){
      return (Phonemetadata.PhoneNumberDesc) null;
    }
    public boolean hasGeneralDesc(){
      return false;
    }
    public boolean hasFixedLine(){
      return false;
    }
    public boolean hasMobile(){
      return false;
    }
    public boolean hasTollFree(){
      return false;
    }
    public boolean hasPremiumRate(){
      return false;
    }
    public boolean hasSharedCost(){
      return false;
    }
    public boolean hasPersonalNumber(){
      return false;
    }
    public boolean hasVoip(){
      return false;
    }
    public boolean hasPager(){
      return false;
    }
    public boolean hasUan(){
      return false;
    }
    public boolean hasNoInternationalDialling(){
      return false;
    }
    public boolean hasId(){
      return false;
    }
    public boolean hasCountryCode(){
      return false;
    }
    public boolean hasInternationalPrefix(){
      return false;
    }
    public boolean hasNationalPrefixForParsing(){
      return false;
    }
    public boolean hasNationalPrefixTransformRule(){
      return false;
    }
    public boolean hasSameMobileAndFixedLinePattern(){
      return false;
    }
    public boolean hasMainCountryForCode(){
      return false;
    }
    public boolean hasLeadingZeroPossible(){
      return false;
    }
    public static Phonemetadata.PhoneMetadata.Builder newBuilder(){
      return (Phonemetadata.PhoneMetadata.Builder) null;
    }
    public Phonemetadata.PhoneMetadata setGeneralDesc(@com.francetelecom.rd.stubs.annotation.FieldSet("mGeneralDesc") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setFixedLine(@com.francetelecom.rd.stubs.annotation.FieldSet("mFixedLine") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setMobile(@com.francetelecom.rd.stubs.annotation.FieldSet("mMobile") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setTollFree(@com.francetelecom.rd.stubs.annotation.FieldSet("mTollFree") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setPremiumRate(@com.francetelecom.rd.stubs.annotation.FieldSet("mPremiumRate") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setSharedCost(@com.francetelecom.rd.stubs.annotation.FieldSet("mSharedCost") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setPersonalNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("mPersonalNumber") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setVoip(@com.francetelecom.rd.stubs.annotation.FieldSet("mVoip") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setPager(@com.francetelecom.rd.stubs.annotation.FieldSet("mPager") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setUan(@com.francetelecom.rd.stubs.annotation.FieldSet("mUan") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setNoInternationalDialling(@com.francetelecom.rd.stubs.annotation.FieldSet("mNoInternationalDialling") Phonemetadata.PhoneNumberDesc arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setInternationalPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("mInternationalPrefix") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setPreferredInternationalPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("mPreferredInternationalPrefix") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setNationalPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("mNationalPrefix") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setPreferredExtnPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("mPreferredExtnPrefix") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setNationalPrefixForParsing(@com.francetelecom.rd.stubs.annotation.FieldSet("mNationalPrefixForParsing") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setNationalPrefixTransformRule(@com.francetelecom.rd.stubs.annotation.FieldSet("mNationalPrefixTransformRule") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setSameMobileAndFixedLinePattern(boolean arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mNumberFormat")
    public Phonemetadata.NumberFormat getNumberFormat(int arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public Phonemetadata.PhoneMetadata addNumberFormat(@FieldSet("mNumberFormat") Phonemetadata.NumberFormat arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public int intlNumberFormatSize(){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mIntlNumberFormat")
    public Phonemetadata.NumberFormat getIntlNumberFormat(int arg1){
      return (Phonemetadata.NumberFormat) null;
    }
    public Phonemetadata.PhoneMetadata addIntlNumberFormat(@FieldSet("mIntlNumberFormat") Phonemetadata.NumberFormat arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata clearIntlNumberFormat(){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public boolean isMainCountryForCode(){
      return false;
    }
    public boolean getMainCountryForCode(){
      return false;
    }
    public Phonemetadata.PhoneMetadata setMainCountryForCode(boolean arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setLeadingDigits(@com.francetelecom.rd.stubs.annotation.FieldSet("mLeadingDigits") java.lang.String arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
    public Phonemetadata.PhoneMetadata setLeadingZeroPossible(boolean arg1){
      return (Phonemetadata.PhoneMetadata) null;
    }
  }
  public static class PhoneMetadataCollection
    implements java.io.Externalizable
  {
    // Classes

    public static final class Builder
      extends Phonemetadata.PhoneMetadataCollection    {
      // Constructors

      public Builder(){
        super();
      }
      // Methods

      public Phonemetadata.PhoneMetadataCollection build(){
        return (Phonemetadata.PhoneMetadataCollection) null;
      }
    }
    // Constructors

    public PhoneMetadataCollection(){
    }
    // Methods

    public Phonemetadata.PhoneMetadataCollection clear(){
      return (Phonemetadata.PhoneMetadataCollection) null;
    }
    public void readExternal(java.io.ObjectInput arg1) throws java.io.IOException{
    }
    public void writeExternal(java.io.ObjectOutput arg1) throws java.io.IOException{
    }
    public static Phonemetadata.PhoneMetadataCollection.Builder newBuilder(){
      return (Phonemetadata.PhoneMetadataCollection.Builder) null;
    }
    public java.util.List<Phonemetadata.PhoneMetadata> getMetadataList(){
      return (java.util.List) null;
    }
    public int getMetadataCount(){
      return 0;
    }
    public Phonemetadata.PhoneMetadataCollection addMetadata(Phonemetadata.PhoneMetadata arg1){
      return (Phonemetadata.PhoneMetadataCollection) null;
    }
  }
  // Constructors

  private Phonemetadata(){
  }
}
