package android.graphics.drawable;

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


public class DrawableContainer
  extends Drawable  implements Drawable.Callback
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DrawableContainerStateImplem", superClass = "")
  public abstract static class DrawableContainerState
    extends Drawable.ConstantState  {
    // Constructors

    DrawableContainerState(DrawableContainer.DrawableContainerState arg1, DrawableContainer arg2, android.content.res.Resources arg3){
      super();
    }
    // Methods

    public int getChangingConfigurations(){
      return 0;
    }
    public final int getChildCount(){
      return 0;
    }
    public final int getOpacity(){
      return 0;
    }
    public final boolean isStateful(){
      return false;
    }
    public final void setEnterFadeDuration(int arg1){
    }
    public final void setExitFadeDuration(int arg1){
    }
    public final int addChild(Drawable arg1){
      return 0;
    }
    public final Drawable [] getChildren(){
      return (Drawable []) null;
    }
    public void growArray(int arg1, int arg2){
    }
    public final void setVariablePadding(boolean arg1){
    }
    public final android.graphics.Rect getConstantPadding(){
      return (android.graphics.Rect) null;
    }
    public final void setConstantSize(boolean arg1){
    }
    public final boolean isConstantSize(){
      return false;
    }
    public final int getConstantWidth(){
      return 0;
    }
    public final int getConstantHeight(){
      return 0;
    }
    public final int getConstantMinimumWidth(){
      return 0;
    }
    public final int getConstantMinimumHeight(){
      return 0;
    }
    protected void computeConstantSize(){
    }
    public final int getEnterFadeDuration(){
      return 0;
    }
    public final int getExitFadeDuration(){
      return 0;
    }
    public synchronized boolean canConstantState(){
      return false;
    }
  }
  // Constructors

  public DrawableContainer(){
    super();
  }
  // Methods

  public int getChangingConfigurations(){
    return 0;
  }
  public boolean setVisible(boolean arg1, boolean arg2){
    return false;
  }
  public void setAlpha(int arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void invalidateDrawable(Drawable arg1){
  }
  public void scheduleDrawable(Drawable arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg2, long arg3){
  }
  public void unscheduleDrawable(Drawable arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg2){
  }
  public int getOpacity(){
    return 0;
  }
  public Drawable.ConstantState getConstantState(){
    return (Drawable.ConstantState) null;
  }
  public int getIntrinsicWidth(){
    return 0;
  }
  public int getIntrinsicHeight(){
    return 0;
  }
  public void setDither(boolean arg1){
  }
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public boolean isStateful(){
    return false;
  }
  public boolean getPadding(android.graphics.Rect arg1){
    return false;
  }
  public int getMinimumWidth(){
    return 0;
  }
  public int getMinimumHeight(){
    return 0;
  }
  public void jumpToCurrentState(){
  }
  public Drawable getCurrent(){
    return (Drawable) null;
  }
  protected boolean onStateChange(int [] arg1){
    return false;
  }
  protected boolean onLevelChange(int arg1){
    return false;
  }
  public void setEnterFadeDuration(int arg1){
  }
  public void setExitFadeDuration(int arg1){
  }
  public boolean selectDrawable(int arg1){
    return false;
  }
  protected void setConstantState(DrawableContainer.DrawableContainerState arg1){
  }
}
