package com.android.internal.app;

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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ActionBarImpl
  extends android.app.ActionBar{
  // Classes

  public class ActionModeImpl
    extends android.view.ActionMode    implements com.android.internal.view.menu.MenuBuilder.Callback
  {
    // Fields

    // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateActionMode")
    public ActionModeImpl(android.view.ActionMode.Callback arg1){
      super();
    }
    // Methods

    public void finish(){
    }
    public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
    }
    public void setTitle(int arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionMode")
    public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder arg1, android.view.MenuItem arg2){
      return false;
    }
    public android.view.MenuInflater getMenuInflater(){
      return (android.view.MenuInflater) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
    public java.lang.CharSequence getTitle(){
      return (java.lang.CharSequence) null;
    }
    public void setCustomView(@com.francetelecom.rd.stubs.annotation.FieldSet("mCustomView") android.view.View arg1){
    }
    public void setSubtitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1){
    }
    public void setSubtitle(int arg1){
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle")
    public java.lang.CharSequence getSubtitle(){
      return (java.lang.CharSequence) null;
    }
    public void invalidate(){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionMode")
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder arg1){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionMode")
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder arg1, boolean arg2){
    }
    
    public android.view.Menu getMenu(){
      return (android.view.Menu) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCustomView")
    public android.view.View getCustomView(){
      return (android.view.View) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionMode")
    public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionMode")
    public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder arg1){
    }
    public boolean dispatchOnCreate(){
      return false;
    }
  }
  public class TabImpl
    extends android.app.ActionBar.Tab  {
    // Fields

    // Constructors

    public TabImpl(){
      super();
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.FieldGet("mText")
    public java.lang.CharSequence getText(){
      return (java.lang.CharSequence) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mTag")
    public java.lang.Object getTag(){
      return (java.lang.Object) null;
    }
    public int getPosition(){
      return 0;
    }
    public android.app.ActionBar.Tab setCustomView(@com.francetelecom.rd.stubs.annotation.FieldSet("mCustomView") android.view.View arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setCustomView(int arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setTag(@com.francetelecom.rd.stubs.annotation.FieldSet("mTag") java.lang.Object arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setContentDescription(int arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setContentDescription(@com.francetelecom.rd.stubs.annotation.FieldSet("mContentDescription") java.lang.CharSequence arg1){
      return (android.app.ActionBar.Tab) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mContentDescription")
    public java.lang.CharSequence getContentDescription(){
      return (java.lang.CharSequence) null;
    }
    public android.app.ActionBar.Tab setText(@com.francetelecom.rd.stubs.annotation.FieldSet("mText") java.lang.CharSequence arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setText(int arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setIcon(@com.francetelecom.rd.stubs.annotation.FieldSet("mIcon") android.graphics.drawable.Drawable arg1){
      return (android.app.ActionBar.Tab) null;
    }
    public android.app.ActionBar.Tab setIcon(int arg1){
      return (android.app.ActionBar.Tab) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mIcon")
    public android.graphics.drawable.Drawable getIcon(){
      return (android.graphics.drawable.Drawable) null;
    }
    @FieldGet("tabListener")
    public android.app.ActionBar.TabListener getCallback(){
      return (android.app.ActionBar.TabListener) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCustomView")
    public android.view.View getCustomView(){
      return (android.view.View) null;
    }
    public void setPosition(int arg1){
    }
    public void select(){
    }
    public android.app.ActionBar.Tab setTabListener(@FieldSet("tabListener")@com.francetelecom.rd.stubs.annotation.CallBackRegister("onTabSel") android.app.ActionBar.TabListener arg1){
      return (android.app.ActionBar.Tab) null;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateActionBar")
  public ActionBarImpl(android.app.Activity arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateActionBar")
  public ActionBarImpl(android.app.Dialog arg1){
    super();
  }
  // Methods

  public void setTitle(int arg1){
  }
  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActionBar")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public android.view.ActionMode startActionMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg1){
    return (android.view.ActionMode) null;
  }
  public void show(){
  }
  public void hide(){
  }
  public void setCustomView(int arg1){
  }
  public void setCustomView(@com.francetelecom.rd.stubs.annotation.FieldSet("mCustomView") android.view.View arg1){
  }
  public void setCustomView(@com.francetelecom.rd.stubs.annotation.FieldSet("mCustomView") android.view.View arg1, android.app.ActionBar.LayoutParams arg2){
  }
  public void setSubtitle(int arg1){
  }
  public void setSubtitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle")
  public java.lang.CharSequence getSubtitle(){
    return (java.lang.CharSequence) null;
  }
  public void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public int getHeight(){
    return 0;
  }
  public void setIcon(int arg1){
  }
  public void setIcon(android.graphics.drawable.Drawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCustomView")
  public android.view.View getCustomView(){
    return (android.view.View) null;
  }
  public boolean isShowing(){
    return false;
  }
  public void setShowHideAnimationEnabled(boolean arg1){
  }
  public void dispatchMenuVisibilityChanged(boolean arg1){
  }
  public android.content.Context getThemedContext(){
    return (android.content.Context) null;
  }
  public void addOnMenuVisibilityListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMenuVisibilityChanged") android.app.ActionBar.OnMenuVisibilityListener arg1){
  }
  public void removeOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener arg1){
  }
  public void setDisplayUseLogoEnabled(boolean arg1){
  }
  public void setDisplayShowHomeEnabled(boolean arg1){
  }
  public void setDisplayHomeAsUpEnabled(boolean arg1){
  }
  public void setDisplayShowTitleEnabled(boolean arg1){
  }
  public void setDisplayShowCustomEnabled(boolean arg1){
  }
  public void setHomeButtonEnabled(boolean arg1){
  }
  public void setSelectedNavigationItem(int arg1){
  }
  public void removeAllTabs(){
  }
  public void setDisplayOptions(int arg1){
  }
  public void setDisplayOptions(int arg1, int arg2){
  }
  public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public int getNavigationMode(){
    return 0;
  }
  public int getDisplayOptions(){
    return 0;
  }
  public void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("mTab") android.app.ActionBar.Tab arg1){
  }
  public void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("mTab") android.app.ActionBar.Tab arg1, int arg2){
  }
  public void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("mTab") android.app.ActionBar.Tab arg1, boolean arg2){
  }
  public void addTab(@com.francetelecom.rd.stubs.annotation.FieldSet("mTab") android.app.ActionBar.Tab arg1, int arg2, boolean arg3){
  }
  public android.app.ActionBar.Tab newTab(){
    return (android.app.ActionBar.Tab) null;
  }
  public void removeTab(android.app.ActionBar.Tab arg1){
  }
  public void removeTabAt(int arg1){
  }
  public void selectTab(android.app.ActionBar.Tab arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTab")
  public android.app.ActionBar.Tab getSelectedTab(){
    return (android.app.ActionBar.Tab) null;
  }
  public void setListNavigationCallbacks(android.widget.SpinnerAdapter arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onNavigationListener") android.app.ActionBar.OnNavigationListener arg2){
  }
  public int getSelectedNavigationIndex(){
    return 0;
  }
  public int getNavigationItemCount(){
    return 0;
  }
  public int getTabCount(){
    return 0;
  }
  public void setNavigationMode(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTab")
  public android.app.ActionBar.Tab getTabAt(int arg1){
    return (android.app.ActionBar.Tab) null;
  }
  public void setLogo(int arg1){
  }
  public void setLogo(android.graphics.drawable.Drawable arg1){
  }
}
