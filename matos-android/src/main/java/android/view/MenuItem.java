package android.view;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.MenuItemImplem", superClass = "")
public interface MenuItem
{
  // Classes

  public static interface OnMenuItemClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onMenuItemClick")
    public boolean onMenuItemClick(MenuItem arg1);
  }
  public static interface OnActionExpandListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnActionExpandListener")
    public boolean onMenuItemActionExpand(MenuItem arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("OnActionExpandListener")
    public boolean onMenuItemActionCollapse(MenuItem arg1);
  }
  // Fields

  public static final int SHOW_AS_ACTION_NEVER = 0;

  public static final int SHOW_AS_ACTION_IF_ROOM = 1;

  public static final int SHOW_AS_ACTION_ALWAYS = 2;

  public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

  public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

  // Methods

  public boolean isVisible();
  public MenuItem setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1);
  public MenuItem setTitle(int arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIntent")
  public android.content.Intent getIntent();
  public MenuItem setIntent(@com.francetelecom.rd.stubs.annotation.FieldSet("mIntent") android.content.Intent arg1);
  public MenuItem setVisible(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
  public java.lang.CharSequence getTitle();
  public int getItemId();
  public boolean isEnabled();
  public MenuItem setEnabled(boolean arg1);
  public int getOrder();
  public MenuItem setChecked(boolean arg1);
  public boolean isChecked();
  public MenuItem setIcon(@com.francetelecom.rd.stubs.annotation.FieldSet("mIcon") android.graphics.drawable.Drawable arg1);
  public MenuItem setIcon(int arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIcon")
  public android.graphics.drawable.Drawable getIcon();
  public int getGroupId();
  public MenuItem setCheckable(boolean arg1);
  public MenuItem setShortcut(char arg1, char arg2);
  public java.lang.CharSequence getTitleCondensed();
  public MenuItem setOnMenuItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMenuItemClick") MenuItem.OnMenuItemClickListener arg1);
  public SubMenu getSubMenu();
  public char getAlphabeticShortcut();
  public MenuItem setAlphabeticShortcut(char arg1);
  public char getNumericShortcut();
  public MenuItem setNumericShortcut(char arg1);
  public boolean hasSubMenu();
  public MenuItem setTitleCondensed(java.lang.CharSequence arg1);
  public boolean isCheckable();
  public ContextMenu.ContextMenuInfo getMenuInfo();
  public void setShowAsAction(int arg1);
  public MenuItem setActionView(@com.francetelecom.rd.stubs.annotation.FieldSet("mActionView") View arg1);
  public MenuItem setActionView(int arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mActionView")
  public View getActionView();
  @com.francetelecom.rd.stubs.annotation.FieldGet("mActionProvider")
  public ActionProvider getActionProvider();
  public MenuItem setActionProvider(@com.francetelecom.rd.stubs.annotation.FieldSet("mActionProvider") ActionProvider arg1);
  public MenuItem setShowAsActionFlags(int arg1);
  public boolean expandActionView();
  public boolean collapseActionView();
  public MenuItem setOnActionExpandListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnActionExpandListener") MenuItem.OnActionExpandListener arg1);
  public boolean isActionViewExpanded();
}
