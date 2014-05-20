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


public class OverScroller
{
  // Constructors

  public OverScroller(android.content.Context arg1){
  }
  public OverScroller(android.content.Context arg1, android.view.animation.Interpolator arg2){
  }
  public OverScroller(android.content.Context arg1, android.view.animation.Interpolator arg2, boolean arg3){
  }
  public OverScroller(android.content.Context arg1, android.view.animation.Interpolator arg2, float arg3, float arg4){
  }
  public OverScroller(android.content.Context arg1, android.view.animation.Interpolator arg2, float arg3, float arg4, boolean arg5){
  }
  // Methods

  public final int getDuration(){
    return 0;
  }
  public final boolean isFinished(){
    return false;
  }
  public void abortAnimation(){
  }
  public final int getFinalY(){
    return 0;
  }
  public void setFinalY(int arg1){
  }
  public void extendDuration(int arg1){
  }
  public final int getFinalX(){
    return 0;
  }
  public void setFinalX(int arg1){
  }
  public final void forceFinished(boolean arg1){
  }
  public boolean computeScrollOffset(){
    return false;
  }
  public final int getCurrX(){
    return 0;
  }
  public final int getCurrY(){
    return 0;
  }
  public void startScroll(int arg1, int arg2, int arg3, int arg4){
  }
  public void startScroll(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean springBack(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return false;
  }
  public void fling(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public void fling(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10){
  }
  public float getCurrVelocity(){
    return 0.0f;
  }
  public final void setFriction(float arg1){
  }
  public final int getStartX(){
    return 0;
  }
  public final int getStartY(){
    return 0;
  }
  public void notifyHorizontalEdgeReached(int arg1, int arg2, int arg3){
  }
  public void notifyVerticalEdgeReached(int arg1, int arg2, int arg3){
  }
  public boolean isOverScrolled(){
    return false;
  }
  public int timePassed(){
    return 0;
  }
  public boolean isScrollingInDirection(float arg1, float arg2){
    return false;
  }
}
