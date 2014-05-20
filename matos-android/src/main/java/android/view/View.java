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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.View", noAbstract = true)
public class View
  implements android.view.accessibility.AccessibilityEventSource, KeyEvent.Callback, android.graphics.drawable.Drawable.Callback, android.graphics.drawable.Drawable.Callback2
{
  // Classes

  public static interface OnLayoutChangeListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnLayoutChangeListener")
    public void onLayoutChange(View arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);
  }
  public static class DragShadowBuilder
  {
    // Constructors

    public DragShadowBuilder(View arg1){
    }
    public DragShadowBuilder(){
    }
    // Methods

    public final View getView(){
      return (View) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("DragShadowBuilder")
    public void onProvideShadowMetrics(android.graphics.Point arg1, android.graphics.Point arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("DragShadowBuilder")
    public void onDrawShadow(android.graphics.Canvas arg1){
    }
  }
  public static class MeasureSpec
  {
    // Fields

    public static final int UNSPECIFIED = 0;

    public static final int EXACTLY = 1073741824;

    public static final int AT_MOST = -2147483648;

    // Constructors

    public MeasureSpec(){
    }
    // Methods

    public static java.lang.String toString(int arg1){
      return (java.lang.String) null;
    }
    public static int getSize(int arg1){
      return 0;
    }
    public static int getMode(int arg1){
      return 0;
    }
    public static int makeMeasureSpec(int arg1, int arg2){
      return 0;
    }
  }
  public static interface OnKeyListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onKey")
    public boolean onKey(View arg1, int arg2, KeyEvent arg3);
  }
  public static interface OnTouchListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTouch")
    public boolean onTouch(View arg1, MotionEvent arg2);
  }
  public static interface OnHoverListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnHoverListener")
    public boolean onHover(View arg1, MotionEvent arg2);
  }
  public static interface OnGenericMotionListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnGenericMotionListener")
    public boolean onGenericMotion(View arg1, MotionEvent arg2);
  }
  public static interface OnLongClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onLongClick")
    public boolean onLongClick(View arg1);
  }
  public static interface OnDragListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnDragListener")
    public boolean onDrag(View arg1, DragEvent arg2);
  }
  public static interface OnFocusChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onFocusChange")
    public void onFocusChange(View arg1, boolean arg2);
  }
  public static interface OnClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onClick")
    public void onClick(View arg1);
  }
  public static interface OnCreateContextMenuListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateContextMenu")
    public void onCreateContextMenu(ContextMenu arg1, View arg2, ContextMenu.ContextMenuInfo arg3);
  }
  public static interface OnSystemUiVisibilityChangeListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("OnSystemUiVisibilityChangeListener")
    public void onSystemUiVisibilityChange(int arg1);
  }
  public static interface OnAttachStateChangeListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("OnAttachStateChangeListener")
    public void onViewAttachedToWindow(View arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("OnAttachStateChangeListener")
    public void onViewDetachedFromWindow(View arg1);
  }
  public static class BaseSavedState
    extends AbsSavedState  {
    // Fields

    public static final android.os.Parcelable.Creator<View.BaseSavedState> CREATOR = null;

    // Constructors

    public BaseSavedState(android.os.Parcel arg1){
      super((android.os.Parcelable) null);
    }
    public BaseSavedState(android.os.Parcelable arg1){
      super((android.os.Parcelable) null);
    }
  }
  public static class AccessibilityDelegate
  {
    // Constructors

    public AccessibilityDelegate(){
    }
    // Methods

    public boolean dispatchPopulateAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("AccessibilityDelegate")
    public void onInitializeAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("AccessibilityDelegate")
    public boolean onRequestSendAccessibilityEvent(ViewGroup arg1, View arg2, android.view.accessibility.AccessibilityEvent arg3){
      return false;
    }
    public void sendAccessibilityEvent(View arg1, int arg2){
    }
    public void sendAccessibilityEventUnchecked(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("AccessibilityDelegate")
    public void onPopulateAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("AccessibilityDelegate")
    public void onInitializeAccessibilityNodeInfo(View arg1, android.view.accessibility.AccessibilityNodeInfo arg2){
    }
  }
  // Fields

  protected static final java.lang.String VIEW_LOG_TAG = (java.lang.String) null;

  public static final int NO_ID = -1;

  public static final int VISIBLE = 0;

  public static final int INVISIBLE = 4;

  public static final int GONE = 8;

  public static final int DRAWING_CACHE_QUALITY_LOW = 524288;

  public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;

  public static final int DRAWING_CACHE_QUALITY_AUTO = 0;

  public static final int SCROLLBARS_INSIDE_OVERLAY = 0;

  public static final int SCROLLBARS_INSIDE_INSET = 16777216;

  public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;

  public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;

  public static final int KEEP_SCREEN_ON = 67108864;

  public static final int SOUND_EFFECTS_ENABLED = 134217728;

  public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;

  public static final int LAYOUT_DIRECTION_LTR = 0;

  public static final int LAYOUT_DIRECTION_RTL = 1073741824;

  public static final int LAYOUT_DIRECTION_INHERIT = -2147483648;

  public static final int LAYOUT_DIRECTION_LOCALE = -1073741824;

  public static final int FOCUSABLES_ALL = 0;

  public static final int FOCUSABLES_TOUCH_MODE = 1;

  public static final int FOCUS_BACKWARD = 1;

  public static final int FOCUS_FORWARD = 2;

  public static final int FOCUS_LEFT = 17;

  public static final int FOCUS_UP = 33;

  public static final int FOCUS_RIGHT = 66;

  public static final int FOCUS_DOWN = 130;

  public static final int MEASURED_SIZE_MASK = 16777215;

  public static final int MEASURED_STATE_MASK = -16777216;

  public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

  public static final int MEASURED_STATE_TOO_SMALL = 16777216;

  protected static final int [] EMPTY_STATE_SET = null;

  protected static final int [] ENABLED_STATE_SET = null;

  protected static final int [] FOCUSED_STATE_SET = null;

  protected static final int [] SELECTED_STATE_SET = null;

  protected static final int [] PRESSED_STATE_SET = null;

  protected static final int [] WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] ENABLED_FOCUSED_STATE_SET = null;

  protected static final int [] ENABLED_SELECTED_STATE_SET = null;

  protected static final int [] ENABLED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] FOCUSED_SELECTED_STATE_SET = null;

  protected static final int [] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] ENABLED_FOCUSED_SELECTED_STATE_SET = null;

  protected static final int [] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_SELECTED_STATE_SET = null;

  protected static final int [] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_FOCUSED_SELECTED_STATE_SET = null;

  protected static final int [] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_SELECTED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;

  protected static final int [] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;

  protected android.view.animation.Animation mCurrentAnimation;

  protected java.lang.Object mTag;

  public static final int OVER_SCROLL_ALWAYS = 0;

  public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

  public static final int OVER_SCROLL_NEVER = 2;

  public static final int SYSTEM_UI_FLAG_VISIBLE = 0;

  public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;

  public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;

  public static final int STATUS_BAR_HIDDEN = 1;

  public static final int STATUS_BAR_VISIBLE = 0;

  public static final int STATUS_BAR_DISABLE_EXPAND = 65536;

  public static final int STATUS_BAR_DISABLE_NOTIFICATION_ICONS = 131072;

  public static final int STATUS_BAR_DISABLE_NOTIFICATION_ALERTS = 262144;

  public static final int STATUS_BAR_DISABLE_NOTIFICATION_TICKER = 524288;

  public static final int STATUS_BAR_DISABLE_SYSTEM_INFO = 1048576;

  public static final int STATUS_BAR_DISABLE_HOME = 2097152;

  public static final int STATUS_BAR_DISABLE_BACK = 4194304;

  public static final int STATUS_BAR_DISABLE_CLOCK = 8388608;

  public static final int STATUS_BAR_DISABLE_RECENT = 16777216;

  @java.lang.Deprecated
  public static final int STATUS_BAR_DISABLE_NAVIGATION = 18874368;

  public static final int PUBLIC_STATUS_BAR_VISIBILITY_MASK = 65535;

  public static final int SYSTEM_UI_CLEARABLE_FLAGS = 3;

  public static final int FIND_VIEWS_WITH_TEXT = 1;

  public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;

  protected ViewParent mParent;

  protected ViewGroup.LayoutParams mLayoutParams;

  protected int mLeft;

  protected int mRight;

  protected int mTop;

  protected int mBottom;

  protected int mScrollX;

  protected int mScrollY;

  protected int mPaddingLeft;

  protected int mPaddingRight;

  protected int mPaddingTop;

  protected int mPaddingBottom;

  @ViewDebug.ExportedProperty(prefix = "", category = "padding", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  protected int mUserPaddingRight;

  @ViewDebug.ExportedProperty(prefix = "", category = "padding", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  protected int mUserPaddingBottom;

  @ViewDebug.ExportedProperty(prefix = "", category = "padding", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  protected int mUserPaddingLeft;

  protected View.OnFocusChangeListener mOnFocusChangeListener;

  protected View.OnClickListener mOnClickListener;

  protected View.OnLongClickListener mOnLongClickListener;

  protected View.OnCreateContextMenuListener mOnCreateContextMenuListener;

  protected android.content.Context mContext;

  public boolean mCachingFailed;

  public static final int DRAG_FLAG_GLOBAL = 1;

  public static final int SCROLLBAR_POSITION_DEFAULT = 0;

  public static final int SCROLLBAR_POSITION_LEFT = 1;

  public static final int SCROLLBAR_POSITION_RIGHT = 2;

  public static final int LAYER_TYPE_NONE = 0;

  public static final int LAYER_TYPE_SOFTWARE = 1;

  public static final int LAYER_TYPE_HARDWARE = 2;

  public static final int TEXT_DIRECTION_INHERIT = 0;

  public static final int TEXT_DIRECTION_FIRST_STRONG = 1;

  public static final int TEXT_DIRECTION_ANY_RTL = 2;

  public static final int TEXT_DIRECTION_LTR = 3;

  public static final int TEXT_DIRECTION_RTL = 4;

  protected static int DEFAULT_TEXT_DIRECTION;

  protected final InputEventConsistencyVerifier mInputEventConsistencyVerifier = (InputEventConsistencyVerifier) null;

  public static android.util.Property<View, java.lang.Float> ALPHA;

  public static android.util.Property<View, java.lang.Float> TRANSLATION_X;

  public static android.util.Property<View, java.lang.Float> TRANSLATION_Y;

  public static android.util.Property<View, java.lang.Float> X;

  public static android.util.Property<View, java.lang.Float> Y;

  public static android.util.Property<View, java.lang.Float> ROTATION;

  public static android.util.Property<View, java.lang.Float> ROTATION_X;

  public static android.util.Property<View, java.lang.Float> ROTATION_Y;

  public static android.util.Property<View, java.lang.Float> SCALE_X;

  public static android.util.Property<View, java.lang.Float> SCALE_Y;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View(android.content.Context arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
  }
  View(){
  }
  // Methods

  public final ViewParent getParent(){
    return (ViewParent) null;
  }
  public android.content.res.Resources getResources(){
    return (android.content.res.Resources) null;
  }
  public void debug(){
  }
  protected void debug(int arg1){
  }
  public final android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public int getId(){
    return 0;
  }
  public boolean isOpaque(){
    return false;
  }
  public android.os.Handler getHandler(){
    return (android.os.Handler) null;
  }
  public static View inflate(android.content.Context arg1, int arg2, ViewGroup arg3){
    return (View) null;
  }
  public final View findViewById(int arg1){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyLongPress(int arg1, KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyMultiple(int arg1, int arg2, KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyShortcut(int arg1, KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onGenericMotionEvent(MotionEvent arg1){
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
  public boolean hasWindowFocus(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyEvent(KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyShortcutEvent(KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchTouchEvent(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchTrackballEvent(MotionEvent arg1){
    return false;
  }
  public boolean dispatchGenericMotionEvent(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateContextMenu")
  protected void onCreateContextMenu(ContextMenu arg1){
  }
  public ActionMode startActionMode(@CallBackRegister("actionMode") ActionMode.Callback arg1){
    return (ActionMode) null;
  }
  public boolean post(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
    return false;
  }
  public boolean postDelayed(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2){
    return false;
  }
  public boolean removeCallbacks(java.lang.Runnable arg1){
    return false;
  }
  public java.lang.Object getTag(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getTag(int arg1){
    return (java.lang.Object) null;
  }
  public boolean isEnabled(){
    return false;
  }
  protected boolean setFrame(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAnimationStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAnimationEnd(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void setVisibility(int arg1){
  }
  public boolean hasFocus(){
    return false;
  }
  public boolean dispatchDragEvent(DragEvent arg1){
    return false;
  }
  public void dispatchSystemUiVisibilityChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchConfigurationChanged(android.content.res.Configuration arg1){
  }
  public void layout(int arg1, int arg2, int arg3, int arg4){
  }
  public View focusSearch(int arg1){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchUnhandledMove(View arg1, int arg2){
    return false;
  }
  public void clearFocus(){
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchWindowFocusChanged(boolean arg1){
  }
  public void addTouchables(java.util.ArrayList<View> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchDisplayHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchVisibilityChanged(View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchWindowVisibilityChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyEventPreIme(KeyEvent arg1){
    return false;
  }
  protected boolean dispatchHoverEvent(MotionEvent arg1){
    return false;
  }
  protected boolean hasHoveredChild(){
    return false;
  }
  protected boolean dispatchGenericPointerEvent(MotionEvent arg1){
    return false;
  }
  protected boolean dispatchGenericFocusedEvent(MotionEvent arg1){
    return false;
  }
  public final boolean requestFocus(){
    return false;
  }
  public final boolean requestFocus(int arg1){
    return false;
  }
  public boolean requestFocus(int arg1, android.graphics.Rect arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchStartTemporaryDetach(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void dispatchFinishTemporaryDetach(){
  }
  public void setPadding(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected void dispatchGetDisplayList(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchSetSelected(boolean arg1){
  }
  protected void dispatchSetActivated(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void dispatchSetPressed(boolean arg1){
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean dispatchConsistencyCheck(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onConsistencyCheck(int arg1){
    return false;
  }
  public boolean gatherTransparentRegion(android.graphics.Region arg1){
    return false;
  }
  protected boolean fitSystemWindows(android.graphics.Rect arg1){
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
  protected void resetResolvedLayoutDirection(){
  }
  protected void resetResolvedTextDirection(){
  }
  public void requestLayout(){
  }
  public boolean isLayoutRequested(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateContextMenu")
  public void createContextMenu(ContextMenu arg1){
  }
  public void setKeepScreenOn(boolean arg1){
  }
  public float getX(){
    return 0.0f;
  }
  public float getY(){
    return 0.0f;
  }
  public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  public KeyEvent.DispatcherState getKeyDispatcherState(){
    return (KeyEvent.DispatcherState) null;
  }
  public void setOnCreateContextMenuListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateContextMenu") View.OnCreateContextMenuListener arg1){
  }
  public boolean showContextMenu(){
    return false;
  }
  public boolean showContextMenu(float arg1, float arg2, int arg3){
    return false;
  }
  public void setId(int arg1){
  }
  public void setTag(java.lang.Object arg1){
  }
  public void setTag(int arg1, java.lang.Object arg2){
  }
  public final void setTop(int arg1){
  }
  public void invalidate(android.graphics.Rect arg1){
  }
  public void invalidate(int arg1, int arg2, int arg3, int arg4){
  }
  public void invalidate(){
  }
  public void setBackgroundDrawable(android.graphics.drawable.Drawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.onClick(this);")
  public void setOnClickListener(View.OnClickListener arg1){
  }
  public int getPaddingTop(){
    return 0;
  }
  public int getPaddingBottom(){
    return 0;
  }
  public int getPaddingLeft(){
    return 0;
  }
  public int getPaddingRight(){
    return 0;
  }
  public ViewGroup.LayoutParams getLayoutParams(){
    return (ViewGroup.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final void measure(int arg1, int arg2){
  }
  public final int getMeasuredHeight(){
    return 0;
  }
  protected final void setMeasuredDimension(int arg1, int arg2){
  }
  public final int getWidth(){
    return 0;
  }
  public void setTranslationX(float arg1){
  }
  public void setScaleY(float arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public int getVisibility(){
    return 0;
  }
  public void setContentDescription(java.lang.CharSequence arg1){
  }
  public void setAlpha(float arg1){
  }
  public final int getMeasuredWidth(){
    return 0;
  }
  public ViewPropertyAnimator animate(){
    return (ViewPropertyAnimator) null;
  }
  public boolean isFocused(){
    return false;
  }
  public boolean isRootNamespace(){
    return false;
  }
  public final boolean isFocusable(){
    return false;
  }
  public void refreshDrawableState(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onFilterTouchEventForSecurity(MotionEvent arg1){
    return false;
  }
  public android.view.animation.Animation getAnimation(){
    return (android.view.animation.Animation) null;
  }
  public void setDrawingCacheEnabled(boolean arg1){
  }
  public boolean isHardwareAccelerated(){
    return false;
  }
  public void buildDrawingCache(){
  }
  public void buildDrawingCache(boolean arg1){
  }
  public long getDrawingTime(){
    return 0l;
  }
  public DisplayList getDisplayList(){
    return (DisplayList) null;
  }
  public int getLayerType(){
    return 0;
  }
  public final int getHeight(){
    return 0;
  }
  public float getAlpha(){
    return 0.0f;
  }
  public void computeScroll(){
  }
  public android.graphics.Bitmap getDrawingCache(){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap getDrawingCache(boolean arg1){
    return (android.graphics.Bitmap) null;
  }
  public boolean canHaveDisplayList(){
    return false;
  }
  public android.graphics.Matrix getMatrix(){
    return (android.graphics.Matrix) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onSetAlpha(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void draw(android.graphics.Canvas arg1){
  }
  public void setSelected(boolean arg1){
  }
  public void setActivated(boolean arg1){
  }
  public void setPressed(boolean arg1){
  }
  public final View findViewWithTag(java.lang.Object arg1){
    return (View) null;
  }
  public final View findViewByPredicate(com.android.internal.util.Predicate<View> arg1){
    return (View) null;
  }
  public void setLayoutParams(ViewGroup.LayoutParams arg1){
  }
  public void setAnimation(android.view.animation.Animation arg1){
  }
  public int getSolidColor(){
    return 0;
  }
  protected static java.lang.String debugIndent(int arg1){
    return (java.lang.String) null;
  }
  public void clearAnimation(){
  }
  public final int [] getDrawableState(){
    return (int []) null;
  }
  protected static int [] mergeDrawableStates(int [] arg1, int [] arg2){
    return (int []) null;
  }
  @ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {@ViewDebug.IntToString(from = 0, to = "LTR"), @ViewDebug.IntToString(from = 1073741824, to = "RTL"), @ViewDebug.IntToString(from = -2147483648, to = "INHERIT"), @ViewDebug.IntToString(from = -1073741824, to = "LOCALE")}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public int getLayoutDirection(){
    return 0;
  }
  public int getTextDirection(){
    return 0;
  }
  public void setScrollContainer(boolean arg1){
  }
  protected void initializeFadingEdge(android.content.res.TypedArray arg1){
  }
  public int getVerticalFadingEdgeLength(){
    return 0;
  }
  public void setFadingEdgeLength(int arg1){
  }
  public int getHorizontalFadingEdgeLength(){
    return 0;
  }
  public int getVerticalScrollbarWidth(){
    return 0;
  }
  protected int getHorizontalScrollbarHeight(){
    return 0;
  }
  protected void initializeScrollbars(android.content.res.TypedArray arg1){
  }
  public void setVerticalScrollbarPosition(int arg1){
  }
  public int getVerticalScrollbarPosition(){
    return 0;
  }
  public void setOnFocusChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onFocusChange") View.OnFocusChangeListener arg1){
  }
  public void addOnLayoutChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnLayoutChangeListener") View.OnLayoutChangeListener arg1){
  }
  public void removeOnLayoutChangeListener(View.OnLayoutChangeListener arg1){
  }
  public void addOnAttachStateChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnAttachStateChangeListener") View.OnAttachStateChangeListener arg1){
  }
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener arg1){
  }
  public View.OnFocusChangeListener getOnFocusChangeListener(){
    return (View.OnFocusChangeListener) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.onLongClick(this);")
  public void setOnLongClickListener(View.OnLongClickListener arg1){
  }
  public boolean performClick(){
    return false;
  }
  public boolean performLongClick(){
    return false;
  }
  protected boolean performButtonActionOnTouchDown(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.onKey(this, com.francetelecom.rd.stubs.Generator.intValue(), new KeyEvent(com.francetelecom.rd.stubs.Generator.token));")
  public void setOnKeyListener(View.OnKeyListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.onTouch(this, new MotionEvent(com.francetelecom.rd.stubs.Generator.token));")
  public void setOnTouchListener(View.OnTouchListener arg1){
  }
  public void setOnGenericMotionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnGenericMotionListener") View.OnGenericMotionListener arg1){
  }
  public void setOnHoverListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnHoverListener") View.OnHoverListener arg1){
  }
  public void setOnDragListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnDragListener") View.OnDragListener arg1){
  }
  public boolean requestRectangleOnScreen(android.graphics.Rect arg1){
    return false;
  }
  public boolean requestRectangleOnScreen(android.graphics.Rect arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  public void sendAccessibilityEvent(int arg1){
  }
  public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(){
    return (android.view.accessibility.AccessibilityNodeInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  public void setAccessibilityDelegate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("AccessibilityDelegate") View.AccessibilityDelegate arg1){
  }
  public int getAccessibilityViewId(){
    return 0;
  }
  public int getAccessibilityWindowId(){
    return 0;
  }
  public java.lang.CharSequence getContentDescription(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusLost(){
  }
  public int getDrawingCacheQuality(){
    return 0;
  }
  public void setDrawingCacheQuality(int arg1){
  }
  public boolean getKeepScreenOn(){
    return false;
  }
  public int getNextFocusLeftId(){
    return 0;
  }
  public void setNextFocusLeftId(int arg1){
  }
  public int getNextFocusRightId(){
    return 0;
  }
  public void setNextFocusRightId(int arg1){
  }
  public int getNextFocusUpId(){
    return 0;
  }
  public void setNextFocusUpId(int arg1){
  }
  public int getNextFocusDownId(){
    return 0;
  }
  public void setNextFocusDownId(int arg1){
  }
  public int getNextFocusForwardId(){
    return 0;
  }
  public void setNextFocusForwardId(int arg1){
  }
  public boolean isShown(){
    return false;
  }
  public void setFitsSystemWindows(boolean arg1){
  }
  public boolean fitsSystemWindows(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void setEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void setFocusable(boolean arg1){
  }
  public void setFocusableInTouchMode(boolean arg1){
  }
  public void setSoundEffectsEnabled(boolean arg1){
  }
  public boolean isSoundEffectsEnabled(){
    return false;
  }
  public void setHapticFeedbackEnabled(boolean arg1){
  }
  public boolean isHapticFeedbackEnabled(){
    return false;
  }
  @RemotableViewMethod
  public void setLayoutDirection(int arg1){
  }
  @ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {@ViewDebug.IntToString(from = 0, to = "RESOLVED_DIRECTION_LTR"), @ViewDebug.IntToString(from = 1073741824, to = "RESOLVED_DIRECTION_RTL")}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public int getResolvedLayoutDirection(){
    return 0;
  }
  public int getResolvedLayoutDirection(android.graphics.drawable.Drawable arg1){
    return 0;
  }
  @ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public boolean isLayoutRtl(){
    return false;
  }
  public void setWillNotDraw(boolean arg1){
  }
  public boolean willNotDraw(){
    return false;
  }
  public void setWillNotCacheDrawing(boolean arg1){
  }
  public boolean willNotCacheDrawing(){
    return false;
  }
  public boolean isClickable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void setClickable(boolean arg1){
  }
  public boolean isLongClickable(){
    return false;
  }
  public void setLongClickable(boolean arg1){
  }
  public boolean isPressed(){
    return false;
  }
  public boolean isSaveEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void setSaveEnabled(boolean arg1){
  }
  public boolean getFilterTouchesWhenObscured(){
    return false;
  }
  public void setFilterTouchesWhenObscured(boolean arg1){
  }
  public boolean isSaveFromParentEnabled(){
    return false;
  }
  public void setSaveFromParentEnabled(boolean arg1){
  }
  public final boolean isFocusableInTouchMode(){
    return false;
  }
  public java.util.ArrayList<View> getFocusables(int arg1){
    return (java.util.ArrayList) null;
  }
  public java.util.ArrayList<View> getTouchables(){
    return (java.util.ArrayList) null;
  }
  public final boolean requestFocusFromTouch(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartTemporaryDetach(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishTemporaryDetach(){
  }
  public final boolean dispatchPointerEvent(MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVisibilityChanged(View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDisplayHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onWindowVisibilityChanged(int arg1){
  }
  public int getWindowVisibility(){
    return 0;
  }
  public void getWindowVisibleDisplayFrame(android.graphics.Rect arg1){
  }
  public boolean isInTouchMode(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyPreIme(int arg1, KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onCheckIsTextEditor(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo arg1){
    return (android.view.inputmethod.InputConnection) null;
  }
  public boolean checkInputConnectionProxy(View arg1){
    return false;
  }
  protected ContextMenu.ContextMenuInfo getContextMenuInfo(){
    return (ContextMenu.ContextMenuInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onHoverEvent(MotionEvent arg1){
    return false;
  }
  @ViewDebug.ExportedProperty(prefix = "", category = "", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public boolean isHovered(){
    return false;
  }
  public void setHovered(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHoverChanged(boolean arg1){
  }
  public boolean isInScrollingContainer(){
    return false;
  }
  public void cancelLongPress(){
  }
  public void setTouchDelegate(TouchDelegate arg1){
  }
  public TouchDelegate getTouchDelegate(){
    return (TouchDelegate) null;
  }
  public void bringToFront(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onScrollChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void setScrollX(int arg1){
  }
  public void setScrollY(int arg1){
  }
  public final int getScrollX(){
    return 0;
  }
  public final int getScrollY(){
    return 0;
  }
  public void getDrawingRect(android.graphics.Rect arg1){
  }
  public final int getMeasuredWidthAndState(){
    return 0;
  }
  public final int getMeasuredHeightAndState(){
    return 0;
  }
  public final int getMeasuredState(){
    return 0;
  }
  public void setCameraDistance(float arg1){
  }
  public float getRotation(){
    return 0.0f;
  }
  public void setRotation(float arg1){
  }
  public float getRotationY(){
    return 0.0f;
  }
  public void setRotationY(float arg1){
  }
  public float getRotationX(){
    return 0.0f;
  }
  public void setRotationX(float arg1){
  }
  public float getScaleX(){
    return 0.0f;
  }
  public void setScaleX(float arg1){
  }
  public float getScaleY(){
    return 0.0f;
  }
  public float getPivotX(){
    return 0.0f;
  }
  public void setPivotX(float arg1){
  }
  public float getPivotY(){
    return 0.0f;
  }
  public void setPivotY(float arg1){
  }
  public final int getTop(){
    return 0;
  }
  public final int getBottom(){
    return 0;
  }
  public boolean isDirty(){
    return false;
  }
  public final void setBottom(int arg1){
  }
  public final int getLeft(){
    return 0;
  }
  public final void setLeft(int arg1){
  }
  public final int getRight(){
    return 0;
  }
  public final void setRight(int arg1){
  }
  public void setX(float arg1){
  }
  public void setY(float arg1){
  }
  public float getTranslationX(){
    return 0.0f;
  }
  public float getTranslationY(){
    return 0.0f;
  }
  public void setTranslationY(float arg1){
  }
  public void setFastTranslationX(float arg1){
  }
  public void setFastTranslationY(float arg1){
  }
  public void setFastX(float arg1){
  }
  public void setFastY(float arg1){
  }
  public void setFastScaleX(float arg1){
  }
  public void setFastScaleY(float arg1){
  }
  public void setFastAlpha(float arg1){
  }
  public void setFastRotationY(float arg1){
  }
  public void getHitRect(android.graphics.Rect arg1){
  }
  public void getFocusedRect(android.graphics.Rect arg1){
  }
  public boolean getGlobalVisibleRect(android.graphics.Rect arg1, android.graphics.Point arg2){
    return false;
  }
  public final boolean getGlobalVisibleRect(android.graphics.Rect arg1){
    return false;
  }
  public final boolean getLocalVisibleRect(android.graphics.Rect arg1){
    return false;
  }
  public void offsetTopAndBottom(int arg1){
  }
  public void offsetLeftAndRight(int arg1){
  }
  public void scrollTo(int arg1, int arg2){
  }
  public void scrollBy(int arg1, int arg2){
  }
  protected boolean awakenScrollBars(){
    return false;
  }
  protected boolean awakenScrollBars(int arg1){
    return false;
  }
  protected boolean awakenScrollBars(int arg1, boolean arg2){
    return false;
  }
  public void fastInvalidate(){
  }
  protected void invalidateParentCaches(){
  }
  protected void invalidateParentIfNeeded(){
  }
  protected void computeOpaqueFlags(){
  }
  protected boolean hasOpaqueScrollbars(){
    return false;
  }
  public void postInvalidate(){
  }
  public void postInvalidate(int arg1, int arg2, int arg3, int arg4){
  }
  public void postInvalidateDelayed(long arg1){
  }
  public void postInvalidateDelayed(long arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean isHorizontalFadingEdgeEnabled(){
    return false;
  }
  public void setHorizontalFadingEdgeEnabled(boolean arg1){
  }
  public boolean isVerticalFadingEdgeEnabled(){
    return false;
  }
  public void setVerticalFadingEdgeEnabled(boolean arg1){
  }
  protected float getTopFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getBottomFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getLeftFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getRightFadingEdgeStrength(){
    return 0.0f;
  }
  public boolean isHorizontalScrollBarEnabled(){
    return false;
  }
  public void setHorizontalScrollBarEnabled(boolean arg1){
  }
  public boolean isVerticalScrollBarEnabled(){
    return false;
  }
  public void setVerticalScrollBarEnabled(boolean arg1){
  }
  protected void recomputePadding(){
  }
  public void setScrollbarFadingEnabled(boolean arg1){
  }
  public boolean isScrollbarFadingEnabled(){
    return false;
  }
  public void setScrollBarStyle(int arg1){
  }
  public int getScrollBarStyle(){
    return 0;
  }
  protected int computeHorizontalScrollRange(){
    return 0;
  }
  protected int computeHorizontalScrollOffset(){
    return 0;
  }
  protected int computeHorizontalScrollExtent(){
    return 0;
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
  public boolean canScrollHorizontally(int arg1){
    return false;
  }
  public boolean canScrollVertically(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected final void onDrawScrollBars(android.graphics.Canvas arg1){
  }
  protected boolean isVerticalScrollBarHidden(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDrawHorizontalScrollBar(android.graphics.Canvas arg1, android.graphics.drawable.Drawable arg2, int arg3, int arg4, int arg5, int arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDrawVerticalScrollBar(android.graphics.Canvas arg1, android.graphics.drawable.Drawable arg2, int arg3, int arg4, int arg5, int arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  protected void resolvePadding(){
  }
  protected boolean canResolveLayoutDirection(){
    return false;
  }
  protected static boolean isLayoutDirectionRtl(java.util.Locale arg1){
    return false;
  }
  protected int getWindowAttachCount(){
    return 0;
  }
  public android.os.IBinder getWindowToken(){
    return (android.os.IBinder) null;
  }
  public android.os.IBinder getApplicationWindowToken(){
    return (android.os.IBinder) null;
  }
  public void setDuplicateParentStateEnabled(boolean arg1){
  }
  public boolean isDuplicateParentStateEnabled(){
    return false;
  }
  public void setLayerType(int arg1, android.graphics.Paint arg2){
  }
  public void buildLayer(){
  }
  public boolean isDrawingCacheEnabled(){
    return false;
  }
  public void outputDirtyFlags(java.lang.String arg1, boolean arg2, int arg3){
  }
  public void destroyDrawingCache(){
  }
  public void setDrawingCacheBackgroundColor(int arg1){
  }
  public int getDrawingCacheBackgroundColor(){
    return 0;
  }
  public boolean isInEditMode(){
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
  protected int getFadeTop(boolean arg1){
    return 0;
  }
  protected int getFadeHeight(boolean arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFinishInflate(){
  }
  public void invalidateDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void scheduleDrawable(android.graphics.drawable.Drawable arg1, java.lang.Runnable arg2, long arg3){
  }
  public void unscheduleDrawable(android.graphics.drawable.Drawable arg1, java.lang.Runnable arg2){
  }
  public void unscheduleDrawable(android.graphics.drawable.Drawable arg1){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public void setBackgroundColor(int arg1){
  }
  public void setBackgroundResource(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.graphics.drawable.Drawable getBackground(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setPaddingRelative(int arg1, int arg2, int arg3, int arg4){
  }
  public int getPaddingStart(){
    return 0;
  }
  public int getPaddingEnd(){
    return 0;
  }
  public boolean isPaddingRelative(){
    return false;
  }
  public boolean isSelected(){
    return false;
  }
  @ViewDebug.ExportedProperty(prefix = "", category = "", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public boolean isActivated(){
    return false;
  }
  public ViewTreeObserver getViewTreeObserver(){
    return (ViewTreeObserver) null;
  }
  public View getRootView(){
    return (View) null;
  }
  public void getLocationOnScreen(int [] arg1){
  }
  public void getLocationInWindow(int [] arg1){
  }
  public final View findViewByPredicateInsideOut(View arg1, com.android.internal.util.Predicate<View> arg2){
    return (View) null;
  }
  public void setIsRootNamespace(boolean arg1){
  }
  public void setTagInternal(int arg1, java.lang.Object arg2){
  }
  public int getBaseline(){
    return 0;
  }
  public void forceLayout(){
  }
  public static int combineMeasuredStates(int arg1, int arg2){
    return 0;
  }
  public static int resolveSize(int arg1, int arg2){
    return 0;
  }
  public static int resolveSizeAndState(int arg1, int arg2, int arg3){
    return 0;
  }
  public static int getDefaultSize(int arg1, int arg2){
    return 0;
  }
  protected int getSuggestedMinimumHeight(){
    return 0;
  }
  protected int getSuggestedMinimumWidth(){
    return 0;
  }
  public void setMinimumHeight(int arg1){
  }
  public void setMinimumWidth(int arg1){
  }
  public void startAnimation(android.view.animation.Animation arg1){
  }
  public void playSoundEffect(int arg1){
  }
  public boolean performHapticFeedback(int arg1){
    return false;
  }
  public boolean performHapticFeedback(int arg1, int arg2){
    return false;
  }
  public void setSystemUiVisibility(int arg1){
  }
  public int getSystemUiVisibility(){
    return 0;
  }
  public void setOnSystemUiVisibilityChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnSystemUiVisibilityChangeListener") View.OnSystemUiVisibilityChangeListener arg1){
  }
  public final boolean startDrag(android.content.ClipData arg1, @com.francetelecom.rd.stubs.annotation.CallBack("DragShadowBuilder") View.DragShadowBuilder arg2, java.lang.Object arg3, int arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onDragEvent(DragEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseSystemDialogs(java.lang.String arg1){
  }
  public void applyDrawableToTransparentRegion(android.graphics.drawable.Drawable arg1, android.graphics.Region arg2){
  }
  protected boolean overScrollBy(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onOverScrolled(int arg1, int arg2, boolean arg3, boolean arg4){
  }
  public int getOverScrollMode(){
    return 0;
  }
  public void setOverScrollMode(int arg1){
  }
  protected float getVerticalScrollFactor(){
    return 0.0f;
  }
  protected float getHorizontalScrollFactor(){
    return 0.0f;
  }
  public void setTextDirection(int arg1){
  }
  public int getResolvedTextDirection(){
    return 0;
  }
  protected void resolveTextDirection(){
  }
  public void hackTurnOffWindowResizeAnim(boolean arg1){
  }
}
