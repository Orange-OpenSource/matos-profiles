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
public final class Phonenumber
{
  // Classes

  public static class PhoneNumber
    implements java.io.Serializable
  {
    // Classes

    public static enum CountryCodeSource
    {
      // Enum Constants

      FROM_NUMBER_WITH_PLUS_SIGN()
, FROM_NUMBER_WITH_IDD()
, FROM_NUMBER_WITHOUT_PLUS_SIGN()
, FROM_DEFAULT_COUNTRY()
;
      // Fields

      // Constructors

      private CountryCodeSource(){
      }
      // Methods

    }
    // Constructors

    public PhoneNumber(){
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
    public final Phonenumber.PhoneNumber clear(){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber mergeFrom(Phonenumber.PhoneNumber arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public boolean hasExtension(){
      return false;
    }
    public Phonenumber.PhoneNumber setCountryCode(int arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public int getCountryCode(){
      return 0;
    }
    public boolean hasCountryCode(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mExtension")
    public java.lang.String getExtension(){
      return (java.lang.String) null;
    }
    public Phonenumber.PhoneNumber clearExtension(){
      return (Phonenumber.PhoneNumber) null;
    }
    public long getNationalNumber(){
      return 0l;
    }
    public boolean hasRawInput(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRawInput")
    public java.lang.String getRawInput(){
      return (java.lang.String) null;
    }
    public boolean hasPreferredDomesticCarrierCode(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPreferredDomesticCarrierCode")
    public java.lang.String getPreferredDomesticCarrierCode(){
      return (java.lang.String) null;
    }
    public boolean hasCountryCodeSource(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCountryCodeSource")
    public Phonenumber.PhoneNumber.CountryCodeSource getCountryCodeSource(){
      return (Phonenumber.PhoneNumber.CountryCodeSource) null;
    }
    public boolean hasItalianLeadingZero(){
      return false;
    }
    public boolean isItalianLeadingZero(){
      return false;
    }
    public Phonenumber.PhoneNumber setNationalNumber(long arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber setCountryCodeSource(@com.francetelecom.rd.stubs.annotation.FieldSet("mCountryCodeSource") Phonenumber.PhoneNumber.CountryCodeSource arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber setRawInput(@com.francetelecom.rd.stubs.annotation.FieldSet("mRawInput") java.lang.String arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber setExtension(@com.francetelecom.rd.stubs.annotation.FieldSet("mExtension") java.lang.String arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber clearCountryCodeSource(){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber setPreferredDomesticCarrierCode(@com.francetelecom.rd.stubs.annotation.FieldSet("mPreferredDomesticCarrierCode") java.lang.String arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber setItalianLeadingZero(boolean arg1){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber clearRawInput(){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber clearPreferredDomesticCarrierCode(){
      return (Phonenumber.PhoneNumber) null;
    }
    public boolean exactlySameAs(Phonenumber.PhoneNumber arg1){
      return false;
    }
    public boolean hasNationalNumber(){
      return false;
    }
    public Phonenumber.PhoneNumber clearCountryCode(){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber clearNationalNumber(){
      return (Phonenumber.PhoneNumber) null;
    }
    public Phonenumber.PhoneNumber clearItalianLeadingZero(){
      return (Phonenumber.PhoneNumber) null;
    }
  }
  // Constructors

  private Phonenumber(){
  }
}
