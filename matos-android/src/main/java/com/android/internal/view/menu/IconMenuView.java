package com.android.internal.view.menu;

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
public final class IconMenuView
  extends android.view.ViewGroup  implements MenuView, MenuBuilder.ItemInvoker, java.lang.Runnable
{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public IconMenuView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void run(){
  }
  public void initialize(MenuBuilder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public IconMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (IconMenuView.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public boolean invokeItem(MenuItemImpl arg1){
    return false;
  }
  public int getWindowAnimations(){
    return 0;
  }
  public int [] getLayout(){
    return (int []) null;
  }
  public int getLayoutNumRows(){
    return 0;
  }
}
