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
public class SyncStatusInfo
  implements android.os.Parcelable
{
  // Fields

  public final int authorityId = 0;

  public long totalElapsedTime;

  public int numSyncs;

  public int numSourcePoll;

  public int numSourceServer;

  public int numSourceLocal;

  public int numSourceUser;

  public int numSourcePeriodic;

  public long lastSuccessTime;

  public int lastSuccessSource;

  public long lastFailureTime;

  public int lastFailureSource;

  public java.lang.String lastFailureMesg;

  public long initialFailureTime;

  public boolean pending;

  public boolean initialize;

  public java.util.ArrayList<java.lang.Long> periodicSyncTimes;

  public static final android.os.Parcelable.Creator<SyncStatusInfo> CREATOR = null;

  // Constructors

  SyncStatusInfo(int arg1){
  }
  SyncStatusInfo(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getLastFailureMesgAsInt(int arg1){
    return 0;
  }
  public void setPeriodicSyncTime(int arg1, long arg2){
  }
  public long getPeriodicSyncTime(int arg1){
    return 0l;
  }
  public void removePeriodicSyncTime(int arg1){
  }
}
