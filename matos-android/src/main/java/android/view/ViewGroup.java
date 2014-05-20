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
@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
public abstract class ViewGroup
  extends View  implements ViewManager, ViewParent
{
  // Classes

  public static interface OnHierarchyChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onChildViewChange")
    public void onChildViewAdded(View arg1, View arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onChildViewChange")
    public void onChildViewRemoved(View arg1, View arg2);
  }
  public static class LayoutParams
  {
    // Fields

    public static final int FILL_PARENT = -1;

    public static final int MATCH_PARENT = -1;

    public static final int WRAP_CONTENT = -2;

    public int width;

    public int height;

    public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
    }
    public LayoutParams(int arg1, int arg2){
    }
    public LayoutParams(ViewGroup.LayoutParams arg1){
    }
    LayoutParams(){
    }
    // Methods

    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
    protected void setBaseAttributes(android.content.res.TypedArray arg1, int arg2, int arg3){
    }
    protected void resolveWithDirection(int arg1){
    }
    protected static java.lang.String sizeToString(int arg1){
      return (java.lang.String) null;
    }
  }
  public static class MarginLayoutParams
    extends ViewGroup.LayoutParams  {
    // Fields

    public int leftMargin;

    public int topMargin;

    public int rightMargin;

    public int bottomMargin;

    @ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    protected int startMargin;

    @ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    protected int endMargin;

    // Constructors

    public MarginLayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public MarginLayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public MarginLayoutParams(ViewGroup.MarginLayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public MarginLayoutParams(ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    protected void resolveWithDirection(int arg1){
    }
    public void setMargins(int arg1, int arg2, int arg3, int arg4){
    }
    public void setMarginsRelative(int arg1, int arg2, int arg3, int arg4){
    }
    public int getMarginStart(){
      return 0;
    }
    public int getMarginEnd(){
      return 0;
    }
    public boolean isMarginRelative(){
      return false;
    }
  }
  // Fields

  protected java.util.ArrayList<View> mDisappearingChildren;

  protected ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;

  protected int mGroupFlags;

  protected static final int FLAG_USE_CHILD_DRAWING_ORDER = 0;

  protected static final int FLAG_SUPPORT_STATIC_TRANSFORMATIONS = 0;

  public static final int FOCUS_BEFORE_DESCENDANTS = 131072;

  public static final int FOCUS_AFTER_DESCENDANTS = 262144;

  public static final int FOCUS_BLOCK_DESCENDANTS = 393216;

  protected static final int FLAG_DISALLOW_INTERCEPT = 0;

  protected int mPersistentDrawingCache;

  public static final int PERSISTENT_NO_CACHE = 0;

  public static final int PERSISTENT_ANIMATION_CACHE = 1;

  public static final int PERSISTENT_SCROLLING_CACHE = 2;

  public static final int PERSISTENT_ALL_CACHES = 3;

  protected static final int CLIP_TO_PADDING_MASK = 0;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ViewGroup(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ViewGroup(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ViewGroup(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected void debug(int arg1){
  }
  public boolean dispatchKeyEvent(KeyEvent arg1){
    return false;
  }
  public boolean dispatchKeyShortcutEvent(KeyEvent arg1){
    return false;
  }
  public boolean dispatchTouchEvent(MotionEvent arg1){
    return false;
  }
  public boolean dispatchTrackballEvent(MotionEvent arg1){
    return false;
  }
  protected ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (ViewGroup.LayoutParams) null;
  }
  public ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (ViewGroup.LayoutParams) null;
  }
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams arg1){
    return (ViewGroup.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAnimationStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAnimationEnd(){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  public boolean hasFocus(){
    return false;
  }
  public boolean dispatchDragEvent(DragEvent arg1){
    return false;
  }
  public void dispatchSystemUiVisibilityChanged(int arg1){
  }
  public void dispatchConfigurationChanged(android.content.res.Configuration arg1){
  }
  public void updateViewLayout(View arg1, ViewGroup.LayoutParams arg2){
  }
  public void addView(View arg1){
  }
  public void addView(View arg1, int arg2){
  }
  public void addView(View arg1, int arg2, int arg3){
  }
  public void addView(View arg1, ViewGroup.LayoutParams arg2){
  }
  public void addView(View arg1, int arg2, ViewGroup.LayoutParams arg3){
  }
  public int getChildCount(){
    return 0;
  }
  public final void layout(int arg1, int arg2, int arg3, int arg4){
  }
  public void removeView(View arg1){
  }
  public View getChildAt(int arg1){
    return (View) null;
  }
  public void removeAllViews(){
  }
  public int getDescendantFocusability(){
    return 0;
  }
  public void setDescendantFocusability(int arg1){
  }
  public void requestChildFocus(View arg1, View arg2){
  }
  public void focusableViewAvailable(View arg1){
  }
  public boolean showContextMenuForChild(View arg1){
    return false;
  }
  public ActionMode startActionModeForChild(View arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") ActionMode.Callback arg2){
    return (ActionMode) null;
  }
  public View focusSearch(View arg1, int arg2){
    return (View) null;
  }
  public boolean requestChildRectangleOnScreen(View arg1, android.graphics.Rect arg2, boolean arg3){
    return false;
  }
  public boolean requestSendAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onRequestSendAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    return false;
  }
  public boolean dispatchUnhandledMove(View arg1, int arg2){
    return false;
  }
  public void clearChildFocus(View arg1){
  }
  public void clearFocus(){
  }
  public View getFocusedChild(){
    return (View) null;
  }
  public View findFocus(){
    return (View) null;
  }
  public boolean hasFocusable(){
    return false;
  }
  public void addFocusables(java.util.ArrayList<View> arg1, int arg2){
  }
  public void addFocusables(java.util.ArrayList<View> arg1, int arg2, int arg3){
  }
  public void findViewsWithText(java.util.ArrayList<View> arg1, java.lang.CharSequence arg2, int arg3){
  }
  public void dispatchWindowFocusChanged(boolean arg1){
  }
  public void addTouchables(java.util.ArrayList<View> arg1){
  }
  public void dispatchDisplayHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onChildVisibilityChanged(View arg1, int arg2){
  }
  protected void dispatchVisibilityChanged(View arg1, int arg2){
  }
  public void dispatchWindowVisibilityChanged(int arg1){
  }
  public void recomputeViewAttributes(View arg1){
  }
  public void bringChildToFront(View arg1){
  }
  public boolean dispatchKeyEventPreIme(KeyEvent arg1){
    return false;
  }
  protected boolean dispatchHoverEvent(MotionEvent arg1){
    return false;
  }
  protected boolean hasHoveredChild(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptHoverEvent(MotionEvent arg1){
    return false;
  }
  protected boolean dispatchGenericPointerEvent(MotionEvent arg1){
    return false;
  }
  protected boolean dispatchGenericFocusedEvent(MotionEvent arg1){
    return false;
  }
  protected boolean isTransformedTouchPointInView(float arg1, float arg2, View arg3, android.graphics.PointF arg4){
    return false;
  }
  public void setMotionEventSplittingEnabled(boolean arg1){
  }
  public boolean isMotionEventSplittingEnabled(){
    return false;
  }
  public void requestDisallowInterceptTouchEvent(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptTouchEvent(MotionEvent arg1){
    return false;
  }
  public boolean requestFocus(int arg1, android.graphics.Rect arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onRequestFocusInDescendants(int arg1, android.graphics.Rect arg2){
    return false;
  }
  public void dispatchStartTemporaryDetach(){
  }
  public void dispatchFinishTemporaryDetach(){
  }
  public void setPadding(int arg1, int arg2, int arg3, int arg4){
  }
  protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void setChildrenDrawingCacheEnabled(boolean arg1){
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected int getChildDrawingOrder(int arg1, int arg2){
    return 0;
  }
  protected void dispatchGetDisplayList(){
  }
  protected boolean drawChild(android.graphics.Canvas arg1, View arg2, long arg3){
    return false;
  }
  public void setChildrenLayersEnabled(boolean arg1){
  }
  public void setClipChildren(boolean arg1){
  }
  public void setClipToPadding(boolean arg1){
  }
  public void dispatchSetSelected(boolean arg1){
  }
  public void dispatchSetActivated(boolean arg1){
  }
  protected void dispatchSetPressed(boolean arg1){
  }
  protected void setStaticTransformationsEnabled(boolean arg1){
  }
  protected boolean getChildStaticTransformation(View arg1, android.view.animation.Transformation arg2){
    return false;
  }
  protected View findViewTraversal(int arg1){
    return (View) null;
  }
  protected View findViewWithTagTraversal(java.lang.Object arg1){
    return (View) null;
  }
  protected View findViewByPredicateTraversal(com.android.internal.util.Predicate<View> arg1, View arg2){
    return (View) null;
  }
  protected boolean checkLayoutParams(ViewGroup.LayoutParams arg1){
    return false;
  }
  public void setOnHierarchyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChildViewChange") ViewGroup.OnHierarchyChangeListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onViewAdded(View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onViewRemoved(View arg1){
  }
  protected boolean addViewInLayout(View arg1, int arg2, ViewGroup.LayoutParams arg3){
    return false;
  }
  protected boolean addViewInLayout(View arg1, int arg2, ViewGroup.LayoutParams arg3, boolean arg4){
    return false;
  }
  protected void cleanupLayoutState(View arg1){
  }
  protected void attachLayoutAnimationParameters(View arg1, ViewGroup.LayoutParams arg2, int arg3, int arg4){
  }
  public void removeViewInLayout(View arg1){
  }
  public void removeViewsInLayout(int arg1, int arg2){
  }
  public void removeViewAt(int arg1){
  }
  public void removeViews(int arg1, int arg2){
  }
  public void setLayoutTransition(android.animation.LayoutTransition arg1){
  }
  public android.animation.LayoutTransition getLayoutTransition(){
    return (android.animation.LayoutTransition) null;
  }
  public void removeAllViewsInLayout(){
  }
  protected void removeDetachedView(View arg1, boolean arg2){
  }
  protected void attachViewToParent(View arg1, int arg2, ViewGroup.LayoutParams arg3){
  }
  protected void detachViewFromParent(View arg1){
  }
  protected void detachViewFromParent(int arg1){
  }
  protected void detachViewsFromParent(int arg1, int arg2){
  }
  protected void detachAllViewsFromParent(){
  }
  public final void invalidateChild(View arg1, android.graphics.Rect arg2){
  }
  public ViewParent invalidateChildInParent(int [] arg1, android.graphics.Rect arg2){
    return (ViewParent) null;
  }
  public final void offsetDescendantRectToMyCoords(View arg1, android.graphics.Rect arg2){
  }
  public final void offsetRectIntoDescendantCoords(View arg1, android.graphics.Rect arg2){
  }
  public void offsetChildrenTopAndBottom(int arg1){
  }
  public boolean getChildVisibleRect(View arg1, android.graphics.Rect arg2, android.graphics.Point arg3){
    return false;
  }
  protected boolean canAnimate(){
    return false;
  }
  public void startLayoutAnimation(){
  }
  public void scheduleLayoutAnimation(){
  }
  public void setLayoutAnimation(@com.francetelecom.rd.stubs.annotation.FieldSet("animationController") android.view.animation.LayoutAnimationController arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("animationController")
  public android.view.animation.LayoutAnimationController getLayoutAnimation(){
    return (android.view.animation.LayoutAnimationController) null;
  }
  public boolean isAnimationCacheEnabled(){
    return false;
  }
  public void setAnimationCacheEnabled(boolean arg1){
  }
  public boolean isAlwaysDrawnWithCacheEnabled(){
    return false;
  }
  public void setAlwaysDrawnWithCacheEnabled(boolean arg1){
  }
  protected boolean isChildrenDrawnWithCacheEnabled(){
    return false;
  }
  protected void setChildrenDrawnWithCacheEnabled(boolean arg1){
  }
  protected boolean isChildrenDrawingOrderEnabled(){
    return false;
  }
  protected void setChildrenDrawingOrderEnabled(boolean arg1){
  }
  public int getPersistentDrawingCache(){
    return 0;
  }
  public void setPersistentDrawingCache(int arg1){
  }
  protected boolean dispatchConsistencyCheck(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onConsistencyCheck(int arg1){
    return false;
  }
  public int indexOfChild(View arg1){
    return 0;
  }
  protected void measureChildren(int arg1, int arg2){
  }
  protected void measureChild(View arg1, int arg2, int arg3){
  }
  protected void measureChildWithMargins(View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static int getChildMeasureSpec(int arg1, int arg2, int arg3){
    return 0;
  }
  public void clearDisappearingChildren(){
  }
  public void startViewTransition(View arg1){
  }
  public void endViewTransition(View arg1){
  }
  public boolean gatherTransparentRegion(android.graphics.Region arg1){
    return false;
  }
  public void requestTransparentRegion(View arg1){
  }
  protected boolean fitSystemWindows(android.graphics.Rect arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("animationListener")
  public android.view.animation.Animation.AnimationListener getLayoutAnimationListener(){
    return (android.view.animation.Animation.AnimationListener) null;
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected int [] onCreateDrawableState(int arg1){
    return (int []) null;
  }
  public void setAddStatesFromChildren(boolean arg1){
  }
  public boolean addStatesFromChildren(){
    return false;
  }
  public void childDrawableStateChanged(View arg1){
  }
  public void setLayoutAnimationListener(@com.francetelecom.rd.stubs.annotation.FieldSet("animationListener") android.view.animation.Animation.AnimationListener arg1){
  }
  public void requestTransitionStart(android.animation.LayoutTransition arg1){
  }
  protected void resetResolvedLayoutDirection(){
  }
  protected void resetResolvedTextDirection(){
  }
}
