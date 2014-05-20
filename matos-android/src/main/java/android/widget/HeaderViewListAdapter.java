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


public class HeaderViewListAdapter
  implements WrapperListAdapter, Filterable
{
  // Constructors

  public HeaderViewListAdapter(java.util.ArrayList<ListView.FixedViewInfo> arg1, java.util.ArrayList<ListView.FixedViewInfo> arg2, ListAdapter arg3){
  }
  // Methods

  public boolean isEmpty(){
    return false;
  }
  public Filter getFilter(){
    return (Filter) null;
  }
  public int getCount(){
    return 0;
  }
  public boolean hasStableIds(){
    return false;
  }
  public java.lang.Object getItem(int arg1){
    return (java.lang.Object) null;
  }
  public long getItemId(int arg1){
    return 0l;
  }
  public android.view.View getView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.DataSetObserver.onChanged") android.database.DataSetObserver arg1){
  }
  public void unregisterDataSetObserver(android.database.DataSetObserver arg1){
  }
  public boolean areAllItemsEnabled(){
    return false;
  }
  public boolean isEnabled(int arg1){
    return false;
  }
  public int getItemViewType(int arg1){
    return 0;
  }
  public int getViewTypeCount(){
    return 0;
  }
  public boolean removeHeader(android.view.View arg1){
    return false;
  }
  public int getHeadersCount(){
    return 0;
  }
  public int getFootersCount(){
    return 0;
  }
  public boolean removeFooter(android.view.View arg1){
    return false;
  }
  public ListAdapter getWrappedAdapter(){
    return (ListAdapter) null;
  }
}
