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
public class FrameLayout
  extends android.view.ViewGroup{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Fields

    public int gravity;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, int arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.MarginLayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Fields

  protected boolean mForegroundInPadding;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public FrameLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public FrameLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public FrameLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected FrameLayout.LayoutParams generateDefaultLayoutParams(){
    return (FrameLayout.LayoutParams) null;
  }
  public FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (FrameLayout.LayoutParams) null;
  }
  protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public boolean gatherTransparentRegion(android.graphics.Region arg1){
    return false;
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public void setForegroundGravity(int arg1){
  }
  public void setForeground(android.graphics.drawable.Drawable arg1){
  }
  public android.graphics.drawable.Drawable getForeground(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setMeasureAllChildren(boolean arg1){
  }
  public boolean getConsiderGoneChildrenWhenMeasuring(){
    return false;
  }
  public boolean getMeasureAllChildren(){
    return false;
  }
}
