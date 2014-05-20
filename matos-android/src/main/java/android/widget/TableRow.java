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
public class TableRow
  extends LinearLayout{
  // Classes

  public static class LayoutParams
    extends LinearLayout.LayoutParams  {
    // Fields

    public int column;

    public int span;

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
    public LayoutParams(int arg1){
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

  public TableRow(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public TableRow(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  protected LinearLayout.LayoutParams generateDefaultLayoutParams(){
    return (LinearLayout.LayoutParams) null;
  }
  public TableRow.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (TableRow.LayoutParams) null;
  }
  protected LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (LinearLayout.LayoutParams) null;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public void setOnHierarchyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChildViewChange") android.view.ViewGroup.OnHierarchyChangeListener arg1){
  }
  public android.view.View getVirtualChildAt(int arg1){
    return (android.view.View) null;
  }
  public int getVirtualChildCount(){
    return 0;
  }
}
