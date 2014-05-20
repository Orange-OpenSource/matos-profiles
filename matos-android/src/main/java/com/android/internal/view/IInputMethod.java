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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IInputMethod
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IInputMethodStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IInputMethod
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputMethod asInterface(android.os.IBinder arg1){
      return (IInputMethod) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethod")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void showSoftInput(int arg1, android.os.ResultReceiver arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void restartInput(IInputContext arg1, android.view.inputmethod.EditorInfo arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void attachToken(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void bindInput(android.view.inputmethod.InputBinding arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void unbindInput() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void startInput(IInputContext arg1, android.view.inputmethod.EditorInfo arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void createSession(@com.francetelecom.rd.stubs.annotation.CallBackRegister("iInputMethodCallBack") IInputMethodCallback arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void setSessionEnabled(IInputMethodSession arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void revokeSession(IInputMethodSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void hideSoftInput(int arg1, android.os.ResultReceiver arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethod")
  public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype arg1) throws android.os.RemoteException;
}
