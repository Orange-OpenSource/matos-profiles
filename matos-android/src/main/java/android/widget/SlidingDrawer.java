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
public class SlidingDrawer
  extends android.view.ViewGroup{
  // Classes

  public static interface OnDrawerOpenListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDrawerOpened")
    public void onDrawerOpened();
  }
  public static interface OnDrawerCloseListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDrawerClosed")
    public void onDrawerClosed();
  }
  public static interface OnDrawerScrollListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScroll")
    public void onScrollStarted();
    @com.francetelecom.rd.stubs.annotation.CallBack("onScroll")
    public void onScrollEnded();
  }
  // Fields

  public static final int ORIENTATION_HORIZONTAL = 0;

  public static final int ORIENTATION_VERTICAL = 1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SlidingDrawer(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SlidingDrawer(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void lock(){
  }
  public void close(){
  }
  public void open(){
  }
  public android.view.View getHandle(){
    return (android.view.View) null;
  }
  public android.view.View getContent(){
    return (android.view.View) null;
  }
  public void unlock(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected void onFinishInflate(){
  }
  public void toggle(){
  }
  public boolean isOpened(){
    return false;
  }
  public void animateToggle(){
  }
  public void animateClose(){
  }
  public void animateOpen(){
  }
  public void setOnDrawerOpenListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.SlidingDrawer.OnDrawerOpenListener.onDrawerOpened") SlidingDrawer.OnDrawerOpenListener arg1){
  }
  public void setOnDrawerCloseListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.SlidingDrawer.OnDrawerCloseListener.onDrawerClosed") SlidingDrawer.OnDrawerCloseListener arg1){
  }
  public void setOnDrawerScrollListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.SlidingDrawer.OnDrawerScrollListener.onScroll") SlidingDrawer.OnDrawerScrollListener arg1){
  }
  public boolean isMoving(){
    return false;
  }
}
