package android.view.textservice;

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
public final class SuggestionsInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;

  public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;

  public static final android.os.Parcelable.Creator<SuggestionsInfo> CREATOR = null;

  // Constructors

  public SuggestionsInfo(int arg1, java.lang.String [] arg2){
  }
  public SuggestionsInfo(int arg1, java.lang.String [] arg2, int arg3, int arg4){
  }
  public SuggestionsInfo(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getCookie(){
    return 0;
  }
  public int getSequence(){
    return 0;
  }
  public void setCookieAndSequence(int arg1, int arg2){
  }
  public int getSuggestionsAttributes(){
    return 0;
  }
  public int getSuggestionsCount(){
    return 0;
  }
  public java.lang.String getSuggestionAt(int arg1){
    return (java.lang.String) null;
  }
}
