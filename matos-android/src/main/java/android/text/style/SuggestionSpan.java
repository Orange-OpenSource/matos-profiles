package android.text.style;

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


public class SuggestionSpan
  extends CharacterStyle  implements android.text.ParcelableSpan
{
  // Fields

  public static final int FLAG_EASY_CORRECT = 1;

  public static final int FLAG_MISSPELLED = 2;

  public static final int FLAG_AUTO_CORRECTION = 4;

  public static final java.lang.String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";

  public static final java.lang.String SUGGESTION_SPAN_PICKED_AFTER = "after";

  public static final java.lang.String SUGGESTION_SPAN_PICKED_BEFORE = "before";

  public static final java.lang.String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";

  public static final int SUGGESTIONS_MAX_SIZE = 5;

  public static final android.os.Parcelable.Creator<SuggestionSpan> CREATOR = null;

  // Constructors

  public SuggestionSpan(android.content.Context arg1, java.lang.String [] arg2, int arg3){
    super();
  }
  public SuggestionSpan(java.util.Locale arg1, java.lang.String [] arg2, int arg3){
    super();
  }
  public SuggestionSpan(android.content.Context arg1, java.util.Locale arg2, java.lang.String [] arg3, int arg4, java.lang.Class<?> arg5){
    super();
  }
  public SuggestionSpan(android.os.Parcel arg1){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getSpanTypeId(){
    return 0;
  }
  public void updateDrawState(android.text.TextPaint arg1){
  }
  public void setFlags(int arg1){
  }
  public int getFlags(){
    return 0;
  }
  public java.lang.String getLocale(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getSuggestions(){
    return (java.lang.String []) null;
  }
  public java.lang.String getNotificationTargetClassName(){
    return (java.lang.String) null;
  }
  public int getUnderlineColor(){
    return 0;
  }
}
