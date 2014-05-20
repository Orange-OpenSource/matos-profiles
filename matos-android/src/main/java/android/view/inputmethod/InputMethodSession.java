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
public interface InputMethodSession
{
  // Classes

  public static interface EventCallback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("EventCallback")
    public void finishedEvent(int arg1, boolean arg2);
  }
  // Methods

  public void dispatchKeyEvent(int arg1, android.view.KeyEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("EventCallback") InputMethodSession.EventCallback arg3);
  public void dispatchTrackballEvent(int arg1, android.view.MotionEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("EventCallback") InputMethodSession.EventCallback arg3);
  public void viewClicked(boolean arg1);
  public void updateSelection(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
  public void updateCursor(android.graphics.Rect arg1);
  public void updateExtractedText(int arg1, ExtractedText arg2);
  public void displayCompletions(CompletionInfo [] arg1);
  public void finishInput();
  public void appPrivateCommand(java.lang.String arg1, android.os.Bundle arg2);
  public void toggleSoftInput(int arg1, int arg2);
}
