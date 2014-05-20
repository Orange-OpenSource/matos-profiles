package android.app;

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
public abstract class ActionBar
{
  // Classes

  public static interface OnNavigationListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onNavigationListener")
    public boolean onNavigationItemSelected(int arg1, long arg2);
  }
  public static interface OnMenuVisibilityListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onMenuVisibilityChanged")
    public void onMenuVisibilityChanged(boolean arg1);
  }
  public abstract static class Tab
  {
    // Fields

    public static final int INVALID_POSITION = -1;

    // Constructors

    public Tab(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.FieldGet("text")
    public abstract java.lang.CharSequence getText();
    @com.francetelecom.rd.stubs.annotation.FieldGet("tag")
    public abstract java.lang.Object getTag();
    public abstract int getPosition();
    public abstract ActionBar.Tab setCustomView(android.view.View arg1);
    public abstract ActionBar.Tab setCustomView(int arg1);
    @com.francetelecom.rd.stubs.annotation.FieldSet("tag")
    public abstract ActionBar.Tab setTag(java.lang.Object arg1);
    public abstract ActionBar.Tab setContentDescription(int arg1);
    @com.francetelecom.rd.stubs.annotation.FieldSet("contentDescription")
    public abstract ActionBar.Tab setContentDescription(java.lang.CharSequence arg1);
    @com.francetelecom.rd.stubs.annotation.FieldGet("contentDescription")
    public abstract java.lang.CharSequence getContentDescription();
    public abstract ActionBar.Tab setText(java.lang.CharSequence arg1);
    @com.francetelecom.rd.stubs.annotation.FieldSet("text")
    public abstract ActionBar.Tab setText(int arg1);
    public abstract ActionBar.Tab setIcon(android.graphics.drawable.Drawable arg1);
    public abstract ActionBar.Tab setIcon(int arg1);
    public abstract android.graphics.drawable.Drawable getIcon();
    public abstract android.view.View getCustomView();
    public abstract void select();
    public abstract ActionBar.Tab setTabListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onTabSel") ActionBar.TabListener arg1);
  }
  public static interface TabListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("onTabSel")
    public void onTabSelected(ActionBar.Tab arg1, FragmentTransaction arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("onTabSel")
    public void onTabUnselected(ActionBar.Tab arg1, FragmentTransaction arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("onTabSel")
    public void onTabReselected(ActionBar.Tab arg1, FragmentTransaction arg2);
  }
  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Fields

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {@android.view.ViewDebug.IntToString(from = -1, to = "NONE"), @android.view.ViewDebug.IntToString(from = 0, to = "NONE"), @android.view.ViewDebug.IntToString(from = 48, to = "TOP"), @android.view.ViewDebug.IntToString(from = 80, to = "BOTTOM"), @android.view.ViewDebug.IntToString(from = 3, to = "LEFT"), @android.view.ViewDebug.IntToString(from = 5, to = "RIGHT"), @android.view.ViewDebug.IntToString(from = 16, to = "CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from = 112, to = "FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from = 1, to = "CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from = 7, to = "FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from = 17, to = "CENTER"), @android.view.ViewDebug.IntToString(from = 119, to = "FILL")}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public int gravity;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, int arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(ActionBar.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Fields

  public static final int NAVIGATION_MODE_STANDARD = 0;

  public static final int NAVIGATION_MODE_LIST = 1;

  public static final int NAVIGATION_MODE_TABS = 2;

  public static final int DISPLAY_USE_LOGO = 1;

  public static final int DISPLAY_SHOW_HOME = 2;

  public static final int DISPLAY_HOME_AS_UP = 4;

  public static final int DISPLAY_SHOW_TITLE = 8;

  public static final int DISPLAY_SHOW_CUSTOM = 16;

  // Constructors

  public ActionBar(){
  }
  // Methods

  public abstract void setTitle(java.lang.CharSequence arg1);
  public abstract void setTitle(int arg1);
  public abstract java.lang.CharSequence getTitle();
  public abstract void show();
  public abstract void hide();
  public abstract void setCustomView(android.view.View arg1);
  public abstract void setCustomView(android.view.View arg1, ActionBar.LayoutParams arg2);
  public abstract void setCustomView(int arg1);
  public abstract void setSubtitle(java.lang.CharSequence arg1);
  public abstract void setSubtitle(int arg1);
  public abstract java.lang.CharSequence getSubtitle();
  public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable arg1);
  public abstract int getHeight();
  public abstract void setIcon(int arg1);
  public abstract void setIcon(android.graphics.drawable.Drawable arg1);
  public abstract android.view.View getCustomView();
  public abstract boolean isShowing();
  public android.content.Context getThemedContext(){
    return (android.content.Context) null;
  }
  public abstract void addOnMenuVisibilityListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMenuVisibilityChanged") ActionBar.OnMenuVisibilityListener arg1);
  public abstract void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener arg1);
  public abstract void setDisplayUseLogoEnabled(boolean arg1);
  public abstract void setDisplayShowHomeEnabled(boolean arg1);
  public abstract void setDisplayHomeAsUpEnabled(boolean arg1);
  public abstract void setDisplayShowTitleEnabled(boolean arg1);
  public abstract void setDisplayShowCustomEnabled(boolean arg1);
  public void setHomeButtonEnabled(boolean arg1){
  }
  public abstract void setSelectedNavigationItem(int arg1);
  public abstract void removeAllTabs();
  public abstract void setDisplayOptions(int arg1);
  public abstract void setDisplayOptions(int arg1, int arg2);
  public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public abstract int getNavigationMode();
  public abstract int getDisplayOptions();
  public abstract void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("tab") ActionBar.Tab arg1);
  public abstract void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("tab") ActionBar.Tab arg1, boolean arg2);
  public abstract void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("tab") ActionBar.Tab arg1, int arg2);
  public abstract void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("tab") ActionBar.Tab arg1, int arg2, boolean arg3);
  public abstract ActionBar.Tab newTab();
  public abstract void removeTab(ActionBar.Tab arg1);
  public abstract void removeTabAt(int arg1);
  public abstract void selectTab(ActionBar.Tab arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("tab")
  public abstract ActionBar.Tab getSelectedTab();
  public abstract void setListNavigationCallbacks(android.widget.SpinnerAdapter arg1, @com.francetelecom.rd.stubs.annotation.CallBack("onNavigationListener") ActionBar.OnNavigationListener arg2);
  public abstract int getSelectedNavigationIndex();
  public abstract int getNavigationItemCount();
  public abstract int getTabCount();
  public abstract void setNavigationMode(int arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("tab")
  public abstract ActionBar.Tab getTabAt(int arg1);
  public abstract void setLogo(int arg1);
  public abstract void setLogo(android.graphics.drawable.Drawable arg1);
}
