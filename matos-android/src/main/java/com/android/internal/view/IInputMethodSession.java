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
public interface IInputMethodSession
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IInputMethodSessionStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IInputMethodSession
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputMethodSession asInterface(android.os.IBinder arg1){
      return (IInputMethodSession) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodSession")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void dispatchKeyEvent(int arg1, android.view.KeyEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iInputMethodCallBack") IInputMethodCallback arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void dispatchTrackballEvent(int arg1, android.view.MotionEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iInputMethodCallBack") IInputMethodCallback arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void viewClicked(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void updateSelection(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void updateCursor(android.graphics.Rect arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void updateExtractedText(int arg1, android.view.inputmethod.ExtractedText arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void displayCompletions(android.view.inputmethod.CompletionInfo [] arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void finishInput() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void appPrivateCommand(java.lang.String arg1, android.os.Bundle arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void toggleSoftInput(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputMethodSession")
  public void finishSession() throws android.os.RemoteException;
}
