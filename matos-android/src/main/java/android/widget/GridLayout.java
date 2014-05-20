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
public class GridLayout
  extends android.view.ViewGroup{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Fields

    public GridLayout.Spec rowSpec;

    public GridLayout.Spec columnSpec;

    // Constructors

    private LayoutParams(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, GridLayout.Spec arg7, GridLayout.Spec arg8){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(GridLayout.Spec arg1, GridLayout.Spec arg2){
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
    public LayoutParams(GridLayout.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public void setGravity(int arg1){
    }
    protected void setBaseAttributes(android.content.res.TypedArray arg1, int arg2, int arg3){
    }
  }
  public static class Spec
  {
    // Constructors

    private Spec(boolean arg1, int arg2, int arg3, GridLayout.Alignment arg4){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
  }
  public abstract static class Alignment
  {
    // Constructors

    Alignment(){
    }
  }
  // Fields

  public static final int HORIZONTAL = 0;

  public static final int VERTICAL = 1;

  public static final int UNDEFINED = -2147483648;

  public static final int ALIGN_BOUNDS = 0;

  public static final int ALIGN_MARGINS = 1;

  public static final GridLayout.Alignment TOP = null;

  public static final GridLayout.Alignment BOTTOM = null;

  public static final GridLayout.Alignment RIGHT = null;

  public static final GridLayout.Alignment LEFT = null;

  public static final GridLayout.Alignment CENTER = null;

  public static final GridLayout.Alignment BASELINE = null;

  public static final GridLayout.Alignment FILL = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public GridLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public GridLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public GridLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  protected GridLayout.LayoutParams generateDefaultLayoutParams(){
    return (GridLayout.LayoutParams) null;
  }
  public GridLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (GridLayout.LayoutParams) null;
  }
  protected GridLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (GridLayout.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onChildVisibilityChanged(android.view.View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onViewAdded(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onViewRemoved(android.view.View arg1){
  }
  public void requestLayout(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public void setOrientation(int arg1){
  }
  public int getOrientation(){
    return 0;
  }
  public int getColumnCount(){
    return 0;
  }
  public static GridLayout.Spec spec(int arg1, int arg2, GridLayout.Alignment arg3){
    return (GridLayout.Spec) null;
  }
  public static GridLayout.Spec spec(int arg1, GridLayout.Alignment arg2){
    return (GridLayout.Spec) null;
  }
  public static GridLayout.Spec spec(int arg1, int arg2){
    return (GridLayout.Spec) null;
  }
  public static GridLayout.Spec spec(int arg1){
    return (GridLayout.Spec) null;
  }
  public int getRowCount(){
    return 0;
  }
  public void setRowCount(int arg1){
  }
  public void setColumnCount(int arg1){
  }
  public boolean getUseDefaultMargins(){
    return false;
  }
  public void setUseDefaultMargins(boolean arg1){
  }
  public int getAlignmentMode(){
    return 0;
  }
  public void setAlignmentMode(int arg1){
  }
  public boolean isRowOrderPreserved(){
    return false;
  }
  public void setRowOrderPreserved(boolean arg1){
  }
  public boolean isColumnOrderPreserved(){
    return false;
  }
  public void setColumnOrderPreserved(boolean arg1){
  }
}
