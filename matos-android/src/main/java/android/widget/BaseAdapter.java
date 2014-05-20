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
public abstract class BaseAdapter
  implements SpinnerAdapter, ListAdapter
{
  // Constructors

  public BaseAdapter(){
  }
  // Methods

  public boolean isEmpty(){
    return false;
  }
  public boolean hasStableIds(){
    return false;
  }
  public android.view.View getDropDownView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") android.database.DataSetObserver arg1){
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
  public boolean isEnabled(int arg1){
    return false;
  }
  public int getItemViewType(int arg1){
    return 0;
  }
  public int getViewTypeCount(){
    return 0;
  }
}
