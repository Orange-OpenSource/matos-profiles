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
public class MenuBuilder
  implements android.view.Menu
{
  // Classes

  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("call")
    public boolean onMenuItemSelected(MenuBuilder arg1, android.view.MenuItem arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("call")
    public void onMenuModeChange(MenuBuilder arg1);
  }
  public static interface ItemInvoker
  {
    // Methods

    public boolean invokeItem(MenuItemImpl arg1);
  }
  // Constructors

  public MenuBuilder(android.content.Context arg1){
  }
  // Methods

  public android.view.MenuItem add(java.lang.CharSequence arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem add(int arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem add(int arg1, int arg2, int arg3, java.lang.CharSequence arg4){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem add(int arg1, int arg2, int arg3, int arg4){
    return (android.view.MenuItem) null;
  }
  public void clear(){
  }
  public int size(){
    return 0;
  }
  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public void close(){
  }
  public android.view.MenuItem getItem(int arg1){
    return (android.view.MenuItem) null;
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("call") MenuBuilder.Callback arg1){
  }
  public void flagActionItems(){
  }
  public boolean expandItemActionView(MenuItemImpl arg1){
    return false;
  }
  public boolean collapseItemActionView(MenuItemImpl arg1){
    return false;
  }
  public boolean hasVisibleItems(){
    return false;
  }
  public android.view.MenuItem findItem(int arg1){
    return (android.view.MenuItem) null;
  }
  public boolean performShortcut(int arg1, android.view.KeyEvent arg2, int arg3){
    return false;
  }
  public int addIntentOptions(int arg1, int arg2, int arg3, android.content.ComponentName arg4, android.content.Intent [] arg5, android.content.Intent arg6, int arg7, android.view.MenuItem [] arg8){
    return 0;
  }
  public android.view.SubMenu addSubMenu(java.lang.CharSequence arg1){
    return (android.view.SubMenu) null;
  }
  public android.view.SubMenu addSubMenu(int arg1){
    return (android.view.SubMenu) null;
  }
  public android.view.SubMenu addSubMenu(int arg1, int arg2, int arg3, java.lang.CharSequence arg4){
    return (android.view.SubMenu) null;
  }
  public android.view.SubMenu addSubMenu(int arg1, int arg2, int arg3, int arg4){
    return (android.view.SubMenu) null;
  }
  public boolean isShortcutKey(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public boolean performIdentifierAction(int arg1, int arg2){
    return false;
  }
  public void removeGroup(int arg1){
  }
  public void removeItem(int arg1){
  }
  public void setGroupCheckable(int arg1, boolean arg2, boolean arg3){
  }
  public void setGroupEnabled(int arg1, boolean arg2){
  }
  public void setGroupVisible(int arg1, boolean arg2){
  }
  public void setQwertyMode(boolean arg1){
  }
  public void clearHeader(){
  }
  public void addMenuPresenter(MenuPresenter arg1){
  }
  public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo arg1){
  }
  public boolean performItemAction(android.view.MenuItem arg1, int arg2){
    return false;
  }
  public MenuBuilder getRootMenu(){
    return (MenuBuilder) null;
  }
  public android.view.View getHeaderView(){
    return (android.view.View) null;
  }
  public android.graphics.drawable.Drawable getHeaderIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public java.lang.CharSequence getHeaderTitle(){
    return (java.lang.CharSequence) null;
  }
  public boolean isShortcutsVisible(){
    return false;
  }
  public MenuBuilder setDefaultShowAsAction(int arg1){
    return (MenuBuilder) null;
  }
  public void removeMenuPresenter(MenuPresenter arg1){
  }
  public void savePresenterStates(android.os.Bundle arg1){
  }
  public void restorePresenterStates(android.os.Bundle arg1){
  }
  public int findItemIndex(int arg1){
    return 0;
  }
  protected MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable arg1){
    return (MenuBuilder) null;
  }
  protected MenuBuilder setHeaderIconInt(int arg1){
    return (MenuBuilder) null;
  }
  protected MenuBuilder setHeaderTitleInt(java.lang.CharSequence arg1){
    return (MenuBuilder) null;
  }
  protected MenuBuilder setHeaderTitleInt(int arg1){
    return (MenuBuilder) null;
  }
  protected MenuBuilder setHeaderViewInt(android.view.View arg1){
    return (MenuBuilder) null;
  }
  public void saveActionViewStates(android.os.Bundle arg1){
  }
  public void restoreActionViewStates(android.os.Bundle arg1){
  }
  protected java.lang.String getActionViewStatesKey(){
    return (java.lang.String) null;
  }
  public void removeItemAt(int arg1){
  }
  public void clearAll(){
  }
  public int findGroupIndex(int arg1){
    return 0;
  }
  public int findGroupIndex(int arg1, int arg2){
    return 0;
  }
  public void setShortcutsVisible(boolean arg1){
  }
  public void changeMenuMode(){
  }
  public void stopDispatchingItemsChanged(){
  }
  public void startDispatchingItemsChanged(){
  }
  public MenuItemImpl getExpandedItem(){
    return (MenuItemImpl) null;
  }
}
