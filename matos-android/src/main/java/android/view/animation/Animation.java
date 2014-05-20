package android.view.animation;

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
public abstract class Animation
  implements java.lang.Cloneable
{
  // Classes

  protected static class Description
  {
    // Fields

    public int type;

    public float value;

    // Constructors

    protected Description(){
    }
  }
  public static interface AnimationListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onAnimationChange")
    public void onAnimationStart(Animation arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onAnimationChange")
    public void onAnimationEnd(Animation arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onAnimationChange")
    public void onAnimationRepeat(Animation arg1);
  }
  // Fields

  public static final int INFINITE = -1;

  public static final int RESTART = 1;

  public static final int REVERSE = 2;

  public static final int START_ON_FIRST_FRAME = -1;

  public static final int ABSOLUTE = 0;

  public static final int RELATIVE_TO_SELF = 1;

  public static final int RELATIVE_TO_PARENT = 2;

  public static final int ZORDER_NORMAL = 0;

  public static final int ZORDER_TOP = 1;

  public static final int ZORDER_BOTTOM = -1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateAnimation")
  public Animation(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateAnimation")
  public Animation(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  protected Animation clone() throws java.lang.CloneNotSupportedException{
    return (Animation) null;
  }
  public void start(){
  }
  public void reset(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateAnimation")
  public void initialize(int arg1, int arg2, int arg3, int arg4){
  }
  public void detach(){
  }
  public void cancel(){
  }
  public long getStartTime(){
    return 0l;
  }
  public long getDuration(){
    return 0l;
  }
  public void setBackgroundColor(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateAnimation")
  protected float resolveSize(int arg1, float arg2, int arg3, int arg4){
    return 0.0f;
  }
  public void setInterpolator(android.content.Context arg1, int arg2){
  }
  public void setInterpolator(Interpolator arg1){
  }
  public Interpolator getInterpolator(){
    return (Interpolator) null;
  }
  public boolean isInitialized(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateAnimation")
  protected void applyTransformation(float arg1, Transformation arg2){
  }
  public int getRepeatCount(){
    return 0;
  }
  public void setDuration(long arg1){
  }
  public void initializeInvalidateRegion(int arg1, int arg2, int arg3, int arg4){
  }
  public boolean getTransformation(long arg1, Transformation arg2){
    return false;
  }
  public boolean getTransformation(long arg1, Transformation arg2, float arg3){
    return false;
  }
  public boolean willChangeTransformationMatrix(){
    return false;
  }
  public boolean willChangeBounds(){
    return false;
  }
  public void getInvalidateRegion(int arg1, int arg2, int arg3, int arg4, android.graphics.RectF arg5, Transformation arg6){
  }
  public boolean getFillAfter(){
    return false;
  }
  public boolean hasAlpha(){
    return false;
  }
  public void setStartTime(long arg1){
  }
  public void setFillBefore(boolean arg1){
  }
  public long getStartOffset(){
    return 0l;
  }
  public void setStartOffset(long arg1){
  }
  public void restrictDuration(long arg1){
  }
  public void scaleCurrentDuration(float arg1){
  }
  public void startNow(){
  }
  public void setRepeatMode(int arg1){
  }
  public void setRepeatCount(int arg1){
  }
  public boolean isFillEnabled(){
    return false;
  }
  public void setFillEnabled(boolean arg1){
  }
  public void setFillAfter(boolean arg1){
  }
  public void setZAdjustment(int arg1){
  }
  protected float getScaleFactor(){
    return 0.0f;
  }
  public void setDetachWallpaper(boolean arg1){
  }
  public int getRepeatMode(){
    return 0;
  }
  public boolean getFillBefore(){
    return false;
  }
  public int getZAdjustment(){
    return 0;
  }
  public int getBackgroundColor(){
    return 0;
  }
  public boolean getDetachWallpaper(){
    return false;
  }
  public void setAnimationListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAnimationChange") Animation.AnimationListener arg1){
  }
  protected void ensureInterpolator(){
  }
  public long computeDurationHint(){
    return 0l;
  }
  public boolean hasStarted(){
    return false;
  }
  public boolean hasEnded(){
    return false;
  }
}
