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
public class SyncStats
  implements android.os.Parcelable
{
  // Fields

  public long numAuthExceptions;

  public long numIoExceptions;

  public long numParseExceptions;

  public long numConflictDetectedExceptions;

  public long numInserts;

  public long numUpdates;

  public long numDeletes;

  public long numEntries;

  public long numSkippedEntries;

  public static final android.os.Parcelable.Creator<SyncStats> CREATOR = null;

  // Constructors

  public SyncStats(){
  }
  public SyncStats(android.os.Parcel arg1){
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
}
