package android.os.storage;

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
public class StorageVolume
  implements android.os.Parcelable
{
  // Fields

  public static final java.lang.String EXTRA_STORAGE_VOLUME = "storage_volume";

  public static final android.os.Parcelable.Creator<StorageVolume> CREATOR = null;

  // Constructors

  public StorageVolume(java.lang.String arg1, java.lang.String arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, long arg7){
  }
  private StorageVolume(java.lang.String arg1, java.lang.String arg2, boolean arg3, boolean arg4, int arg5, int arg6, boolean arg7, long arg8){
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
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isEmulated(){
    return false;
  }
  public int getStorageId(){
    return 0;
  }
  public java.lang.String getDescription(){
    return (java.lang.String) null;
  }
  public boolean allowMassStorage(){
    return false;
  }
  public void setStorageId(int arg1){
  }
  public boolean isRemovable(){
    return false;
  }
  public int getMtpReserveSpace(){
    return 0;
  }
  public long getMaxFileSize(){
    return 0l;
  }
}
