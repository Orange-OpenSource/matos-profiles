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
public class SyncQueue
{
  // Fields

  public final java.util.HashMap<java.lang.String, SyncOperation> mOperationsMap = (java.util.HashMap) null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SyncQueue(){
  }
  // Methods

  public boolean add(SyncOperation arg1){
    return false;
  }
  public void remove(SyncOperation arg1){
  }
  public void remove(android.accounts.Account arg1, java.lang.String arg2){
  }
  public void dump(java.lang.StringBuilder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBackoffChanged(android.accounts.Account arg1, java.lang.String arg2, long arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDelayUntilTimeChanged(android.accounts.Account arg1, java.lang.String arg2, long arg3){
  }
}
