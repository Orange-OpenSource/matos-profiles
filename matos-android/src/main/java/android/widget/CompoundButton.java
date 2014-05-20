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
public abstract class CompoundButton
  extends Button  implements Checkable
{
  // Classes

  public static interface OnCheckedChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCheck")
    public void onCheckedChanged(CompoundButton arg1, boolean arg2);
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CompoundButton(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CompoundButton(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CompoundButton(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected int [] onCreateDrawableState(int arg1){
    return (int []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean performClick(){
    return false;
  }
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public void setChecked(boolean arg1){
  }
  public boolean isChecked(){
    return false;
  }
  public void toggle(){
  }
  public void setOnCheckedChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCheck") CompoundButton.OnCheckedChangeListener arg1){
  }
  public void setButtonDrawable(int arg1){
  }
  public void setButtonDrawable(android.graphics.drawable.Drawable arg1){
  }
}
