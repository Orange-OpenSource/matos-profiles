package android.inputmethodservice;

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
public class InputMethodService
  extends AbstractInputMethodService{
  // Classes

  public class InputMethodImpl
    extends AbstractInputMethodService.AbstractInputMethodImpl  {
    // Fields

    // Constructors

    public InputMethodImpl(){
      super();
    }
    // Methods

    public void showSoftInput(int arg1, android.os.ResultReceiver arg2){
    }
    public void restartInput(android.view.inputmethod.InputConnection arg1, android.view.inputmethod.EditorInfo arg2){
    }
    public void attachToken(android.os.IBinder arg1){
    }
    public void bindInput(android.view.inputmethod.InputBinding arg1){
    }
    public void unbindInput(){
    }
    public void startInput(android.view.inputmethod.InputConnection arg1, android.view.inputmethod.EditorInfo arg2){
    }
    public void hideSoftInput(int arg1, android.os.ResultReceiver arg2){
    }
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype arg1){
    }
  }
  public class InputMethodSessionImpl
    extends AbstractInputMethodService.AbstractInputMethodSessionImpl  {
    // Fields

    // Constructors

    public InputMethodSessionImpl(){
      super();
    }
    // Methods

    public void viewClicked(boolean arg1){
    }
    public void updateSelection(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    }
    public void updateCursor(android.graphics.Rect arg1){
    }
    public void updateExtractedText(int arg1, android.view.inputmethod.ExtractedText arg2){
    }
    public void displayCompletions(android.view.inputmethod.CompletionInfo [] arg1){
    }
    public void finishInput(){
    }
    public void appPrivateCommand(java.lang.String arg1, android.os.Bundle arg2){
    }
    public void toggleSoftInput(int arg1, int arg2){
    }
  }
  public static final class Insets
  {
    // Fields

    public int contentTopInsets;

    public int visibleTopInsets;

    public final android.graphics.Region touchableRegion = (android.graphics.Region) null;

    public static final int TOUCHABLE_INSETS_FRAME = 0;

    public static final int TOUCHABLE_INSETS_CONTENT = 1;

    public static final int TOUCHABLE_INSETS_VISIBLE = 2;

    public static final int TOUCHABLE_INSETS_REGION = 3;

    public int touchableInsets;

    // Constructors

    public Insets(){
    }
  }
  // Fields

  public static final int BACK_DISPOSITION_DEFAULT = 0;

  public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;

  public static final int BACK_DISPOSITION_WILL_DISMISS = 2;

  public static final int IME_ACTIVE = 1;

  public static final int IME_VISIBLE = 2;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public InputMethodService(){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  public android.app.Dialog getWindow(){
    return (android.app.Dialog) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyLongPress(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public android.view.LayoutInflater getLayoutInflater(){
    return (android.view.LayoutInflater) null;
  }
  public void setTheme(int arg1){
  }
  public void sendDownUpKeyEvents(int arg1){
  }
  public boolean isFullscreenMode(){
    return false;
  }
  public void showStatusIcon(int arg1){
  }
  public void hideStatusIcon(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface(){
    return (AbstractInputMethodService.AbstractInputMethodSessionImpl) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface(){
    return (AbstractInputMethodService.AbstractInputMethodImpl) null;
  }
  public android.view.inputmethod.EditorInfo getCurrentInputEditorInfo(){
    return (android.view.inputmethod.EditorInfo) null;
  }
  public android.view.inputmethod.InputConnection getCurrentInputConnection(){
    return (android.view.inputmethod.InputConnection) null;
  }
  public boolean isExtractViewShown(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onComputeInsets(InputMethodService.Insets arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onBind")
  public void onBindInput(){
  }
  public void onUnbindInput(){
  }
  public boolean isInputViewShown(){
    return false;
  }
  public void hideWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onShowInputRequested(int arg1, boolean arg2){
    return false;
  }
  public void showWindow(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onEvaluateInputViewShown(){
    return false;
  }
  protected void onCurrentInputMethodSubtypeChanged(android.view.inputmethod.InputMethodSubtype arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeInterface(){
  }
  public void setBackDisposition(@com.francetelecom.rd.stubs.annotation.FieldSet("backDisposition") int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("backDisposition")
  public int getBackDisposition(){
    return 0;
  }
  public int getMaxWidth(){
    return 0;
  }
  public android.view.inputmethod.InputBinding getCurrentInputBinding(){
    return (android.view.inputmethod.InputBinding) null;
  }
  public boolean getCurrentInputStarted(){
    return false;
  }
  public void updateFullscreenMode(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigureWindow(android.view.Window arg1, boolean arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onEvaluateFullscreenMode(){
    return false;
  }
  public void setExtractViewShown(boolean arg1){
  }
  public void updateInputViewShown(){
  }
  public boolean isShowInputRequested(){
    return false;
  }
  public void setCandidatesViewShown(boolean arg1){
  }
  public int getCandidatesHiddenVisibility(){
    return 0;
  }
  public void switchInputMethod(java.lang.String arg1){
  }
  public void setExtractView(android.view.View arg1){
  }
  public void setCandidatesView(android.view.View arg1){
  }
  public void setInputView(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.View onCreateExtractTextView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.View onCreateCandidatesView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.View onCreateInputView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartInputView(android.view.inputmethod.EditorInfo arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishInputView(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartCandidatesView(android.view.inputmethod.EditorInfo arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishCandidatesView(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowShown(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowHidden(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartInput(android.view.inputmethod.EditorInfo arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishInput(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDisplayCompletions(android.view.inputmethod.CompletionInfo [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUpdateExtractedText(int arg1, android.view.inputmethod.ExtractedText arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUpdateSelection(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onViewClicked(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUpdateCursor(android.graphics.Rect arg1){
  }
  public void requestHideSelf(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAppPrivateCommand(java.lang.String arg1, android.os.Bundle arg2){
  }
  public boolean sendDefaultEditorAction(boolean arg1){
    return false;
  }
  public void sendKeyChar(char arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onExtractedSelectionChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onExtractedTextClicked(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onExtractedCursorMovement(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onExtractTextContextMenuItem(int arg1){
    return false;
  }
  public java.lang.CharSequence getTextForImeAction(int arg1){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUpdateExtractingVisibility(android.view.inputmethod.EditorInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUpdateExtractingViews(android.view.inputmethod.EditorInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onExtractingInputChanged(android.view.inputmethod.EditorInfo arg1){
  }
}
