package com.android.internal.policy.impl;

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
public class PhoneWindow
  extends android.view.Window  implements com.android.internal.view.menu.MenuBuilder.Callback
{
  // Constructors
  
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PhoneWindow(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  public void setTitle(java.lang.CharSequence arg1){
  }
  public android.view.View getCurrentFocus(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public void setContentView(int arg1){
  }
  public void setContentView(android.view.View arg1){
  }
  public void setContentView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  public void addContentView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onKeyDown(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onKeyUp(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder arg1, android.view.MenuItem arg2){
    return false;
  }
  public void takeKeyEvents(boolean arg1){
  }
  public final void setFeatureDrawableResource(int arg1, int arg2){
  }
  public final void setFeatureDrawableUri(int arg1, android.net.Uri arg2){
  }
  public final void setFeatureDrawable(int arg1, android.graphics.drawable.Drawable arg2){
  }
  public void setFeatureDrawableAlpha(int arg1, int arg2){
  }
  public android.view.LayoutInflater getLayoutInflater(){
    return (android.view.LayoutInflater) null;
  }
  public void setTitleColor(int arg1){
  }
  public void setVolumeControlStream(int arg1){
  }
  public int getVolumeControlStream(){
    return 0;
  }
  public void restoreHierarchyState(android.os.Bundle arg1){
  }
  public android.os.Bundle saveHierarchyState(){
    return (android.os.Bundle) null;
  }
  public final void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder arg1){
  }
  public boolean isShortcutKey(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public final android.view.View getDecorView(){
    return (android.view.View) null;
  }
  public boolean performPanelShortcut(int arg1, int arg2, android.view.KeyEvent arg3, int arg4){
    return false;
  }
  public boolean superDispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent arg1){
    return false;
  }
  public boolean superDispatchTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean superDispatchTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean superDispatchGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  public void invalidatePanelMenu(int arg1){
  }
  public final void openPanel(int arg1, android.view.KeyEvent arg2){
  }
  public final void closePanel(int arg1){
  }
  public boolean requestFeature(int arg1){
    return false;
  }
  public final void setFeatureInt(int arg1, int arg2){
  }
  public void setUiOptions(int arg1){
  }
  public void setUiOptions(int arg1, int arg2){
  }
  public final void setContainer(android.view.Window arg1){
  }
  public final void closeAllPanels(){
  }
  public void alwaysReadCloseOnTouchAttr(){
  }
  public boolean performPanelIdentifierAction(int arg1, int arg2, int arg3){
    return false;
  }
  public void takeSurface(@com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange2") android.view.SurfaceHolder.Callback2 arg1){
  }
  public void takeInputQueue(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onInputQueue") android.view.InputQueue.Callback arg1){
  }
  public boolean isFloating(){
    return false;
  }
  public boolean performContextMenuIdentifierAction(int arg1, int arg2){
    return false;
  }
  public final void togglePanel(int arg1, android.view.KeyEvent arg2){
  }
  public final android.view.View peekDecorView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onActive(){
  }
  public final void setChildDrawable(int arg1, android.graphics.drawable.Drawable arg2){
  }
  public final void setChildInt(int arg1, int arg2){
  }
  protected final void updateDrawable(int arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final boolean onKeyDownPanel(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final void onKeyUpPanel(int arg1, android.view.KeyEvent arg2){
  }
  protected final void setFeatureDefaultDrawable(int arg1, android.graphics.drawable.Drawable arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDrawableChanged(int arg1, android.graphics.drawable.Drawable arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onIntChanged(int arg1, int arg2){
  }
  protected void setFeatureFromAttrs(int arg1, android.content.res.TypedArray arg2, int arg3, int arg4){
  }
}
