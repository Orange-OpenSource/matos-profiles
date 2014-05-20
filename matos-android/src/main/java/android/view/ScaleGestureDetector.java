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
public class ScaleGestureDetector
{
  // Classes

  public static interface OnScaleGestureListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScale")
    public boolean onScaleBegin(ScaleGestureDetector arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onScale")
    public boolean onScale(ScaleGestureDetector arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onScale")
    public void onScaleEnd(ScaleGestureDetector arg1);
  }
  public static class SimpleOnScaleGestureListener
    implements ScaleGestureDetector.OnScaleGestureListener
  {
    // Constructors

    public SimpleOnScaleGestureListener(){
    }
    // Methods

    public boolean onScaleBegin(ScaleGestureDetector arg1){
      return false;
    }
    public boolean onScale(ScaleGestureDetector arg1){
      return false;
    }
    public void onScaleEnd(ScaleGestureDetector arg1){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ScaleGestureDetector(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onScale") ScaleGestureDetector.OnScaleGestureListener arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(MotionEvent arg1){
    return false;
  }
  public float getScaleFactor(){
    return 0.0f;
  }
  public long getEventTime(){
    return 0l;
  }
  public boolean isInProgress(){
    return false;
  }
  public float getFocusX(){
    return 0.0f;
  }
  public float getFocusY(){
    return 0.0f;
  }
  public float getCurrentSpan(){
    return 0.0f;
  }
  public float getPreviousSpan(){
    return 0.0f;
  }
  public float getCurrentSpanX(){
    return 0.0f;
  }
  public float getCurrentSpanY(){
    return 0.0f;
  }
  public float getPreviousSpanX(){
    return 0.0f;
  }
  public float getPreviousSpanY(){
    return 0.0f;
  }
  public long getTimeDelta(){
    return 0l;
  }
}
