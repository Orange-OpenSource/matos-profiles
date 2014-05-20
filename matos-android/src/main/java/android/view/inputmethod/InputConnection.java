package android.view.inputmethod;

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
public interface InputConnection
{
  // Fields

  public static final int GET_TEXT_WITH_STYLES = 1;

  public static final int GET_EXTRACTED_TEXT_MONITOR = 1;

  // Methods

  public boolean setSelection(int arg1, int arg2);
  public boolean beginBatchEdit();
  public boolean endBatchEdit();
  public java.lang.CharSequence getTextAfterCursor(int arg1, int arg2);
  public java.lang.CharSequence getTextBeforeCursor(int arg1, int arg2);
  public java.lang.CharSequence getSelectedText(int arg1);
  public int getCursorCapsMode(int arg1);
  public ExtractedText getExtractedText(ExtractedTextRequest arg1, int arg2);
  public boolean commitText(java.lang.CharSequence arg1, int arg2);
  public boolean commitCompletion(CompletionInfo arg1);
  public boolean commitCorrection(CorrectionInfo arg1);
  public boolean performEditorAction(int arg1);
  public boolean performContextMenuAction(int arg1);
  public boolean setComposingRegion(int arg1, int arg2);
  public boolean setComposingText(java.lang.CharSequence arg1, int arg2);
  public boolean finishComposingText();
  public boolean sendKeyEvent(android.view.KeyEvent arg1);
  public boolean clearMetaKeyStates(int arg1);
  public boolean deleteSurroundingText(int arg1, int arg2);
  public boolean reportFullscreenMode(boolean arg1);
  public boolean performPrivateCommand(java.lang.String arg1, android.os.Bundle arg2);
}
