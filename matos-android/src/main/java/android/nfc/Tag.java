package android.nfc;

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


public final class Tag
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<Tag> CREATOR = null;

  // Constructors

  public Tag(byte [] arg1, int [] arg2, android.os.Bundle [] arg3, int arg4, INfcTag arg5){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public byte [] getId(){
    return (byte []) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public INfcTag getTagService(){
    return (INfcTag) null;
  }
  public java.lang.String [] getTechList(){
    return (java.lang.String []) null;
  }
  public Tag rediscover() throws java.io.IOException{
    return (Tag) null;
  }
  public boolean hasTech(int arg1){
    return false;
  }
  public int getServiceHandle(){
    return 0;
  }
  public int getConnectedTechnology(){
    return 0;
  }
  public synchronized void setConnectedTechnology(int arg1){
  }
  public void setTechnologyDisconnected(){
  }
  public android.os.Bundle getTechExtras(int arg1){
    return (android.os.Bundle) null;
  }
  public static Tag createMockTag(byte [] arg1, int [] arg2, android.os.Bundle [] arg3){
    return (Tag) null;
  }
}
