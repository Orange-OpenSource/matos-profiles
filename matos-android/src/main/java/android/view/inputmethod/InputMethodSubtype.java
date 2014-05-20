package android.view.inputmethod;

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
public final class InputMethodSubtype
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<InputMethodSubtype> CREATOR = null;

  // Constructors

  public InputMethodSubtype(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6){
  }
  public InputMethodSubtype(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6, boolean arg7){
  }
  InputMethodSubtype(android.os.Parcel arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public static java.util.List<InputMethodSubtype> sort(android.content.Context arg1, int arg2, InputMethodInfo arg3, java.util.List<InputMethodSubtype> arg4){
    return (java.util.List) null;
  }
  public java.lang.CharSequence getDisplayName(android.content.Context arg1, java.lang.String arg2, android.content.pm.ApplicationInfo arg3){
    return (java.lang.CharSequence) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.String getMode(){
    return (java.lang.String) null;
  }
  public boolean isAuxiliary(){
    return false;
  }
  public boolean overridesImplicitlyEnabledSubtype(){
    return false;
  }
  public java.lang.String getLocale(){
    return (java.lang.String) null;
  }
  public int getNameResId(){
    return 0;
  }
  public java.lang.String getExtraValue(){
    return (java.lang.String) null;
  }
  public boolean containsExtraValueKey(java.lang.String arg1){
    return false;
  }
  public int getIconResId(){
    return 0;
  }
  public java.lang.String getExtraValueOf(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
