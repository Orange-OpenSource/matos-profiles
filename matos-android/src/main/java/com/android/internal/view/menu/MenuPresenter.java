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
public interface MenuPresenter
{
  // Classes

  public static interface Callback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("Callback")
    public void onCloseMenu(MenuBuilder arg1, boolean arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("Callback")
    public boolean onOpenSubMenu(MenuBuilder arg1);
  }
  // Methods

  public int getId();
  @com.francetelecom.rd.stubs.annotation.CallBack("MenuPresenter")
  public void onRestoreInstanceState(android.os.Parcelable arg1);
  public android.os.Parcelable onSaveInstanceState();
  public void initForMenu(android.content.Context arg1, MenuBuilder arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("MenuPresenter")
  public boolean onSubMenuSelected(SubMenuBuilder arg1);
  public void updateMenuView(boolean arg1);
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callback") MenuPresenter.Callback arg1);
  public MenuView getMenuView(android.view.ViewGroup arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("MenuPresenter")
  public void onCloseMenu(MenuBuilder arg1, boolean arg2);
  public boolean flagActionItems();
  public boolean expandItemActionView(MenuBuilder arg1, MenuItemImpl arg2);
  public boolean collapseItemActionView(MenuBuilder arg1, MenuItemImpl arg2);
}
