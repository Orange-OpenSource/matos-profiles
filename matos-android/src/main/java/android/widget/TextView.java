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
public class TextView
  extends android.view.View  implements android.view.ViewTreeObserver.OnPreDrawListener
{
  // Classes

  public static interface OnEditorActionListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onEditorAction")
    public boolean onEditorAction(TextView arg1, int arg2, android.view.KeyEvent arg3);
  }
  public static class SavedState
    extends android.view.View.BaseSavedState  {
    // Fields

    public static final android.os.Parcelable.Creator<TextView.SavedState> CREATOR = null;

    // Constructors

    SavedState(android.os.Parcelable arg1){
      super((android.os.Parcel) null);
    }
    private SavedState(android.os.Parcel arg1){
      super((android.os.Parcel) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
  }
  public static enum BufferType
  {
    // Enum Constants

    NORMAL()
, SPANNABLE()
, EDITABLE()
;
    // Fields

    // Constructors

    private BufferType(){
    }
    // Methods

  }
  // Fields

  protected android.text.Layout mLayout;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public final void append(java.lang.CharSequence arg1){
  }
  public void append(java.lang.CharSequence arg1, int arg2, int arg3){
  }
  public int length(){
    return 0;
  }
  public void debug(int arg1){
  }
  public void setError(java.lang.CharSequence arg1){
  }
  public void setError(java.lang.CharSequence arg1, android.graphics.drawable.Drawable arg2){
  }
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
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyShortcut(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCreateContextMenu(android.view.ContextMenu arg1){
  }
  public java.lang.CharSequence getText(){
    return (java.lang.CharSequence) null;
  }
  protected boolean setFrame(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void findViewsWithText(java.util.ArrayList<android.view.View> arg1, java.lang.CharSequence arg2, int arg3){
  }
  public void dispatchFinishTemporaryDetach(){
  }
  public void setPadding(int arg1, int arg2, int arg3, int arg4){
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
  public void computeScroll(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onSetAlpha(int arg1){
    return false;
  }
  public void setSelected(boolean arg1){
  }
  public boolean performLongClick(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  public void sendAccessibilityEvent(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  public void setEnabled(boolean arg1){
  }
  public int getResolvedLayoutDirection(android.graphics.drawable.Drawable arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartTemporaryDetach(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishTemporaryDetach(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVisibilityChanged(android.view.View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyPreIme(int arg1, android.view.KeyEvent arg2){
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
  public void cancelLongPress(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onScrollChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void getFocusedRect(android.graphics.Rect arg1){
  }
  protected float getLeftFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getRightFadingEdgeStrength(){
    return 0.0f;
  }
  protected int computeHorizontalScrollRange(){
    return 0;
  }
  protected int computeVerticalScrollRange(){
    return 0;
  }
  protected int computeVerticalScrollExtent(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
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
  public void invalidateDrawable(android.graphics.drawable.Drawable arg1){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public int getBaseline(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onDragEvent(android.view.DragEvent arg1){
    return false;
  }
  protected void resolveTextDirection(){
  }
  public void setGravity(int arg1){
  }
  public final void setText(java.lang.CharSequence arg1){
  }
  public void setText(java.lang.CharSequence arg1, TextView.BufferType arg2){
  }
  public final void setText(char [] arg1, int arg2, int arg3){
  }
  public final void setText(int arg1){
  }
  public final void setText(int arg1, TextView.BufferType arg2){
  }
  public final android.text.Layout getLayout(){
    return (android.text.Layout) null;
  }
  protected void onTextChanged(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  protected boolean getDefaultEditable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("movementMethod")
  protected android.text.method.MovementMethod getDefaultMovementMethod(){
    return (android.text.method.MovementMethod) null;
  }
  public void setEllipsize(android.text.TextUtils.TruncateAt arg1){
  }
  public void beginBatchEdit(){
  }
  public void endBatchEdit(){
  }
  public void setExtractedText(android.view.inputmethod.ExtractedText arg1){
  }
  public void setTextAppearance(android.content.Context arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPreDraw(){
    return false;
  }
  public int getGravity(){
    return 0;
  }
  public int getOffsetForPosition(float arg1, float arg2){
    return 0;
  }
  public void clearComposingText(){
  }
  public java.lang.CharSequence getError(){
    return (java.lang.CharSequence) null;
  }
  public boolean onTextContextMenuItem(int arg1){
    return false;
  }
  public void setCompoundDrawablesWithIntrinsicBounds(int arg1, int arg2, int arg3, int arg4){
  }
  public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable arg1, android.graphics.drawable.Drawable arg2, android.graphics.drawable.Drawable arg3, android.graphics.drawable.Drawable arg4){
  }
  public void setTypeface(android.graphics.Typeface arg1, int arg2){
  }
  public void setTypeface(android.graphics.Typeface arg1){
  }
  public android.text.Editable getEditableText(){
    return (android.text.Editable) null;
  }
  public int getLineHeight(){
    return 0;
  }
  public final android.text.method.KeyListener getKeyListener(){
    return (android.text.method.KeyListener) null;
  }
  public void setKeyListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.text.method.KeyListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("movementMethod")
  public final android.text.method.MovementMethod getMovementMethod(){
    return (android.text.method.MovementMethod) null;
  }
  public final void setMovementMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("movementMethod") @com.francetelecom.rd.stubs.annotation.CallBackRegister("MovementMethod") android.text.method.MovementMethod arg1){
  }
  public final android.text.method.TransformationMethod getTransformationMethod(){
    return (android.text.method.TransformationMethod) null;
  }
  public final void setTransformationMethod(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onFocusChanged") android.text.method.TransformationMethod arg1){
  }
  public int getCompoundPaddingTop(){
    return 0;
  }
  public int getCompoundPaddingBottom(){
    return 0;
  }
  public int getCompoundPaddingLeft(){
    return 0;
  }
  public int getCompoundPaddingRight(){
    return 0;
  }
  public int getCompoundPaddingStart(){
    return 0;
  }
  public int getCompoundPaddingEnd(){
    return 0;
  }
  public int getExtendedPaddingTop(){
    return 0;
  }
  public int getExtendedPaddingBottom(){
    return 0;
  }
  public int getTotalPaddingLeft(){
    return 0;
  }
  public int getTotalPaddingRight(){
    return 0;
  }
  public int getTotalPaddingStart(){
    return 0;
  }
  public int getTotalPaddingEnd(){
    return 0;
  }
  public int getTotalPaddingTop(){
    return 0;
  }
  public int getTotalPaddingBottom(){
    return 0;
  }
  public void setCompoundDrawables(android.graphics.drawable.Drawable arg1, android.graphics.drawable.Drawable arg2, android.graphics.drawable.Drawable arg3, android.graphics.drawable.Drawable arg4){
  }
  public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable arg1, android.graphics.drawable.Drawable arg2, android.graphics.drawable.Drawable arg3, android.graphics.drawable.Drawable arg4){
  }
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int arg1, int arg2, int arg3, int arg4){
  }
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable arg1, android.graphics.drawable.Drawable arg2, android.graphics.drawable.Drawable arg3, android.graphics.drawable.Drawable arg4){
  }
  public android.graphics.drawable.Drawable [] getCompoundDrawables(){
    return (android.graphics.drawable.Drawable []) null;
  }
  public android.graphics.drawable.Drawable [] getCompoundDrawablesRelative(){
    return (android.graphics.drawable.Drawable []) null;
  }
  public void setCompoundDrawablePadding(int arg1){
  }
  public int getCompoundDrawablePadding(){
    return 0;
  }
  public final int getAutoLinkMask(){
    return 0;
  }
  public float getTextSize(){
    return 0.0f;
  }
  public void setTextSize(float arg1){
  }
  public void setTextSize(int arg1, float arg2){
  }
  public float getTextScaleX(){
    return 0.0f;
  }
  public void setTextScaleX(float arg1){
  }
  public android.graphics.Typeface getTypeface(){
    return (android.graphics.Typeface) null;
  }
  public void setTextColor(int arg1){
  }
  public void setTextColor(android.content.res.ColorStateList arg1){
  }
  public final android.content.res.ColorStateList getTextColors(){
    return (android.content.res.ColorStateList) null;
  }
  public static android.content.res.ColorStateList getTextColors(android.content.Context arg1, android.content.res.TypedArray arg2){
    return (android.content.res.ColorStateList) null;
  }
  public final int getCurrentTextColor(){
    return 0;
  }
  public void setHighlightColor(int arg1){
  }
  public void setShadowLayer(float arg1, float arg2, float arg3, int arg4){
  }
  public android.text.TextPaint getPaint(){
    return (android.text.TextPaint) null;
  }
  public final void setAutoLinkMask(int arg1){
  }
  public final void setLinksClickable(boolean arg1){
  }
  public final boolean getLinksClickable(){
    return false;
  }
  public android.text.style.URLSpan [] getUrls(){
    return (android.text.style.URLSpan []) null;
  }
  public final void setHintTextColor(int arg1){
  }
  public final void setHintTextColor(android.content.res.ColorStateList arg1){
  }
  public final android.content.res.ColorStateList getHintTextColors(){
    return (android.content.res.ColorStateList) null;
  }
  public final int getCurrentHintTextColor(){
    return 0;
  }
  public final void setLinkTextColor(int arg1){
  }
  public final void setLinkTextColor(android.content.res.ColorStateList arg1){
  }
  public final android.content.res.ColorStateList getLinkTextColors(){
    return (android.content.res.ColorStateList) null;
  }
  public int getPaintFlags(){
    return 0;
  }
  public void setPaintFlags(int arg1){
  }
  public void setHorizontallyScrolling(boolean arg1){
  }
  public void setMinLines(int arg1){
  }
  public void setMinHeight(int arg1){
  }
  public void setMaxLines(int arg1){
  }
  public void setMaxHeight(int arg1){
  }
  public void setLines(int arg1){
  }
  public void setHeight(int arg1){
  }
  public void setMinEms(int arg1){
  }
  public void setMinWidth(int arg1){
  }
  public void setMaxEms(int arg1){
  }
  public void setMaxWidth(int arg1){
  }
  public void setEms(int arg1){
  }
  public void setWidth(int arg1){
  }
  public void setLineSpacing(float arg1, float arg2){
  }
  public void setFreezesText(boolean arg1){
  }
  public boolean getFreezesText(){
    return false;
  }
  public final void setEditableFactory(android.text.Editable.Factory arg1){
  }
  public final void setSpannableFactory(android.text.Spannable.Factory arg1){
  }
  public final void setTextKeepState(java.lang.CharSequence arg1){
  }
  public final void setTextKeepState(java.lang.CharSequence arg1, TextView.BufferType arg2){
  }
  public final void setHint(java.lang.CharSequence arg1){
  }
  public final void setHint(int arg1){
  }
  public java.lang.CharSequence getHint(){
    return (java.lang.CharSequence) null;
  }
  public void setInputType(int arg1){
  }
  public void setRawInputType(int arg1){
  }
  public int getInputType(){
    return 0;
  }
  public void setImeOptions(int arg1){
  }
  public int getImeOptions(){
    return 0;
  }
  public void setImeActionLabel(java.lang.CharSequence arg1, int arg2){
  }
  public java.lang.CharSequence getImeActionLabel(){
    return (java.lang.CharSequence) null;
  }
  public int getImeActionId(){
    return 0;
  }
  public void setOnEditorActionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onEditorAction") TextView.OnEditorActionListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onEditorAction(int arg1){
  }
  public void setPrivateImeOptions(java.lang.String arg1){
  }
  public java.lang.String getPrivateImeOptions(){
    return (java.lang.String) null;
  }
  public void setInputExtras(int arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public android.os.Bundle getInputExtras(boolean arg1){
    return (android.os.Bundle) null;
  }
  public void setFilters(android.text.InputFilter [] arg1){
  }
  public android.text.InputFilter [] getFilters(){
    return (android.text.InputFilter []) null;
  }
  public boolean isTextSelectable(){
    return false;
  }
  public void setTextIsSelectable(boolean arg1){
  }
  public int getLineCount(){
    return 0;
  }
  public int getLineBounds(int arg1, android.graphics.Rect arg2){
    return 0;
  }
  public void resetErrorChangedFlag(){
  }
  public void hideErrorIfUnchanged(){
  }
  public boolean extractText(android.view.inputmethod.ExtractedTextRequest arg1, android.view.inputmethod.ExtractedText arg2){
    return false;
  }
  public void setExtracting(android.view.inputmethod.ExtractedTextRequest arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCommitCompletion(android.view.inputmethod.CompletionInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCommitCorrection(android.view.inputmethod.CorrectionInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBeginBatchEdit(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onEndBatchEdit(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPrivateIMECommand(java.lang.String arg1, android.os.Bundle arg2){
    return false;
  }
  protected void makeNewLayout(int arg1, int arg2, android.text.BoringLayout.Metrics arg3, android.text.BoringLayout.Metrics arg4, int arg5, boolean arg6){
  }
  public void setIncludeFontPadding(boolean arg1){
  }
  public boolean bringPointIntoView(int arg1){
    return false;
  }
  public boolean moveCursorToVisibleOffset(){
    return false;
  }
  public int getSelectionStart(){
    return 0;
  }
  public int getSelectionEnd(){
    return 0;
  }
  public boolean hasSelection(){
    return false;
  }
  public void setSingleLine(){
  }
  public void setSingleLine(boolean arg1){
  }
  public void setAllCaps(boolean arg1){
  }
  public void setMarqueeRepeatLimit(int arg1){
  }
  public android.text.TextUtils.TruncateAt getEllipsize(){
    return (android.text.TextUtils.TruncateAt) null;
  }
  public void setSelectAllOnFocus(boolean arg1){
  }
  public void setCursorVisible(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSelectionChanged(int arg1, int arg2){
  }
  public void addTextChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.text.TextWatcher arg1){
  }
  public void removeTextChangedListener(android.text.TextWatcher arg1){
  }
  public boolean didTouchFocusSelect(){
    return false;
  }
  public boolean shouldIgnoreActionUpEvent(){
    return false;
  }
  public void setScroller(Scroller arg1){
  }
  public static int getTextColor(android.content.Context arg1, android.content.res.TypedArray arg2, int arg3){
    return 0;
  }
  public boolean isInputMethodTarget(){
    return false;
  }
  public boolean isSuggestionsEnabled(){
    return false;
  }
  public void setCustomSelectionActionModeCallback(@FieldSet("actionCallback")@com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg1){
  }
  @FieldGet("actionCallback")
  public android.view.ActionMode.Callback getCustomSelectionActionModeCallback(){
    return (android.view.ActionMode.Callback) null;
  }
  protected void resolveDrawables(){
  }
  protected void resetResolvedDrawables(){
  }
  protected void viewClicked(android.view.inputmethod.InputMethodManager arg1){
  }
}
