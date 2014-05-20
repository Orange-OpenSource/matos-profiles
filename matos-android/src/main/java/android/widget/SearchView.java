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
public class SearchView
  extends LinearLayout  implements android.view.CollapsibleActionView
{
  // Classes

  public static interface OnQueryTextListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnQueryTextListener")
    public boolean onQueryTextChange(java.lang.String arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("OnQueryTextListener")
    public boolean onQueryTextSubmit(java.lang.String arg1);
  }
  public static interface OnCloseListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnCloseListener")
    public boolean onClose();
  }
  public static interface OnSuggestionListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnSuggestionListener")
    public boolean onSuggestionClick(int arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("OnSuggestionListener")
    public boolean onSuggestionSelect(int arg1);
  }
  public static class SearchAutoComplete
    extends AutoCompleteTextView  {
    // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SearchAutoComplete(android.content.Context arg1){
      super((android.content.Context) null);
    }
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SearchAutoComplete(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null);
    }
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SearchAutoComplete(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
      super((android.content.Context) null);
    }
    // Methods

    public void setThreshold(int arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onWindowFocusChanged(boolean arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public boolean onKeyPreIme(int arg1, android.view.KeyEvent arg2){
      return false;
    }
    public boolean enoughToFilter(){
      return false;
    }
    public void performCompletion(){
    }
    protected void replaceText(java.lang.CharSequence arg1){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SearchView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SearchView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public java.lang.CharSequence getQuery(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  public void clearFocus(){
  }
  public boolean requestFocus(int arg1, android.graphics.Rect arg2){
    return false;
  }
  public void setMaxWidth(int arg1){
  }
  public void setInputType(int arg1){
  }
  public void setImeOptions(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActionViewExpanded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActionViewCollapsed(){
  }
  public void setSearchableInfo(android.app.SearchableInfo arg1){
  }
  public void setAppSearchData(android.os.Bundle arg1){
  }
  public void setOnQueryTextListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnQueryTextListener") SearchView.OnQueryTextListener arg1){
  }
  public void setOnCloseListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnCloseListener") SearchView.OnCloseListener arg1){
  }
  public void setOnQueryTextFocusChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onFocusChange") android.view.View.OnFocusChangeListener arg1){
  }
  public void setOnSuggestionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnSuggestionListener") SearchView.OnSuggestionListener arg1){
  }
  public void setOnSearchClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg1){
  }
  public void setQuery(java.lang.CharSequence arg1, boolean arg2){
  }
  public void setQueryHint(java.lang.CharSequence arg1){
  }
  public void setIconifiedByDefault(boolean arg1){
  }
  public boolean isIconfiedByDefault(){
    return false;
  }
  public void setIconified(boolean arg1){
  }
  public boolean isIconified(){
    return false;
  }
  public void setSubmitButtonEnabled(boolean arg1){
  }
  public boolean isSubmitButtonEnabled(){
    return false;
  }
  public void setQueryRefinementEnabled(boolean arg1){
  }
  public boolean isQueryRefinementEnabled(){
    return false;
  }
  public void setSuggestionsAdapter(@com.francetelecom.rd.stubs.annotation.FieldSet("mCursorAdapter") CursorAdapter arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCursorAdapter") 
  public CursorAdapter getSuggestionsAdapter(){
    return (CursorAdapter) null;
  }
}
