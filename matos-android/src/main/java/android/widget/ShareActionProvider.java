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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ShareActionProvider
  extends android.view.ActionProvider{
  // Classes

  public static interface OnShareTargetSelectedListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnShareTargetSelectedListener")
    public boolean onShareTargetSelected(ShareActionProvider arg1, android.content.Intent arg2);
  }
  // Fields

  public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ShareActionProvider(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  public boolean hasSubMenu(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public android.view.View onCreateActionView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public void onPrepareSubMenu(android.view.SubMenu arg1){
  }
  public void setOnShareTargetSelectedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnShareTargetSelectedListener") ShareActionProvider.OnShareTargetSelectedListener arg1){
  }
  public void setShareHistoryFileName(java.lang.String arg1){
  }
  public void setShareIntent(android.content.Intent arg1){
  }
}
