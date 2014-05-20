package android.widget;

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


public class PopupMenu
  implements com.android.internal.view.menu.MenuPresenter.Callback, com.android.internal.view.menu.MenuBuilder.Callback
{
  // Classes

  public static interface OnDismissListener
  {
    // Methods
	  
    @com.francetelecom.rd.stubs.annotation.CallBack("OnDismissListener")
    public void onDismiss(PopupMenu arg1);
  }
  public static interface OnMenuItemClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnMenuItemClickListener")
    public boolean onMenuItemClick(android.view.MenuItem arg1);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PopupMenu(android.content.Context arg1, android.view.View arg2){
  }
  // Methods

  public void inflate(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder arg1, android.view.MenuItem arg2){
    return false;
  }
  public android.view.MenuInflater getMenuInflater(){
    return (android.view.MenuInflater) null;
  }
  public void show(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(com.android.internal.view.menu.MenuBuilder arg1, boolean arg2){
  }
  public void dismiss(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder arg1){
    return false;
  }
  public void setOnMenuItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnMenuItemClickListener") PopupMenu.OnMenuItemClickListener arg1){
  }
  public android.view.Menu getMenu(){
    return (android.view.Menu) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder arg1){
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnDismissListener") PopupMenu.OnDismissListener arg1){
  }
}
