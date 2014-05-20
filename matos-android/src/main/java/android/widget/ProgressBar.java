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
public class ProgressBar
  extends android.view.View{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ProgressBar(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ProgressBar(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ProgressBar(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ProgressBar(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, int arg4){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public synchronized void setProgress(int arg1){
  }
  public synchronized void setSecondaryProgress(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected synchronized void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void setVisibility(int arg1){
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  public int getResolvedLayoutDirection(android.graphics.drawable.Drawable arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVisibilityChanged(android.view.View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void postInvalidate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected synchronized void onDraw(android.graphics.Canvas arg1){
  }
  public void invalidateDrawable(android.graphics.drawable.Drawable arg1){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public void setInterpolator(android.content.Context arg1, int arg2){
  }
  public void setInterpolator(android.view.animation.Interpolator arg1){
  }
  public android.view.animation.Interpolator getInterpolator(){
    return (android.view.animation.Interpolator) null;
  }
  public synchronized int getProgress(){
    return 0;
  }
  public synchronized void setMax(int arg1){
  }
  public synchronized int getMax(){
    return 0;
  }
  public synchronized void setIndeterminate(boolean arg1){
  }
  public final synchronized void incrementProgressBy(int arg1){
  }
  public android.graphics.drawable.Drawable getProgressDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  public synchronized boolean isIndeterminate(){
    return false;
  }
  public android.graphics.drawable.Drawable getIndeterminateDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setIndeterminateDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setProgressDrawable(android.graphics.drawable.Drawable arg1){
  }
  public synchronized int getSecondaryProgress(){
    return 0;
  }
  public final synchronized void incrementSecondaryProgressBy(int arg1){
  }
}
