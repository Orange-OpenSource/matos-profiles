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


public class SyncOperation
  implements java.lang.Comparable
{
  // Fields

  public final android.accounts.Account account = (android.accounts.Account) null;

  public int syncSource;

  public java.lang.String authority;

  public final boolean allowParallelSyncs = false;

  public android.os.Bundle extras;

  public final java.lang.String key = (java.lang.String) null;

  public long earliestRunTime;

  public boolean expedited;

  public SyncStorageEngine.PendingOperation pendingOperation;

  public java.lang.Long backoff;

  public long delayUntil;

  public long effectiveRunTime;

  // Constructors

  public SyncOperation(android.accounts.Account arg1, int arg2, java.lang.String arg3, android.os.Bundle arg4, long arg5, long arg6, long arg7, boolean arg8){
  }
  SyncOperation(SyncOperation arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int compareTo(java.lang.Object arg1){
    return 0;
  }
  public java.lang.String dump(boolean arg1){
    return (java.lang.String) null;
  }
  public boolean isInitialization(){
    return false;
  }
  public boolean ignoreBackoff(){
    return false;
  }
  public static void extrasToStringBuilder(android.os.Bundle arg1, java.lang.StringBuilder arg2){
  }
  public void updateEffectiveRunTime(){
  }
}
