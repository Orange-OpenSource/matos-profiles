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
public abstract class BaseExpandableListAdapter
  implements HeterogeneousExpandableList, ExpandableListAdapter
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BaseExpandableListAdapter(){
  }
  // Methods

  public boolean isEmpty(){
    return false;
  }
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.DataSetObserver.onChanged") android.database.DataSetObserver arg1){
  }
  public void unregisterDataSetObserver(android.database.DataSetObserver arg1){
  }
  public void notifyDataSetChanged(){
  }
  public void notifyDataSetInvalidated(){
  }
  public boolean areAllItemsEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGroupCollapsed(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGroupExpanded(int arg1){
  }
  public long getCombinedChildId(long arg1, long arg2){
    return 0l;
  }
  public long getCombinedGroupId(long arg1){
    return 0l;
  }
  public int getChildType(int arg1, int arg2){
    return 0;
  }
  public int getChildTypeCount(){
    return 0;
  }
  public int getGroupType(int arg1){
    return 0;
  }
  public int getGroupTypeCount(){
    return 0;
  }
}
