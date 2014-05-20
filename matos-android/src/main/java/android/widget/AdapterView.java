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

import com.francetelecom.rd.stubs.annotation.UseSuper;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class AdapterView<T extends Adapter>
  extends android.view.ViewGroup{
  // Classes

  public static interface OnItemClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onItemClick")
    public void onItemClick(AdapterView<?> arg1, android.view.View arg2, int arg3, long arg4);
  }
  public static interface OnItemLongClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onItemLongClick")
    public boolean onItemLongClick(AdapterView<?> arg1, android.view.View arg2, int arg3, long arg4);
  }
  public static interface OnItemSelectedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onItemSelected")
    public void onItemSelected(AdapterView<?> arg1, android.view.View arg2, int arg3, long arg4);
    @com.francetelecom.rd.stubs.annotation.CallBack("onItemSelected")
    public void onNothingSelected(AdapterView<?> arg1);
  }
  public static class AdapterContextMenuInfo
    implements android.view.ContextMenu.ContextMenuInfo
  {
    // Fields

    public android.view.View targetView;

    public int position;

    public long id;

    // Constructors

    public AdapterContextMenuInfo(android.view.View arg1, int arg2, long arg3){
    }
  }
  // Fields

  public static final int ITEM_VIEW_TYPE_IGNORE = -1;

  public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;

  public static final int INVALID_POSITION = -1;

  public static final long INVALID_ROW_ID = -9223372036854775808l;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  public int getCount(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void addView(android.view.View arg1){
  }
  public void addView(android.view.View arg1, int arg2){
  }
  public void addView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  public void addView(android.view.View arg1, int arg2, android.view.ViewGroup.LayoutParams arg3){
  }
  public void removeView(android.view.View arg1){
  }
  public void removeAllViews(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onRequestSendAccessibilityEvent(android.view.View arg1, android.view.accessibility.AccessibilityEvent arg2){
    return false;
  }
  protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  public void removeViewAt(int arg1){
  }
  protected boolean canAnimate(){
    return false;
  }
  public void setOnClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  public void setFocusable(boolean arg1){
  }
  public void setFocusableInTouchMode(boolean arg1){
  }
  public abstract void setSelection(int arg1);
  
  public abstract T getAdapter();
  public abstract void setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") T arg1);
  public abstract android.view.View getSelectedView();
  public boolean performItemClick(android.view.View arg1, int arg2, long arg3){
    return false;
  }
  public long getItemIdAtPosition(int arg1){
    return 0l;
  }
  public int getPositionForView(android.view.View arg1){
    return 0;
  }
  public int getSelectedItemPosition(){
    return 0;
  }
  public long getSelectedItemId(){
    return 0l;
  }
  public void setOnItemClickListener(@com.francetelecom.rd.stubs.annotation.FieldSet("itemClickListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.AdapterView.OnItemClickListener.onItemClick") AdapterView.OnItemClickListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("itemClickListener")
  public final AdapterView.OnItemClickListener getOnItemClickListener(){
    return (AdapterView.OnItemClickListener) null;
  }
  public void setOnItemLongClickListener(@com.francetelecom.rd.stubs.annotation.FieldSet("itemLongClickListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemLongClick") AdapterView.OnItemLongClickListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("itemLongClickListener")
  public final AdapterView.OnItemLongClickListener getOnItemLongClickListener(){
    return (AdapterView.OnItemLongClickListener) null;
  }
  public void setOnItemSelectedListener(@com.francetelecom.rd.stubs.annotation.FieldSet("itemSelectedClickListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemSelected") AdapterView.OnItemSelectedListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("itemSelectedClickListener")
  public final AdapterView.OnItemSelectedListener getOnItemSelectedListener(){
    return (AdapterView.OnItemSelectedListener) null;
  }
  public java.lang.Object getSelectedItem(){
    return (java.lang.Object) null;
  }
  public int getFirstVisiblePosition(){
    return 0;
  }
  public int getLastVisiblePosition(){
    return 0;
  }
  public void setEmptyView(android.view.View arg1){
  }
  public android.view.View getEmptyView(){
    return (android.view.View) null;
  }
  public java.lang.Object getItemAtPosition(int arg1){
    return (java.lang.Object) null;
  }
}
