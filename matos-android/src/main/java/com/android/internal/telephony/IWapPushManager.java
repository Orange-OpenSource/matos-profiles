package com.android.internal.telephony;

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

import com.francetelecom.rd.stubs.annotation.Real;


public interface IWapPushManager
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IWapPushManagerStubImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IWapPushManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IWapPushManager asInterface(android.os.IBinder arg1){
      return (IWapPushManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int processMessage(java.lang.String arg1, java.lang.String arg2, android.content.Intent arg3) throws android.os.RemoteException;
  public boolean addPackage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, int arg5, boolean arg6, boolean arg7) throws android.os.RemoteException;
  public boolean updatePackage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, int arg5, boolean arg6, boolean arg7) throws android.os.RemoteException;
  public boolean deletePackage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws android.os.RemoteException;
}
