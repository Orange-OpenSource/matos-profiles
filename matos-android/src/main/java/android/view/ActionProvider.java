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
public abstract class ActionProvider
{
  // Classes

  public static interface SubUiVisibilityListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("SubUiVisibilityListener")
    public void onSubUiVisibilityChanged(boolean arg1);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionProvider(android.content.Context arg1){
  }
  // Methods

  public boolean hasSubMenu(){
    return false;
  }
  public boolean onPerformDefaultAction(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract View onCreateActionView();
  public void onPrepareSubMenu(SubMenu arg1){
  }
  public void subUiVisibilityChanged(boolean arg1){
  }
  public void setSubUiVisibilityListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SubUiVisibilityListener") ActionProvider.SubUiVisibilityListener arg1){
  }
}
