package android.os;

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
public interface IServiceManager
  extends IInterface
{
  // Fields

  public static final java.lang.String descriptor = "android.os.IServiceManager";

  public static final int GET_SERVICE_TRANSACTION = 1;

  public static final int CHECK_SERVICE_TRANSACTION = 2;

  public static final int ADD_SERVICE_TRANSACTION = 3;

  public static final int LIST_SERVICES_TRANSACTION = 4;

  public static final int CHECK_SERVICES_TRANSACTION = 5;

  public static final int SET_PERMISSION_CONTROLLER_TRANSACTION = 6;

  // Methods

  public IBinder getService(java.lang.String arg1) throws RemoteException;
  public IBinder checkService(java.lang.String arg1) throws RemoteException;
  public void addService(java.lang.String arg1, IBinder arg2) throws RemoteException;
  public java.lang.String [] listServices() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "setPermissionController", report = "-")
  public void setPermissionController(@com.francetelecom.rd.stubs.annotation.CallBackRegister("PermissionController") IPermissionController arg1) throws RemoteException;
}
