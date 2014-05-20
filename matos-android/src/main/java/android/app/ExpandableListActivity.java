package android.app;

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
public class ExpandableListActivity
  extends Activity  implements android.view.View.OnCreateContextMenuListener, android.widget.ExpandableListView.OnGroupExpandListener, android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnChildClickListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("Interact")
  public ExpandableListActivity(){
    super();
  }
  // Methods

  protected void onRestoreInstanceState(android.os.Bundle arg1){
  }
  public void onContentChanged(){
  }
  public void onCreateContextMenu(android.view.ContextMenu arg1, android.view.View arg2, android.view.ContextMenu.ContextMenuInfo arg3){
  }
  public void setListAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") @com.francetelecom.rd.stubs.annotation.FieldSet("expandableListAdapter") android.widget.ExpandableListAdapter arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Interact")
  public void onGroupExpand(int arg1){
  }
  public long getSelectedPosition(){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Interact")
  public boolean onChildClick(android.widget.ExpandableListView arg1, android.view.View arg2, int arg3, int arg4, long arg5){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Interact")
  public void onGroupCollapse(int arg1){
  }
  public android.widget.ExpandableListView getExpandableListView(){
    return (android.widget.ExpandableListView) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("expandableListAdapter")
  public android.widget.ExpandableListAdapter getExpandableListAdapter(){
    return (android.widget.ExpandableListAdapter) null;
  }
  public long getSelectedId(){
    return 0l;
  }
  public boolean setSelectedChild(int arg1, int arg2, boolean arg3){
    return false;
  }
  public void setSelectedGroup(int arg1){
  }
}
