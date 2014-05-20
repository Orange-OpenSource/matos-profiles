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
public final class SyncResult
  implements android.os.Parcelable
{
  // Fields

  public final boolean syncAlreadyInProgress = false;

  public boolean tooManyDeletions;

  public boolean tooManyRetries;

  public boolean databaseError;

  public boolean fullSyncRequested;

  public boolean partialSyncUnavailable;

  public boolean moreRecordsToGet;

  public long delayUntil;

  public final SyncStats stats = (SyncStats) null;

  public static final SyncResult ALREADY_IN_PROGRESS = null;

  public static final android.os.Parcelable.Creator<SyncResult> CREATOR = null;

  // Constructors

  public SyncResult(){
  }
  private SyncResult(boolean arg1){
  }
  private SyncResult(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean hasError(){
    return false;
  }
  public java.lang.String toDebugString(){
    return (java.lang.String) null;
  }
  public boolean madeSomeProgress(){
    return false;
  }
  public boolean hasSoftError(){
    return false;
  }
  public boolean hasHardError(){
    return false;
  }
}
