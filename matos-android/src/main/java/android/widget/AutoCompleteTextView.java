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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AutoCompleteTextView
  extends EditText  implements Filter.FilterListener
{
  // Classes

  public static interface Validator
  {
    // Methods

    public boolean isValid(java.lang.CharSequence arg1);
    public java.lang.CharSequence fixText(java.lang.CharSequence arg1);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AutoCompleteTextView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AutoCompleteTextView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AutoCompleteTextView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void setThreshold(int arg1){
  }
  protected Filter getFilter(){
    return (Filter) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  protected boolean setFrame(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public void setOnClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDisplayHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyPreIme(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public void setText(java.lang.CharSequence arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCommitCompletion(android.view.inputmethod.CompletionInfo arg1){
  }
  public ListAdapter getAdapter(){
    return (ListAdapter) null;
  }
  public <T extends ListAdapter & Filterable>void setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") T arg1){
  }
  public void setOnItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.AdapterView.OnItemClickListener.onItemClick") AdapterView.OnItemClickListener arg1){
  }
  public AdapterView.OnItemClickListener getOnItemClickListener(){
    return (AdapterView.OnItemClickListener) null;
  }
  public void setOnItemSelectedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.AdapterView.OnItemSelectedListener.onItemSelected") AdapterView.OnItemSelectedListener arg1){
  }
  public AdapterView.OnItemSelectedListener getOnItemSelectedListener(){
    return (AdapterView.OnItemSelectedListener) null;
  }
  public void clearListSelection(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFilterComplete(int arg1){
  }
  public void setCompletionHint(java.lang.CharSequence arg1){
  }
  public int getDropDownWidth(){
    return 0;
  }
  public void setDropDownWidth(int arg1){
  }
  public int getDropDownHeight(){
    return 0;
  }
  public void setDropDownHeight(int arg1){
  }
  public int getDropDownAnchor(){
    return 0;
  }
  public void setDropDownAnchor(int arg1){
  }
  public android.graphics.drawable.Drawable getDropDownBackground(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setDropDownBackgroundResource(int arg1){
  }
  public void setDropDownVerticalOffset(int arg1){
  }
  public int getDropDownVerticalOffset(){
    return 0;
  }
  public void setDropDownHorizontalOffset(int arg1){
  }
  public int getDropDownHorizontalOffset(){
    return 0;
  }
  public void setDropDownAnimationStyle(int arg1){
  }
  public int getDropDownAnimationStyle(){
    return 0;
  }
  public boolean isDropDownAlwaysVisible(){
    return false;
  }
  public void setDropDownAlwaysVisible(boolean arg1){
  }
  public boolean isDropDownDismissedOnCompletion(){
    return false;
  }
  public void setDropDownDismissedOnCompletion(boolean arg1){
  }
  public int getThreshold(){
    return 0;
  }
  public AdapterView.OnItemClickListener getItemClickListener(){
    return (AdapterView.OnItemClickListener) null;
  }
  public AdapterView.OnItemSelectedListener getItemSelectedListener(){
    return (AdapterView.OnItemSelectedListener) null;
  }
  public boolean enoughToFilter(){
    return false;
  }
  public boolean isPopupShowing(){
    return false;
  }
  protected java.lang.CharSequence convertSelectionToString(java.lang.Object arg1){
    return (java.lang.CharSequence) null;
  }
  public void setListSelection(int arg1){
  }
  public int getListSelection(){
    return 0;
  }
  protected void performFiltering(java.lang.CharSequence arg1, int arg2){
  }
  public void performCompletion(){
  }
  public boolean isPerformingCompletion(){
    return false;
  }
  protected void replaceText(java.lang.CharSequence arg1){
  }
  public void dismissDropDown(){
  }
  public void showDropDownAfterLayout(){
  }
  public void ensureImeVisible(boolean arg1){
  }
  public boolean isInputMethodNotNeeded(){
    return false;
  }
  public void showDropDown(){
  }
  public void setForceIgnoreOutsideTouch(boolean arg1){
  }
  public void setValidator(@FieldSet("validator") AutoCompleteTextView.Validator arg1){
  }
  @FieldGet("validator") 
  public AutoCompleteTextView.Validator getValidator(){
    return (AutoCompleteTextView.Validator) null;
  }
  public void performValidation(){
  }
}
