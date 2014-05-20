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
public class IInputConnectionWrapper
  extends IInputContext.Stub{
  // Constructors

  public IInputConnectionWrapper(android.os.Looper arg1, android.view.inputmethod.InputConnection arg2){
    super();
  }
  // Methods

  public void setSelection(int arg1, int arg2){
  }
  public void beginBatchEdit(){
  }
  public void endBatchEdit(){
  }
  public boolean isActive(){
    return false;
  }
  public void getTextAfterCursor(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4){
  }
  public void getTextBeforeCursor(int arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4){
  }
  public void getSelectedText(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg3){
  }
  public void getCursorCapsMode(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg3){
  }
  public void getExtractedText(android.view.inputmethod.ExtractedTextRequest arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IInputContextCallback") IInputContextCallback arg4){
  }
  public void commitText(java.lang.CharSequence arg1, int arg2){
  }
  public void commitCompletion(android.view.inputmethod.CompletionInfo arg1){
  }
  public void commitCorrection(android.view.inputmethod.CorrectionInfo arg1){
  }
  public void performEditorAction(int arg1){
  }
  public void performContextMenuAction(int arg1){
  }
  public void setComposingRegion(int arg1, int arg2){
  }
  public void setComposingText(java.lang.CharSequence arg1, int arg2){
  }
  public void finishComposingText(){
  }
  public void sendKeyEvent(android.view.KeyEvent arg1){
  }
  public void clearMetaKeyStates(int arg1){
  }
  public void deleteSurroundingText(int arg1, int arg2){
  }
  public void reportFullscreenMode(boolean arg1){
  }
  public void performPrivateCommand(java.lang.String arg1, android.os.Bundle arg2){
  }
}
