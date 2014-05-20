package android.gesture;

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


public class GestureOverlayView
  extends android.widget.FrameLayout{
  // Classes

  public static interface OnGesturingListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGesturingEnded(GestureOverlayView arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGesturingStarted(GestureOverlayView arg1);
  }
  public static interface OnGestureListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGestureCancelled(GestureOverlayView arg1, android.view.MotionEvent arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGestureStarted(GestureOverlayView arg1, android.view.MotionEvent arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGesture(GestureOverlayView arg1, android.view.MotionEvent arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGestureEnded(GestureOverlayView arg1, android.view.MotionEvent arg2);
  }
  public static interface OnGesturePerformedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGesture")
    public void onGesturePerformed(GestureOverlayView arg1, Gesture arg2);
  }
  // Fields

  public static final int GESTURE_STROKE_TYPE_SINGLE = 0;

  public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;

  public static final int ORIENTATION_HORIZONTAL = 0;

  public static final int ORIENTATION_VERTICAL = 1;

  // Constructors

  public GestureOverlayView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public GestureOverlayView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public GestureOverlayView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void clear(boolean arg1){
  }
  protected void onDetachedFromWindow(){
  }
  public boolean dispatchTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void setOrientation(int arg1){
  }
  public int getOrientation(){
    return 0;
  }
  public java.util.ArrayList<GesturePoint> getCurrentStroke(){
    return (java.util.ArrayList) null;
  }
  public void setGestureColor(int arg1){
  }
  public void setUncertainGestureColor(int arg1){
  }
  public int getUncertainGestureColor(){
    return 0;
  }
  public int getGestureColor(){
    return 0;
  }
  public float getGestureStrokeWidth(){
    return 0.0f;
  }
  public void setGestureStrokeWidth(float arg1){
  }
  public int getGestureStrokeType(){
    return 0;
  }
  public void setGestureStrokeType(int arg1){
  }
  public float getGestureStrokeLengthThreshold(){
    return 0.0f;
  }
  public void setGestureStrokeLengthThreshold(float arg1){
  }
  public float getGestureStrokeSquarenessTreshold(){
    return 0.0f;
  }
  public void setGestureStrokeSquarenessTreshold(float arg1){
  }
  public float getGestureStrokeAngleThreshold(){
    return 0.0f;
  }
  public void setGestureStrokeAngleThreshold(float arg1){
  }
  public boolean isEventsInterceptionEnabled(){
    return false;
  }
  public void setEventsInterceptionEnabled(boolean arg1){
  }
  public boolean isFadeEnabled(){
    return false;
  }
  public void setFadeEnabled(boolean arg1){
  }
  public Gesture getGesture(){
    return (Gesture) null;
  }
  public void setGesture(Gesture arg1){
  }
  public android.graphics.Path getGesturePath(){
    return (android.graphics.Path) null;
  }
  public android.graphics.Path getGesturePath(android.graphics.Path arg1){
    return (android.graphics.Path) null;
  }
  public boolean isGestureVisible(){
    return false;
  }
  public void setGestureVisible(boolean arg1){
  }
  public long getFadeOffset(){
    return 0l;
  }
  public void setFadeOffset(long arg1){
  }
  public void addOnGestureListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureOverlayView.OnGestureListener arg1){
  }
  public void removeOnGestureListener(GestureOverlayView.OnGestureListener arg1){
  }
  public void removeAllOnGestureListeners(){
  }
  public void addOnGesturePerformedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureOverlayView.OnGesturePerformedListener arg1){
  }
  public void removeOnGesturePerformedListener(GestureOverlayView.OnGesturePerformedListener arg1){
  }
  public void removeAllOnGesturePerformedListeners(){
  }
  public void addOnGesturingListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGesture") GestureOverlayView.OnGesturingListener arg1){
  }
  public void removeOnGesturingListener(GestureOverlayView.OnGesturingListener arg1){
  }
  public void removeAllOnGesturingListeners(){
  }
  public boolean isGesturing(){
    return false;
  }
  public android.graphics.Paint getGesturePaint(){
    return (android.graphics.Paint) null;
  }
  public void cancelClearAnimation(){
  }
  public void cancelGesture(){
  }
}
