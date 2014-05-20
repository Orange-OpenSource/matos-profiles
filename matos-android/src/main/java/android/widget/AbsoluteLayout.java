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
public class AbsoluteLayout
  extends android.view.ViewGroup{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.LayoutParams  {
    // Fields

    public int x;

    public int y;

    // Constructors

    public LayoutParams(int arg1, int arg2, int arg3, int arg4){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsoluteLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsoluteLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsoluteLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.view.ViewGroup.LayoutParams) null;
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
}
