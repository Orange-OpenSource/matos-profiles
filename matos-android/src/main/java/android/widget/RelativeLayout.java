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
public class RelativeLayout
  extends android.view.ViewGroup{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Fields

    public boolean alignWithParent;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.MarginLayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public int [] getRules(){
      return (int []) null;
    }
    public void addRule(int arg1){
    }
    public void addRule(int arg1, int arg2){
    }
  }
  // Fields

  public static final int TRUE = -1;

  public static final int LEFT_OF = 0;

  public static final int RIGHT_OF = 1;

  public static final int ABOVE = 2;

  public static final int BELOW = 3;

  public static final int ALIGN_BASELINE = 4;

  public static final int ALIGN_LEFT = 5;

  public static final int ALIGN_TOP = 6;

  public static final int ALIGN_RIGHT = 7;

  public static final int ALIGN_BOTTOM = 8;

  public static final int ALIGN_PARENT_LEFT = 9;

  public static final int ALIGN_PARENT_TOP = 10;

  public static final int ALIGN_PARENT_RIGHT = 11;

  public static final int ALIGN_PARENT_BOTTOM = 12;

  public static final int CENTER_IN_PARENT = 13;

  public static final int CENTER_HORIZONTAL = 14;

  public static final int CENTER_VERTICAL = 15;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RelativeLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RelativeLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RelativeLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public RelativeLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (RelativeLayout.LayoutParams) null;
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
  public void requestLayout(){
  }
  public int getBaseline(){
    return 0;
  }
  public void setIgnoreGravity(int arg1){
  }
  public void setGravity(int arg1){
  }
  public void setHorizontalGravity(int arg1){
  }
  public void setVerticalGravity(int arg1){
  }
}
