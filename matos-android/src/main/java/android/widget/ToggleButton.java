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
public class ToggleButton
  extends CompoundButton{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ToggleButton(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ToggleButton(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ToggleButton(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  protected void drawableStateChanged(){
  }
  public void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFinishInflate(){
  }
  public void setChecked(boolean arg1){
  }
  public void setTextOn(@com.francetelecom.rd.stubs.annotation.FieldSet("mTextOn") java.lang.CharSequence arg1){
  }
  public void setTextOff(@com.francetelecom.rd.stubs.annotation.FieldSet("mTextOff") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTextOn") 
  public java.lang.CharSequence getTextOn(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTextOff") 
  public java.lang.CharSequence getTextOff(){
    return (java.lang.CharSequence) null;
  }
}
