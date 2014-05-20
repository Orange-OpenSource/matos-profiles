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
public class TableLayout
  extends LinearLayout{
  // Classes

  public static class LayoutParams
    extends LinearLayout.LayoutParams  {
    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, float arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.MarginLayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    protected void setBaseAttributes(android.content.res.TypedArray arg1, int arg2, int arg3){
    }
  }
  // Constructors

  public TableLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public TableLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  protected LinearLayout.LayoutParams generateDefaultLayoutParams(){
    return (LinearLayout.LayoutParams) null;
  }
  public TableLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (TableLayout.LayoutParams) null;
  }
  protected LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (LinearLayout.LayoutParams) null;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void addView(android.view.View arg1){
  }
  public void addView(android.view.View arg1, int arg2){
  }
  public void addView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  public void addView(android.view.View arg1, int arg2, android.view.ViewGroup.LayoutParams arg3){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public void setOnHierarchyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChildViewChange") android.view.ViewGroup.OnHierarchyChangeListener arg1){
  }
  public void requestLayout(){
  }
  public void setColumnCollapsed(int arg1, boolean arg2){
  }
  public boolean isShrinkAllColumns(){
    return false;
  }
  public void setShrinkAllColumns(boolean arg1){
  }
  public boolean isStretchAllColumns(){
    return false;
  }
  public void setStretchAllColumns(boolean arg1){
  }
  public boolean isColumnCollapsed(int arg1){
    return false;
  }
  public void setColumnStretchable(int arg1, boolean arg2){
  }
  public boolean isColumnStretchable(int arg1){
    return false;
  }
  public void setColumnShrinkable(int arg1, boolean arg2){
  }
  public boolean isColumnShrinkable(int arg1){
    return false;
  }
}
