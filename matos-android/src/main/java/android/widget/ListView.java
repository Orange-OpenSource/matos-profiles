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
@com.francetelecom.rd.stubs.annotation.Field(modifier = 4, type = "ListAdapter", value = "adapter")
public class ListView
  extends AbsListView{
  // Classes

  public class FixedViewInfo
  {
    // Fields

    public android.view.View view;

    public java.lang.Object data;

    public boolean isSelectable;

    // Constructors

    public FixedViewInfo(){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean isOpaque(){
    return false;
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
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  public boolean requestChildRectangleOnScreen(android.view.View arg1, android.graphics.Rect arg2, boolean arg3){
    return false;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected boolean drawChild(android.graphics.Canvas arg1, android.view.View arg2, long arg3){
    return false;
  }
  protected android.view.View findViewTraversal(int arg1){
    return (android.view.View) null;
  }
  protected android.view.View findViewWithTagTraversal(java.lang.Object arg1){
    return (android.view.View) null;
  }
  protected android.view.View findViewByPredicateTraversal(com.android.internal.util.Predicate<android.view.View> arg1, android.view.View arg2){
    return (android.view.View) null;
  }
  protected boolean canAnimate(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onFinishInflate(){
  }
  public void setSelection(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("adapter")
  public ListAdapter getAdapter(){
    return (ListAdapter) null;
  }
  public void setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") @com.francetelecom.rd.stubs.annotation.FieldSet("adapter") ListAdapter arg1){
  }
  @android.view.RemotableViewMethod
  public void setRemoteViewsAdapter(android.content.Intent arg1){
  }
  protected boolean recycleOnMeasure(){
    return false;
  }
  public void setItemsCanFocus(boolean arg1){
  }
  public int getMaxScrollAmount(){
    return 0;
  }
  public void addHeaderView(android.view.View arg1, java.lang.Object arg2, boolean arg3){
  }
  public void addHeaderView(android.view.View arg1){
  }
  public int getHeaderViewsCount(){
    return 0;
  }
  public boolean removeHeaderView(android.view.View arg1){
    return false;
  }
  public void addFooterView(android.view.View arg1, java.lang.Object arg2, boolean arg3){
  }
  public void addFooterView(android.view.View arg1){
  }
  public int getFooterViewsCount(){
    return 0;
  }
  public boolean removeFooterView(android.view.View arg1){
    return false;
  }
  @android.view.RemotableViewMethod
  public void smoothScrollToPosition(int arg1){
  }
  @android.view.RemotableViewMethod
  public void smoothScrollByOffset(int arg1){
  }
  protected void layoutChildren(){
  }
  public void setSelectionFromTop(int arg1, int arg2){
  }
  public void setSelectionAfterHeaderView(){
  }
  public boolean getItemsCanFocus(){
    return false;
  }
  public void setCacheColorHint(int arg1){
  }
  public android.graphics.drawable.Drawable getDivider(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setDivider(android.graphics.drawable.Drawable arg1){
  }
  public int getDividerHeight(){
    return 0;
  }
  public void setDividerHeight(int arg1){
  }
  public void setHeaderDividersEnabled(boolean arg1){
  }
  public void setFooterDividersEnabled(boolean arg1){
  }
  public void setOverscrollHeader(android.graphics.drawable.Drawable arg1){
  }
  public android.graphics.drawable.Drawable getOverscrollHeader(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setOverscrollFooter(android.graphics.drawable.Drawable arg1){
  }
  public android.graphics.drawable.Drawable getOverscrollFooter(){
    return (android.graphics.drawable.Drawable) null;
  }
  public long [] getCheckItemIds(){
    return (long []) null;
  }
}
