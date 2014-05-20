package com.android.internal.view;

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
public class StandaloneActionMode
  extends android.view.ActionMode  implements com.android.internal.view.menu.MenuBuilder.Callback
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public StandaloneActionMode(android.content.Context arg1, com.android.internal.widget.ActionBarContextView arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg3, boolean arg4){
    super();
  }
  // Methods

  public void finish(){
  }
  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
  }
  public void setTitle(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(com.android.internal.view.menu.MenuBuilder arg1, boolean arg2){
  }
  public android.view.Menu getMenu(){
    return (android.view.Menu) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCustomView") 
  public android.view.View getCustomView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder arg1){
  }
  public boolean isUiFocusable(){
    return false;
  }
}
