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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class AbsListView
  extends AdapterView<ListAdapter>  implements android.text.TextWatcher, Filter.FilterListener, RemoteViewsAdapter.RemoteAdapterConnectionCallback, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{
  // Classes

  public static interface OnScrollListener
  {
    // Fields

    public static final int SCROLL_STATE_IDLE = 0;

    public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

    public static final int SCROLL_STATE_FLING = 2;

    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScroll")
    public void onScroll(AbsListView arg1, int arg2, int arg3, int arg4);
    @com.francetelecom.rd.stubs.annotation.CallBack("onScroll")
    public void onScrollStateChanged(AbsListView arg1, int arg2);
  }
  public static interface SelectionBoundsAdjuster
  {
    // Methods

    public void adjustListItemSelectionBounds(android.graphics.Rect arg1);
  }
  @Real("com.francetelecom.rd.fakeandroid.MultiChoiceModeListenerImpl")
  public static interface MultiChoiceModeListener
    extends android.view.ActionMode.Callback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("MultiChoiceModeListener")
    public void onItemCheckedStateChanged(android.view.ActionMode arg1, int arg2, long arg3, boolean arg4);
  }
  public static class LayoutParams
    extends android.view.ViewGroup.LayoutParams  {
    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, int arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  public static interface RecyclerListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onMovedToScrapHead")
    public void onMovedToScrapHeap(android.view.View arg1);
  }
  // Fields

  public static final int TRANSCRIPT_MODE_DISABLED = 0;

  public static final int TRANSCRIPT_MODE_NORMAL = 1;

  public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;

  public static final int CHOICE_MODE_NONE = 0;

  public static final int CHOICE_MODE_SINGLE = 1;

  public static final int CHOICE_MODE_MULTIPLE = 2;

  public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsListView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsListView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsListView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
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
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onGenericMotionEvent(android.view.MotionEvent arg1){
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
  protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public AbsListView.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (AbsListView.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean showContextMenuForChild(android.view.View arg1){
    return false;
  }
  public void addTouchables(java.util.ArrayList<android.view.View> arg1){
  }
  public void requestDisallowInterceptTouchEvent(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected void dispatchSetPressed(boolean arg1){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onConsistencyCheck(int arg1){
    return false;
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected int [] onCreateDrawableState(int arg1){
    return (int []) null;
  }
  public void requestLayout(){
  }
  public boolean showContextMenu(float arg1, float arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void draw(android.graphics.Canvas arg1){
  }
  public int getSolidColor(){
    return 0;
  }
  public int getVerticalScrollbarWidth(){
    return 0;
  }
  public void setVerticalScrollbarPosition(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  public void sendAccessibilityEvent(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDisplayHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo arg1){
    return (android.view.inputmethod.InputConnection) null;
  }
  public boolean checkInputConnectionProxy(android.view.View arg1){
    return false;
  }
  protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo(){
    return (android.view.ContextMenu.ContextMenuInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void getFocusedRect(android.graphics.Rect arg1){
  }
  protected float getTopFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getBottomFadingEdgeStrength(){
    return 0.0f;
  }
  protected int computeVerticalScrollRange(){
    return 0;
  }
  protected int computeVerticalScrollOffset(){
    return 0;
  }
  protected int computeVerticalScrollExtent(){
    return 0;
  }
  protected boolean isVerticalScrollBarHidden(){
    return false;
  }
  protected boolean isPaddingOffsetRequired(){
    return false;
  }
  protected int getLeftPaddingOffset(){
    return 0;
  }
  protected int getRightPaddingOffset(){
    return 0;
  }
  protected int getTopPaddingOffset(){
    return 0;
  }
  protected int getBottomPaddingOffset(){
    return 0;
  }
  public boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onOverScrolled(int arg1, int arg2, boolean arg3, boolean arg4){
  }
  public void setOverScrollMode(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void beforeTextChanged(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTextChanged(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void afterTextChanged(android.text.Editable arg1){
  }
  public int pointToPosition(int arg1, int arg2){
    return 0;
  }
  
  public void setAdapter(@CallBackRegister("adapter")ListAdapter arg1){
  }
  public android.view.View getSelectedView(){
    return (android.view.View) null;
  }
  public boolean performItemClick(android.view.View arg1, int arg2, long arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFilterComplete(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGlobalLayout(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTouchModeChanged(boolean arg1){
  }
  public void setFriction(float arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRemoteAdapterDisconnected(){
  }
  public void setRemoteViewsAdapter(android.content.Intent arg1){
  }
  public void deferNotifyDataSetChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onRemoteAdapterConnected(){
    return false;
  }
  public void smoothScrollToPosition(int arg1){
  }
  public void smoothScrollToPosition(int arg1, int arg2){
  }
  protected void layoutChildren(){
  }
  public void setCacheColorHint(int arg1){
  }
  protected void handleDataChanged(){
  }
  protected boolean isInFilterMode(){
    return false;
  }
  public void setChoiceMode(int arg1){
  }
  public void setTextFilterEnabled(boolean arg1){
  }
  public int getListPaddingTop(){
    return 0;
  }
  public int getListPaddingBottom(){
    return 0;
  }
  public int getCacheColorHint(){
    return 0;
  }
  public long [] getCheckedItemIds(){
    return (long []) null;
  }
  public int getCheckedItemCount(){
    return 0;
  }
  public boolean isItemChecked(int arg1){
    return false;
  }
  public int getCheckedItemPosition(){
    return 0;
  }
  public android.util.SparseBooleanArray getCheckedItemPositions(){
    return (android.util.SparseBooleanArray) null;
  }
  public void clearChoices(){
  }
  public void setItemChecked(int arg1, boolean arg2){
  }
  public int getChoiceMode(){
    return 0;
  }
  public void setMultiChoiceModeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("MultiChoiceModeListener") AbsListView.MultiChoiceModeListener arg1){
  }
  public void setFastScrollEnabled(boolean arg1){
  }
  public void setFastScrollAlwaysVisible(boolean arg1){
  }
  public boolean isFastScrollAlwaysVisible(){
    return false;
  }
  public boolean isFastScrollEnabled(){
    return false;
  }
  public void setSmoothScrollbarEnabled(boolean arg1){
  }
  public boolean isSmoothScrollbarEnabled(){
    return false;
  }
  public void setOnScrollListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onScroll") AbsListView.OnScrollListener arg1){
  }
  public boolean isScrollingCacheEnabled(){
    return false;
  }
  public void setScrollingCacheEnabled(boolean arg1){
  }
  public boolean isTextFilterEnabled(){
    return false;
  }
  public boolean isStackFromBottom(){
    return false;
  }
  public void setStackFromBottom(boolean arg1){
  }
  public void setFilterText(java.lang.String arg1){
  }
  public java.lang.CharSequence getTextFilter(){
    return (java.lang.CharSequence) null;
  }
  public int getListPaddingLeft(){
    return 0;
  }
  public int getListPaddingRight(){
    return 0;
  }
  public void setDrawSelectorOnTop(boolean arg1){
  }
  public void setSelector(int arg1){
  }
  public void setSelector(android.graphics.drawable.Drawable arg1){
  }
  public android.graphics.drawable.Drawable getSelector(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setScrollIndicators(android.view.View arg1, android.view.View arg2){
  }
  public long pointToRowId(int arg1, int arg2){
    return 0l;
  }
  public void setOverScrollEffectPadding(int arg1, int arg2){
  }
  public void setVelocityScale(float arg1){
  }
  public void smoothScrollToPositionFromTop(int arg1, int arg2, int arg3){
  }
  public void smoothScrollToPositionFromTop(int arg1, int arg2){
  }
  public void smoothScrollBy(int arg1, int arg2){
  }
  public void invalidateViews(){
  }
  public void clearTextFilter(){
  }
  public boolean hasTextFilter(){
    return false;
  }
  public void setTranscriptMode(int arg1){
  }
  public int getTranscriptMode(){
    return 0;
  }
  public void reclaimViews(java.util.List<android.view.View> arg1){
  }
  public void setRecyclerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onMovedToScrapHead") AbsListView.RecyclerListener arg1){
  }
}
