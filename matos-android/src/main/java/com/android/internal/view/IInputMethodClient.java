package com.android.internal.view;

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


public interface IInputMethodClient
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IInputMethodClientStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IInputMethodClient
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputMethodClient asInterface(android.os.IBinder arg1){
      return (IInputMethodClient) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodClient")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodClient")
  public void setActive(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodClient")
  public void setUsingInputMethod(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodClient")
  public void onBindMethod(InputBindResult arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodClient")
  public void onUnbindMethod(int arg1) throws android.os.RemoteException;
}
