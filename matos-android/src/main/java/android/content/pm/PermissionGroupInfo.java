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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class PermissionGroupInfo
  extends PackageItemInfo  implements android.os.Parcelable
{
  // Fields

  public int descriptionRes;

  public java.lang.CharSequence nonLocalizedDescription;

  public static final android.os.Parcelable.Creator<PermissionGroupInfo> CREATOR = null;

  // Constructors

  public PermissionGroupInfo(){
    super();
  }
  public PermissionGroupInfo(PermissionGroupInfo arg1){
    super();
  }
  private PermissionGroupInfo(android.os.Parcel arg1){
    super();
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
  public java.lang.CharSequence loadDescription(PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
}
