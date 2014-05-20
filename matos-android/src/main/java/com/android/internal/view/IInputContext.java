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
public interface IInputContext
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IInputContext
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputContext asInterface(android.os.IBinder arg1){
      return (IInputContext) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContext")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void setSelection(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void beginBatchEdit() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void endBatchEdit() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void getTextAfterCursor(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void getTextBeforeCursor(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void getSelectedText(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void getCursorCapsMode(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void getExtractedText(android.view.inputmethod.ExtractedTextRequest arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void commitText(java.lang.CharSequence arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void commitCompletion(android.view.inputmethod.CompletionInfo arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void commitCorrection(android.view.inputmethod.CorrectionInfo arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void performEditorAction(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void performContextMenuAction(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void setComposingRegion(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void setComposingText(java.lang.CharSequence arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void finishComposingText() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void sendKeyEvent(android.view.KeyEvent arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void clearMetaKeyStates(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void deleteSurroundingText(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void reportFullscreenMode(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContext")
  public void performPrivateCommand(java.lang.String arg1, android.os.Bundle arg2) throws android.os.RemoteException;
}
