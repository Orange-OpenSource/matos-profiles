package com.android.internal.app;

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


public interface IUsageStats
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IUsageStats
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IUsageStats asInterface(android.os.IBinder arg1){
      return (IUsageStats) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IUsageStats")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IUsageStats")
  public void noteLaunchTime(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsageStats")
  public void noteResumeComponent(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsageStats")
  public void notePauseComponent(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsageStats")
  public com.android.internal.os.PkgUsageStats getPkgUsageStats(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IUsageStats")
  public com.android.internal.os.PkgUsageStats [] getAllPkgUsageStats() throws android.os.RemoteException;
}
