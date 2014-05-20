package android.accounts;

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
public class AuthenticatorDescription
  implements android.os.Parcelable
{
  // Fields

  public final java.lang.String type = (java.lang.String) null;

  public final int labelId = 0;

  public final int iconId = 0;

  public final int smallIconId = 0;

  public final int accountPreferencesId = 0;

  public final java.lang.String packageName = (java.lang.String) null;

  public final boolean customTokens = false;

  public static final android.os.Parcelable.Creator<AuthenticatorDescription> CREATOR = null;

  // Constructors

  public AuthenticatorDescription(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7){
  }
  public AuthenticatorDescription(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, int arg6){
  }
  private AuthenticatorDescription(java.lang.String arg1){
  }
  private AuthenticatorDescription(android.os.Parcel arg1){
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
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static AuthenticatorDescription newKey(java.lang.String arg1){
    return (AuthenticatorDescription) null;
  }
}
