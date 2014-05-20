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
public class ActionMenuItem
  implements android.view.MenuItem
{
  // Constructors

  public ActionMenuItem(android.content.Context arg1, int arg2, int arg3, int arg4, int arg5, java.lang.CharSequence arg6){
  }
  // Methods

  public boolean invoke(){
    return false;
  }
  public boolean isVisible(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setTitle(int arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIntent") 
  public android.content.Intent getIntent(){
    return (android.content.Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setIntent(@com.francetelecom.rd.stubs.annotation.FieldSet("mIntent") android.content.Intent arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setVisible(boolean arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle") 
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public int getItemId(){
    return 0;
  }
  public boolean isEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setEnabled(boolean arg1){
    return (android.view.MenuItem) null;
  }
  public int getOrder(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setChecked(boolean arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isChecked(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setIcon(@com.francetelecom.rd.stubs.annotation.FieldSet("mIcon") android.graphics.drawable.Drawable arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setIcon(int arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIcon") 
  public android.graphics.drawable.Drawable getIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public int getGroupId(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setCheckable(boolean arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setShortcut(char arg1, char arg2){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitleCondensed") 
  public java.lang.CharSequence getTitleCondensed(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setOnMenuItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMenuItemClick") android.view.MenuItem.OnMenuItemClickListener arg1){
    return (android.view.MenuItem) null;
  }
  public android.view.SubMenu getSubMenu(){
    return (android.view.SubMenu) null;
  }
  public char getAlphabeticShortcut(){
    return '\u0000';
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setAlphabeticShortcut(char arg1){
    return (android.view.MenuItem) null;
  }
  public char getNumericShortcut(){
    return '\u0000';
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setNumericShortcut(char arg1){
    return (android.view.MenuItem) null;
  }
  public boolean hasSubMenu(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setTitleCondensed(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitleCondensed") java.lang.CharSequence arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isCheckable(){
    return false;
  }
  public ActionMenuItem setExclusiveCheckable(boolean arg1){
    return (ActionMenuItem) null;
  }
  public android.view.ContextMenu.ContextMenuInfo getMenuInfo(){
    return (android.view.ContextMenu.ContextMenuInfo) null;
  }
  public void setShowAsAction(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setActionView(@com.francetelecom.rd.stubs.annotation.FieldSet("mActionView") android.view.View arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setActionView(int arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mActionView") 
  public android.view.View getActionView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mActionProvider") 
  public android.view.ActionProvider getActionProvider(){
    return (android.view.ActionProvider) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setActionProvider(@com.francetelecom.rd.stubs.annotation.FieldSet("mActionProvider") android.view.ActionProvider arg1){
    return (android.view.MenuItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setShowAsActionFlags(int arg1){
    return (android.view.MenuItem) null;
  }
  public boolean expandActionView(){
    return false;
  }
  public boolean collapseActionView(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  public android.view.MenuItem setOnActionExpandListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnActionExpandListener") android.view.MenuItem.OnActionExpandListener arg1){
    return (android.view.MenuItem) null;
  }
  public boolean isActionViewExpanded(){
    return false;
  }
}
