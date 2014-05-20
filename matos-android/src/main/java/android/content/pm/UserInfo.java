package android.content.pm;

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


public class UserInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int FLAG_PRIMARY = 1;

  public static final int FLAG_ADMIN = 2;

  public static final int FLAG_GUEST = 4;

  public int id;

  public java.lang.String name;

  public int flags;

  public static final android.os.Parcelable.Creator<UserInfo> CREATOR = null;

  // Constructors

  public UserInfo(int arg1, java.lang.String arg2, int arg3){
  }
  public UserInfo(){
  }
  public UserInfo(UserInfo arg1){
  }
  private UserInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isPrimary(){
    return false;
  }
  public boolean isAdmin(){
    return false;
  }
  public boolean isGuest(){
    return false;
  }
}
