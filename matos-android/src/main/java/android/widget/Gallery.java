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
public class Gallery
  extends AbsSpinner  implements android.view.GestureDetector.OnGestureListener
{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.LayoutParams  {
    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Gallery(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Gallery(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Gallery(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean showContextMenuForChild(android.view.View arg1){
    return false;
  }
  protected int getChildDrawingOrder(int arg1, int arg2){
    return 0;
  }
  public void dispatchSetSelected(boolean arg1){
  }
  protected void dispatchSetPressed(boolean arg1){
  }
  protected boolean getChildStaticTransformation(android.view.View arg1, android.view.animation.Transformation arg2){
    return false;
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public boolean showContextMenu(){
    return false;
  }
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo(){
    return (android.view.ContextMenu.ContextMenuInfo) null;
  }
  protected int computeHorizontalScrollRange(){
    return 0;
  }
  protected int computeHorizontalScrollOffset(){
    return 0;
  }
  protected int computeHorizontalScrollExtent(){
    return 0;
  }
  public void setGravity(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onDown(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onScroll(android.view.MotionEvent arg1, android.view.MotionEvent arg2, float arg3, float arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSingleTapUp(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onFling(android.view.MotionEvent arg1, android.view.MotionEvent arg2, float arg3, float arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLongPress(android.view.MotionEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onShowPress(android.view.MotionEvent arg1){
  }
  public void setCallbackDuringFling(boolean arg1){
  }
  public void setCallbackOnUnselectedItemClick(boolean arg1){
  }
  public void setAnimationDuration(int arg1){
  }
  public void setSpacing(int arg1){
  }
  public void setUnselectedAlpha(float arg1){
  }
}
