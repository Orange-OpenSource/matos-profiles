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
public interface IInputMethodManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IInputMethodManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputMethodManager asInterface(android.os.IBinder arg1){
      return (IInputMethodManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public boolean showSoftInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, int arg2, android.os.ResultReceiver arg3) throws android.os.RemoteException;
  public InputBindResult startInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, IInputContext arg2, android.view.inputmethod.EditorInfo arg3, boolean arg4, boolean arg5) throws android.os.RemoteException;
  public boolean hideSoftInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, int arg2, android.os.ResultReceiver arg3) throws android.os.RemoteException;
  public void setImeWindowStatus(android.os.IBinder arg1, int arg2, int arg3) throws android.os.RemoteException;
  public void addClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, IInputContext arg2, int arg3, int arg4) throws android.os.RemoteException;
  public void finishInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1) throws android.os.RemoteException;
  public void removeClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1) throws android.os.RemoteException;
  public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList() throws android.os.RemoteException;
  public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo arg1, boolean arg2) throws android.os.RemoteException;
  public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan [] arg1) throws android.os.RemoteException;
  public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList() throws android.os.RemoteException;
  public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() throws android.os.RemoteException;
  public java.util.List getShortcutInputMethodsAndSubtypes() throws android.os.RemoteException;
  public void windowGainedFocus(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, android.os.IBinder arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, int arg7) throws android.os.RemoteException;
  public void showInputMethodPickerFromClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1) throws android.os.RemoteException;
  public void showInputMethodAndSubtypeEnablerFromClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") IInputMethodClient arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void setInputMethod(android.os.IBinder arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void setInputMethodAndSubtype(android.os.IBinder arg1, java.lang.String arg2, android.view.inputmethod.InputMethodSubtype arg3) throws android.os.RemoteException;
  public void hideMySoftInput(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  public void showMySoftInput(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  public void updateStatusIcon(android.os.IBinder arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public boolean notifySuggestionPicked(android.text.style.SuggestionSpan arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() throws android.os.RemoteException;
  public boolean setCurrentInputMethodSubtype(android.view.inputmethod.InputMethodSubtype arg1) throws android.os.RemoteException;
  public boolean switchToLastInputMethod(android.os.IBinder arg1) throws android.os.RemoteException;
  public boolean setInputMethodEnabled(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public void setAdditionalInputMethodSubtypes(java.lang.String arg1, android.view.inputmethod.InputMethodSubtype [] arg2) throws android.os.RemoteException;
}
