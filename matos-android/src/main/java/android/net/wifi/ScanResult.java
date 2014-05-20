package android.net.wifi;

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
public class ScanResult
  implements android.os.Parcelable
{
  // Fields

  public java.lang.String SSID;

  public java.lang.String BSSID;

  public java.lang.String capabilities;

  public int level;

  public int frequency;

  public static final android.os.Parcelable.Creator<ScanResult> CREATOR = null;

  // Constructors

  public ScanResult(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5){
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
}
