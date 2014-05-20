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
public class AccountAuthenticatorResponse
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<AccountAuthenticatorResponse> CREATOR = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  AccountAuthenticatorResponse(IAccountAuthenticatorResponse arg1){
  }
  public AccountAuthenticatorResponse(android.os.Parcel arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onError(int arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onResult(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRequestContinued(){
  }
}
