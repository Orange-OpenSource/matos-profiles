package com.android.internal.view.menu;

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
public class ListMenuItemView
  extends android.widget.LinearLayout  implements MenuView.ItemView
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListMenuItemView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListMenuItemView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void initialize(@com.francetelecom.rd.stubs.annotation.FieldSet("mItemData") MenuItemImpl arg1, int arg2){
  }
  public void setTitle(java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFinishInflate(){
  }
  public void setChecked(boolean arg1){
  }
  public void setIcon(android.graphics.drawable.Drawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mItemData") 
  public MenuItemImpl getItemData(){
    return (MenuItemImpl) null;
  }
  public void setCheckable(boolean arg1){
  }
  public void setShortcut(boolean arg1, char arg2){
  }
  public boolean prefersCondensedTitle(){
    return false;
  }
  public boolean showsIcon(){
    return false;
  }
  public void setForceShowIcon(boolean arg1){
  }
}
