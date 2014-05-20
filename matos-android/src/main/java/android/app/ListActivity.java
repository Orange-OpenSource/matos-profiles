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
public class ListActivity
  extends Activity{
  // Fields

  protected android.widget.ListAdapter mAdapter;

  protected android.widget.ListView mList;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListActivity(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onContentChanged(){
  }
  public void setSelection(int arg1){
  }
  public int getSelectedItemPosition(){
    return 0;
  }
  public long getSelectedItemId(){
    return 0l;
  }
  public android.widget.ListView getListView(){
    return (android.widget.ListView) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onListItemClick(android.widget.ListView arg1, android.view.View arg2, int arg3, long arg4){
  }
  public void setListAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") android.widget.ListAdapter arg1){
  }
  public android.widget.ListAdapter getListAdapter(){
    return (android.widget.ListAdapter) null;
  }
}
