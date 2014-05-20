package android.widget;

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
public class PopupWindow
{
  // Classes

  public static interface OnDismissListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDismiss")
    public void onDismiss();
  }
  // Fields

  public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;

  public static final int INPUT_METHOD_NEEDED = 1;

  public static final int INPUT_METHOD_NOT_NEEDED = 2;

  // Constructors

  public PopupWindow(android.content.Context arg1){
  }
  public PopupWindow(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  public PopupWindow(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
  }
  public PopupWindow(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, int arg4){
  }
  public PopupWindow(){
  }
  public PopupWindow(android.view.View arg1){
  }
  public PopupWindow(int arg1, int arg2){
  }
  public PopupWindow(android.view.View arg1, int arg2, int arg3){
  }
  public PopupWindow(android.view.View arg1, int arg2, int arg3, boolean arg4){
  }
  // Methods

  public void update(){
  }
  public void update(int arg1, int arg2){
  }
  public void update(int arg1, int arg2, int arg3, int arg4){
  }
  public void update(int arg1, int arg2, int arg3, int arg4, boolean arg5){
  }
  public void update(android.view.View arg1, int arg2, int arg3){
  }
  public void update(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setContentView(android.view.View arg1){
  }
  public void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public int getWidth(){
    return 0;
  }
  public boolean isFocusable(){
    return false;
  }
  public int getHeight(){
    return 0;
  }
  public void setFocusable(boolean arg1){
  }
  public android.graphics.drawable.Drawable getBackground(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setHeight(int arg1){
  }
  public void setWidth(int arg1){
  }
  public void dismiss(){
  }
  public boolean isShowing(){
    return false;
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onDismiss") PopupWindow.OnDismissListener arg1){
  }
  public void setSoftInputMode(int arg1){
  }
  public android.view.View getContentView(){
    return (android.view.View) null;
  }
  public void setInputMethodMode(int arg1){
  }
  public void showAsDropDown(android.view.View arg1){
  }
  public void showAsDropDown(android.view.View arg1, int arg2, int arg3){
  }
  public boolean isAboveAnchor(){
    return false;
  }
  public int getAnimationStyle(){
    return 0;
  }
  public void setIgnoreCheekPress(){
  }
  public void setAnimationStyle(int arg1){
  }
  public void setTouchInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onTouch") android.view.View.OnTouchListener arg1){
  }
  public int getInputMethodMode(){
    return 0;
  }
  public int getSoftInputMode(){
    return 0;
  }
  public boolean isTouchable(){
    return false;
  }
  public void setTouchable(boolean arg1){
  }
  public boolean isOutsideTouchable(){
    return false;
  }
  public void setOutsideTouchable(boolean arg1){
  }
  public boolean isClippingEnabled(){
    return false;
  }
  public void setClippingEnabled(boolean arg1){
  }
  public void setClipToScreenEnabled(boolean arg1){
  }
  public boolean isSplitTouchEnabled(){
    return false;
  }
  public void setSplitTouchEnabled(boolean arg1){
  }
  public boolean isLayoutInScreenEnabled(){
    return false;
  }
  public void setLayoutInScreenEnabled(boolean arg1){
  }
  public void setLayoutInsetDecor(boolean arg1){
  }
  public void setWindowLayoutType(int arg1){
  }
  public int getWindowLayoutType(){
    return 0;
  }
  public void setTouchModal(boolean arg1){
  }
  public void setWindowLayoutMode(int arg1, int arg2){
  }
  public void showAtLocation(android.view.View arg1, int arg2, int arg3, int arg4){
  }
  public void showAtLocation(android.os.IBinder arg1, int arg2, int arg3, int arg4){
  }
  public int getMaxAvailableHeight(android.view.View arg1){
    return 0;
  }
  public int getMaxAvailableHeight(android.view.View arg1, int arg2){
    return 0;
  }
  public int getMaxAvailableHeight(android.view.View arg1, int arg2, boolean arg3){
    return 0;
  }
}
