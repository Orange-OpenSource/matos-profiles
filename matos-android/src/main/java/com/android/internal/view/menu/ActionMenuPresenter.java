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


public class ActionMenuPresenter
  extends BaseMenuPresenter  implements android.view.ActionProvider.SubUiVisibilityListener
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionMenuPresenter(android.content.Context arg1){
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public boolean showOverflowMenu(){
    return false;
  }
  public boolean hideOverflowMenu(){
    return false;
  }
  public boolean isOverflowMenuShowing(){
    return false;
  }
  public boolean isOverflowReserved(){
    return false;
  }
  public boolean dismissPopupMenus(){
    return false;
  }
  public void initForMenu(android.content.Context arg1, MenuBuilder arg2){
  }
  public void bindItemView(MenuItemImpl arg1, MenuView.ItemView arg2){
  }
  public boolean shouldIncludeItem(int arg1, MenuItemImpl arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSubMenuSelected(SubMenuBuilder arg1){
    return false;
  }
  public void updateMenuView(boolean arg1){
  }
  public boolean filterLeftoverView(android.view.ViewGroup arg1, int arg2){
    return false;
  }
  public MenuView getMenuView(android.view.ViewGroup arg1){
    return (MenuView) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(MenuBuilder arg1, boolean arg2){
  }
  public android.view.View getItemView(MenuItemImpl arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public boolean flagActionItems(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSubUiVisibilityChanged(boolean arg1){
  }
  public boolean hideSubMenus(){
    return false;
  }
  public void setWidthLimit(int arg1, boolean arg2){
  }
  public void setItemLimit(int arg1){
  }
  public void setReserveOverflow(boolean arg1){
  }
  public void setExpandedActionViewsExclusive(boolean arg1){
  }
}
