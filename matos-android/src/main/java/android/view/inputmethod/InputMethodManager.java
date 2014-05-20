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
public final class InputMethodManager
{
  // Fields

  public static final int SHOW_IMPLICIT = 1;

  public static final int SHOW_FORCED = 2;

  public static final int RESULT_UNCHANGED_SHOWN = 0;

  public static final int RESULT_UNCHANGED_HIDDEN = 1;

  public static final int RESULT_SHOWN = 2;

  public static final int RESULT_HIDDEN = 3;

  public static final int HIDE_IMPLICIT_ONLY = 1;

  public static final int HIDE_NOT_ALWAYS = 2;

  // Constructors

  InputMethodManager(com.android.internal.view.IInputMethodManager arg1, android.os.Looper arg2){
  }
  // Methods

  public static InputMethodManager getInstance(android.content.Context arg1){
    return (InputMethodManager) null;
  }
  public static InputMethodManager getInstance(android.os.Looper arg1){
    return (InputMethodManager) null;
  }
  public void dispatchKeyEvent(android.content.Context arg1, int arg2, android.view.KeyEvent arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iInputMethodCallBack") com.android.internal.view.IInputMethodCallback arg4){
  }
  public void viewClicked(android.view.View arg1){
  }
  public boolean showSoftInput(android.view.View arg1, int arg2){
    return false;
  }
  public boolean showSoftInput(android.view.View arg1, int arg2, android.os.ResultReceiver arg3){
    return false;
  }
  public void restartInput(android.view.View arg1){
  }
  public void setImeWindowStatus(android.os.IBinder arg1, int arg2, int arg3){
  }
  public boolean isActive(android.view.View arg1){
    return false;
  }
  public boolean isActive(){
    return false;
  }
  public void updateSelection(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void updateCursor(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void updateExtractedText(android.view.View arg1, int arg2, ExtractedText arg3){
  }
  public void displayCompletions(android.view.View arg1, CompletionInfo [] arg2){
  }
  public void toggleSoftInput(int arg1, int arg2){
  }
  public com.android.internal.view.IInputMethodClient getClient(){
    return (com.android.internal.view.IInputMethodClient) null;
  }
  public java.util.List<InputMethodInfo> getEnabledInputMethodList(){
    return (java.util.List) null;
  }
  public java.util.List<InputMethodSubtype> getEnabledInputMethodSubtypeList(InputMethodInfo arg1, boolean arg2){
    return (java.util.List) null;
  }
  public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan [] arg1){
  }
  public java.util.List<InputMethodInfo> getInputMethodList(){
    return (java.util.List) null;
  }
  public InputMethodSubtype getLastInputMethodSubtype(){
    return (InputMethodSubtype) null;
  }
  public java.util.Map<InputMethodInfo, java.util.List<InputMethodSubtype>> getShortcutInputMethodsAndSubtypes(){
    return (java.util.Map) null;
  }
  public void setInputMethod(android.os.IBinder arg1, java.lang.String arg2){
  }
  public void setInputMethodAndSubtype(android.os.IBinder arg1, java.lang.String arg2, InputMethodSubtype arg3){
  }
  public void notifySuggestionPicked(android.text.style.SuggestionSpan arg1, java.lang.String arg2, int arg3){
  }
  public InputMethodSubtype getCurrentInputMethodSubtype(){
    return (InputMethodSubtype) null;
  }
  public boolean setCurrentInputMethodSubtype(InputMethodSubtype arg1){
    return false;
  }
  public boolean switchToLastInputMethod(android.os.IBinder arg1){
    return false;
  }
  public void setAdditionalInputMethodSubtypes(java.lang.String arg1, InputMethodSubtype [] arg2){
  }
  public void checkFocus(){
  }
  public static InputMethodManager peekInstance(){
    return (InputMethodManager) null;
  }
  public void focusOut(android.view.View arg1){
  }
  public void focusIn(android.view.View arg1){
  }
  public boolean hideSoftInputFromWindow(android.os.IBinder arg1, int arg2){
    return false;
  }
  public boolean hideSoftInputFromWindow(android.os.IBinder arg1, int arg2, android.os.ResultReceiver arg3){
    return false;
  }
  public boolean isWatchingCursor(android.view.View arg1){
    return false;
  }
  public boolean isFullscreenMode(){
    return false;
  }
  public void setFullscreenMode(boolean arg1){
  }
  public com.android.internal.view.IInputContext getInputContext(){
    return (com.android.internal.view.IInputContext) null;
  }
  public void startGettingWindowFocus(android.view.View arg1){
  }
  public void onWindowFocus(android.view.View arg1, android.view.View arg2, int arg3, boolean arg4, int arg5){
  }
  public void reportFinishInputConnection(InputConnection arg1){
  }
  public void showSoftInputUnchecked(int arg1, android.os.ResultReceiver arg2){
  }
  public void showStatusIcon(android.os.IBinder arg1, java.lang.String arg2, int arg3){
  }
  public void hideStatusIcon(android.os.IBinder arg1){
  }
  public boolean isAcceptingText(){
    return false;
  }
  public void toggleSoftInputFromWindow(android.os.IBinder arg1, int arg2, int arg3){
  }
  public void windowDismissed(android.os.IBinder arg1){
  }
  public void sendAppPrivateCommand(android.view.View arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public void hideSoftInputFromInputMethod(android.os.IBinder arg1, int arg2){
  }
  public void showSoftInputFromInputMethod(android.os.IBinder arg1, int arg2){
  }
  public void showInputMethodPicker(){
  }
  public void showInputMethodAndSubtypeEnabler(java.lang.String arg1){
  }
}
