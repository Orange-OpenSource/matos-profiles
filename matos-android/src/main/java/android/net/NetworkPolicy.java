package android.net;

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


public class NetworkPolicy
  implements java.lang.Comparable<NetworkPolicy>, android.os.Parcelable
{
  // Fields

  public static final long WARNING_DISABLED = -1l;

  public static final long LIMIT_DISABLED = -1l;

  public static final long SNOOZE_NEVER = -1l;

  public final NetworkTemplate template = (NetworkTemplate) null;

  public int cycleDay;

  public long warningBytes;

  public long limitBytes;

  public long lastSnooze;

  public static final android.os.Parcelable.Creator<NetworkPolicy> CREATOR = null;

  // Constructors

  public NetworkPolicy(NetworkTemplate arg1, int arg2, long arg3, long arg4, long arg5){
  }
  public NetworkPolicy(android.os.Parcel arg1){
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
  public int compareTo(NetworkPolicy arg1){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isOverLimit(long arg1){
    return false;
  }
}
