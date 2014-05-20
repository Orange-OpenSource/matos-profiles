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
public class LayoutAnimationController
{
  // Classes

  public static class AnimationParameters
  {
    // Fields

    public int count;

    public int index;

    // Constructors

    public AnimationParameters(){
    }
  }
  // Fields

  public static final int ORDER_NORMAL = 0;

  public static final int ORDER_REVERSE = 1;

  public static final int ORDER_RANDOM = 2;

  protected Animation mAnimation;

  protected java.util.Random mRandomizer;

  protected Interpolator mInterpolator;

  // Constructors

  public LayoutAnimationController(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  public LayoutAnimationController(Animation arg1){
  }
  public LayoutAnimationController(Animation arg1, float arg2){
  }
  // Methods

  public void start(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("animation")
  public Animation getAnimation(){
    return (Animation) null;
  }
  public void setAnimation(android.content.Context arg1, int arg2){
  }
  public void setAnimation(@com.francetelecom.rd.stubs.annotation.FieldSet("animation") Animation arg1){
  }
  public int getOrder(){
    return 0;
  }
  public void setInterpolator(android.content.Context arg1, int arg2){
  }
  public void setInterpolator(Interpolator arg1){
  }
  public boolean willOverlap(){
    return false;
  }
  public boolean isDone(){
    return false;
  }
  public final Animation getAnimationForView(android.view.View arg1){
    return (Animation) null;
  }
  public void setOrder(int arg1){
  }
  public Interpolator getInterpolator(){
    return (Interpolator) null;
  }
  public float getDelay(){
    return 0.0f;
  }
  public void setDelay(float arg1){
  }
  protected long getDelayForView(android.view.View arg1){
    return 0l;
  }
  protected int getTransformedIndex(LayoutAnimationController.AnimationParameters arg1){
    return 0;
  }
}
