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


public final class CorrectionInfo
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<CorrectionInfo> CREATOR = null;

  // Constructors

  public CorrectionInfo(int arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3){
  }
  private CorrectionInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getOffset(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.CharSequence getNewText(){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getOldText(){
    return (java.lang.CharSequence) null;
  }
}
