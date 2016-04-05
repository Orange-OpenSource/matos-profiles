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
// @com.francetelecom.rd.stubs.annotation.Field(modifier = 4, type = "ExpandableListAdapter", value = "expandableListAdapter")
@com.francetelecom.rd.stubs.annotation.Field(modifier = 4, type = "ListAdapter", value = "listAdapter")
// @com.francetelecom.rd.stubs.annotation.Code({"private ListAdapter listAdapter;", "private ExpandableListAdapter expandableListAdapter"}) 
public class ExpandableListView
  extends ListView{
  // Classes

  public static interface OnGroupCollapseListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnGroupCollapse")
    public void onGroupCollapse(int arg1);
  }
  public static interface OnGroupExpandListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGroupExpand")
    public void onGroupExpand(int arg1);
  }
  public static interface OnGroupClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGroupClick")
    public boolean onGroupClick(ExpandableListView arg1, android.view.View arg2, int arg3, long arg4);
  }
  public static interface OnChildClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onChildClick")
    public boolean onChildClick(ExpandableListView arg1, android.view.View arg2, int arg3, int arg4, long arg5);
  }
  public static class ExpandableListContextMenuInfo
    implements android.view.ContextMenu.ContextMenuInfo
  {
    // Fields

    public android.view.View targetView;

    public long packedPosition;

    public long id;

    // Constructors

    public ExpandableListContextMenuInfo(android.view.View arg1, long arg2, long arg3){
    }
  }
  // Fields

  public static final int PACKED_POSITION_TYPE_GROUP = 0;

  public static final int PACKED_POSITION_TYPE_CHILD = 1;

  public static final int PACKED_POSITION_TYPE_NULL = 2;

  public static final long PACKED_POSITION_VALUE_NULL = 4294967295l;

  public static final int CHILD_INDICATOR_INHERIT = -1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public ExpandableListView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public ExpandableListView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("oncreate")
  public ExpandableListView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("oncreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("listAdapter")
  public ListAdapter getAdapter(){
    return (ListAdapter) null;
  }
  public void setAdapter(@com.francetelecom.rd.stubs.annotation.FieldSet("listAdapter") @com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") ListAdapter arg1){
  }
  public void setAdapter(@com.francetelecom.rd.stubs.annotation.FieldSet("expandableListAdapter") @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") ExpandableListAdapter arg1){
  }
  public boolean performItemClick(android.view.View arg1, int arg2, long arg3){
    return false;
  }
  public void setOnItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemClick") AdapterView.OnItemClickListener arg1){
  }
  public long getSelectedPosition(){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("expandableListAdapter")
  public ExpandableListAdapter getExpandableListAdapter(){
    return (ExpandableListAdapter) null;
  }
  public long getSelectedId(){
    return 0l;
  }
  public boolean setSelectedChild(int arg1, int arg2, boolean arg3){
    return false;
  }
  public void setSelectedGroup(int arg1){
  }
  public static long getPackedPositionForGroup(int arg1){
    return 0l;
  }
  public int getFlatListPosition(long arg1){
    return 0;
  }
  public static long getPackedPositionForChild(int arg1, int arg2){
    return 0l;
  }
  public static int getPackedPositionGroup(long arg1){
    return 0;
  }
  public static int getPackedPositionType(long arg1){
    return 0;
  }
  public static int getPackedPositionChild(long arg1){
    return 0;
  }
  public void setOnChildClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.ExpandableListView.OnChildClickListener.onChildClick") ExpandableListView.OnChildClickListener arg1){
  }
  public void setOnGroupExpandListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.ExpandableListView.OnGroupExpandListener.onGroupExpand") ExpandableListView.OnGroupExpandListener arg1){
  }
  public void setOnGroupCollapseListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.ExpandableListView.OnGroupCollabseListener.OnGroupCollapse") ExpandableListView.OnGroupCollapseListener arg1){
  }
  public void setChildDivider(android.graphics.drawable.Drawable arg1){
  }
  public boolean expandGroup(int arg1){
    return false;
  }
  public boolean expandGroup(int arg1, boolean arg2){
    return false;
  }
  public boolean collapseGroup(int arg1){
    return false;
  }
  public void setOnGroupClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onGroupClick") ExpandableListView.OnGroupClickListener arg1){
  }
  public long getExpandableListPosition(int arg1){
    return 0l;
  }
  public boolean isGroupExpanded(int arg1){
    return false;
  }
  public void setChildIndicator(android.graphics.drawable.Drawable arg1){
  }
  public void setChildIndicatorBounds(int arg1, int arg2){
  }
  public void setGroupIndicator(android.graphics.drawable.Drawable arg1){
  }
  public void setIndicatorBounds(int arg1, int arg2){
  }
}
