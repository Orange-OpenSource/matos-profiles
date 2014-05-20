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
public class ListMenuPresenter
  implements MenuPresenter, android.widget.AdapterView.OnItemClickListener
{
  // Fields

  public static final java.lang.String VIEWS_TAG = "android:menu:list";

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListMenuPresenter(android.content.Context arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListMenuPresenter(int arg1, int arg2){
  }
  // Methods

  public int getId(){
    return 0;
  }
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
  public void setId(int arg1){
  }
  public android.widget.ListAdapter getAdapter(){
    return (android.widget.ListAdapter) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onItemClick(android.widget.AdapterView<?> arg1, android.view.View arg2, int arg3, long arg4){
  }
  public void initForMenu(android.content.Context arg1, MenuBuilder arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSubMenuSelected(SubMenuBuilder arg1){
    return false;
  }
  public void updateMenuView(boolean arg1){
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callback") MenuPresenter.Callback arg1){
  }
  public MenuView getMenuView(android.view.ViewGroup arg1){
    return (MenuView) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(MenuBuilder arg1, boolean arg2){
  }
  public boolean flagActionItems(){
    return false;
  }
  public boolean expandItemActionView(MenuBuilder arg1, MenuItemImpl arg2){
    return false;
  }
  public boolean collapseItemActionView(MenuBuilder arg1, MenuItemImpl arg2){
    return false;
  }
  public void setItemIndexOffset(int arg1){
  }
}
