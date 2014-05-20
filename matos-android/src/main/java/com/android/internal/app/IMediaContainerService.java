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


public interface IMediaContainerService
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IMediaContainerServiceStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IMediaContainerService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IMediaContainerService asInterface(android.os.IBinder arg1){
      return (IMediaContainerService) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public android.content.res.ObbInfo getObbInfo(java.lang.String arg1) throws android.os.RemoteException;
  public long calculateDirectorySize(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String copyResourceToContainer(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws android.os.RemoteException;
  public int copyResource(android.net.Uri arg1, android.os.ParcelFileDescriptor arg2) throws android.os.RemoteException;
  public android.content.pm.PackageInfoLite getMinimalPackageInfo(android.net.Uri arg1, int arg2, long arg3) throws android.os.RemoteException;
  public boolean checkInternalFreeStorage(android.net.Uri arg1, long arg2) throws android.os.RemoteException;
  public boolean checkExternalFreeStorage(android.net.Uri arg1) throws android.os.RemoteException;
}
