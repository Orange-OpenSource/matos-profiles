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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SyncAdapterType
  implements android.os.Parcelable
{
  // Fields

  public final java.lang.String authority = (java.lang.String) null;

  public final java.lang.String accountType = (java.lang.String) null;

  public final boolean isKey = false;

  public static final android.os.Parcelable.Creator<SyncAdapterType> CREATOR = null;

  // Constructors

  public SyncAdapterType(java.lang.String arg1, java.lang.String arg2, boolean arg3, boolean arg4){
  }
  public SyncAdapterType(java.lang.String arg1, java.lang.String arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, java.lang.String arg7){
  }
  private SyncAdapterType(java.lang.String arg1, java.lang.String arg2){
  }
  public SyncAdapterType(android.os.Parcel arg1){
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
  public boolean allowParallelSyncs(){
    return false;
  }
  public boolean isAlwaysSyncable(){
    return false;
  }
  public boolean supportsUploading(){
    return false;
  }
  public java.lang.String getSettingsActivity(){
    return (java.lang.String) null;
  }
  public static SyncAdapterType newKey(java.lang.String arg1, java.lang.String arg2){
    return (SyncAdapterType) null;
  }
  public boolean isUserVisible(){
    return false;
  }
}
