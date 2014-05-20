package android.net;

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
public class UrlQuerySanitizer
{
  // Classes

  public class ParameterValuePair
  {
    // Fields

    public java.lang.String mParameter;

    public java.lang.String mValue;

    // Constructors

    public ParameterValuePair(java.lang.String arg1, java.lang.String arg2){
    }
  }
  public static interface ValueSanitizer
  {
    // Methods

    public java.lang.String sanitize(java.lang.String arg1);
  }
  public static class IllegalCharacterValueSanitizer
    implements UrlQuerySanitizer.ValueSanitizer
  {
    // Fields

    public static final int SPACE_OK = 1;

    public static final int OTHER_WHITESPACE_OK = 2;

    public static final int NON_7_BIT_ASCII_OK = 4;

    public static final int DQUOTE_OK = 8;

    public static final int SQUOTE_OK = 16;

    public static final int LT_OK = 32;

    public static final int GT_OK = 64;

    public static final int AMP_OK = 128;

    public static final int PCT_OK = 256;

    public static final int NUL_OK = 512;

    public static final int SCRIPT_URL_OK = 1024;

    public static final int ALL_OK = 2047;

    public static final int ALL_WHITESPACE_OK = 3;

    public static final int ALL_ILLEGAL = 0;

    public static final int ALL_BUT_NUL_LEGAL = 1535;

    public static final int ALL_BUT_WHITESPACE_LEGAL = 1532;

    public static final int URL_LEGAL = 404;

    public static final int URL_AND_SPACE_LEGAL = 405;

    public static final int AMP_LEGAL = 128;

    public static final int AMP_AND_SPACE_LEGAL = 129;

    public static final int SPACE_LEGAL = 1;

    public static final int ALL_BUT_NUL_AND_ANGLE_BRACKETS_LEGAL = 1439;

    // Constructors

    public IllegalCharacterValueSanitizer(int arg1){
    }
    // Methods

    public java.lang.String sanitize(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public UrlQuerySanitizer(){
  }
  public UrlQuerySanitizer(java.lang.String arg1){
  }
  // Methods

  protected void clear(){
  }
  public java.lang.String getValue(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String unescape(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected boolean isHexDigit(char arg1){
    return false;
  }
  public boolean hasParameter(java.lang.String arg1){
    return false;
  }
  public void parseQuery(java.lang.String arg1){
  }
  public void parseUrl(java.lang.String arg1){
  }
  public UrlQuerySanitizer.ValueSanitizer getUnregisteredParameterValueSanitizer(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public void setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.ValueSanitizer arg1){
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAllIllegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAllButNulLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAllButWhitespaceLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getUrlLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getUrlAndSpaceLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAmpLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAmpAndSpaceLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getSpaceLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public static final UrlQuerySanitizer.ValueSanitizer getAllButNulAndAngleBracketsLegal(){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public java.util.Set<java.lang.String> getParameterSet(){
    return (java.util.Set) null;
  }
  public java.util.List<UrlQuerySanitizer.ParameterValuePair> getParameterList(){
    return (java.util.List) null;
  }
  public void registerParameter(java.lang.String arg1, UrlQuerySanitizer.ValueSanitizer arg2){
  }
  public void registerParameters(java.lang.String [] arg1, UrlQuerySanitizer.ValueSanitizer arg2){
  }
  public void setAllowUnregisteredParamaters(boolean arg1){
  }
  public boolean getAllowUnregisteredParamaters(){
    return false;
  }
  public void setPreferFirstRepeatedParameter(boolean arg1){
  }
  public boolean getPreferFirstRepeatedParameter(){
    return false;
  }
  protected void parseEntry(java.lang.String arg1, java.lang.String arg2){
  }
  protected void addSanitizedEntry(java.lang.String arg1, java.lang.String arg2){
  }
  public UrlQuerySanitizer.ValueSanitizer getValueSanitizer(java.lang.String arg1){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  public UrlQuerySanitizer.ValueSanitizer getEffectiveValueSanitizer(java.lang.String arg1){
    return (UrlQuerySanitizer.ValueSanitizer) null;
  }
  protected int decodeHexDigit(char arg1){
    return 0;
  }
}
