package com.android.server;

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

import com.francetelecom.rd.stubs.annotation.Code;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class InputMethodManagerService
  extends com.android.internal.view.IInputMethodManager.Stub  implements android.content.ServiceConnection, android.os.Handler.Callback
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate") 
  public InputMethodManagerService(android.content.Context arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public boolean handleMessage(android.os.Message arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onServiceConnected(android.content.ComponentName arg1, android.os.IBinder arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onServiceDisconnected(android.content.ComponentName arg1){
  }
  public boolean showSoftInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, int arg2, android.os.ResultReceiver arg3){
    return false;
  }
  public com.android.internal.view.InputBindResult startInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, com.android.internal.view.IInputContext arg2, android.view.inputmethod.EditorInfo arg3, boolean arg4, boolean arg5){
    return (com.android.internal.view.InputBindResult) null;
  }
  public boolean hideSoftInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, int arg2, android.os.ResultReceiver arg3){
    return false;
  }
  public void setImeWindowStatus(android.os.IBinder arg1, int arg2, int arg3){
  }
  public void systemReady(StatusBarManagerService arg1){
  }
  public void addClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, com.android.internal.view.IInputContext arg2, int arg3, int arg4){
  }
  public void finishInput(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1){
  }
  public void removeClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1){
  }
  public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return java.util.Collections.singletonList(inputMethodSubtype);")
  public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo arg1, boolean arg2){
    return (java.util.List) null;
  }
  public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan [] arg1){
  }
  public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("inputMethodSubtype")
  public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(){
    return (android.view.inputmethod.InputMethodSubtype) null;
  }
  public java.util.List getShortcutInputMethodsAndSubtypes(){
    return (java.util.List) null;
  }
  public void windowGainedFocus(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, android.os.IBinder arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, int arg7){
  }
  public void showInputMethodPickerFromClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1){
  }
  public void showInputMethodAndSubtypeEnablerFromClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputMethodClient") com.android.internal.view.IInputMethodClient arg1, java.lang.String arg2){
  }
  public void setInputMethod(android.os.IBinder arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("inputMethod") java.lang.String arg2){
  }
  public void setInputMethodAndSubtype(android.os.IBinder arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("inputMethod") java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("inputMethodSubtype") android.view.inputmethod.InputMethodSubtype arg3){
  }
  public void hideMySoftInput(android.os.IBinder arg1, int arg2){
  }
  public void showMySoftInput(android.os.IBinder arg1, int arg2){
  }
  public void updateStatusIcon(android.os.IBinder arg1, java.lang.String arg2, int arg3){
  }
  public boolean notifySuggestionPicked(android.text.style.SuggestionSpan arg1, java.lang.String arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("inputMethodSubtype")
  public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(){
    return (android.view.inputmethod.InputMethodSubtype) null;
  }
  public boolean setCurrentInputMethodSubtype(@com.francetelecom.rd.stubs.annotation.FieldSet("inputMethodSubtype") android.view.inputmethod.InputMethodSubtype arg1){
    return false;
  }
  public boolean switchToLastInputMethod(android.os.IBinder arg1){
    return false;
  }
  public boolean setInputMethodEnabled(@com.francetelecom.rd.stubs.annotation.FieldSet("inputMethod") java.lang.String arg1, boolean arg2){
    return false;
  }
  @Code("inputMethodSubtype = arg2[0];")
  public void setAdditionalInputMethodSubtypes(java.lang.String arg1, android.view.inputmethod.InputMethodSubtype [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return java.util.Collections.singletonList(inputMethodSubtype);")
  public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeListLocked(android.view.inputmethod.InputMethodInfo arg1, boolean arg2){
	return (java.util.List) null;
  }
}
