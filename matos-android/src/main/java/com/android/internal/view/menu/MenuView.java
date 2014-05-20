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
public interface MenuView
{
  // Classes

  public static interface ItemView
  {
    // Methods

    public void initialize(MenuItemImpl arg1, int arg2);
    public void setTitle(java.lang.CharSequence arg1);
    public void setEnabled(boolean arg1);
    public void setChecked(boolean arg1);
    public void setIcon(android.graphics.drawable.Drawable arg1);
    public MenuItemImpl getItemData();
    public void setCheckable(boolean arg1);
    public void setShortcut(boolean arg1, char arg2);
    public boolean prefersCondensedTitle();
    public boolean showsIcon();
  }
  // Methods

  public void initialize(MenuBuilder arg1);
  public int getWindowAnimations();
}
