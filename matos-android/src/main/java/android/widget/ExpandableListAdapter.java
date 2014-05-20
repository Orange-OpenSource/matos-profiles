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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ExpandableListAdapterImplem", superClass = "")
public interface ExpandableListAdapter
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public boolean isEmpty();
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public boolean hasStableIds();
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") android.database.DataSetObserver arg1);
  public void unregisterDataSetObserver(android.database.DataSetObserver arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public boolean areAllItemsEnabled();
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public java.lang.Object getChild(int arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public long getChildId(int arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public int getChildrenCount(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public java.lang.Object getGroup(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public int getGroupCount();
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public long getGroupId(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public android.view.View getGroupView(int arg1, boolean arg2, android.view.View arg3, android.view.ViewGroup arg4);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public android.view.View getChildView(int arg1, int arg2, boolean arg3, android.view.View arg4, android.view.ViewGroup arg5);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public boolean isChildSelectable(int arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public void onGroupCollapsed(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public void onGroupExpanded(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public long getCombinedChildId(long arg1, long arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
  public long getCombinedGroupId(long arg1);
}
