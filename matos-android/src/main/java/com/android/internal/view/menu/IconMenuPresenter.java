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
public class IconMenuPresenter
  extends BaseMenuPresenter{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public IconMenuPresenter(android.content.Context arg1){
    super((android.content.Context) null, 0, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  public void restoreHierarchyState(android.os.Bundle arg1){
  }
  public void saveHierarchyState(android.os.Bundle arg1){
  }
  public int getNumActualItemsShown(){
    return 0;
  }
  public void initForMenu(android.content.Context arg1, MenuBuilder arg2){
  }
  public void bindItemView(MenuItemImpl arg1, MenuView.ItemView arg2){
  }
  public boolean shouldIncludeItem(int arg1, MenuItemImpl arg2){
    return false;
  }
  protected void addItemView(android.view.View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSubMenuSelected(SubMenuBuilder arg1){
    return false;
  }
  public void updateMenuView(boolean arg1){
  }
  protected boolean filterLeftoverView(android.view.ViewGroup arg1, int arg2){
    return false;
  }
}
