package android.content;

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


public class ClipDescription
  implements android.os.Parcelable
{
  // Fields

  public static final java.lang.String MIMETYPE_TEXT_PLAIN = "text/plain";

  public static final java.lang.String MIMETYPE_TEXT_URILIST = "text/uri-list";

  public static final java.lang.String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";

  public static final android.os.Parcelable.Creator<ClipDescription> CREATOR = null;

  // Constructors

  public ClipDescription(java.lang.CharSequence arg1, java.lang.String [] arg2){
  }
  public ClipDescription(ClipDescription arg1){
  }
  ClipDescription(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void validate(){
  }
  public boolean hasMimeType(java.lang.String arg1){
    return false;
  }
  public java.lang.String getMimeType(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.CharSequence getLabel(){
    return (java.lang.CharSequence) null;
  }
  public static boolean compareMimeTypes(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public java.lang.String [] filterMimeTypes(java.lang.String arg1){
    return (java.lang.String []) null;
  }
  public int getMimeTypeCount(){
    return 0;
  }
}
