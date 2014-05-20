package android.telephony;

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
public class NeighboringCellInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int UNKNOWN_RSSI = 99;

  public static final int UNKNOWN_CID = -1;

  public static final android.os.Parcelable.Creator<NeighboringCellInfo> CREATOR = null;

  // Constructors

  public NeighboringCellInfo(){
  }
  public NeighboringCellInfo(int arg1, int arg2){
  }
  public NeighboringCellInfo(int arg1, java.lang.String arg2, int arg3){
  }
  public NeighboringCellInfo(android.os.Parcel arg1){
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
  public int getNetworkType(){
    return 0;
  }
  public int getRssi(){
    return 0;
  }
  public int getCid(){
    return 0;
  }
  public void setRssi(int arg1){
  }
  public int getLac(){
    return 0;
  }
  public int getPsc(){
    return 0;
  }
  public void setCid(int arg1){
  }
}
