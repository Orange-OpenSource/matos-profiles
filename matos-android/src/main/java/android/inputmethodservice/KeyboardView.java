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
public class KeyboardView
  extends android.view.View  implements android.view.View.OnClickListener
{
  // Classes

  public static interface OnKeyboardActionListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void onKey(int arg1, int [] arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void onRelease(int arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void onText(java.lang.CharSequence arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void onPress(int arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void swipeLeft();
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void swipeRight();
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void swipeUp();
    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyChange")
    public void swipeDown();
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public KeyboardView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public KeyboardView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void closing(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onMeasure(int arg1, int arg2){
  }
  public boolean onHoverEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDraw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onLongPress(Keyboard.Key arg1){
    return false;
  }
  public boolean setShifted(boolean arg1){
    return false;
  }
  public boolean isShifted(){
    return false;
  }
  protected void swipeLeft(){
  }
  protected void swipeRight(){
  }
  protected void swipeUp(){
  }
  protected void swipeDown(){
  }
  public void setOnKeyboardActionListener(@com.francetelecom.rd.stubs.annotation.FieldSet("actionListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.inputmethodService.KeyboardView.OnKeyboardActionListener.onKeyChange") KeyboardView.OnKeyboardActionListener arg1){
  }
  public void setKeyboard(@com.francetelecom.rd.stubs.annotation.FieldSet("keyboard") Keyboard arg1){
  }
  public void setPreviewEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("keyboard")
  public Keyboard getKeyboard(){
    return (Keyboard) null;
  }
  public boolean handleBack(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("actionListener")
  protected KeyboardView.OnKeyboardActionListener getOnKeyboardActionListener(){
    return (KeyboardView.OnKeyboardActionListener) null;
  }
  public boolean isPreviewEnabled(){
    return false;
  }
  public void setVerticalCorrection(int arg1){
  }
  public void setPopupParent(android.view.View arg1){
  }
  public void setPopupOffset(int arg1, int arg2){
  }
  public void setProximityCorrectionEnabled(boolean arg1){
  }
  public boolean isProximityCorrectionEnabled(){
    return false;
  }
  public void invalidateAllKeys(){
  }
  public void invalidateKey(int arg1){
  }
}
