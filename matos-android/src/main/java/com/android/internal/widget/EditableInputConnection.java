package com.android.internal.widget;

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
public class EditableInputConnection
  extends android.view.inputmethod.BaseInputConnection{
  // Constructors

  public EditableInputConnection(android.widget.TextView arg1){
    super((android.view.View) null, false);
  }
  // Methods

  public boolean beginBatchEdit(){
    return false;
  }
  public boolean endBatchEdit(){
    return false;
  }
  public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest arg1, int arg2){
    return (android.view.inputmethod.ExtractedText) null;
  }
  public boolean commitText(java.lang.CharSequence arg1, int arg2){
    return false;
  }
  public boolean commitCompletion(android.view.inputmethod.CompletionInfo arg1){
    return false;
  }
  public boolean commitCorrection(android.view.inputmethod.CorrectionInfo arg1){
    return false;
  }
  public boolean performEditorAction(int arg1){
    return false;
  }
  public boolean performContextMenuAction(int arg1){
    return false;
  }
  public boolean clearMetaKeyStates(int arg1){
    return false;
  }
  public boolean performPrivateCommand(java.lang.String arg1, android.os.Bundle arg2){
    return false;
  }
  public android.text.Editable getEditable(){
    return (android.text.Editable) null;
  }
}
