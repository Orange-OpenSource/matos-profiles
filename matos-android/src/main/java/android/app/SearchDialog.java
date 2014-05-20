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
public class SearchDialog
  extends Dialog{
  // Classes

  public static class SearchBar
    extends android.widget.LinearLayout  {
    // Constructors

    public SearchBar(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null);
    }
    public SearchBar(android.content.Context arg1){
      super((android.content.Context) null);
    }
    // Methods

    public android.view.ActionMode startActionModeForChild(android.view.View arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg2){
      return (android.view.ActionMode) null;
    }
    public void setSearchDialog(SearchDialog arg1){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateDialog")
  public SearchDialog(android.content.Context arg1, SearchManager arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  protected void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public android.os.Bundle onSaveInstanceState(){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public void onConfigurationChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public void onBackPressed(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDialog")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateDialog")
  public boolean show(java.lang.String arg1, boolean arg2, android.content.ComponentName arg3, android.os.Bundle arg4){
    return false;
  }
  public void hide(){
  }
  public void setListSelection(int arg1){
  }
  public void launchQuerySearch(){
  }
  protected void launchQuerySearch(int arg1, java.lang.String arg2){
  }
  public void setWorking(boolean arg1){
  }
}
