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
public class MenuDialogHelper
  implements MenuPresenter.Callback, android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MenuDialogHelper(MenuBuilder arg1){
  }
  // Methods

  public void show(android.os.IBinder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.content.DialogInterface arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKey(android.content.DialogInterface arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDismiss(android.content.DialogInterface arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseMenu(MenuBuilder arg1, boolean arg2){
  }
  public void dismiss(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onOpenSubMenu(MenuBuilder arg1){
    return false;
  }
  public void setPresenterCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callback")MenuPresenter.Callback arg1){
  }
}
