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
public abstract class BaseMenuPresenter
  implements MenuPresenter
{
  // Fields

  protected android.content.Context mSystemContext;

  protected android.content.Context mContext;

  protected MenuBuilder mMenu;

  protected android.view.LayoutInflater mSystemInflater;

  protected android.view.LayoutInflater mInflater;

  protected MenuView mMenuView;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BaseMenuPresenter(android.content.Context arg1, int arg2, int arg3){
  }
  // Methods

  public int getId(){
    return 0;
  }
  public void setId(int arg1){
  }
  public void initForMenu(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mMenu") MenuBuilder arg2){
  }
  public abstract void bindItemView(MenuItemImpl arg1, MenuView.ItemView arg2);
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
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callback") MenuPresenter.Callback arg1){
  }
  public MenuView getMenuView(android.view.ViewGroup arg1){
    return (MenuView) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(MenuBuilder arg1, boolean arg2){
  }
  public MenuView.ItemView createItemView(android.view.ViewGroup arg1){
    return (MenuView.ItemView) null;
  }
  public android.view.View getItemView(MenuItemImpl arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
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
}
