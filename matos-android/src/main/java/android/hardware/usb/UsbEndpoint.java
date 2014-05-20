package android.hardware.usb;

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


public class UsbEndpoint
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<UsbEndpoint> CREATOR = null;

  // Constructors

  public UsbEndpoint(int arg1, int arg2, int arg3, int arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getAddress(){
    return 0;
  }
  public int getType(){
    return 0;
  }
  public int getAttributes(){
    return 0;
  }
  public int getMaxPacketSize(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getDirection(){
    return 0;
  }
  public int getEndpointNumber(){
    return 0;
  }
  public int getInterval(){
    return 0;
  }
}
