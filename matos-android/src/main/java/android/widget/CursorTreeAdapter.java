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
public abstract class CursorTreeAdapter
  extends BaseExpandableListAdapter  implements Filterable
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorTreeAdapter(android.database.Cursor arg1, android.content.Context arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorTreeAdapter(android.database.Cursor arg1, android.content.Context arg2, boolean arg3){
    super();
  }
  // Methods

  public Filter getFilter(){
    return (Filter) null;
  }
  public java.lang.String convertToString(android.database.Cursor arg1){
    return (java.lang.String) null;
  }
  public boolean hasStableIds(){
    return false;
  }
  public void changeCursor(android.database.Cursor arg1){
  }
  public android.database.Cursor getCursor(){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg1){
    return (android.database.Cursor) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("filterQueryProvider")
  public FilterQueryProvider getFilterQueryProvider(){
    return (FilterQueryProvider) null;
  }
  public void setFilterQueryProvider(@com.francetelecom.rd.stubs.annotation.FieldSet("filterQueryProvider") FilterQueryProvider arg1){
  }
  public void notifyDataSetChanged(){
  }
  public void notifyDataSetChanged(boolean arg1){
  }
  public void notifyDataSetInvalidated(){
  }
  public android.database.Cursor getChild(int arg1, int arg2){
    return (android.database.Cursor) null;
  }
  protected abstract void bindChildView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3, boolean arg4);
  protected abstract void bindGroupView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3, boolean arg4);
  protected abstract android.view.View newChildView(android.content.Context arg1, android.database.Cursor arg2, boolean arg3, android.view.ViewGroup arg4);
  protected abstract android.view.View newGroupView(android.content.Context arg1, android.database.Cursor arg2, boolean arg3, android.view.ViewGroup arg4);
  protected abstract android.database.Cursor getChildrenCursor(android.database.Cursor arg1);
  public void setGroupCursor(android.database.Cursor arg1){
  }
  public void setChildrenCursor(int arg1, android.database.Cursor arg2){
  }
  public long getChildId(int arg1, int arg2){
    return 0l;
  }
  public int getChildrenCount(int arg1){
    return 0;
  }
  public android.database.Cursor getGroup(int arg1){
    return (android.database.Cursor) null;
  }
  public int getGroupCount(){
    return 0;
  }
  public long getGroupId(int arg1){
    return 0l;
  }
  public android.view.View getGroupView(int arg1, boolean arg2, android.view.View arg3, android.view.ViewGroup arg4){
    return (android.view.View) null;
  }
  public android.view.View getChildView(int arg1, int arg2, boolean arg3, android.view.View arg4, android.view.ViewGroup arg5){
    return (android.view.View) null;
  }
  public boolean isChildSelectable(int arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGroupCollapsed(int arg1){
  }
}
