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
public class ListPopupWindow
{
  // Fields

  public static final int POSITION_PROMPT_ABOVE = 0;

  public static final int POSITION_PROMPT_BELOW = 1;

  public static final int MATCH_PARENT = -1;

  public static final int WRAP_CONTENT = -2;

  public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;

  public static final int INPUT_METHOD_NEEDED = 1;

  public static final int INPUT_METHOD_NOT_NEEDED = 2;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPopupWindow(android.content.Context arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPopupWindow(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPopupWindow(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPopupWindow(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, int arg4){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public void show(){
  }
  public void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyPreIme(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public android.graphics.drawable.Drawable getBackground(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setSelection(int arg1){
  }
  public void setHeight(int arg1){
  }
  public void setWidth(int arg1){
  }
  public void setAdapter(ListAdapter arg1){
  }
  public android.view.View getSelectedView(){
    return (android.view.View) null;
  }
  public boolean performItemClick(int arg1){
    return false;
  }
  public int getSelectedItemPosition(){
    return 0;
  }
  public long getSelectedItemId(){
    return 0l;
  }
  public void setOnItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemClick") AdapterView.OnItemClickListener arg1){
  }
  public void setOnItemSelectedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemSelected") AdapterView.OnItemSelectedListener arg1){
  }
  public java.lang.Object getSelectedItem(){
    return (java.lang.Object) null;
  }
  public void clearListSelection(){
  }
  public boolean isDropDownAlwaysVisible(){
    return false;
  }
  public void setDropDownAlwaysVisible(boolean arg1){
  }
  public boolean isInputMethodNotNeeded(){
    return false;
  }
  public void setForceIgnoreOutsideTouch(boolean arg1){
  }
  public void dismiss(){
  }
  public ListView getListView(){
    return (ListView) null;
  }
  public boolean isShowing(){
    return false;
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onDismiss") PopupWindow.OnDismissListener arg1){
  }
  public void setAnchorView(android.view.View arg1){
  }
  public void setSoftInputMode(int arg1){
  }
  public void setInputMethodMode(int arg1){
  }
  public int getAnimationStyle(){
    return 0;
  }
  public void setAnimationStyle(int arg1){
  }
  public int getInputMethodMode(){
    return 0;
  }
  public int getSoftInputMode(){
    return 0;
  }
  public int getVerticalOffset(){
    return 0;
  }
  public void setPromptPosition(int arg1){
  }
  public void setListSelector(android.graphics.drawable.Drawable arg1){
  }
  public void setVerticalOffset(int arg1){
  }
  public void setHorizontalOffset(int arg1){
  }
  public void setPromptView(android.view.View arg1){
  }
  public int getHorizontalOffset(){
    return 0;
  }
  public void postShow(){
  }
  public android.view.View getAnchorView(){
    return (android.view.View) null;
  }
  public void setModal(boolean arg1){
  }
  public void setContentWidth(int arg1){
  }
  public int getPromptPosition(){
    return 0;
  }
  public boolean isModal(){
    return false;
  }
}
