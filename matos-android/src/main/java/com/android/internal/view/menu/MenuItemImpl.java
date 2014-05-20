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
public final class MenuItemImpl
  implements android.view.MenuItem
{
  // Constructors

  MenuItemImpl(MenuBuilder arg1, int arg2, int arg3, int arg4, int arg5, java.lang.CharSequence arg6, int arg7){
  }
  // Methods

  public boolean invoke(){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean isVisible(){
    return false;
  }
  public android.view.MenuItem setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("title") java.lang.CharSequence arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setTitle(int arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("intent")
  public android.content.Intent getIntent(){
    return (android.content.Intent) null;
  }
  public android.view.MenuItem setIntent(@com.francetelecom.rd.stubs.annotation.FieldSet("intent") android.content.Intent arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setVisible(boolean arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("title")
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public int getItemId(){
    return 0;
  }
  public boolean isEnabled(){
    return false;
  }
  public android.view.MenuItem setEnabled(boolean arg1){
    return (android.view.MenuItem) null;
  }
  public int getOrder(){
    return 0;
  }
  public android.view.MenuItem setChecked(boolean arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isChecked(){
    return false;
  }
  public android.view.MenuItem setIcon(@com.francetelecom.rd.stubs.annotation.FieldSet("icon") android.graphics.drawable.Drawable arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setIcon(int arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("icon")
  public android.graphics.drawable.Drawable getIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public int getGroupId(){
    return 0;
  }
  public android.view.MenuItem setCheckable(boolean arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setShortcut(char arg1, char arg2){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("titleCondensed")
  public java.lang.CharSequence getTitleCondensed(){
    return (java.lang.CharSequence) null;
  }
  public android.view.MenuItem setOnMenuItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMenuItemClick") android.view.MenuItem.OnMenuItemClickListener arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isActionButton(){
    return false;
  }
  public android.view.SubMenu getSubMenu(){
    return (android.view.SubMenu) null;
  }
  public int getOrdering(){
    return 0;
  }
  public char getAlphabeticShortcut(){
    return '\u0000';
  }
  public android.view.MenuItem setAlphabeticShortcut(char arg1){
    return (android.view.MenuItem) null;
  }
  public char getNumericShortcut(){
    return '\u0000';
  }
  public android.view.MenuItem setNumericShortcut(char arg1){
    return (android.view.MenuItem) null;
  }
  public boolean hasSubMenu(){
    return false;
  }
  public android.view.MenuItem setTitleCondensed(@com.francetelecom.rd.stubs.annotation.FieldSet("titleCondensed") java.lang.CharSequence arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isCheckable(){
    return false;
  }
  public void setExclusiveCheckable(boolean arg1){
  }
  public boolean isExclusiveCheckable(){
    return false;
  }
  public android.view.ContextMenu.ContextMenuInfo getMenuInfo(){
    return (android.view.ContextMenu.ContextMenuInfo) null;
  }
  public void actionFormatChanged(){
  }
  public boolean shouldShowIcon(){
    return false;
  }
  public boolean requestsActionButton(){
    return false;
  }
  public boolean requiresActionButton(){
    return false;
  }
  public void setIsActionButton(boolean arg1){
  }
  public boolean showsTextAsAction(){
    return false;
  }
  public void setShowAsAction(int arg1){
  }
  public android.view.MenuItem setActionView(android.view.View arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setActionView(int arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.View getActionView(){
    return (android.view.View) null;
  }
  public android.view.ActionProvider getActionProvider(){
    return (android.view.ActionProvider) null;
  }
  public android.view.MenuItem setActionProvider(android.view.ActionProvider arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.MenuItem setShowAsActionFlags(int arg1){
    return (android.view.MenuItem) null;
  }
  public boolean expandActionView(){
    return false;
  }
  public boolean collapseActionView(){
    return false;
  }
  public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener arg1){
    return (android.view.MenuItem) null;
  }
  public boolean hasCollapsibleActionView(){
    return false;
  }
  public void setActionViewExpanded(boolean arg1){
  }
  public boolean isActionViewExpanded(){
    return false;
  }
}
