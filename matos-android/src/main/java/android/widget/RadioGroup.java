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


public class RadioGroup
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
  public static interface OnCheckedChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCheckedChange")
    public void onCheckedChanged(RadioGroup arg1, int arg2);
  }
  // Constructors

  public RadioGroup(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public RadioGroup(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void check(int arg1){
  }
  protected LinearLayout.LayoutParams generateDefaultLayoutParams(){
    return (LinearLayout.LayoutParams) null;
  }
  public RadioGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (RadioGroup.LayoutParams) null;
  }
  public void addView(android.view.View arg1, int arg2, android.view.ViewGroup.LayoutParams arg3){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public void setOnHierarchyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChildViewChange") android.view.ViewGroup.OnHierarchyChangeListener arg1){
  }
  protected void onFinishInflate(){
  }
  public void setOnCheckedChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.RadioGroup.OnCheckedChangeListener.onCheckedChange") RadioGroup.OnCheckedChangeListener arg1){
  }
  public int getCheckedRadioButtonId(){
    return 0;
  }
  public void clearCheck(){
  }
}
