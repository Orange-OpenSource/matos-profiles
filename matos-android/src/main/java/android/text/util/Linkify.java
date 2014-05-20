package android.text.util;

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
public class Linkify
{
  // Classes

  public static interface MatchFilter
  {
    // Methods

    public boolean acceptMatch(java.lang.CharSequence arg1, int arg2, int arg3);
  }
  public static interface TransformFilter
  {
    // Methods

    public java.lang.String transformUrl(java.util.regex.Matcher arg1, java.lang.String arg2);
  }
  // Fields

  public static final int WEB_URLS = 1;

  public static final int EMAIL_ADDRESSES = 2;

  public static final int PHONE_NUMBERS = 4;

  public static final int MAP_ADDRESSES = 8;

  public static final int ALL = 15;

  public static final Linkify.MatchFilter sUrlMatchFilter = null;

  public static final Linkify.MatchFilter sPhoneNumberMatchFilter = null;

  public static final Linkify.TransformFilter sPhoneNumberTransformFilter = null;

  // Constructors

  public Linkify(){
  }
  // Methods

  public static final boolean addLinks(android.text.Spannable arg1, int arg2){
    return false;
  }
  public static final boolean addLinks(android.widget.TextView arg1, int arg2){
    return false;
  }
  public static final void addLinks(android.widget.TextView arg1, java.util.regex.Pattern arg2, java.lang.String arg3){
  }
  public static final void addLinks(android.widget.TextView arg1, java.util.regex.Pattern arg2, java.lang.String arg3, Linkify.MatchFilter arg4, Linkify.TransformFilter arg5){
  }
  public static final boolean addLinks(android.text.Spannable arg1, java.util.regex.Pattern arg2, java.lang.String arg3){
    return false;
  }
  public static final boolean addLinks(android.text.Spannable arg1, java.util.regex.Pattern arg2, java.lang.String arg3, Linkify.MatchFilter arg4, Linkify.TransformFilter arg5){
    return false;
  }
}
