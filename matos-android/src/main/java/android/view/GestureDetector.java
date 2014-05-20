package android.view;

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
public class GestureDetector
{
  // Classes

  public static interface OnGestureListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public boolean onDown(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public boolean onScroll(MotionEvent arg1, MotionEvent arg2, float arg3, float arg4);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public boolean onSingleTapUp(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public boolean onFling(MotionEvent arg1, MotionEvent arg2, float arg3, float arg4);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onLongPress(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onShowPress(MotionEvent arg1);
  }
  public static interface OnDoubleTapListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDoubleTab")
    public boolean onDoubleTap(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onDoubleTab")
    public boolean onDoubleTapEvent(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onDoubleTab")
    public boolean onSingleTapConfirmed(MotionEvent arg1);
  }
  public static class SimpleOnGestureListener
    implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
  {
    // Constructors

    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SimpleOnGestureListener(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onDown(MotionEvent arg1){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onScroll(MotionEvent arg1, MotionEvent arg2, float arg3, float arg4){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onSingleTapUp(MotionEvent arg1){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onFling(MotionEvent arg1, MotionEvent arg2, float arg3, float arg4){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onLongPress(MotionEvent arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onShowPress(MotionEvent arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onDoubleTap(MotionEvent arg1){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onDoubleTapEvent(MotionEvent arg1){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onSingleTapConfirmed(MotionEvent arg1){
      return false;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GestureDetector(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureDetector.OnGestureListener arg1, android.os.Handler arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GestureDetector(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureDetector.OnGestureListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GestureDetector(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureDetector.OnGestureListener arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GestureDetector(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureDetector.OnGestureListener arg2, android.os.Handler arg3){
  }
  public GestureDetector(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureDetector.OnGestureListener arg2, android.os.Handler arg3, boolean arg4){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(MotionEvent arg1){
    return false;
  }
  public void setIsLongpressEnabled(boolean arg1){
  }
  public void setOnDoubleTapListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.GestureDetector.OnDoubleTapListener.onDoubleTab") GestureDetector.OnDoubleTapListener arg1){
  }
  public boolean isLongpressEnabled(){
    return false;
  }
}
